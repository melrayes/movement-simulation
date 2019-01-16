package com.robot.model.command;

import com.robot.model.core.Movable;
import com.robot.model.core.Position;

/**
 * The Turnaround command.
 */
public class TurnaroundCommand implements MoveCommand {
    /**
     * The command name.
     */
    public static final String name = "TURNAROUND";

    @Override
    public void execute(Movable object) {
        Position currentPosition = object.getPosition();
        currentPosition.setDirection(currentPosition.getDirection().turnaround());
    }
}

