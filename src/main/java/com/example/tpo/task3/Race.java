package com.example.tpo.task3;

import java.util.ArrayList;
import java.util.Iterator;

public class Race {
    public static Human conductPresidentRace(ArrayList<Human> candidates) {
        ArrayList<Human> winners = Race.checkAttributes(candidates);
        return winners.get(0);
    }

    private static ArrayList<Human> checkAttributes(ArrayList<Human> candidates) {
        Iterator<Human> iter = candidates.iterator();
        ArrayList<Human> valid = new ArrayList<Human>();
        while (iter.hasNext()) {
            Human next = iter.next();
            if (next.ability != null) {
                if (next.ability == AbilityEnum.PRESIDENT) {
                    valid.add(next);
                }
                if (next.ability == AbilityEnum.IDEAL) {
                    valid.addFirst(next);
                    return valid;
                }
            }
        }
        return valid;
    }
}
