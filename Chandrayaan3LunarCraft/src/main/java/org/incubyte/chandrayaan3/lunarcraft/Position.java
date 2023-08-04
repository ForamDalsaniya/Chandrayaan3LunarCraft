package org.incubyte.chandrayaan3.lunarcraft;

import java.util.Objects;

public class Position {
    private int x;
    private int y;
    private int z;

    private Direction direction;
    public Position(){

    }
    public Position(int x, int y, int z, Direction direction){
        this.x = x;
        this.y = y;
        this.z = z;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }


    @Override
    public String toString() {
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", direction=" + direction +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return x == position.x && y == position.y && z == position.z && direction == position.direction;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z, direction);
    }
}
