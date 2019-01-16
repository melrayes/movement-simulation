package com.robot.model.command;

import com.robot.model.core.Direction;
import com.robot.model.core.Movable;
import com.robot.model.core.Position;

/**
 * The Initialize position command.
 */
public class InitializePositionCommand implements MoveCommand {
    /**
     * The command name.
     */
    public static final String name = "POSITION";

    private Position initialPosition;

    /**
     * Instantiates a new Initialize position command.
     *
     * @param x         the x
     * @param y         the y
     * @param direction the direction
     */
    public InitializePositionCommand(int x, int y, String direction) {
        initialPosition = new Position(x, y, Direction.getByStringValue(direction));
    }

    @Override
    public void execute(Movable object) {
        object.setPosition(initialPosition);
    }
}

