<template>
<div>
   <div ref="vantaRef" style="width:100%;height:100vh"></div>
   <div class="my_title">安徽省优势产能云推荐</div>

</div>

</template>

<script>
import * as THREE from 'three'
import Rings from 'vanta/src/vanta.rings'

export default {
  name: "hello",
  mounted() {
    this.vantaEffect = Rings({
      el: this.$refs.vantaRef,
      THREE: THREE
    })
  },
  beforeDestroy() {
    if (this.vantaEffect) {
      this.vantaEffect.destroy()
    }
  },
  methods: {

  },

};
</script>

<style>
.my_title{
  z-index: 999;
  position: fixed;
  top: 40%;
  left: 10%;
  color: aquamarine;
  font-size: 100px;
  font-weight: bolder;
}
</style>
