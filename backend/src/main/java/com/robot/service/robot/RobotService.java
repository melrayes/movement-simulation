package com.robot.service.robot;

import com.robot.model.command.MoveCommand;
import com.robot.model.core.Position;
import com.robot.model.robot.Robot;

import java.util.List;

/**
 * The interface Robot service.
 */
public interface RobotService {
    /**
     * Move robot.
     *
     * @param robot    the robot
     * @param commands the commands
     * @return the robot
     */
    public Robot move(Robot robot, List<MoveCommand> commands);

    /**
     * Update position based on script position.
     *
     * @param currentPosition the current position
     * @param script          the script
     * @return the position
     */
    public Position updatePositionBasedOnScript(Position currentPosition, String script);
}

