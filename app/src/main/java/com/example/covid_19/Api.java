package com.example.covid_19;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {

    @GET("countries/India")
    Call<PostResponse> list();

    @GET("countries")
    Call<List<Country>> country();

}
