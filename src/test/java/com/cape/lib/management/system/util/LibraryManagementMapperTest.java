package com.cape.lib.management.system.util;

import com.cape.lib.management.system.domain.response.SearchByResponse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.exceptions.misusing.MissingMethodInvocationException;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.mockito.Mockito.when;

public class LibraryManagementMapperTest {
    LibraryManagementMapper managementMapper = new LibraryManagementMapper();
    public static final String AUTHOR= "Ravi";
    public static final String PUBLISHER= "Ram Kumar";
    public static final String BOOK_NAME= "Tamil language";
    public static final String BOOK_REF= "109876";


    @Mock
    ResultSet resultSet;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void givenSearchByAuthor_thenReturnValidResponse_whenMaoRowInvoked() throws SQLException {
        when(resultSet.getString("AUTHOR")).thenReturn("Ravi");
        SearchByResponse searchByResponse =  managementMapper.mapRow(resultSet,20);
        Assert.assertEquals(AUTHOR,searchByResponse.getAuthor());
        Assert.assertNull(searchByResponse.getBookName());
        Assert.assertNull(searchByResponse.getBookRef());
        Assert.assertNull(searchByResponse.getPublisher());

    }
    @Test
    public void givenSearchByAuthorAndPublisher_thenReturnValidResponse_whenMaoRowInvoked() throws SQLException {
        when(resultSet.getString("AUTHOR")).thenReturn("Ravi");
        when(resultSet.getString("PUBLISHER")).thenReturn("Ram Kumar");

        SearchByResponse searchByResponse =  managementMapper.mapRow(resultSet,20);
        Assert.assertEquals(AUTHOR,searchByResponse.getAuthor());
        Assert.assertEquals(PUBLISHER,searchByResponse.getPublisher());
        Assert.assertNull(searchByResponse.getBookName());
        Assert.assertNull(searchByResponse.getBookRef());

    }
    @Test
    public void givenSearchByAuthorAndPublisherAndBookName_thenReturnValidResponse_whenMaoRowInvoked() throws SQLException {
        when(resultSet.getString("AUTHOR")).thenReturn("Ravi");
        when(resultSet.getString("PUBLISHER")).thenReturn("Ram Kumar");
        when(resultSet.getString("BOOK_NAME")).thenReturn("Tamil language");
        SearchByResponse searchByResponse =  managementMapper.mapRow(resultSet,20);
        Assert.assertEquals(AUTHOR,searchByResponse.getAuthor());
        Assert.assertEquals(PUBLISHER,searchByResponse.getPublisher());
        Assert.assertEquals(BOOK_NAME,searchByResponse.getBookName());
        Assert.assertNull(searchByResponse.getBookRef());

    }
    @Test
    public void givenSearchByDetails_thenReturnValidResponse_whenMaoRowInvoked() throws SQLException {
        when(resultSet.getString("AUTHOR")).thenReturn("Ravi");
        when(resultSet.getString("PUBLISHER")).thenReturn("Ram Kumar");
        when(resultSet.getString("BOOK_NAME")).thenReturn("Tamil language");
        when(resultSet.getString("BOOK_REF")).thenReturn("109876");
        SearchByResponse searchByResponse =  managementMapper.mapRow(resultSet,20);
        Assert.assertEquals(AUTHOR,searchByResponse.getAuthor());
        Assert.assertEquals(PUBLISHER,searchByResponse.getPublisher());
        Assert.assertEquals(BOOK_NAME,searchByResponse.getBookName());
        Assert.assertEquals(BOOK_REF,searchByResponse.getBookRef());

    }
    @Test(expected = NullPointerException.class)
    public void giveResultSetNull_whenReturnNullPointerException_thenMapRowInvoked() throws SQLException {
        managementMapper.mapRow(null,20);
    }
}
