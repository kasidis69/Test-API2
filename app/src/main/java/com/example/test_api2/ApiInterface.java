package com.example.test_api2;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {


        @GET("coins")
        Call<CoinResponse> getCompanies(@Query("api_key") String apiKey);

        @GET("coins/{id}")
        Call<CoinResponse> getCompany(@Path("id") int id, @Query("api_key") String apiKey);

        @GET("coins/geo/{id}")
        Call<CoinResponse> getCompaniesByGeo(@Path("id") int id, @Query("api_key") String apiKey);
    }


