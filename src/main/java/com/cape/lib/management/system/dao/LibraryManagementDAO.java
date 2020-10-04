package com.cape.lib.management.system.dao;

import com.cape.lib.management.system.domain.request.LibrayDetailsRequest;
import com.cape.lib.management.system.domain.request.SearchByRequest;
import com.cape.lib.management.system.domain.response.LibraryManagementResponse;

public interface LibraryManagementDAO {
    void insertDetails(LibrayDetailsRequest librayDetailsRequest);

    void updateDetails(LibrayDetailsRequest librayDetailsRequest);

    void deleteDetails(LibrayDetailsRequest librayDetailsRequest);

    LibraryManagementResponse searchBy(SearchByRequest searchByRequest);
}
