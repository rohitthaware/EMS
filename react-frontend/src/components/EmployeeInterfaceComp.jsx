import React, { Component } from 'react'

export default class EmployeeInterfaceComp extends Component {
    constructor(props) {
        super(props)
    
        this.state = {
             
        }
        this.applyLeave = this.applyLeave.bind(this);
    }
    
    applyLeave(){
        this.props.history.push('/leave-application')
    }

    trainings(){
        
    }

    render() {
        return (
            <div><br/><br/>
                <button onClick={this.applyLeave} className="btn btn-info">Apply for Leave</button><br/><br/>
                <button onClick={this.trainings} className="btn btn-info">Trainings</button>
            </div>
        )
    }
}
