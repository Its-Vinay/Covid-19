package com.example.covid_19;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private Retrofit retrofit;
    private static final String baseUrl = "https://corona.lmao.ninja/v2/";
    private static RetrofitClient mInstance;

    private RetrofitClient(){
        retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    public static synchronized RetrofitClient getInstance(){
        if(mInstance==null)
            mInstance = new RetrofitClient();
        return mInstance;
    }
    public Api getApi(){
        return retrofit.create(Api.class);
    }

}
