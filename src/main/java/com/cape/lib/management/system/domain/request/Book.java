package com.cape.lib.management.system.domain.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.validation.constraints.Pattern;

import static com.cape.lib.management.system.contants.LibraryManagementContants.ALHA_NUMERIC;
import static com.cape.lib.management.system.contants.LibraryManagementContants.VALIDATION_MESSAGE;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Book {
    @Pattern(regexp = ALHA_NUMERIC,message = VALIDATION_MESSAGE)
    private String bookId;
    @Pattern(regexp = ALHA_NUMERIC,message = VALIDATION_MESSAGE)
    private String bookName;
    @Pattern(regexp = ALHA_NUMERIC,message = VALIDATION_MESSAGE)
    private String bookRef;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookRef() {
        return bookRef;
    }

    public void setBookRef(String bookRef) {
        this.bookRef = bookRef;
    }
}
