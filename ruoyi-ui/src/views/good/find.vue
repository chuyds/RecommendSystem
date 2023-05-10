<template>
  <div>
    <el-form ref="findForm" :model="formData" :rules="rules" size="mini" label-width="100px">
      <el-form-item label="产品类别" prop="field">
        <el-select v-model="formData.field" placeholder="如果需要查看某一类产品请在此处选择" clearable :style="{width: '50%'}">
          <el-option v-for="(item, index) in fieldOptions" :key="index" :label="item.label"
            :value="item.value" :disabled="item.disabled"></el-option>
        </el-select>
      </el-form-item>

      <el-form-item size="large">
        <el-button type="primary" @click="submitForm">提交</el-button>
        <el-button @click="resetForm">重置</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>
<script>
import { listGood, listGoodByCategory, getGood } from "@/api/system/good";

export default {
  components: {},
  props: [],
  data() {
    return {
      formData: {
        field: undefined,
      },
      rules: {
        field: [{
          required: true,
          message: '如果需要查看某一类产品请在此处选择',
          trigger: 'change'
        }],
      },
      fieldOptions: [{
        "label": "汽车",
        "value": 1
      }, {
        "label": "电子产品",
        "value": 2
      },{
        "label": "酒",
        "value": 3
      },{
        "label": "茶叶",
        "value": 4
      },{
        "label": "全部",
        "value": 5
      }],
      goods:[],
    }
  },
  computed: {},
  watch: {},
  created() {},
  mounted() {},
  methods: {
    getList() {     //获取全部商品列表
      listGood().then(response => {
        this.goods = response.data.data;
      });
    },
    submitForm() {
      this.listGood();
    },
    resetForm() {
      this.$refs['findForm'].resetFields()
    },
  }
}

</script>
<style>
</style>
