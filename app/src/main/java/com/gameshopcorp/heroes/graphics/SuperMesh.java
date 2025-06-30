package com.gameshopcorp.heroes.graphics;

import com.gameshopcorp.heroes.app.App;
import com.jme3.math.Vector2f;
import com.jme3.math.Vector3f;
import com.jme3.scene.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SuperMesh {

    public HashMap<String, SuperSurface> superMesh;
//    public HashMap<String, ArrayList<String>> linkNames;
//    public HashMap<String, ArrayList<Vector2f>> linkValues;
    Node node;
    public SuperMesh(String[] names, SuperSurface[] superSurfaces){

        superMesh = new HashMap<>();
//        linkNames = new HashMap<>();
//        linkValues = new HashMap<>();

        node = new Node("SuperMesh");
        int i = 0;
        for (String s: names){

            superMesh.put(s, superSurfaces[i]);
            node.attachChild(superSurfaces[i].node);
            i++;

        }

        App.getInstance().app.getRootNode().attachChild(node);


    }

//    public void linkPoints(String name, String[] superSurfaceNames, Vector2f[] superSurfacePoints){
//
//        ArrayList<String> namesArray = new ArrayList<>(Arrays.asList(superSurfaceNames));
//
//        ArrayList<Vector2f> pointsArray = new ArrayList<>(Arrays.asList(superSurfacePoints));
//
//        linkNames.put(name, namesArray);
//        linkValues.put(name, pointsArray);
//
//    }

//    public void moveLinkedPoint(String name, Vector3f move){
//
//        for (int i = 0; i < linkNames.get(name).size(); i++){
//
//                superMesh.get(linkNames.get(name).get(i)).moveSuperLine((byte) linkValues.get(name).get(i).x, (byte) linkValues.get(name).get(i).y, new Vector3f(move));
//
//        }
//
//    }

}
