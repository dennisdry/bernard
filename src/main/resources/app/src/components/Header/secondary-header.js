import React from 'react';

import HeaderTodaysInfo from './header-todayinfo';
import HeaderNotifications from './header-notifications';

export default class SecondaryHeader extends React.Component {
  render() {
    return (
      <div className="secondary">
          <div className="container">
              <div className="row align-items-center secondary-row">
                <HeaderTodaysInfo />
                <HeaderNotifications />
              </div>
          </div>
      </div>
    );
  }
}
