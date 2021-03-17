package com.moedasvirtuai.alan.criptocalc.api;

import com.moedasvirtuai.alan.criptocalc.Modelo.Moeda;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    String BASE_URL = "https://api.coinmarketcap.com/v1/";

    @GET("ticker/")
    Call<List<Moeda>> getMoedasApi();
}


