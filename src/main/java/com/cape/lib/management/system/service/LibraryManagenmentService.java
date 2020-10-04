package com.cape.lib.management.system.service;

import com.cape.lib.management.system.domain.request.LibrayDetailsRequest;
import com.cape.lib.management.system.domain.request.SearchByRequest;
import com.cape.lib.management.system.domain.response.LibraryManagementResponse;

public interface LibraryManagenmentService {
    public LibraryManagementResponse add(LibrayDetailsRequest librayDetailsRequest);

    public LibraryManagementResponse update(LibrayDetailsRequest librayDetailsRequest);

    public LibraryManagementResponse delete(LibrayDetailsRequest librayDetailsRequest);

    public LibraryManagementResponse view(SearchByRequest searchByRequest);
}
