<template>
  <div>
    <h1>CGI Cinema login</h1>
    <form @submit.prevent="handleSubmit(email)" >
      <label for="email">Email:</label>
      <input id="email" v-model="email" required />
      <button type="submit">Login</button>
    </form>

    <form @submit.prevent="getAllUsers()" >
      <button type="submit">Get all Users data</button>
    </form>

    <p v-if="error">{{ error }}</p>
    <pre v-if="userData">{{ userData }}</pre>
    <pre v-if="users">{{ users }}</pre>
  </div>
</template>

<script>
  export default {
    data() {
      return {
        email: '',
        error: null,
        userData: null,
        response:null,
        users:[]
      };
    },
    // TODO get a valid user.
    methods:{
      handleSubmit(email){
        this.userData= null
        this.users = null
        fetch(`http://localhost:9090/users/${email}`, {
          method: 'GET',
        })
          .then(response => {
            return response.json()
          })
          .then(data => {
            this.userData = data;
          })
          .catch(error => {
            console.error('Error fetching data:', error);
            this.error = 'Failed to retrieve user data.';
          });
      },
      getAllUsers(){

        //TODO reset fields
       this.users = null
        fetch(`http://localhost:9090/users/valid`, {
          method: 'GET',
        })
          .then(response => {
            return response.json()
          })
          .then(data => {
            this.users = data;
          })
          .catch(error => {
            console.error('Error fetching data:', error);
            this.error = 'Failed to retrieve user data.';
          });
      },
    }
  }
</script>

<style scoped>
h1 {
  font-weight: 500;
  font-size: 2.6rem;
  position: relative;
  color: red;
  top: -10px;
}

h3 {
  font-size: 1.2rem;
}

.greetings h1,
.greetings h3 {
  text-align: center;
}

@media (min-width: 1024px) {
  .greetings h1,
  .greetings h3 {
    text-align: left;
  }
}
</style>