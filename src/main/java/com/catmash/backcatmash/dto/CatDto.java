package com.catmash.backcatmash.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class CatDto {

    private String id;
    private String url;

    private Integer likes;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }
}
