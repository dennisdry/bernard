import React from 'react';

export default class ActionBarTags extends React.Component {
  render() {
    return (
      <div className="col">
          <span className="tag">
              <a href="#">
                  office
              </a>
          </span>
          <span className="tag">
          <a href="#">
              repair
          </a>
      </span>
      </div>
    );
  }
}
