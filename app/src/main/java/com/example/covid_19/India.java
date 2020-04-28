package com.example.covid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class India extends AppCompatActivity {
    TextView country,confirmed,recovered,critical,deaths;
    PostResponse p;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_india);
        country = findViewById(R.id.country_cases);
        confirmed = findViewById(R.id.confirmed_cases);
        recovered = findViewById(R.id.recovered_cases);
        critical = findViewById(R.id.critical_cases);
        deaths = findViewById(R.id.deaths_cases);
        Call<PostResponse> call = RetrofitClient
                .getInstance()
                .getApi()
                .list();
        call.enqueue(new Callback<PostResponse>() {
            @Override
            public void onResponse(Call<PostResponse> call, Response<PostResponse> response) {
                try {

                    p = response.body();

                    country.setText(p.getCountry());
                    confirmed.setText(p.getCases()+"");
                    recovered.setText(p.getDeaths()+"");
                    critical.setText(p.getCritical()+"");
                    deaths.setText(p.getRecovered()+"");



                } catch (Exception e) {
                    Toast.makeText(India.this, e.getMessage()+"response", Toast.LENGTH_LONG).show();
                }
            }
            @Override
            public void onFailure(Call<PostResponse> call, Throwable t) {
                Toast.makeText(India.this,t.getMessage()+"failure" , Toast.LENGTH_LONG).show();
            }
        });


    }
}
