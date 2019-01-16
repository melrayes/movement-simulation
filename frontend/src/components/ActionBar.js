import React from 'react';
import {connect} from 'react-redux'
import {executeMoveScript} from '../actions'

class ActionBar extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            scriptContent: ''
        };

        this.handleChange = this.handleChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    handleChange(event) {
        this.setState({scriptContent: event.target.value});
    }

    handleSubmit(event) {
        if (this.state.scriptContent === '')
            return;

        // todo move to fetch to an action
        fetch('http://localhost:8080/robot/move', {
            method: 'POST',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json',
            },
            body: JSON.stringify({
                currentPosition: this.props.currentRobotPosition,
                moveScript: this.state.scriptContent,
            })
        }).then(result => {
            if (result.status === 200)
                return result.json();
        }).then((jsonObject) => {
            if (jsonObject !== undefined)
                this.props.executeMoveScript(jsonObject);
            else
                alert("Invalid move script");

        });
        event.preventDefault();
    }

    render() {
        return (
            <div className="actionBar">
                <h2>Script</h2>
                <textarea onChange={this.handleChange} cols={40} rows={10}/>
                <br/>
                <button className="button button--warning text-center" onClick={this.handleSubmit}>Execute</button>
            </div>
        );
    }
}

const mapStateToProps = (state) => {
    return state;
};

export default connect(mapStateToProps, {executeMoveScript})(ActionBar);

