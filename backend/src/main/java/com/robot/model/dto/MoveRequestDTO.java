package com.robot.model.dto;

import com.robot.model.core.Position;

/**
 * The Move request dto.
 */
public class MoveRequestDTO {
    private Position currentPosition;
    private String moveScript;

    /**
     * Gets current position.
     *
     * @return the current position
     */
    public Position getCurrentPosition() {
        return currentPosition;
    }

    /**
     * Sets current position.
     *
     * @param currentPosition the current position
     */
    public void setCurrentPosition(Position currentPosition) {
        this.currentPosition = currentPosition;
    }

    /**
     * Gets move script.
     *
     * @return the move script
     */
    public String getMoveScript() {
        return moveScript;
    }

    /**
     * Sets move script.
     *
     * @param moveScript the move script
     */
    public void setMoveScript(String moveScript) {
        this.moveScript = moveScript;
    }
}

