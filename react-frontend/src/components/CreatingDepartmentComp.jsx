import React, { Component } from 'react'
import DepartmentService from '../services/DepartmentService'
class CreateDepartmentComp extends Component {
    constructor(props) {
        super(props)

        this.state = {
            // step 2
            id: this.props.match.params.id,
            deptName: '',
            deptId: '',
        }
        this.changeFirstNameHandler = this.changeDepartmentNameHandler.bind(this);
        this.changeLastNameHandler = this.changeDepartmentIdHandler.bind(this);
        this.saveOrUpdateEmployee = this.saveDepartment.bind(this);
        this.showDepartment = this.showDepartment.bind(this);
    }

    changeDepartmentNameHandler=(event)=>{

        this.setState({deptName:event.target.value})

    }

    
    changeDepartmentIdHandler=(event)=>{

        this.setState({deptId:event.target.value})

    }


    saveDepartment = (e) => {
        e.preventDefault();
        let dept = {deptName: this.state.deptName, deptId: this.state.deptId};
        console.log('employee => ' + JSON.stringify(dept));

        DepartmentService.createDept(dept).then(res=>{
            this.props.history.push('/employees')
        })

    }

    showDepartment(){

        this.props.history.push('/showall-department')

    }

render() {
    return (
        <div>
            <br></br>
               <div className = "container">
                    <div className = "row">
                        <div className = "card col-md-6 offset-md-3 offset-md-3">
                        

                            <div className = "card-body">
                                
                                <form>
                                    <div className = "form-group">
                                        <label> Department Name </label>
                                        <input placeholder="Department Name" name="deptName" className="form-control" 
                                            value={this.state.deptName} onChange={this.changeDepartmentNameHandler}/>
                                    </div>
                                    <div className = "form-group">
                                        <label> Set Department ID: </label>
                                        <input placeholder="Department ID" name="deptId" className="form-control" 
                                            value={this.state.deptId} onChange={this.changeDepartmentIdHandler}/>
                                    </div>

                                    <button className="btn btn-success" onClick={this.saveDepartment}>Save</button>
                                    
                                </form>
                            </div>
                            <button className="btn btn-info" onClick={this.showDepartment} style={{marginLeft: "10px"}}>Show Dept List</button>
                        </div>
                        
                    </div>

               </div>
        </div>
    )
}
}

export default CreateDepartmentComp