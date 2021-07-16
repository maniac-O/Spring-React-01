import React, { useState, useEffect } from 'react';
import './App.css';
import Axios from 'axios';

function App() {
    const [user, setUser] = useState('');
    useEffect(() => {
        Axios.post('/api/users').then((response) => {
            if (response.data) {
                console.log(response.data);
                setUser(response.data);
            } else {
                alert('failed to ');
            }
        });
    }, []);

    return (
        <div className="App">
            <header className="App-header">
                <h1>{user.id}</h1>
                <h1>{user.username}</h1>
                <h1>{user.password}</h1>
                <h1>{user.email}</h1>
            </header>
            <p className="App-intro">
                To get started, edit <code>src/App.js</code> and save to reload
            </p>
        </div>
    );
}

export default App;
