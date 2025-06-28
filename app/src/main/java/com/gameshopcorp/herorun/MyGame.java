package com.gameshopcorp.herorun;

import com.gameshopcorp.herorun.app.App;
import com.gameshopcorp.herorun.graphics.ATMS;
import com.gameshopcorp.herorun.graphics.SuperLine;
import com.gameshopcorp.herorun.graphics.SuperSurface;
import com.jme3.app.SimpleApplication;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.math.Vector4f;
import com.jme3.scene.Node;
import com.jme3.texture.Texture2D;

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
        SuperLine superLine = new SuperLine(new Vector3f[]{new Vector3f(0,0,0),new Vector3f(1,0,0),new Vector3f(2,0,0),new Vector3f(3,0,0)}, 7);
        SuperLine superLine1 = new SuperLine(new Vector3f[]{new Vector3f(0,1,0),new Vector3f(1,1,1),new Vector3f(2,1,1),new Vector3f(3,1,0)}, 7);
        SuperLine superLine2 = new SuperLine(new Vector3f[]{new Vector3f(0,2,0),new Vector3f(1,2,1),new Vector3f(2,2,1),new Vector3f(3,2,0)}, 7);
        SuperLine superLine3 = new SuperLine(new Vector3f[]{new Vector3f(0,3,0),new Vector3f(1,3,0),new Vector3f(2,3,0),new Vector3f(3,3,0)}, 7);

        SuperSurface superSurface = new SuperSurface(new SuperLine[]{superLine, superLine1, superLine2, superLine3}, atms, this.getRootNode());

    }

}
