package com.gameshopcorp.herorun.graphics;

import com.gameshopcorp.herorun.app.App;
import com.jme3.scene.Node;

import java.util.Arrays;
import java.util.HashMap;

public class SuperMesh {

    public HashMap<String, SuperSurface> superMesh;
    Node node;
    public SuperMesh(String[] names, SuperSurface[] superSurfaces){

        superMesh = new HashMap<>();
        node = new Node("SuperMesh");
        int i = 0;
        for (String s: names){

            superMesh.put(s, superSurfaces[i]);
            node.attachChild(superSurfaces[i].node);
            i++;

        }

        App.getInstance().app.getRootNode().attachChild(node);


    }

}
