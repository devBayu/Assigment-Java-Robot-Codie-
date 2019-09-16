package com.enigma.model;

public enum Directions {
    NORTH,
    SOUTH,
    EAST,
    WEST;

    public Directions left(){
        return Directions.values()[(ordinal()+3)%4];
    }
    public Directions right(){
        return Directions.values()[(ordinal()+1)%4];
    }
}
