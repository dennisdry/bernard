import React from 'react';

import ActionBarTags from './chat-action-bar-tags';
import ActionBarInteractions from './chat-action-bar-interactions';

export default class ChatActionBar extends React.Component {
  render() {
    return (
      <div className="action-bar">
          <div className="row align-items-center">
              <ActionBarTags tags="repair, office, service" />
              <ActionBarInteractions replies="1" />
          </div>
      </div>
    );
  }
}
