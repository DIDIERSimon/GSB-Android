package com.example.gsbvisite.view;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.gsbvisite.R;

public class lrdvActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lrdv);
        callManager();
    }

    private void callManager(){
        findViewById(R.id.callBack_Btn).setOnClickListener(v ->{
            Intent intent = new Intent(lrdvActivity.this, GSBVisite.class);
            startActivity(intent);
        });
    }

}
