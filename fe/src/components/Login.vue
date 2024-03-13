<script>
// setup
// defineProps({
//   msg: {
//     type: String,
//     required: true
//   }
// })

// import {ref} from 'vue';
  export default {
    data() {
      return {
        email: '',
        error: null,
        userData: null,
      };
    },
    methods: {
      handleSubmit(email) {
        this.error = null; // Clear any previous errors
        this.userData = null; // Clear previous data

        fetch(`http://localhost:9090/users/${email}`,{
          method: 'GET',
        })
            .then( response => {
              console.log(response);
               return response.text()})

            .then(data => {
              this.userData = data;
            })
            .catch(error => {
              console.error('Error fetching data:', error);
              this.error = 'Failed to retrieve user data.';
            });
      },
    },
}
</script>

<template>

    <div>
      <h1>Login</h1>
      <form @submit.prevent="handleSubmit(email)">
        <label for="email">Email:</label>
        <input id="email" v-model="email" />
        <button type="submit">Login</button>
      </form>
      <p v-if="error">{{ error }}</p>
      <pre v-if="userData">{{ userData }}</pre>
    </div>
</template>

<style scoped>
h1 {
  font-weight: 500;
  font-size: 2.6rem;
  position: relative;
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