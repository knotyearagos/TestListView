package com.example.knot.testlistview;

import com.example.knot.testlistview.Model.Animal;
import java.util.ArrayList;

public class AnimalData {

    private static AnimalData sInstance;

    public ArrayList<Animal> animalList;

    public static AnimalData getInstance() {
        if (sInstance == null) {
            sInstance = new AnimalData();
        }
        return sInstance;
    }

}

