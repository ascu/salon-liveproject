import React from 'react';
import './App.css';
import 'bootstrap/dist/css/bootstrap.css';
import Navbar from 'react-bootstrap/Navbar';

class App extends React.Component {

  componentDidMount() {
    console.log("Component did load!")
    fetch("http://localhost:8080/api/services/retrieveAvailableSalonServices")
    .then(res => res.json())
    .then(
      (result) => {
        console.log(result)
      },
      // Note: it's important to handle errors here
      // instead of a catch() block so that we don't swallow
      // exceptions from actual bugs in components.
      (error) => {
        console.log(error)
      }
    )
  }

  render() {
    return <Navbar bg="dark" variant="dark" expand="lg">
      <Navbar.Brand href="#home">AR Salon and Day Spa Services</Navbar.Brand>
    </Navbar>
  }
}

export default App;
