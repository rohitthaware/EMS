import React, { Component } from 'react'
import TrainingServices from '../services/TrainingServices';
class TrainingListComp extends Component {

    constructor(props) {
        super(props)
    
        this.state = {
            
            trainings: []

        }
    }

    
    componentDidMount(){
        TrainingServices.getAllTrainings().then((res) => {
            this.setState({trainings: res.data});
        });
    }
    

    render() {
        return (
            <div>
                <br/>
                 <h2 className="text-left">Training List</h2>

                 
                 <br></br>
                 <div className = "row">
                        <table className = "table table-hover table-dark">

                            <thead>
                                <tr>
                                <th>Training ID</th>
                                    <th>Training Name</th>
                                    
                                    {/* <th>Employee ID</th> */}
                                    <th>Training Dept</th>
                                    
                                </tr>
                            </thead>
                            <tbody>
                                {
                                    this.state.trainings.map(
                                        train => 
                                         <tr key = {train.id}>
                                    
                                            <td> {train.courseNo} </td>   
                                            <td> {train.courseName}</td>
                                            <td>{train.trainingDepartment}</td>
                                           
                                            
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
export default TrainingListComp