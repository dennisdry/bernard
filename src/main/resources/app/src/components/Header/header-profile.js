import React from 'react';
import myProfilePicture from '../../../public/profile/harry_smith.png';

export default class ProfilePicture extends React.Component {
  render() {
    return (
      <div className="col col-lg-2 hidden-md-down user-profile-wrapper">
          <div className="user-profile">
              <div className="image" data-toggle="tooltip" data-placement="bottom" title="Go to Your Profile">
                <img src={myProfilePicture} />
              </div>
          </div>
      </div>
    );
  }
}
