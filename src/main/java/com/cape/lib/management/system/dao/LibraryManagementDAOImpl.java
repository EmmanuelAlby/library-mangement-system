package com.cape.lib.management.system.dao;

import com.cape.lib.management.system.domain.request.LibrayDetailsRequest;
import com.cape.lib.management.system.domain.request.SearchByRequest;
import com.cape.lib.management.system.domain.response.LibraryManagementResponse;
import com.cape.lib.management.system.util.LibraryManagementMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.cape.lib.management.system.util.QueryUtils.*;

@Component
public class LibraryManagementDAOImpl implements LibraryManagementDAO {
    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public void insertDetails(LibrayDetailsRequest librayDetailsRequest) {

        String query = LIB_MGT_ADD_QUERY;
        jdbcTemplate.update(query, setParams(librayDetailsRequest));
    }

    @Override
    public void updateDetails(LibrayDetailsRequest librayDetailsRequest) {
        String query = LIB_MGT_UPDATE_QUERY;
        jdbcTemplate.update(query, setParams(librayDetailsRequest));
    }

    @Override
    public void deleteDetails(LibrayDetailsRequest librayDetailsRequest) {
        String query = LIB_MGT_DELET_QUERY;
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("BOOK_ID", librayDetailsRequest.getBook().getBookId());
        jdbcTemplate.update(query, params);
    }

    @Override
    public LibraryManagementResponse searchBy(SearchByRequest searchByRequest) {
        String query = LIB_MGT_DELET_QUERY;
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("name", searchByRequest.getBookName());
        params.addValue("author", searchByRequest.getAuthor());
        params.addValue("category", searchByRequest.getBookCategory());
        params.addValue("publisher", searchByRequest.getPublisher());
        List<LibraryManagementResponse> libraryManagementResponses = jdbcTemplate.query(query, params, new LibraryManagementMapper());
        return (LibraryManagementResponse) libraryManagementResponses;
    }

    private MapSqlParameterSource setParams(LibrayDetailsRequest librayDetailsRequest) {
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("BOOK_ID", librayDetailsRequest.getBook().getBookId());
        params.addValue("BOOK_NAME", librayDetailsRequest.getBook().getBookName());
        params.addValue("BOOK_REF", librayDetailsRequest.getBook().getBookRef());
        params.addValue("FIRST_NAME", librayDetailsRequest.getBook().getBookName());
        params.addValue("LAST_NAME", librayDetailsRequest.getBook().getBookRef());
        params.addValue("AUTH_FIRST_NAME", librayDetailsRequest.getBook().getBookName());
        params.addValue("AUTH_LAST_NAME", librayDetailsRequest.getBook().getBookRef());
        params.addValue("PUBLISH_ORG", librayDetailsRequest.getBook().getBookName());
        params.addValue("PUBLISH_COUNTRY", librayDetailsRequest.getBook().getBookRef());
        return params;
    }
}
