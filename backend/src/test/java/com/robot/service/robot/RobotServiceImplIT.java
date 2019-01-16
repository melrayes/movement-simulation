package com.robot.service.robot;

import com.robot.model.core.Direction;
import com.robot.model.core.Position;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RobotServiceImplIT {

    @Autowired
    RobotService robotService;

    @Test
    public void updatePositionBasedOnScriptTest() {
        Position currentPosition = new Position(0, 0, Direction.East);
        Position expectedPosition = new Position(3, 1, Direction.North);

        String moveScript = "POSITION 1 3 EAST\n" +
                "FORWARD 3\n" +
                "WAIT\n" +
                "TURNAROUND\n" +
                "FORWARD 1\n" +
                "RIGHT\n" +
                "FORWARD 2";


        Position actualPosition = robotService.updatePositionBasedOnScript(currentPosition, moveScript);
        assertEquals(expectedPosition, actualPosition);
    }

}

