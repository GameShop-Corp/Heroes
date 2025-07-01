package com.gameshopcorp.heroes;

import com.gameshopcorp.heroes.animation.SuperJoin;
import com.gameshopcorp.heroes.app.App;
import com.gameshopcorp.heroes.character.basic.body.Head;
import com.gameshopcorp.heroes.character.basic.body.Neck;
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
        Neck neck = new Neck(7, new Vector4f(255,215,172,255));
        neck.superMesh.node.scale(.5f,1.5f, .5f);
        neck.superMesh.node.move(.25f,-1f,-.25f);




    }

}
