package com.robot.model.command;

import com.robot.model.core.Movable;

/**
 * The Wait command.
 */
public class WaitCommand implements MoveCommand {
    /**
     * The command name.
     */
    public static final String name = "WAIT";

    @Override
    public void execute(Movable object) {
        //Do nothing
    }
}

