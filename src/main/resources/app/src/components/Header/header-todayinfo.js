import React from 'react';

export default class HeaderTodaysInfo extends React.Component {
  render()  {
    return (
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
    );
  }
}
