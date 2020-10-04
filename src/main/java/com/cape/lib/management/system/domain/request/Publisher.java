package com.cape.lib.management.system.domain.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import javax.validation.constraints.Pattern;
import java.util.Date;

import static com.cape.lib.management.system.contants.LibraryManagementContants.ALHA_NUMERIC;
import static com.cape.lib.management.system.contants.LibraryManagementContants.VALIDATION_MESSAGE;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Publisher {

    @Pattern(regexp = ALHA_NUMERIC,message = VALIDATION_MESSAGE)
    private String publishOrg;
    @Pattern(regexp = ALHA_NUMERIC,message = VALIDATION_MESSAGE)
    private String publishCountry;
    private Date publishDate;

    public String getPublishOrg() {
        return publishOrg;
    }

    public void setPublishOrg(String publishOrg) {
        this.publishOrg = publishOrg;
    }

    public String getPublishCountry() {
        return publishCountry;
    }

    public void setPublishCountry(String publishCountry) {
        this.publishCountry = publishCountry;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }
}
