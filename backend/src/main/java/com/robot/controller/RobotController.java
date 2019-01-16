package com.robot.controller;

import com.robot.model.core.Position;
import com.robot.model.dto.MoveRequestDTO;
import com.robot.service.robot.RobotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * The Robot controller.
 */
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class RobotController {

    @Autowired
    private RobotService robotService;

    /**
     * Move based on script.
     *
     * @param moveRequest the move request
     * @return the response entity
     */
    @PostMapping(path = "/robot/move", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Position> moveBasedOnScript(@RequestBody MoveRequestDTO moveRequest) {
        Position newPosition =
                robotService.updatePositionBasedOnScript(moveRequest.getCurrentPosition(), moveRequest.getMoveScript());

        return new ResponseEntity<>(newPosition, HttpStatus.OK);
    }
}

