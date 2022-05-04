package com.spring.entities;

import java.util.Date;

public class News {
    public News(String category) {
        this.category = category;
    }

    public News() {
    }

    private String category;
    private Date datetime;
    private String headline;

    private int id;

    private String image;

    private String related;

    private String source;

    private String summary;

    private String url;

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getHeadline() {
        return headline;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setRelated(String related) {
        this.related = related;
    }

    public String getRelated() {
        return related;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return source;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSummary() {
        return summary;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "News{" +
                "category='" + category + '\'' +
                ", datetime=" + datetime +
                ", headline='" + headline + '\'' +
                ", id=" + id +
                ", image='" + image + '\'' +
                ", related='" + related + '\'' +
                ", source='" + source + '\'' +
                ", summary='" + summary + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}

