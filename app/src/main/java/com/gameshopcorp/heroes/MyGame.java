package com.gameshopcorp.heroes;

import com.gameshopcorp.heroes.animation.SuperJoin;
import com.gameshopcorp.heroes.app.App;
import com.gameshopcorp.heroes.character.basic.body.Head;
import com.gameshopcorp.heroes.graphics.ATMS;
import com.gameshopcorp.heroes.graphics.SuperSurface;
import com.gameshopcorp.heroes.supermesh.SuperCube;
import com.gameshopcorp.heroes.supermesh.SuperSquare;
import com.jme3.app.SimpleApplication;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector2f;
import com.jme3.math.Vector3f;
import com.jme3.math.Vector4f;
import com.jme3.scene.Node;

import java.util.ArrayList;

import de.lessvoid.nifty.Nifty;

public final class MyGame extends SimpleApplication {


    private Nifty nifty;


    @Override
    public void simpleInitApp() {
        App.getInstance().app = this;

        flyCam.setEnabled(true);

        getViewPort().setBackgroundColor(ColorRGBA.White);

        Head head = new Head(7, new Vector4f(255,215,172,255));

//        ATMS atms = new ATMS("BlueCircle", 128,128);
//        atms.layer.drawCircle(64,64, 64,new Vector4f(0,0,255,255));
////
//        int numPoints = 4;
//        SuperSquare sTop = new SuperSquare("top", atms, new Node("top"), numPoints, new Vector3f(0,1,0), new Vector3f(1,1,0),new Vector3f(0,1,1),new Vector3f(1,1,1));
//        SuperSquare sBottom = new SuperSquare("bottom", atms, new Node("bottom"), numPoints, new Vector3f(0,0,0), new Vector3f(1,0,0),new Vector3f(0,0,1),new Vector3f(1,0,1));
//        SuperSquare sFront = new SuperSquare("front", atms, new Node("front"), numPoints, new Vector3f(0,0,1), new Vector3f(1,0,1),new Vector3f(0,1,1),new Vector3f(1,1,1));
//        SuperSquare sBack = new SuperSquare("back", atms, new Node("back"), numPoints, new Vector3f(0,0,0), new Vector3f(1,0,0),new Vector3f(0,1,0),new Vector3f(1,1,0));
//        SuperSquare sLeft = new SuperSquare("left", atms, new Node("left"), numPoints, new Vector3f(0,0,0), new Vector3f(0,0,1),new Vector3f(0,1,0),new Vector3f(0,1,1));
//        SuperSquare sRight = new SuperSquare("right", atms, new Node("right"), numPoints, new Vector3f(1,0,0), new Vector3f(1,0,1),new Vector3f(1,1,0),new Vector3f(1,1,1));
//
//        SuperCube superCube = new SuperCube(sTop, sBottom, sFront, sBack, sLeft, sRight);
//
//        //superCube.superMesh.node.scale(2);
//        SuperJoin superJoin = new SuperJoin(new SuperSurface[]{superCube.superMesh.superMesh.get("top"),superCube.superMesh.superMesh.get("back"),superCube.superMesh.superMesh.get("left")}, new Vector2f[]{new Vector2f(0,0), new Vector2f(3,0), new Vector2f(3,0)});
//        superJoin.moveJoin(new Vector3f(-1,1,-1));
//        superCube.superMesh.superMesh.get("top").updateSimpleMeshes();
//        superCube.superMesh.superMesh.get("back").updateSimpleMeshes();
//        superCube.superMesh.superMesh.get("left").updateSimpleMeshes();
    }

}
