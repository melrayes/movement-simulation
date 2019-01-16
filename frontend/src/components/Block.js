import React, {Component}  from 'react';
import northArrow from '../assets/north-arrow.png';
import eastArrow from '../assets/east-arrow.png';
import southArrow from '../assets/south-arrow.png';
import westArrow from '../assets/west-arrow.png';


class Block extends Component {
    render() {
        let block = this.props.block;
        return (
            <div className="block">
                <div hidden={block.robot === null}>
                    {this.getRobotDirectionImg()}
                </div>
                <div className="textFont" hidden={block.robot != null}>
                    {block.x},{block.y}
                </div>
            </div>
        );
    }

    getRobotDirectionImg() {
        if (this.props.block.robot == null)
            return;
        if (this.props.block.robot.direction === 'North')
            return <img className="north" src={northArrow} alt="robot"/>;
        else if (this.props.block.robot.direction === 'East')
            return <img className="east" src={eastArrow} alt="robot"/>;
        else if (this.props.block.robot.direction === 'South')
            return <img className="south" src={southArrow} alt="robot"/>;
        else if (this.props.block.robot.direction === 'West')
            return <img className="west" src={westArrow} alt="robot"/>;
    }
}

export default Block;
