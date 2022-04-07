import React, { Component } from 'react'
import DepartmentService from '../services/DepartmentService';

class ListDepartmentComp extends Component {
    constructor(props) {
        super(props)

        this.state = {
           departments: []
        }
        
    }

    

    componentDidMount(){
        DepartmentService.getDept().then((res) => {
            this.setState({ departments: res.data});
        });
    }

    addEmployee(){
        this.props.history.push('/add-employee/_add');
    }

    addDepartment(){
        this.props.history.push('/department');
    
    }

    render() {
        return (
            <div>
                <br/>
                 <h2 className="text-left">Department List</h2>

                 
                 <br></br>
                 <div className = "row">
                        <table className = "table table-hover table-dark">

                            <thead>
                                <tr>
                                <th> Department ID</th>
                                    <th> Department Name</th>
                                  
                                    
                                </tr>
                            </thead>
                            <tbody>
                                {
                                    this.state.departments.map(
                                        dept => 
                                        <tr key = {dept.id}>
                                             <td> { dept.deptId} </td>   
                                             <td> {dept.deptName}</td>
                                            
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

export default ListDepartmentComp
