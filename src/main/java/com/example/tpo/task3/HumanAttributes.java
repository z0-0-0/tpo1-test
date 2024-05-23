package com.example.tpo.task3;

public abstract class HumanAttributes {
    public String attitude = "";
    public String ability = "";
    public boolean knows_galaxy = false;

    public void setAttributes(String attitude, String ability, boolean knows_galaxy){
        this.attitude = attitude;
        this.ability = ability;
        this.knows_galaxy = knows_galaxy;
    }
}
