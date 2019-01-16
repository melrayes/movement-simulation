package com.robot.model.command;

import com.robot.model.core.Direction;
import com.robot.model.core.Movable;
import com.robot.model.core.Position;

/**
 * The Forward command.
 */
public class ForwardCommand implements MoveCommand {
    /**
     * The Command name.
     */
    public static final String name = "FORWARD";
    private int stepsCount;

    /**
     * Instantiates a new Forward command.
     *
     * @param stepsCount the steps count
     */
    public ForwardCommand(int stepsCount) {
        this.stepsCount = stepsCount;
    }

    @Override
    public void execute(Movable object) {
        Position currentPosition = object.getPosition();
        if (currentPosition.getDirection().equals(Direction.East))
            currentPosition.setX(currentPosition.getX() + stepsCount);
        else if (currentPosition.getDirection().equals(Direction.South))
            currentPosition.setY(currentPosition.getY() + stepsCount);
        else if (currentPosition.getDirection().equals(Direction.West))
            currentPosition.setX(currentPosition.getX() - stepsCount);
        else if (currentPosition.getDirection().equals(Direction.North))
            currentPosition.setY(currentPosition.getY() - stepsCount);
    }
}

