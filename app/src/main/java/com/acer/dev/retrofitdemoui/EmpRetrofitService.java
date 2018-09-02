package com.acer.dev.retrofitdemoui;

import retrofit2.Call;
import retrofit2.http.GET;

public interface EmpRetrofitService {
    @GET("cpzhFZEKJK")
    Call<Employees> getAllEmployees();
}
