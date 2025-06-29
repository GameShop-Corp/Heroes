package com.gameshopcorp.heroes;

import com.gameshopcorp.heroes.app.App;
import com.gameshopcorp.heroes.graphics.ATMS;
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

        ATMS atms = new ATMS("BlueCircle", 128,128);
        atms.layer.drawCircle(64,64, 64,new Vector4f(0,0,255,255));
//        SuperLine superLine = new SuperLine(new Vector3f[]{new Vector3f(0,0,0),new Vector3f(0,0,0),new Vector3f(0,0,1),new Vector3f(0,0,1)}, 7);
//        SuperLine superLine1 = new SuperLine(new Vector3f[]{new Vector3f(0,1,0),new Vector3f(0,1,0),new Vector3f(0,1,1),new Vector3f(0,1,1)}, 7);
//        SuperLine superLine2 = new SuperLine(new Vector3f[]{new Vector3f(0,2,0),new Vector3f(0,2,0),new Vector3f(0,2,1),new Vector3f(0,2,1)}, 7);
//        SuperLine superLine3 = new SuperLine(new Vector3f[]{new Vector3f(0,3,0),new Vector3f(0,3,0),new Vector3f(0,3,1),new Vector3f(0,3,1)}, 7);
//
//        SuperSurface superSurface = new SuperSurface(new SuperLine[]{superLine, superLine1, superLine2, superLine3}, atms, this.getRootNode());

        int numPoints = 4;
        SuperSquare sTop = new SuperSquare("top", atms, new Node("top"), numPoints, new Vector3f(0,1,0), new Vector3f(1,1,0),new Vector3f(0,1,1),new Vector3f(1,1,1));
        SuperSquare sBottom = new SuperSquare("bottom", atms, new Node("bottom"), numPoints, new Vector3f(0,0,0), new Vector3f(1,0,0),new Vector3f(0,0,1),new Vector3f(1,0,1));
        SuperSquare sFront = new SuperSquare("front", atms, new Node("front"), numPoints, new Vector3f(0,0,1), new Vector3f(1,0,1),new Vector3f(0,1,1),new Vector3f(1,1,1));
        SuperSquare sBack = new SuperSquare("back", atms, new Node("back"), numPoints, new Vector3f(0,0,0), new Vector3f(1,0,0),new Vector3f(0,1,0),new Vector3f(1,1,0));
        SuperSquare sLeft = new SuperSquare("left", atms, new Node("left"), numPoints, new Vector3f(0,0,0), new Vector3f(0,0,1),new Vector3f(0,1,0),new Vector3f(0,1,1));
        SuperSquare sRight = new SuperSquare("right", atms, new Node("right"), numPoints, new Vector3f(1,0,0), new Vector3f(1,0,1),new Vector3f(1,1,0),new Vector3f(1,1,1));

        SuperCube superCube = new SuperCube(sTop, sBottom, sFront, sBack, sLeft, sRight);

        ArrayList<String> joins = new ArrayList<>();

        if (superCube.superMesh.superMesh.containsKey("top")){
            joins.add("top");
        }

        if (superCube.superMesh.superMesh.containsKey("left")){
            joins.add("left");
        }

        if (superCube.superMesh.superMesh.containsKey("front")){
            joins.add("front");
        }


        superCube.superMesh.linkPoints("topLeftFront",new String[]{joins.get(2)}, new Vector2f[]{new Vector2f(3, 0)});
        superCube.superMesh.moveLinkedPoint("topLeftFront", new Vector3f(-1,1,1));
        superCube.superMesh.superMesh.get("front").atms.layer.drawCircle(64,64,64,new Vector4f(0,0,255,255));
        superCube.superMesh.superMesh.get("front").updateSimpleMeshes();
    }

}
