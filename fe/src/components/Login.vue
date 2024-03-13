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


<script>
  export default {
    data() {
      return {
        email: 'a',
        error: null,
        userData: null,
        response:null
      };
    },

    mounted() {

      fetch(`http://localhost:9090/users/a`, {
            method: 'GET',
          })
              .then(response => {
                console.log(response);
                return response.json()
              })

              .then(data => {
                this.userData = data;
              })
              .catch(error => {
                console.error('Error fetching data:', error);
                this.error = 'Failed to retrieve user data.';
              });
        }
}
</script>
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