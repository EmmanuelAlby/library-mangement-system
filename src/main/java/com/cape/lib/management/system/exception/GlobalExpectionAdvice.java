package com.cape.lib.management.system.exception;

import com.cape.lib.management.system.domain.response.LibraryManagementResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExpectionAdvice {

    @ExceptionHandler(UnhadledException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<LibraryManagementResponse> handleBadRequest(UnhadledException unhadledException){
        LibraryManagementResponse libraryManagementResponse = new LibraryManagementResponse();
        libraryManagementResponse.setMessage(unhadledException.getMessage());
        return ResponseEntity.badRequest().body(libraryManagementResponse);
    }

    @ExceptionHandler(UnhadledException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<LibraryManagementResponse> internalServer(UnhadledException unhadledException){
        LibraryManagementResponse libraryManagementResponse = new LibraryManagementResponse();
        libraryManagementResponse.setMessage(unhadledException.getMessage());
        return ResponseEntity.badRequest().body(libraryManagementResponse);
    }


}
