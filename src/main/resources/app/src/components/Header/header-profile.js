import React from 'react';
import { Tooltip } from 'reactstrap';
import myProfilePicture from '../../../public/profile/harry_smith.png';

// var strippedUserName = "Harry Smith";
// strippedUserName = strippedUserName.replace(/\s+/g, '_').toLowerCase();

// var profilePictureUrl = `${window.location.href}/public/profile/${strippedUserName}.png`;
// console.log(profilePictureUrl);


export default class ProfilePicture extends React.Component {
  constructor(props) {
    super(props);

    this.toggle = this.toggle.bind(this);
    this.profilePictureUrl = this.profilePictureUrl.bind(this);
    this.state = {
      tooltipOpen: false
      //name: this.props.currentUser
    };
  }

  toggle() {
    this.setState({
      tooltipOpen: !this.state.tooltipOpen
    });
  }

  profilePictureUrl() {
    const strippedUserName = this.props.name.replace(/\s+/g, '_').toLowerCase();
    const pictureUrl = `${require(`../../../public/profile/${strippedUserName}.png`)}`
    return(
      pictureUrl
    );
  }



  render() {
    return (
      <div className="col col-lg-2 hidden-md-down user-profile-wrapper">
          <div className="user-profile">
              <div className="image" data-toggle="tooltip" data-placement="bottom" title="Go to Your Profile">
                <img id="CurrentUserProfilePicture" src={this.profilePictureUrl()} />
              </div>

              <Tooltip placement="bottom" isOpen={this.state.tooltipOpen} target="CurrentUserProfilePicture" toggle={this.toggle}>
                {this.props.name}
              </Tooltip>
          </div>
      </div>
    );
  }
}
