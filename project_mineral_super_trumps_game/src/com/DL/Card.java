package com.DL;

/**
 * Created by danelennon on 18/08/2016.
 */
public class Card {
    private String fileName;
    private String imageName;
    private String cardType;
    private String title;
    private String chemistry;
    private String classification;
    private String crystalSystem;
    private String[] occrance;
    private int hardness;
    private int specGravity;
    private String cleavage;
    private String crystalAbundance;
    private String economicValue;

    public Card(String fileName, String imageName, String cardType, String title, String chemistry, String classification, String crystalSystem, String[] occrance, int hardness, int specGravity, String cleavage, String crystalAbundance, String economicValue) {
        this.fileName = fileName;
        this.imageName = imageName;
        this.cardType = cardType;
        this.title = title;
        this.chemistry = chemistry;
        this.classification = classification;
        this.crystalSystem = crystalSystem;
        this.occrance = occrance;
        this.hardness = hardness;
        this.specGravity = specGravity;
        this.cleavage = cleavage;
        this.crystalAbundance = crystalAbundance;
        this.economicValue = economicValue;
    }

    //---------------GETTERS-------------
    public String getFileName() {
        return fileName;
    }

    public String getImageName() {
        return imageName;
    }

    public String getCardType() {
        return cardType;
    }

    public String getTitle() {
        return title;
    }

    public String getChemistry() {
        return chemistry;
    }

    public String getClassification() {
        return classification;
    }

    public String getCrystalSystem() {
        return crystalSystem;
    }

    public String[] getOccrance() {
        return occrance;
    }

    public int getHardness() {
        return hardness;
    }

    public int getSpecGravity() {
        return specGravity;
    }

    public String getCleavage() {
        return cleavage;
    }

    public String getCrystalAbundance() {
        return crystalAbundance;
    }

    public String getEconomicValue() {
        return economicValue;
    }
}
