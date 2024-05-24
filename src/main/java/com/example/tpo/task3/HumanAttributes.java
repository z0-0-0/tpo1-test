package com.example.tpo.task3;

public abstract class HumanAttributes {
    public AttitudeEnum attitude = AttitudeEnum.NEUTRAL;
    public AbilityEnum ability;
    public boolean knows_galaxy = false;

    public void setAttributes(AttitudeEnum attitude, AbilityEnum ability, boolean knows_galaxy){
        this.attitude = attitude;
        this.ability = ability;
        this.knows_galaxy = knows_galaxy;
    }
}
