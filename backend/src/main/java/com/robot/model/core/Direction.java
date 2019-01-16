package com.robot.model.core;

import java.util.Objects;

/**
 * The enum Direction.
 */
public enum Direction {
    /**
     * North direction.
     */
    North, /**
     * East direction.
     */
    East, /**
     * South direction.
     */
    South, /**
     * West direction.
     */
    West;

    @Override
    public String toString() {
        return "";
    }

    /**
     * Gets by string value.
     *
     * @param value the value
     * @return the by string value
     */
    public static Direction getByStringValue(String value) {
        Objects.requireNonNull(value, "invalid args");
        if (value.toUpperCase().equals(North.name().toUpperCase()))
            return North;
        else if (value.toUpperCase().equals(East.name().toUpperCase()))
            return East;
        else if (value.toUpperCase().equals(South.name().toUpperCase()))
            return South;
        else if (value.toUpperCase().equals(West.name().toUpperCase()))
            return West;

        return null;
    }

    /**
     * Turnaround direction.
     *
     * @return the direction
     */
    public Direction turnaround() {
        if (this.equals(North))
            return South;
        else if (this.equals(East))
            return West;
        else if (this.equals(South))
            return North;
        else if (this.equals(West))
            return East;

        return null;
    }

    /**
     * Turn right direction.
     *
     * @return the direction
     */
    public Direction turnRight() {
        if (this.equals(North))
            return East;
        else if (this.equals(East))
            return South;
        else if (this.equals(South))
            return West;
        else if (this.equals(West))
            return North;

        return null;
    }
}

