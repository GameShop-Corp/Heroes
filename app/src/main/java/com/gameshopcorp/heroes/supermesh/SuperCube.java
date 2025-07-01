package com.gameshopcorp.heroes.supermesh;

import com.gameshopcorp.heroes.animation.SuperJoin;
import com.gameshopcorp.heroes.graphics.SuperMesh;
import com.gameshopcorp.heroes.graphics.SuperSurface;
import com.jme3.math.Vector2f;
import com.jme3.math.Vector3f;

import java.util.ArrayList;
import java.util.HashMap;

public class SuperCube {

    public SuperMesh superMesh;
    public HashMap<String, SuperJoin> superJoins;
    public SuperCube(SuperSquare top, SuperSquare bottom, SuperSquare front, SuperSquare back, SuperSquare left, SuperSquare right){

        superMesh = new SuperMesh(new String[]{"top","bottom","front","back","left","right"}, new SuperSurface[]{top.superMesh.superMesh.get(top.name), bottom.superMesh.superMesh.get(bottom.name), front.superMesh.superMesh.get(front.name), back.superMesh.superMesh.get(back.name), left.superMesh.superMesh.get(left.name), right.superMesh.superMesh.get(right.name)});
        superJoins = new HashMap<>();

        SuperJoin topFrontLeft = new SuperJoin(new SuperSurface[]{superMesh.superMesh.get("top"), superMesh.superMesh.get("front"), superMesh.superMesh.get("left")}, new Vector2f[]{new Vector2f(3,0), new Vector2f(3,0), new Vector2f(3,3)});
        SuperJoin topFrontRight = new SuperJoin(new SuperSurface[]{superMesh.superMesh.get("top"), superMesh.superMesh.get("front"), superMesh.superMesh.get("right")}, new Vector2f[]{new Vector2f(3,3), new Vector2f(3,3), new Vector2f(3,3)});
        SuperJoin topBackLeft = new SuperJoin(new SuperSurface[]{superMesh.superMesh.get("top"), superMesh.superMesh.get("back"), superMesh.superMesh.get("left")}, new Vector2f[]{new Vector2f(0,0), new Vector2f(3,0), new Vector2f(3,0)});
        SuperJoin topBackRight = new SuperJoin(new SuperSurface[]{superMesh.superMesh.get("top"), superMesh.superMesh.get("back"), superMesh.superMesh.get("right")}, new Vector2f[]{new Vector2f(0,3), new Vector2f(3,3), new Vector2f(3,0)});

        SuperJoin bottomFrontLeft = new SuperJoin(new SuperSurface[]{superMesh.superMesh.get("bottom"), superMesh.superMesh.get("front"), superMesh.superMesh.get("left")}, new Vector2f[]{new Vector2f(3,0), new Vector2f(0,0), new Vector2f(0,3)});
        SuperJoin bottomFrontRight = new SuperJoin(new SuperSurface[]{superMesh.superMesh.get("bottom"), superMesh.superMesh.get("front"), superMesh.superMesh.get("right")}, new Vector2f[]{new Vector2f(3,3), new Vector2f(0,3), new Vector2f(0,3)});
        SuperJoin bottomBackLeft = new SuperJoin(new SuperSurface[]{superMesh.superMesh.get("bottom"), superMesh.superMesh.get("back"), superMesh.superMesh.get("left")}, new Vector2f[]{new Vector2f(0,0), new Vector2f(0,0), new Vector2f(0,0)});
        SuperJoin bottomBackRight = new SuperJoin(new SuperSurface[]{superMesh.superMesh.get("bottom"), superMesh.superMesh.get("back"), superMesh.superMesh.get("right")}, new Vector2f[]{new Vector2f(0,3), new Vector2f(0,3), new Vector2f(0,0)});

        SuperJoin edgeTopFrontMidLeft = new SuperJoin(new SuperSurface[]{superMesh.superMesh.get("top"), superMesh.superMesh.get("front")}, new Vector2f[]{new Vector2f(3,1), new Vector2f(3,1)});
        SuperJoin edgeTopFrontMidRight = new SuperJoin(new SuperSurface[]{superMesh.superMesh.get("top"), superMesh.superMesh.get("front")}, new Vector2f[]{new Vector2f(3,2), new Vector2f(3,2)});
        SuperJoin edgeBottomFrontMidLeft = new SuperJoin(new SuperSurface[]{superMesh.superMesh.get("bottom"), superMesh.superMesh.get("front")}, new Vector2f[]{new Vector2f(3,1), new Vector2f(0,1)});
        SuperJoin edgeBottomFrontMidRight = new SuperJoin(new SuperSurface[]{superMesh.superMesh.get("bottom"), superMesh.superMesh.get("front")}, new Vector2f[]{new Vector2f(3,2), new Vector2f(0,2)});

        SuperJoin edgeTopBackMidLeft = new SuperJoin(new SuperSurface[]{superMesh.superMesh.get("top"), superMesh.superMesh.get("back")}, new Vector2f[]{new Vector2f(0,1), new Vector2f(3,1)});
        SuperJoin edgeTopBackMidRight = new SuperJoin(new SuperSurface[]{superMesh.superMesh.get("top"), superMesh.superMesh.get("back")}, new Vector2f[]{new Vector2f(0,2), new Vector2f(3,2)});
        SuperJoin edgeBottomBackMidLeft = new SuperJoin(new SuperSurface[]{superMesh.superMesh.get("bottom"), superMesh.superMesh.get("back")}, new Vector2f[]{new Vector2f(0,1), new Vector2f(0,1)});
        SuperJoin edgeBottomBackMidRight = new SuperJoin(new SuperSurface[]{superMesh.superMesh.get("bottom"), superMesh.superMesh.get("back")}, new Vector2f[]{new Vector2f(0,2), new Vector2f(0,2)});

        SuperJoin edgeFrontLeftMidTop = new SuperJoin(new SuperSurface[]{superMesh.superMesh.get("front"), superMesh.superMesh.get("left")}, new Vector2f[]{new Vector2f(2,0), new Vector2f(2,3)});
        SuperJoin edgeFrontLeftMidBottom = new SuperJoin(new SuperSurface[]{superMesh.superMesh.get("front"), superMesh.superMesh.get("left")}, new Vector2f[]{new Vector2f(1,0), new Vector2f(1,3)});
        SuperJoin edgeFrontRightMidTop = new SuperJoin(new SuperSurface[]{superMesh.superMesh.get("front"), superMesh.superMesh.get("right")}, new Vector2f[]{new Vector2f(2,3), new Vector2f(2,3)});
        SuperJoin edgeFrontRightMidBottom = new SuperJoin(new SuperSurface[]{superMesh.superMesh.get("front"), superMesh.superMesh.get("right")}, new Vector2f[]{new Vector2f(1,3), new Vector2f(1,3)});

        SuperJoin edgeBackLeftMidTop = new SuperJoin(new SuperSurface[]{superMesh.superMesh.get("back"), superMesh.superMesh.get("left")}, new Vector2f[]{new Vector2f(2,0), new Vector2f(2,0)});
        SuperJoin edgeBackLeftMidBottom = new SuperJoin(new SuperSurface[]{superMesh.superMesh.get("back"), superMesh.superMesh.get("left")}, new Vector2f[]{new Vector2f(1,0), new Vector2f(1,0)});
        SuperJoin edgeBackRightMidTop = new SuperJoin(new SuperSurface[]{superMesh.superMesh.get("back"), superMesh.superMesh.get("right")}, new Vector2f[]{new Vector2f(2,3), new Vector2f(2,0)});
        SuperJoin edgeBackRightMidBottom = new SuperJoin(new SuperSurface[]{superMesh.superMesh.get("back"), superMesh.superMesh.get("right")}, new Vector2f[]{new Vector2f(1,3), new Vector2f(1,0)});

        //SuperJoin topFrontRight = new SuperJoin()
        //edgeBackRightMidBottom.moveJoin(new Vector3f( 1,0,-1));

        superJoins.put("topFrontLeft", topFrontLeft);
        superJoins.put("topFrontRight", topFrontRight);
        superJoins.put("topBackLeft", topBackLeft);
        superJoins.put("topBackRight", topBackRight);

        superJoins.put("bottomFrontLeft", bottomFrontLeft);
        superJoins.put("bottomFrontRight",bottomFrontRight);
        superJoins.put("bottomBackLeft", bottomBackLeft);
        superJoins.put("bottomBackRight", bottomBackRight);

        superJoins.put("edgeTopFrontMidLeft", edgeTopFrontMidLeft);
        superJoins.put("edgeTopFrontMidRight", edgeTopFrontMidRight);
        superJoins.put("edgeBottomFrontMidLeft", edgeBottomFrontMidLeft);
        superJoins.put("edgeBottomFrontMidRight", edgeBottomFrontMidRight);

        superJoins.put("edgeTopBackMidLeft", edgeTopBackMidLeft);
        superJoins.put("edgeTopBackMidRight", edgeTopBackMidRight);
        superJoins.put("edgeBottomBackMidLeft", edgeBottomBackMidLeft);
        superJoins.put("edgeBottomBackMidRight", edgeBottomBackMidRight);

        superJoins.put("edgeFrontLeftMidTop", edgeFrontLeftMidTop);
        superJoins.put("edgeFrontLeftMidBottom", edgeFrontLeftMidBottom);
        superJoins.put("edgeFrontRightMidTop", edgeFrontRightMidTop);
        superJoins.put("edgeFrontRightMidBottom", edgeFrontRightMidBottom);

        superJoins.put("edgeBackLeftMidTop", edgeBackLeftMidTop);
        superJoins.put("edgeBackLeftMidBottom", edgeBackLeftMidBottom);
        superJoins.put("edgeBackRightMidTop", edgeBackRightMidTop);
        superJoins.put("edgeBackRightMidBottom", edgeBackRightMidBottom);
    }

}
