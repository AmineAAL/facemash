package com.catmash.backcatmash.dto;

import java.util.List;

public class CatsList {

    private List<CatDto>  images;

    public CatsList() {
    }

    public CatsList(List<CatDto> images) {
        this.images = images;
    }

    public List<CatDto> getImages() {
        return images;
    }

    public void setImages(List<CatDto> images) {
        this.images = images;
    }
}
