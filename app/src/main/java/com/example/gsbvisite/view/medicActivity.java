package com.example.gsbvisite.view;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.gsbvisite.R;
import com.example.gsbvisite.controller.MedicamentController;

public class medicActivity extends AppCompatActivity {

    ListView lvMedicaments;
    MedicamentController medicamentController;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medic);
        lvMedicaments = findViewById(R.id.listMedicaments);
        String[] listeStrings = {"Aspirine", "Doliprane", "Ibuprofène"};

        lvMedicaments.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listeStrings));

        this.medicamentController = MedicamentController.getInstance();

        callManager();
    }

    private void callManager(){
        //callback button
         findViewById(R.id.callBack_Btn).setOnClickListener(v -> {
            Intent intent = new Intent(medicActivity.this, GSBVisite.class);
            startActivity(intent);
        });

        //click on medic
        lvMedicaments.setOnItemClickListener((parent, view, position, id) -> {
            String value = (String)lvMedicaments.getAdapter().getItem(position);
            Toast.makeText(getApplicationContext(),value,Toast.LENGTH_SHORT).show();
        });
    }


}
