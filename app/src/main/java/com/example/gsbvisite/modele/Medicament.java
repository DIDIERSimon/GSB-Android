package com.example.gsbvisite.modele;

public class Medicament {

    private String MDepotLegal;
    private String MNomCommercial;
    private String MComposition;
    private String MPrixEchant;

    public Medicament(String MDepotLegal, String MNomCommercial, String MComposition, String MPrixEchant) {
        this.MDepotLegal = MDepotLegal;
        this.MNomCommercial = MNomCommercial;
        this.MComposition = MComposition;
        this.MPrixEchant = MPrixEchant;
    }

    public String getMDepotLegal() {
        return MDepotLegal;
    }

    public String getMNomCommercial() {
        return MNomCommercial;
    }

    public String getMComposition() {
        return MComposition;
    }

    public String getMPrixEchant() {
        return MPrixEchant;
    }

    public void setMDepotLegal(String MDepotLegal) {
        this.MDepotLegal = MDepotLegal;
    }

    public void setMNomCommercial(String MNomCommercial) {
        this.MNomCommercial = MNomCommercial;
    }

    public void setMComposition(String MComposition) {
        this.MComposition = MComposition;
    }

    public void setMPrixEchant(String MPrixEchant) {
        this.MPrixEchant = MPrixEchant;
    }
}
