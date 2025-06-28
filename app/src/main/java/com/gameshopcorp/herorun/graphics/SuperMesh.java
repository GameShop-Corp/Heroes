package com.gameshopcorp.herorun.graphics;

import java.util.Arrays;
import java.util.HashMap;

public class SuperMesh {

    HashMap<String, SuperSurface> superMesh;
    public SuperMesh(String[] names, SuperSurface[] superSurfaces){

        superMesh = new HashMap<>();
        int i = 0;
        for (String s: names){

            superMesh.put(s, superSurfaces[i]);
            i++;

        }
    }

}
