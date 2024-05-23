package com.example.tpo.task3;

public abstract class Human extends HumanAttributes  {
    public int age;
    public boolean sex;
    public String name;

    public Human(){
        this.age = 0;
        this.sex = false;
        this.name = "";
    }

    public Human(int age, boolean sex, String name){
        this.age = age;
        this.sex = sex;
        this.name = name;
    }
}
