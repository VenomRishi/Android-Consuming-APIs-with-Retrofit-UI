package com.acer.dev.retrofitdemoui;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public final class EmpRetrofitAdapter {

    public static Retrofit retrofit;

    public Retrofit getInstance() {
        synchronized (this) {
            if (retrofit == null) {
                retrofit = new Retrofit
                        .Builder()
                        .baseUrl("http://www.json-generator.com/api/json/get/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
            }
            return retrofit;
        }
    }
}
