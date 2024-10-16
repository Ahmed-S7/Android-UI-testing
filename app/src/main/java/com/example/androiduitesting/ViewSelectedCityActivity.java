package com.example.androiduitesting;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ViewSelectedCityActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selectedcityview);


        Intent viewCityIntent = getIntent();
        String cityToView = viewCityIntent.getStringExtra("cityName");

        TextView cityName  = findViewById(R.id.city_name);
        Button backButton = findViewById(R.id.back_to_main_button);

        cityName.setText(cityToView);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               finish();
            }
        });

}

//public void switchToMainActivity(){
   // finish();
//}

}
