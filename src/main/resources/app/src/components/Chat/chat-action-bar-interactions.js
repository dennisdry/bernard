import React from 'react';

export default class ActionBarInteractions extends React.Component {
  render() {
    return (
      <div className="col text-right right-actions">
          <span className="comments-number" id="mainchat-comment-1">
              2 <span className="hidden-md-down">comments</span>
          </span>
          <span className="reply-action">
              <span className="text">
                  Reply
              </span>
              <span className="icon"></span>
          </span>
      </div>
    );
  }
}
