import axios from 'axios'

const BASE_TR_URL = "http://localhost:8080/ems/v4/trainings";

class TrainingServices{

    getAllTrainings(){

        return axios.get(BASE_TR_URL);

    }

    addTraining(){

        return axios.post(BASE_TR_URL);

    }

}

export default new TrainingServices()