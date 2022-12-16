package com.javarush.module2.project.domain;

import com.javarush.module2.project.domain.animal.Animal;
import com.javarush.module2.project.domain.animal.Horse;
import com.javarush.module2.project.domain.animal.Wolf;

import java.util.HashMap;
import java.util.Map;

// Tell Don't Ask
public class Settings {

    public static final Map<Class<? extends Animal>, Map<Class<? extends Animal>, Integer>> animalToTable = new HashMap<>();

    // from file
    // 1) конь, волк, утка, гусень, растение
    static {
        Map<Class<? extends Animal>, Integer> wolfMap = new HashMap<>();
        wolfMap.put(Horse.class, 10);
//        wolfMap.put("plant", 0);
        animalToTable.put(Wolf.class, wolfMap);
    }

    public int getPercent(String predator, String victim){
        //NPE ???
        return animalToTable.get(predator).get(victim);
    }


}
