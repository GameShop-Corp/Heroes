package com.gameshopcorp.herorun.graphics;

import com.gameshopcorp.herorun.app.App;
import com.jme3.math.Vector2f;
import com.jme3.math.Vector3f;
import com.jme3.scene.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SuperMesh {

    public HashMap<String, SuperSurface> superMesh;
    public HashMap<String, ArrayList<String>> linkNames;
    public HashMap<String, ArrayList<Vector2f>> linkValues;
    Node node;
    public SuperMesh(String[] names, SuperSurface[] superSurfaces){

        superMesh = new HashMap<>();
        linkNames = new HashMap<>();
        linkValues = new HashMap<>();

        node = new Node("SuperMesh");
        int i = 0;
        for (String s: names){

            superMesh.put(s, superSurfaces[i]);
            node.attachChild(superSurfaces[i].node);
            i++;

        }

        App.getInstance().app.getRootNode().attachChild(node);


    }

    public void linkPoints(String name, String[] superSurfaceNames, Vector2f[] superSurfacePoints){

        linkNames.put(name, (ArrayList<String>) Arrays.asList(superSurfaceNames));
        linkValues.put(name, (ArrayList<Vector2f>) Arrays.asList(superSurfacePoints));

    }

    public void moveLinkedPoint(String name, Vector3f move){


    }

}
