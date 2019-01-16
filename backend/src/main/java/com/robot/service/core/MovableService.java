package com.robot.service.core;

import com.robot.model.core.Movable;
import com.robot.model.command.MoveCommand;

import java.util.List;

/**
 * The interface Movable service.
 */
public interface MovableService {
    /**
     * Move movable.
     *
     * @param movable the movable
     * @param command the command
     * @return the movable
     */
    public Movable move(Movable movable, MoveCommand command);

    /**
     * Move movable.
     *
     * @param movable  the movable
     * @param commands the commands
     * @return the movable
     */
    public Movable move(Movable movable, List<MoveCommand> commands);
}

