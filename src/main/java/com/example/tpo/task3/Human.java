package com.example.tpo.task3;

public class Human extends HumanAttributes  {
    public int age;
    public boolean sex;
    public String name;
    public String occupation;

    public Human(){
        this.age = 0;
        this.sex = false;
        this.name = "";
        this.occupation = "";
        this.ability = AbilityEnum.BLUE_COLLAR;
    }

    public Human(int age, boolean sex, String name, String occupation){
        this.age = age;
        this.sex = sex;
        this.name = name;
        this.occupation = occupation;
        this.ability = AbilityEnum.BLUE_COLLAR;
    }
}
