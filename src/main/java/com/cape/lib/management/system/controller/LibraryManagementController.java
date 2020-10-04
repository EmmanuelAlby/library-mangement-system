package com.cape.lib.management.system.controller;

import com.cape.lib.management.system.domain.request.LibrayDetailsRequest;
import com.cape.lib.management.system.domain.request.SearchByRequest;
import com.cape.lib.management.system.domain.response.LibraryManagementResponse;
import com.cape.lib.management.system.exception.UnhadledException;
import com.cape.lib.management.system.service.LibraryManagenmentService;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Api(value = "Library Management System")
@RestController
public class LibraryManagementController {

    public static final Logger LOGGER = LoggerFactory.getLogger(LibraryManagementController.class);
    @Autowired
    LibraryManagenmentService libraryManagenmentService;

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @RequestMapping(value = "/addLibraryDetail", consumes = "application/json", produces = "application/json")
    public ResponseEntity<LibraryManagementResponse> addLiraryDetails(@Valid @RequestBody LibrayDetailsRequest librayDetailsRequest) throws UnhadledException {
        LOGGER.info("Add library details Started..");
        try {
            return ResponseEntity.ok().body(libraryManagenmentService.add(librayDetailsRequest));
        } catch (Exception e) {
            throw new UnhadledException(e.getMessage(), e);
        }
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @RequestMapping(value = "/updateLibraryDetail", consumes = "application/json", produces = "application/json")
    public ResponseEntity<LibraryManagementResponse> updateLiraryDetails(@Valid @RequestBody LibrayDetailsRequest librayDetailsRequest) throws UnhadledException {
        LOGGER.info("update library details Started..");
        try {
            return ResponseEntity.ok().body(libraryManagenmentService.update(librayDetailsRequest));
        } catch (Exception e) {
            throw new UnhadledException(e.getMessage(), e);
        }
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @RequestMapping(value = "/deleteLibraryDetail", consumes = "application/json", produces = "application/json")
    public ResponseEntity<LibraryManagementResponse> deleteLiraryDetails(@Valid @RequestBody LibrayDetailsRequest librayDetailsRequest) throws UnhadledException {
        LOGGER.info("delete library details Started..");
        try {
            return ResponseEntity.ok().body(libraryManagenmentService.delete(librayDetailsRequest));
        } catch (Exception e) {
            throw new UnhadledException(e.getMessage(), e);
        }
    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN','NORMAL_USER')")
    @RequestMapping(value = "/findLibraryDetail", consumes = "application/json", produces = "application/json")
    public ResponseEntity<LibraryManagementResponse> searchBy(@Valid @RequestBody SearchByRequest searchByRequest) throws UnhadledException {
        LOGGER.info("search by library details Started..");
        try {
            return ResponseEntity.ok().body(libraryManagenmentService.view(searchByRequest));
        } catch (Exception e) {
            throw new UnhadledException(e.getMessage(), e);
        }
    }
}
