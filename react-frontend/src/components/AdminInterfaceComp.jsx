import React, { Component } from 'react'

class AdminInterfaceComp extends Component {
    constructor(props) {
        super(props)
    
        this.state = {
             
        }

        this.showEmployees = this.showEmployees.bind(this);
        this.addDepartment = this.addDepartment.bind(this);
        this.addEmployee = this.addEmployee.bind(this);
        this.showDepartment = this.showDepartment.bind(this);
        this.showLeaveList = this.showLeaveList.bind(this);
        this.showTrainingsList = this.showTrainingsList.bind(this);
    }

    showEmployees(){
        this.props.history.push('/employees')
    }
    addEmployee(){
        this.props.history.push('/add-employee/_add');
    }

    addDepartment(){
        this.props.history.push('/department');
    
    }
    showDepartment(){
        this.props.history.push('/showall-department')
    }
    showLeaveList(){
        this.props.history.push('/leaves')
    }
    showTrainingsList(){
        this.props.history.push('/trainings')
    }
    
    render() {
        return (
            <div>
                <div className="container"></div>
                <div className = "row">
                        <div className = "card col-md-6 offset-md-3 offset-md-3"></div>
                
                <div class="d-grid gap-2 col-6 mx-auto">
  <button onClick={this.showEmployees} class="btn btn-info" type="button">Show Employee List</button><br/><br/>
  <button onClick={this.addDepartment} class="btn btn-success" type="button">Add Department</button><br/><br/>
  <button onClick={this.addEmployee} class="btn btn-success" type="button">Add Employee</button><br/><br/>
  <button onClick={this.showDepartment} class="btn btn-success" type="button">Show all Departments</button><br/><br/>
  <button onClick={this.showLeaveList} class="btn btn-success" type="button">Show all Leaves</button><br/><br/>
  <button onClick={this.showTrainingsList} class="btn btn-success" type="button">Show all Trainings</button><br/><br/>
 
 </div>
            
 </div>

</div>
            
        )
    }
}

export default AdminInterfaceComp