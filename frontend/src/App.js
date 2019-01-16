import React, {Component} from 'react';
import './App.css';
import Board from './components/Board'
import ActionBar from './components/ActionBar'

class App extends Component {
    render() {
        return (
            <div className="app">
                <Board />
                <ActionBar />

            </div>
        );
    }
}

export default App;
