package com.example.gsbvisite.modele;

import android.content.Context;

public class Dal {

    private String dbName = "GsbDb.sqlite";
    private String version;
    private GsbDb createDb;

    public Dal(Context context){
        createDb = new GsbDb(context, dbName, null, 1);
    }

    public GsbDb getCreateDb(){
        return createDb;
    }

}
