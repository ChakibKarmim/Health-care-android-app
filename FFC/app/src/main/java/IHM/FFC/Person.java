package IHM.FFC;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;


public class Person implements Parcelable {

    // Je suis
    private String nom;
    private String sexe;
    private String age;
    // Mon Coeur
    private String prob_cardiaqua;
    private String prob_colesterol;
    private String diabet;
    private String hyperT;
    private String parent_prob;
    private String IMC;
    // Mon suivi Cardiaque
    private String cardiovasculaire;
    private String bilan_car;
    private String cardiologue;
    // Mon alimentation
    private String petit_dej;
    private String fruits_legume;
    private String bouffe_domicile;
    private String sel;
    private String charcuterie;
    private String Nutri_score;
    // Mon activité physic
    private String pas_quotidient;
    private String sport_hebdo;
    private String fréquence_cardiaque;
    private String profile_sportif;
    private String activité_weekend;
    // Consomation tabac
    private String fumez_par_jour;
    private String ancien_fumeur;
    private String autre_fumeur;
    // Gestion de stress
    private String antidépresseur;
    private String gestion_famille;
    private String str_anx;
    private String colére;
    // Hygiéne de vie
    private String verre_alco;
    private String boisson_energ;
    private String dormir_7h;
    private String trouble_somm;



    protected Person(Parcel in) {
        nom = in.readString();
        sexe = in.readString();
        age = in.readString();
        prob_cardiaqua = in.readString();
        prob_colesterol = in.readString();
        diabet = in.readString();
        hyperT = in.readString();
        parent_prob = in.readString();
        IMC = in.readString();
        cardiovasculaire = in.readString();
        bilan_car = in.readString();
        cardiologue = in.readString();
        petit_dej = in.readString();
        fruits_legume = in.readString();
        bouffe_domicile = in.readString();
        sel = in.readString();
        charcuterie = in.readString();
        Nutri_score = in.readString();
        pas_quotidient = in.readString();
        sport_hebdo = in.readString();
        fréquence_cardiaque = in.readString();
        profile_sportif = in.readString();
        activité_weekend = in.readString();
        fumez_par_jour = in.readString();
        ancien_fumeur = in.readString();
        autre_fumeur = in.readString();
        antidépresseur = in.readString();
        gestion_famille = in.readString();
        str_anx = in.readString();
        colére = in.readString();
        verre_alco = in.readString();
        boisson_energ = in.readString();
        dormir_7h = in.readString();
        trouble_somm = in.readString();
    }

    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel in) {
            return new Person(in);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };

    public Person(){

    }

    public String getNom() {
        return nom;
    }

    public String getSexe() {
        return sexe;
    }

    public String getAge() {
        return age;
    }

    public String getProb_cardiaqua() {
        return prob_cardiaqua;
    }

    public String getProb_colesterol() {
        return prob_colesterol;
    }

    public String getDiabet() {
        return diabet;
    }

    public String getHyperT() {
        return hyperT;
    }

    public String getParent_prob() {
        return parent_prob;
    }

    public String getIMC() {
        return IMC;
    }

    public String getCardiovasculaire() {
        return cardiovasculaire;
    }

    public String getBilan_car() {
        return bilan_car;
    }

    public String getCardiologue() {
        return cardiologue;
    }

    public String getPetit_dej() {
        return petit_dej;
    }

    public String getFruits_legume() {
        return fruits_legume;
    }

    public String getBouffe_domicile() {
        return bouffe_domicile;
    }

    public String getSel() {
        return sel;
    }

    public String getCharcuterie() {
        return charcuterie;
    }

    public String getNutri_score() {
        return Nutri_score;
    }

    public String getPas_quotidient() {
        return pas_quotidient;
    }

    public String getSport_hebdo() {
        return sport_hebdo;
    }

    public String getFréquence_cardiaque() {
        return fréquence_cardiaque;
    }

    public String getProfile_sportif() {
        return profile_sportif;
    }

    public String getActivité_weekend() {
        return activité_weekend;
    }

    public String getFumez_par_jour() {
        return fumez_par_jour;
    }

    public String getAncien_fumeur() {
        return ancien_fumeur;
    }

    public String getAutre_fumeur() {
        return autre_fumeur;
    }

    public String getAntidépresseur() {
        return antidépresseur;
    }

    public String getGestion_famille() {
        return gestion_famille;
    }

    public String getStr_anx() {
        return str_anx;
    }

    public String getColére() {
        return colére;
    }

    public String getVerre_alco() {
        return verre_alco;
    }

    public String getBoisson_energ() {
        return boisson_energ;
    }

    public String getDormir_7h() {
        return dormir_7h;
    }

    public String getTrouble_somm() {
        return trouble_somm;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setProb_cardiaqua(String prob_cardiaqua) {
        this.prob_cardiaqua = prob_cardiaqua;
    }

    public void setProb_colesterol(String prob_colesterol) {
        this.prob_colesterol = prob_colesterol;
    }

    public void setDiabet(String diabet) {
        this.diabet = diabet;
    }

    public void setHyperT(String hyperT) {
        this.hyperT = hyperT;
    }

    public void setParent_prob(String parent_prob) {
        this.parent_prob = parent_prob;
    }

    public void setIMC(String IMC) {
        this.IMC = IMC;
    }

    public void setCardiovasculaire(String cardiovasculaire) {
        this.cardiovasculaire = cardiovasculaire;
    }

    public void setBilan_car(String bilan_car) {
        this.bilan_car = bilan_car;
    }

    public void setCardiologue(String cardiologue) {
        this.cardiologue = cardiologue;
    }

    public void setPetit_dej(String petit_dej) {
        this.petit_dej = petit_dej;
    }

    public void setFruits_legume(String fruits_legume) {
        this.fruits_legume = fruits_legume;
    }

    public void setBouffe_domicile(String bouffe_domicile) {
        this.bouffe_domicile = bouffe_domicile;
    }

    public void setSel(String sel) {
        this.sel = sel;
    }

    public void setCharcuterie(String charcuterie) {
        this.charcuterie = charcuterie;
    }

    public void setNutri_score(String nutri_score) {
        Nutri_score = nutri_score;
    }

    public void setPas_quotidient(String pas_quotidient) {
        this.pas_quotidient = pas_quotidient;
    }

    public void setSport_hebdo(String sport_hebdo) {
        this.sport_hebdo = sport_hebdo;
    }

    public void setFréquence_cardiaque(String fréquence_cardiaque) {
        this.fréquence_cardiaque = fréquence_cardiaque;
    }

    public void setProfile_sportif(String profile_sportif) {
        this.profile_sportif = profile_sportif;
    }

    public void setActivité_weekend(String activité_weekend) {
        this.activité_weekend = activité_weekend;
    }

    public void setFumez_par_jour(String fumez_par_jour) {
        this.fumez_par_jour = fumez_par_jour;
    }

    public void setAncien_fumeur(String ancien_fumeur) {
        this.ancien_fumeur = ancien_fumeur;
    }

    public void setAutre_fumeur(String autre_fumeur) {
        this.autre_fumeur = autre_fumeur;
    }

    public void setAntidépresseur(String antidépresseur) {
        this.antidépresseur = antidépresseur;
    }

    public void setGestion_famille(String gestion_famille) {
        this.gestion_famille = gestion_famille;
    }

    public void setStr_anx(String str_anx) {
        this.str_anx = str_anx;
    }

    public void setColére(String colére) {
        this.colére = colére;
    }

    public void setVerre_alco(String verre_alco) {
        this.verre_alco = verre_alco;
    }

    public void setBoisson_energ(String boisson_energ) {
        this.boisson_energ = boisson_energ;
    }

    public void setDormir_7h(String dormir_7h) {
        this.dormir_7h = dormir_7h;
    }

    public void setTrouble_somm(String trouble_somm) {
        this.trouble_somm = trouble_somm;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nom);
        parcel.writeString(sexe);
        parcel.writeString(age);
        parcel.writeString(prob_cardiaqua);
        parcel.writeString(prob_colesterol);
        parcel.writeString(diabet);
        parcel.writeString(hyperT);
        parcel.writeString(parent_prob);
        parcel.writeString(IMC);
        parcel.writeString(cardiovasculaire);
        parcel.writeString(bilan_car);
        parcel.writeString(cardiologue);
        parcel.writeString(petit_dej);
        parcel.writeString(fruits_legume);
        parcel.writeString(bouffe_domicile);
        parcel.writeString(sel);
        parcel.writeString(charcuterie);
        parcel.writeString(Nutri_score);
        parcel.writeString(pas_quotidient);
        parcel.writeString(sport_hebdo);
        parcel.writeString(fréquence_cardiaque);
        parcel.writeString(profile_sportif);
        parcel.writeString(activité_weekend);
        parcel.writeString(fumez_par_jour);
        parcel.writeString(ancien_fumeur);
        parcel.writeString(autre_fumeur);
        parcel.writeString(antidépresseur);
        parcel.writeString(gestion_famille);
        parcel.writeString(str_anx);
        parcel.writeString(colére);
        parcel.writeString(verre_alco);
        parcel.writeString(boisson_energ);
        parcel.writeString(dormir_7h);
        parcel.writeString(trouble_somm);
    }



}
