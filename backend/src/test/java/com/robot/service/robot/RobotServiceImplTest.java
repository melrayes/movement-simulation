package com.robot.service.robot;

import com.robot.model.command.*;
import com.robot.model.core.Direction;
import com.robot.model.core.Position;
import com.robot.model.robot.Robot;
import com.robot.service.core.MovableService;
import com.robot.util.MoveCommandsScriptParser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class RobotServiceImplTest {
    @Mock
    MovableService movableService;

    @Mock
    MoveCommandsScriptParser moveCommandsScriptParser;

    @InjectMocks
    RobotServiceImpl robotService;

    @Test
    public void updatePositionBasedOnScriptTest() {
        List<MoveCommand> commands = new ArrayList<>();
        commands.add(new InitializePositionCommand(1, 3, "East"));
        commands.add(new ForwardCommand(3));
        commands.add(new WaitCommand());
        commands.add(new TurnaroundCommand());
        commands.add(new ForwardCommand(1));
        commands.add(new RightCommand());
        commands.add(new ForwardCommand(2));

        Position currentPosition = new Position(0, 0, Direction.East);
        Position expectedPosition = new Position(3, 1, Direction.North);

        Robot robot = new Robot(currentPosition);
        Robot expectedRobot = new Robot(expectedPosition);

        String moveScript = "POSITION 1 3 EAST\n" +
                "FORWARD 3\n" +
                "WAIT\n" +
                "TURNAROUND\n" +
                "FORWARD 1\n" +
                "RIGHT\n" +
                "FORWARD 2";

        Mockito.when(movableService.move(robot, commands)).thenReturn(expectedRobot);
        Mockito.when(moveCommandsScriptParser.parse(moveScript)).thenReturn(commands);

        Position actualPosition = robotService.updatePositionBasedOnScript(currentPosition, moveScript);
        assertEquals(expectedPosition, actualPosition);
    }

}

