package com.robot.model.command;

import com.robot.model.core.Movable;
import com.robot.model.core.Position;

/**
 * The Right command.
 */
public class RightCommand implements MoveCommand {
    /**
     * The command name.
     */
    public static final String name = "RIGHT";

    @Override
    public void execute(Movable object) {
        Position currentPosition = object.getPosition();
        currentPosition.setDirection(currentPosition.getDirection().turnRight());
    }
}

