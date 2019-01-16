import {EXECUTE_MOVE_SCRIPT} from '../constants/constant';

export const executeMoveScript = (currentPosition) => {
    return {
        type: EXECUTE_MOVE_SCRIPT,
        payload: currentPosition
    };
};


