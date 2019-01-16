import {combineReducers} from 'redux'
import {EXECUTE_MOVE_SCRIPT} from '../constants/constant';

export const currentRobotPositionReducer = (currentPosition = {x: 0, y: 0, direction: 'East'}, action) => {
    if (action.type === EXECUTE_MOVE_SCRIPT)
        return action.payload;

    return currentPosition;
};

export default combineReducers({
    currentRobotPosition: currentRobotPositionReducer
});