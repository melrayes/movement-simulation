import React, {Component} from 'react';
import '../App.css';
import BlockList from './BlockList'
import {connect} from 'react-redux'

class Board extends Component {

    render() {
        let blocks = [];
        let key = 1;
        for (let y = 0; y < 5; y++) {
            for (let x = 0; x < 5; x++) {
                let block = {
                    x: x,
                    y: y,
                    key: key++
                };
                if (this.isThisPointTheRebotPosition(x, y)) {
                    block.robot = this.props.currentRobotPosition;
                }
                blocks.push(block);
            }
        }
        return (
            <BlockList blocks={blocks}/>
        );
    }

    isThisPointTheRebotPosition(x, y) {
        if (this.props.currentRobotPosition === null)
            return false;

        return x === this.props.currentRobotPosition.x && y === this.props.currentRobotPosition.y;
    }


}

const mapStateToProps = (state) => ({
    currentRobotPosition: state.currentRobotPosition
});

export default connect(mapStateToProps)(Board);


