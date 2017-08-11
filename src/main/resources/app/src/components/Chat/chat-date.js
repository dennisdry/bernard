import React from 'react';
import Moment from 'react-moment';
import moment from 'moment';

export default class ChatDate extends React.Component {

  constructor(props) {
    super(props);

    //this.messageSent = this.messageSent.bind(this);
  }

  messageSent() {
    var currentTime = moment();
    var messagePostedTime = moment('2017-08-11 14:01');
    var hoursAdded = moment(messagePostedTime).add(3, 'hour');

    if (currentTime <= hoursAdded) {
        // show ago
        return <Moment fromNow>{messagePostedTime}</Moment>
    } else {
        //show date
      return <Moment format="YYYY. MM. DD dddd - HH:mm">{messagePostedTime}</Moment>
      }
  }


  render() {
    return (
      <date className="date">
        {this.messageSent()}
      </date>
    );
  }
}
