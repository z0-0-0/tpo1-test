package com.example.tpo.task3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DomainTest {

    @Test
    public void testBasic(){
        Human hero = new Human(24, false, "Зафод Библброкс", "");
        hero.ability = AbilityEnum.IDEAL;
        ArrayList<Human> population = new ArrayList<Human>();
        population.add(hero);
        Galaxy galaxy = new Galaxy(population);
        galaxy.conductPresidentRace(galaxy.population);
        assertEquals(hero, galaxy.president);
    }

    @Test
    public void testMultiple(){
        Human hero1 = new Human(25, false, "Зафод Библброкс", "");
        hero1.ability = AbilityEnum.IDEAL;
        Human hero2 = new Human(26, true, "Зафодина Билброксовна", "Учитель");
        hero2.ability = AbilityEnum.PRESIDENT;
        Human hero3 = new Human(27, false, "Антон Библброкс", "Безработный");
        Human hero4 = new Human(28, true, "Зафодорна Небиблброкс", "Сварщик");
        hero4.ability = AbilityEnum.BLUE_COLLAR;
        ArrayList<Human> population = new ArrayList<Human>();
        population.add(hero2);
        population.add(hero1);
        population.add(hero3);
        population.add(hero4);
        Galaxy galaxy = new Galaxy(population);
        galaxy.conductPresidentRace(galaxy.population);
        assertEquals(hero1, galaxy.president);
    }

 @Test
    public void testMultipleNoIdeal(){
        Human hero2 = new Human(26, true, "Зафодина Билброксовна", "Учитель");
        hero2.ability = AbilityEnum.PRESIDENT;
        Human hero3 = new Human(27, false, "Антон Библброкс", "Безработный");
        Human hero4 = new Human(28, true, "Зафодорна Небиблброкс", "Сварщик");
        hero4.ability = AbilityEnum.BLUE_COLLAR;
        ArrayList<Human> population = new ArrayList<Human>();
        population.add(hero2);
        population.add(hero3);
        population.add(hero4);
        Galaxy galaxy = new Galaxy(population);
        galaxy.conductPresidentRace(galaxy.population);
        assertTrue(galaxy.president.ability == AbilityEnum.PRESIDENT);;
    }

    @Test
    public void testNulls() throws NullPointerException{
        Galaxy galaxy = new Galaxy();
        try {
        galaxy.conductPresidentRace(null);
        } catch(NullPointerException err) {
            assertEquals(NullPointerException.class, err.getClass());
        }
    }
}
