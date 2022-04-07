import React, { Component } from 'react'
import LeaveServices from '../services/LeaveServices';

export default class LeaveListComp extends Component {
    constructor(props) {
        super(props)
    
        this.state = {
             leaves :[]
        }
    }

    componentDidMount(){
        LeaveServices.getAllLeaves().then((res) => {
            this.setState({ leaves: res.data});
        });
    }
    
    render() {
        return (
            <div>
                <br/>
                 <h2 className="text-left">Leave List</h2>

                 
                 <br></br>
                 <div className = "row">
                        <table className = "table table-hover table-dark">

                            <thead>
                                <tr>
                                    <th> Start Date</th>
                                    <th> End Date</th>
                                    <th>Leave Type</th>
                                    <th>Remaining Leave</th>
                                    
                                </tr>
                            </thead>
                            <tbody>
                                {
                                    this.state.leaves.map(
                                        leave => 
                                        <tr key = {leave.id}>
                                            <td> { leave.startDate} </td>   
                                            <td> {leave.endDate}</td>
                                            <td>{leave.leaveType}</td>
                                            <td>{leave.leavesRemaining}</td>
                                            
                                        </tr>
                                    )
                                }
                            </tbody>
                        </table>

                 </div>

            </div>
        )
    }
}
