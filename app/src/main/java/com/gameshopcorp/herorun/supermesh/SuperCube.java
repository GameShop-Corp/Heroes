package com.gameshopcorp.herorun.supermesh;

import com.gameshopcorp.herorun.graphics.SuperMesh;
import com.gameshopcorp.herorun.graphics.SuperSurface;

public class SuperCube {

    SuperMesh superMesh;
    public SuperCube(SuperSquare top, SuperSquare bottom, SuperSquare front, SuperSquare back, SuperSquare left, SuperSquare right){

        superMesh = new SuperMesh(new String[]{"top","bottom","front","back","left","right"}, new SuperSurface[]{top.superMesh.superMesh.get(top.name), bottom.superMesh.superMesh.get(bottom.name), front.superMesh.superMesh.get(front.name), back.superMesh.superMesh.get(back.name), left.superMesh.superMesh.get(left.name), right.superMesh.superMesh.get(right.name)});

    }
}
