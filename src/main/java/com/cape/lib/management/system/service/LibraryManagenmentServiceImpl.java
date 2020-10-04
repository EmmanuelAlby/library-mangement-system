package com.cape.lib.management.system.service;

import com.cape.lib.management.system.dao.LibraryManagementDAO;
import com.cape.lib.management.system.domain.request.LibrayDetailsRequest;
import com.cape.lib.management.system.domain.request.SearchByRequest;
import com.cape.lib.management.system.domain.response.LibraryManagementResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibraryManagenmentServiceImpl implements LibraryManagenmentService {

    @Autowired
    private LibraryManagementDAO libraryManagementDAO;
    @Override
    public LibraryManagementResponse add(LibrayDetailsRequest librayDetailsRequest) {
        LibraryManagementResponse libraryManagementResponse = new LibraryManagementResponse();
        libraryManagementDAO.insertDetails(librayDetailsRequest);
        libraryManagementResponse.setMessage("successfully added");
        return libraryManagementResponse;
    }

    @Override
    public LibraryManagementResponse update(LibrayDetailsRequest librayDetailsRequest) {

        LibraryManagementResponse libraryManagementResponse = new LibraryManagementResponse();
        libraryManagementDAO.updateDetails(librayDetailsRequest);
        libraryManagementResponse.setMessage("successfully updated");
        return libraryManagementResponse;
    }

    @Override
    public LibraryManagementResponse delete(LibrayDetailsRequest librayDetailsRequest) {
        LibraryManagementResponse libraryManagementResponse = new LibraryManagementResponse();
        libraryManagementDAO.deleteDetails(librayDetailsRequest);
        libraryManagementResponse.setMessage("successfully deleted");
        return libraryManagementResponse;
    }

    @Override
    public LibraryManagementResponse view(SearchByRequest searchByRequest) {
        return  libraryManagementDAO.searchBy(searchByRequest);

    }
}
