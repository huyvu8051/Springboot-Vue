import axios from 'axios'


export default axios.create({
    baseURL: `http://localhost:8098/api`,
    headers: {
      'Access-Control-Allow-Origin': 'http://localhost:8080'
    }
  })

