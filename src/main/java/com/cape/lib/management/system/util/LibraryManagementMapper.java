package com.cape.lib.management.system.util;

import com.cape.lib.management.system.domain.response.SearchByResponse;
import org.springframework.jdbc.core.RowMapper;


import java.sql.ResultSet;
import java.sql.SQLException;


public class LibraryManagementMapper implements RowMapper {
    @Override
    public SearchByResponse mapRow(ResultSet resultSet, int i) throws SQLException {
        SearchByResponse searchByResponse = new SearchByResponse();
        searchByResponse.setAuthor(resultSet.getString("AUTHOR"));
        searchByResponse.setPublisher(resultSet.getString("PUBLISHER"));
        searchByResponse.setBookName(resultSet.getString("BOOK_NAME"));
        searchByResponse.setBookRef(resultSet.getString("BOOK_REF"));
        return searchByResponse;

    }


}
