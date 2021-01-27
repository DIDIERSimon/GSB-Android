package com.example.gsbvisite.controller;

import com.example.gsbvisite.modele.Medicament;

import java.util.ArrayList;

public final class MedicamentController {

    private static MedicamentController medicamentController = null;
    private ArrayList<Medicament>medicaments;

    private MedicamentController(){
        super();
    }

    /**
     * Accesseur
     * @return : une instance unique  de MedicamentController (singleton)
     */
    public static final MedicamentController getInstance(){
        if(MedicamentController.medicamentController == null){
            MedicamentController.medicamentController = new MedicamentController();
        }
        return MedicamentController.medicamentController;
    }

    /**
     * Trouver un médicament par son indice dans l'arraylist
     * @param index
     * @return le médicament
     */
    public Medicament getMedicament(int index){
        return medicaments.get(index);
    }

    /**
     * Liste des médicaments
     * @return l'arraylist des médicaments
     */
    public ArrayList<Medicament> medicaments (){
        return medicaments;
    }

}
