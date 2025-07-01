package com.gameshopcorp.heroes.animation;

import com.jme3.math.Vector3f;

import java.util.ArrayList;
import java.util.Arrays;

public class SuperJoinGroup {

    ArrayList<SuperJoin> superJoins;
    public SuperJoinGroup(SuperJoin... superJoins){

        this.superJoins = new ArrayList<>(Arrays.asList(superJoins));
    }

    public void moveJoin(Vector3f move){

        for (SuperJoin sj: superJoins){
            sj.moveJoin(move);
        }
    }
}
