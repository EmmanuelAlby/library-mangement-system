package com.cape.lib.management.system.service;


import com.cape.lib.management.system.dao.LibraryManagementDAO;
import com.cape.lib.management.system.dao.LibraryManagementDAOImpl;
import com.cape.lib.management.system.domain.request.Book;
import com.cape.lib.management.system.domain.request.LibrayDetailsRequest;
import com.cape.lib.management.system.domain.request.SearchByRequest;
import com.cape.lib.management.system.domain.response.LibraryManagementResponse;
import com.cape.lib.management.system.service.LibraryManagenmentServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.util.ReflectionTestUtils;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class LibraryManagementSystemServiceTest {
    @InjectMocks
    private LibraryManagenmentServiceImpl libraryManagenmentService = new LibraryManagenmentServiceImpl();
    @Mock
    private LibrayDetailsRequest librayDetailsRequest;
    @Mock
    private LibraryManagementDAO libraryManagementDAO;
    @Mock
    SearchByRequest searchByRequest;
    @Mock
    Book book;
    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
        ReflectionTestUtils.setField(libraryManagenmentService,"libraryManagementDAO",libraryManagementDAO);
    }
    @Test
    public void givenValidAddRequest_thenReturnSuccess_whenAddInvoked(){
        when(librayDetailsRequest.getBook()).thenReturn(book);
        when(book.getBookName()).thenReturn("JAVA8");
        LibraryManagementResponse libraryManagementResponse =libraryManagenmentService.add(librayDetailsRequest);
        Assert.assertEquals("successfully added",libraryManagementResponse.getMessage());
    }
    @Test
    public void givenValidAddRequest_thenReturnSuccess_whenUpdateInvoked(){
        when(librayDetailsRequest.getBook()).thenReturn(book);
        when(book.getBookName()).thenReturn("JAVA8");
        LibraryManagementResponse libraryManagementResponse =libraryManagenmentService.update(librayDetailsRequest);
        Assert.assertEquals("successfully updated",libraryManagementResponse.getMessage());
    }
    @Test
    public void givenValidAddRequest_thenReturnSuccess_whenDeleteInvoked(){
        when(librayDetailsRequest.getBook()).thenReturn(book);
        when(book.getBookName()).thenReturn("JAVA8");
        LibraryManagementResponse libraryManagementResponse =libraryManagenmentService.delete(librayDetailsRequest);
        Assert.assertEquals("successfully deleted",libraryManagementResponse.getMessage());
    }
    @Test
    public void givenValidAddRequest_thenReturnSuccess_whenSearchByInvoked(){
        LibraryManagementResponse libraryManagementResponse =libraryManagenmentService.view(searchByRequest);
        Assert.assertNull(libraryManagementResponse);
    }

}
