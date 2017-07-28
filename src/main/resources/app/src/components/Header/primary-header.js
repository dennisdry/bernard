import React from 'react';

import HeaderLogo from './header-logo';
import HeaderProfile from './header-profile';
import HeaderMenu from './header-menu';

export default class PrimaryHeader extends React.Component {
  render() {
    return (
      <div className="primary">
          <div className="container">
              <div className="row header-row align-items-center">
                  <HeaderLogo />
                  <HeaderMenu />
                  <HeaderProfile />
                  <div className="mobile-menu-open">
                      <ul className="mobile-menu list-unstyled">
                          <li>Message Board</li>
                          <li>Admin</li>
                      </ul>
                  </div>
              </div>
          </div>
      </div>
    );
  }
}
