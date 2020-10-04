package com.cape.lib.management.system.domain.response;

import com.cape.lib.management.system.domain.request.Book;

public class SearchByResponse extends Book {

    private String author;
    private String publisher;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
