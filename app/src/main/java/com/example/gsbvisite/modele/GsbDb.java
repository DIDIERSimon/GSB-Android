package com.example.gsbvisite.modele;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

public class GsbDb extends SQLiteOpenHelper {

    //propriétés
    private String creation = "create table Medicament(" +
            "DepotLegale TEXT primary key," +
            "NomCommercial TEXT NOT NULL," +
            "Composition TEXT NOT NULL," +
            "Effet TEXT NOT NULL," +
            "ContreIndication TEXT," +
            "PrixEchant REAL NOT NULL)";

    /**
     * Constructeur
     * @param context
     * @param name
     * @param factory
     * @param version
     */
    public GsbDb(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    /**
     * Si changement de base de données
     * @param db
     */
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS Medicament");
        db.execSQL(creation);
    }

    /**
     * Si changement de version de la base de données
     * @param db
     * @param oldVersion
     * @param newVersion
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
