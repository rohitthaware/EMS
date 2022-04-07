import axios from 'axios'

const BASE_URL = "http://localhost:8080/ems/v3/leaveApplication";

class LeaveServices{

    getAllLeaves(){
    
        return axios.get(BASE_URL)
    
    }

    addLeave(){

        return axios.post(BASE_URL)

    }



}

export default new LeaveServices()