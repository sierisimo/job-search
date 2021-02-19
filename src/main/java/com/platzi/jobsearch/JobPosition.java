package com.platzi.jobsearch;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class JobPosition {
    private String id;
    private String type;
    private String url;
    @SerializedName("created_at")
    private String createdAt;
    private String company;
    @SerializedName("company_url")
    private String companyUrl;
    private String title;
    private String location;
    private String description;
    @SerializedName("company_logo")
    private String companyLogo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompanyUrl() {
        return companyUrl;
    }

    public void setCompanyUrl(String companyUrl) {
        this.companyUrl = companyUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCompanyLogo() {
        return companyLogo;
    }

    public void setCompanyLogo(String companyLogo) {
        this.companyLogo = companyLogo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobPosition that = (JobPosition) o;
        return Objects.equals(id, that.id) && Objects.equals(type, that.type) && Objects.equals(url, that.url) && Objects.equals(createdAt, that.createdAt) && Objects.equals(company, that.company) && Objects.equals(companyUrl, that.companyUrl) && Objects.equals(title, that.title) && Objects.equals(location, that.location) && Objects.equals(description, that.description) && Objects.equals(companyLogo, that.companyLogo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, url, createdAt, company, companyUrl, title, location, description, companyLogo);
    }

    @Override
    public String toString() {
        return "JobPosition{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", url='" + url + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", company='" + company + '\'' +
                ", companyUrl='" + companyUrl + '\'' +
                ", title='" + title + '\'' +
                ", location='" + location + '\'' +
                ", description='" + description + '\'' +
                ", companyLogo='" + companyLogo + '\'' +
                '}';
    }
}
