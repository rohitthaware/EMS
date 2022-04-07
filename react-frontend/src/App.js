import React from 'react';
import logo from './logo.svg';
import './App.css';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom'
import ListEmployeeComponent from './components/ListEmployeeComponent';
import HeaderComponent from './components/HeaderComponent';
import FooterComponent from './components/FooterComponent';
import CreateEmployeeComponent from './components/CreateEmployeeComponent';
import UpdateEmployeeComponent from './components/UpdateEmployeeComponent';
import ViewEmployeeComponent from './components/ViewEmployeeComponent';
import CreateDepartmentComp from './components/CreatingDepartmentComp';
import ApplyLeaveComp from './components/ApplyLeaveComp';
import AdminInterfaceComp from './components/AdminInterfaceComp';
import ListDepartmentComp from './components/ListDepartmentComp';
import LeaveListComp from './components/LeaveListComp';
import EmployeeInterfaceComp from './components/EmployeeInterfaceComp';
import TrainingListComp from './components/TrainingListComp';
import Trainings from './components/Trainings';

function App() {
  return (
    <div>
        <Router>
              <HeaderComponent />
                <div className="container">
                    <Switch> 
                          <Route path = "/" exact component = {ListEmployeeComponent}></Route>
                          <Route path = "/employees" component = {ListEmployeeComponent}></Route>
                          <Route path = "/add-employee/:id" component = {CreateEmployeeComponent}></Route>
                          <Route path = "/view-employee/:id" component = {ViewEmployeeComponent}></Route>
                          {/* <Route path = "/update-employee/:id" component = {UpdateEmployeeComponent}></Route> */}
                          <Route path = "/department" component= {CreateDepartmentComp}></Route>
                          <Route path = "/showall-department" component = {ListDepartmentComp}></Route>
                          <Route path = "/leave-application" component={ApplyLeaveComp}></Route>
                          <Route path = "/admin" component = {AdminInterfaceComp}></Route>
                          <Route path = "/leaves" component = {LeaveListComp}></Route>
                          <Route path = "/employee" component ={EmployeeInterfaceComp}></Route> 
                          <Route path = "/trainingslist" component = {TrainingListComp}></Route>
                          <Route path = "/training" component = {Trainings}></Route>
                    </Switch>
                </div>
              {/* <FooterComponent /> */}
        </Router>
    </div>
    
  );
}

export default App;
