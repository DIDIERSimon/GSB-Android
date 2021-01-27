package com.example.gsbvisite.view;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.gsbvisite.R;

public class GSBVisite extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gsbvisite);
        callManager();
    }

    private void callManager(){
        findViewById(R.id.PRDV_Btn).setOnClickListener(v -> {
            Intent intent = new Intent(GSBVisite.this, prdvActivity.class);
            startActivity(intent);
        });
        findViewById(R.id.LRDV_Btn).setOnClickListener(v -> {
            Intent intent = new Intent(GSBVisite.this, lrdvActivity.class);
            startActivity(intent);
        });
        findViewById(R.id.MED_Btn).setOnClickListener(v -> {
            Intent intent = new Intent(GSBVisite.this, medicActivity.class);
            startActivity(intent);
        });
    }

}