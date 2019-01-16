package com.robot.service.robot;

import com.robot.model.command.MoveCommand;
import com.robot.model.core.Position;
import com.robot.model.robot.Robot;
import com.robot.service.core.MovableService;
import com.robot.util.MoveCommandsScriptParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The Robot service.
 */
@Service
public class RobotServiceImpl implements RobotService {

    /**
     * The Movable service.
     */
    @Autowired
    MovableService movableService;

    /**
     * The Move commands script parser.
     */
    @Autowired
    MoveCommandsScriptParser moveCommandsScriptParser;

    @Override
    public Robot move(Robot robot, List<MoveCommand> commands) {
        robot = (Robot) movableService.move(robot, commands);
        return robot;
    }

    @Override
    public Position updatePositionBasedOnScript(Position currentPosition, String script) {
        Robot robot = new Robot(currentPosition);
        robot = move(robot, moveCommandsScriptParser.parse(script));
        return robot.getPosition();
    }
}

