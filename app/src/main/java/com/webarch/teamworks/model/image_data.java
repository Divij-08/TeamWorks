package com.webarch.teamworks.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class image_data {
    @SerializedName("albumId")
    private Integer albumId;
    @SerializedName("id")
    private Integer id;
    @SerializedName("title")
    private String title;
    @SerializedName("url")
    private String url;
    @SerializedName("thumbnailUrl")
    private String thumbnailUrl;

public image_data( Integer albumId, Integer id, String title, String url, String thumbnailUrl){

    this.albumId=albumId;
    this.id=id;
    this.title=title;
    this.url=url;
    this.thumbnailUrl=thumbnailUrl;


}
String baseImageurl = "https://jsonplaceholder.typicode.com/photos";


    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getBaseImageurl() {
        return baseImageurl;
    }

    public void setBaseImageurl(String baseImageurl) {
        this.baseImageurl = baseImageurl;
    }
}
