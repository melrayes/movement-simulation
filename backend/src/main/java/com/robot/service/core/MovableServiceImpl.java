package com.robot.service.core;

import com.robot.model.command.MoveCommand;
import com.robot.model.core.Movable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type Movable service.
 */
@Service
public class MovableServiceImpl implements MovableService {

    @Override
    public Movable move(Movable movable, MoveCommand command) {
        command.execute(movable);
        return movable;
    }

    @Override
    public Movable move(Movable movable, List<MoveCommand> commands) {
        for (MoveCommand command : commands) {
            command.execute(movable);
        }
        return movable;
    }
}

