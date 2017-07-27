import React from 'react';
import myProfilePicture from '../../public/profile/harry_smith.png';

export default class Header extends React.Component {
  render() {
    return (
      <div>
        <header className="header">
            <div className="primary">
                <div className="container">
                    <div className="row header-row align-items-center">
                        <div className="col col-lg-3 col-md-3 col-sm-8 col-xs-8 logo-wrapper">
                            <div className="logo"></div>
                        </div>
                        <nav className="col col-7 text-right menu hidden-md-down">
                            <ul className="main-menu list-unstyled">
                                <li className="active">
                                    <a href="#">
                                        Messageboard
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        Admin
                                    </a>
                                </li>
                            </ul>
                        </nav>
                        <div className="col col-lg-2 hidden-md-down user-profile-wrapper">
                            <div className="user-profile">
                                <div className="image" data-toggle="tooltip" data-placement="bottom" title="Go to Your Profile">
                                    <a href="#">
                                        <img src={myProfilePicture} />
                                    </a>
                                </div>
                            </div>
                        </div>


                        <div className="mobile-menu-open">
                            <ul className="mobile-menu list-unstyled">
                                <li>Message Board</li>
                                <li>Admin</li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
            <div className="secondary">
                <div className="container">
                    <div className="row align-items-center secondary-row">
                        <div className="col hidden-md-down">
                            <div className="today-info">
                                <date className="date">
                                    Today is 2017. jun 21.
                                </date>
                                <div className="birthday">
                                    Kanye West's birthday. <a href="#">Send him</a> your best wishes!
                                </div>
                            </div>
                        </div>
                        <div className="col">
                            <div className="upcoming-events text-right">
                                <div className="new-notification">
                                    <a href="#">
                                        <span className="text">
                                        1 new notification
                                    </span>
                                        <span className="icon"></span>
                                    </a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </header>
      </div>
    );
  }
}
