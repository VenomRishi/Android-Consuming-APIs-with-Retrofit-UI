package com.acer.dev.retrofitdemoui;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private EmpRetrofitService retrofitService;

    private RecyclerView empRV;
    private EmployeeAdapter employeeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        empRV = findViewById(R.id.empRV);

        http:
//www.json-generator.com/api/json/get/craAWcNScy
        https:
//guides.codepath.com/android/consuming-apis-with-retrofit

        retrofitService = new EmpRetrofitAdapter()
                .getInstance()
                .create(EmpRetrofitService.class);

        retrofitService
                .getAllEmployees()
                .enqueue(new Callback<Employees>() {
                    @Override
                    public void onResponse(Call<Employees> call, Response<Employees> response) {
                        Log.i("rishi", "Response is " + response.body());

                        EmployeeAdapter employeeAdapter = new EmployeeAdapter(response.body().employees);
                        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
                        empRV.setLayoutManager(layoutManager);
                        empRV.setItemAnimator(new DefaultItemAnimator());
                        empRV.setAdapter(employeeAdapter);
                    }

                    @Override
                    public void onFailure(Call<Employees> call, Throwable t) {
                        Log.i("rishi", "Something wrong happened!");
                    }
                });
    }
}
