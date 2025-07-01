package com.gameshopcorp.heroes.character.basic.body;

import com.gameshopcorp.heroes.character.basic.body.base.Base;
import com.gameshopcorp.heroes.supermesh.SuperCube;
import com.jme3.math.Vector3f;
import com.jme3.math.Vector4f;

public class Head extends Base {

    public Head(int numPoints, Vector4f baseColor){
        super(numPoints, baseColor);

        this.superMesh.superJoins.get("bottomFrontLeft").moveJoin(new Vector3f(.25f,.25f,-.25f));

        this.superMesh.superJoins.get("edgeBottomFrontMidLeft").moveJoin(new Vector3f(0,-.15f,-.1f));

        this.superMesh.superJoins.get("edgeLeftBottomMidFront").moveJoin(new Vector3f(0, -.5f, 0f));
        this.superMesh.superJoins.get("edgeLeftBottomMidBack").moveJoin(new Vector3f(0, -.25f, -.25f));

        this.superMesh.superJoins.get("bottomBackLeft").moveJoin(new Vector3f(0,.25f,0));
        this.superMesh.superJoins.get("topBackLeft").moveJoin(new Vector3f(0,.25f,-.25f));

        this.superMesh.superJoins.get("edgeBackLeftMidBottom").moveJoin(new Vector3f(0,0,-.5f));
        this.superMesh.superJoins.get("edgeBackLeftMidTop").moveJoin(new Vector3f(0,0,-.5f));

        this.superMesh.superJoins.get("edgeLeftTopMidFront").moveJoin(new Vector3f(0, .5f, 0f));
        this.superMesh.superJoins.get("edgeLeftTopMidBack").moveJoin(new Vector3f(0, .5f, 0f));

        //

        this.superMesh.superJoins.get("bottomFrontRight").moveJoin(new Vector3f(-.25f,.25f,-.25f));

        this.superMesh.superJoins.get("edgeBottomFrontMidRight").moveJoin(new Vector3f(0,-.15f,-.1f));

        this.superMesh.superJoins.get("edgeRightBottomMidFront").moveJoin(new Vector3f(0, -.5f, 0f));
        this.superMesh.superJoins.get("edgeRightBottomMidBack").moveJoin(new Vector3f(0, -.25f, -.25f));

        this.superMesh.superJoins.get("bottomBackRight").moveJoin(new Vector3f(0,.25f,0));
        this.superMesh.superJoins.get("topBackRight").moveJoin(new Vector3f(0,.25f,-.25f));

        this.superMesh.superJoins.get("edgeBackRightMidBottom").moveJoin(new Vector3f(0,0,-.5f));
        this.superMesh.superJoins.get("edgeBackRightMidTop").moveJoin(new Vector3f(0,0,-.5f));

        this.superMesh.superJoins.get("edgeRightTopMidFront").moveJoin(new Vector3f(0, .5f, 0f));
        this.superMesh.superJoins.get("edgeRightTopMidBack").moveJoin(new Vector3f(0, .5f, 0f));

        //




//        this.superMesh.superJoins.get("bottomFrontRight").moveJoin(new Vector3f(-.25f,.25f,-.25f));
//        this.superMesh.superJoins.get("edgeBottomFrontMidRight").moveJoin(new Vector3f(0,-.15f,-.1f));

        //edgeLeftBottomMidFront
        //edgeLeftBottomMidBack


    }
}
