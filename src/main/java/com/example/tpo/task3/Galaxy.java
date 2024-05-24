package com.example.tpo.task3;

import java.util.ArrayList;
import java.util.Collection;

public class Galaxy {
   public Human president;
   public int presidentTerm;
   public ArrayList<Human> population = new ArrayList<Human>();

   public Galaxy(){
      this.president = new Human();
      this.president.occupation = "President";
      this.population.add(president);
   }

   public Galaxy(Collection<Human> humans){
      this.president = new Human();
      this.population = new ArrayList<Human>(humans);
      this.population.add(president);
   }

   public void conductPresidentRace(ArrayList<Human> candidates){
      president.occupation = "";
      president = Race.conductPresidentRace(candidates);
      president.occupation = "President";
      presidentTerm = 4;
   }
}
