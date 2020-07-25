package com.webarch.teamworks.API;

import com.webarch.teamworks.model.image_data;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Service {
    @GET("image_data")
        Call<image_data> getData(@Query("api_key") String apiKey);




}
