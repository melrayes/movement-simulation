package com.robot.model.robot;

import com.robot.model.core.Movable;
import com.robot.model.core.Position;

import javax.validation.constraints.NotNull;

/**
 * The type Robot.
 */
public class Robot implements Movable {
    @NotNull
    private Position position;

    /**
     * Instantiates a new Robot.
     */
    public Robot() {
    }


    /**
     * Instantiates a new Robot.
     *
     * @param position the position
     */
    public Robot(Position position) {
        this.position = position;
    }

    @Override
    public Position getPosition() {
        return position;
    }

    @Override
    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Robot)) return false;

        Robot robot = (Robot) o;

        return getPosition().equals(robot.getPosition());
    }

    @Override
    public int hashCode() {
        return getPosition().hashCode();
    }
}

