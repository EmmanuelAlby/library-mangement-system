package com.cape.lib.management.system.domain.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.validation.constraints.Pattern;

import static com.cape.lib.management.system.contants.LibraryManagementContants.ALHA_NUMERIC;
import static com.cape.lib.management.system.contants.LibraryManagementContants.VALIDATION_MESSAGE;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchByRequest {
    @Pattern(regexp = ALHA_NUMERIC,message = VALIDATION_MESSAGE)
    private String author;
    @Pattern(regexp = ALHA_NUMERIC,message = VALIDATION_MESSAGE)
    private String bookName;
    @Pattern(regexp = ALHA_NUMERIC,message = VALIDATION_MESSAGE)
    private String publisher;
    @Pattern(regexp = ALHA_NUMERIC,message = VALIDATION_MESSAGE)
    private String bookCategory;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }
}
