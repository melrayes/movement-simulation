package com.robot.model.command;

import com.robot.model.core.Movable;

/**
 * The interface Move command.
 */
public interface MoveCommand {
    /**
     * Execute.
     *
     * @param object the Movable object
     */
    public void execute(Movable object);
}

