import React, { Component } from 'react'

class ApplyLeaveComp extends Component {

    constructor(props) {
        super(props)
    
        this.state = {
             
        }
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
                                            <label> Start Date </label>
                                            <input type="date" placeholder="Department Name" name="deptName" className="form-control" 
                                               />
                                        </div>
                                        <div className = "form-group">
                                            <label> End Date </label>
                                            <input type = "date" placeholder="Department Name" name="deptName" className="form-control" 
                                                value={this.state.deptName} onChange={this.changeDepartmentNameHandler}/>
                                        </div>
                                        <div className = "form-group">
                                            <label> Select leave type: </label>
                                            <input placeholder="Leave Type:" name="deptId" className="form-control" 
                                                value={this.state.deptId} onChange={this.changeDepartmentIdHandler}/>
                                        </div>
    
                                        <button className="btn btn-success" onClick={this.saveDepartment}>Apply</button>
                                        
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

export default ApplyLeaveComp

