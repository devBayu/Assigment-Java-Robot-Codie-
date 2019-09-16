package com.enigma.model;

import java.util.Arrays;

public class Codie {
    private Integer postX;
    private Integer postY;
    private Integer point=0;
    private char[] commands;
    private final String FORWARD = "F";
    private final String BACKWARD = "B";
    private final String RIGHT = "R";
    private final String LEFT = "L";
    Directions directions;

    public Codie(Integer postX, Integer postY, Directions directions) {
        this.postX = postX;
        this.postY = postY;
        this.directions = directions;
    }

    public Integer setPoint(Integer point){
        this.point = this.point + point;
        return this.point;
    }

    public String setCommands(String commands){
        this.commands = commands.toCharArray();
        return commands;
    }

    public void move (){
        if (this.directions.equals(Directions.NORTH)){
            this.postY++;
        }else if (this.directions.equals(Directions.SOUTH)){
            this.postY--;
        }else if (this.directions.equals(Directions.WEST)){
            this.postX--;
        }else if (this.directions.equals(Directions.EAST)){
            this.postX++;
        }else {
            System.out.println("SALAH");
        }
    }

    public void instruction(String movement){
        switch (movement){
            case FORWARD :
                move();
            case RIGHT :
                this.directions = this.directions.right();
            case LEFT:
                this.directions = this.directions.left();
        }
   }

    public void isRun(){
        for (int i = 0; i < this.commands.length; i++){
            if (this.point<=0){
                System.out.println("Isi Point!!");
                break;
            }else{
                char command = commands[i];
                instruction(String.valueOf(command));
                System.out.println(command + getPosition());
                if ((i + 1)% 3 == 0){
                    this.point--;
                }
            }
        }
    }
    public String getPosition(){
        return"(" + this.postX + "," +this.postY + ", " + directions +")";
    }

    public String print() {
        return "Codie{" +
                "postX=" + postX +
                ", postY=" + postY +
                ", point=" + point +
                ", directions=" + directions +
                '}';
    }
}

