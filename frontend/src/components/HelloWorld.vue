<template>
  <div class="hello">
    <h1>{{ msg }}</h1>

    <h2>Chung ta cua hien tai</h2>
   
  </div>
</template>

<script>

import AXIOS from "@/services/http-commons.js";

export default {
  name: 'HelloWorld',
  props: {
    msg: String
  },
  created(){
    AXIOS.get("product").then(resp=>{
      console.log(resp.data);
    })
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
