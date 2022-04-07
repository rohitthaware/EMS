import axios from 'axios'

const DEPT_BASE_URL = "http://localhost:8080/ems/v2/department";

class DepartmentService{

    getDept(){
        return axios.get(DEPT_BASE_URL);
    }

    createDept(dept){
        return axios.post(DEPT_BASE_URL, dept);
    }

    getDeptById(deptId){
        return axios.get(DEPT_BASE_URL + '/' + deptId);
    }

}

export default new DepartmentService()