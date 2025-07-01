package com.gameshopcorp.heroes.character.basic.body.base;

//import com.gameshopcorp.heroes.supermesh.SuperCube;

import com.gameshopcorp.heroes.graphics.ATMS;
import com.gameshopcorp.heroes.graphics.SuperMesh;
import com.gameshopcorp.heroes.supermesh.SuperCube;
import com.gameshopcorp.heroes.supermesh.SuperSquare;
import com.jme3.math.Vector3f;
import com.jme3.math.Vector4f;
import com.jme3.scene.Node;

public class Base {

    public SuperMesh superMesh;


    public Base(int numPoints, Vector4f baseColor){

        ATMS atms = new ATMS("BlueCircle", 128,128);
        atms.layer.drawCircle(64,64, 128, baseColor);
//

        SuperSquare sTop = new SuperSquare("top", atms, new Node("top"), numPoints, new Vector3f(0,1,0), new Vector3f(1,1,0),new Vector3f(0,1,1),new Vector3f(1,1,1));
        SuperSquare sBottom = new SuperSquare("bottom", atms, new Node("bottom"), numPoints, new Vector3f(0,0,0), new Vector3f(1,0,0),new Vector3f(0,0,1),new Vector3f(1,0,1));
        SuperSquare sFront = new SuperSquare("front", atms, new Node("front"), numPoints, new Vector3f(0,0,1), new Vector3f(1,0,1),new Vector3f(0,1,1),new Vector3f(1,1,1));
        SuperSquare sBack = new SuperSquare("back", atms, new Node("back"), numPoints, new Vector3f(0,0,0), new Vector3f(1,0,0),new Vector3f(0,1,0),new Vector3f(1,1,0));
        SuperSquare sLeft = new SuperSquare("left", atms, new Node("left"), numPoints, new Vector3f(0,0,0), new Vector3f(0,0,1),new Vector3f(0,1,0),new Vector3f(0,1,1));
        SuperSquare sRight = new SuperSquare("right", atms, new Node("right"), numPoints, new Vector3f(1,0,0), new Vector3f(1,0,1),new Vector3f(1,1,0),new Vector3f(1,1,1));

        SuperCube superCube = new SuperCube(sTop, sBottom, sFront, sBack, sLeft, sRight);

        superMesh = superCube.superMesh;
    }
}
