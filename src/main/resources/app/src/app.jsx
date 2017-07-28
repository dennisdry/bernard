import React from 'react';
import '../styles/index.scss';

// import Header from './components/Header';
import Header from './components/Header/index';

export default class App extends React.Component {
  render() {
    return (
      <div>
        <Header />
      </div>
    )
  }
}
