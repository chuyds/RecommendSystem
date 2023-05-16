<template>
  <div id="index">
    <!-- 查询表单 -->
    <el-form ref="findForm" :model="formData" :rules="rules" :inline="true" size="mini" label-width="100px">
      <el-form-item label="产品类别" prop="field">
        <el-select id="select" v-model="formData.field" placeholder="如果需要查看某一类产品请在此处选择" clearable :style="{width: '300px'}">
          <el-option v-for="(item, index) in fieldOptions" :key="index" :label="item.label"
            :value="item.value" :disabled="item.disabled"></el-option>
        </el-select>
      </el-form-item>

      <el-form-item size="mini">
        <el-button type="primary" icon="el-icon-search" @click="submitForm">搜索</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="resetForm">重置</el-button>
      </el-form-item>

    </el-form>

    <el-row>
      <el-col :span="6" v-for="(good,index) in goods" class="card-box">
        <el-card>
          <img id="image" :src="good.imageUrl" alt="">
          <div id="text-description">
            <span style="color: red;">{{good.name+":"}}</span>
            <span>{{good.description}}</span>
          </div>
        </el-card>
      </el-col>
    </el-row>

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
        "label": "旅游景点",
        "value": 5
      }],
      goods:[],
      goodsOfCategory:[],
    }
  },
  computed: {},
  watch: {},
  created() {},
  mounted() {
    this.getList();
  },
  methods: {
    getList() {     //获取全部商品列表
      listGood().then(response => {
        this.goods = response;
      });

      // this.goodsOfCategory = this.goods;
    },
    getListByCategory(category) {     //获取category类别商品列表
      listGoodByCategory(category).then(response => {
        this.goods = response;
      });

      // this.goodsOfCategory = null;
      // for (var i = 0; i < this.goods.length; i++) {
      //   if(this.goods[i].category===category){
      //     this.goodsOfCategory.push(this.goods[i]);
      //   }
      // }
    },
    submitForm() {
      var category;
      var categoryElt = document.getElementById("select");
      for (var i = 0; i < this.fieldOptions.length; i++) {      //获取当前类别id
        if(this.fieldOptions[i].label===categoryElt.value){
          category = this.fieldOptions[i].value;
        }
      }
      // alert(category);

      this.getListByCategory(category);
    },
    resetForm() {
      this.$refs['findForm'].resetFields();
      this.getList();
    },
  }
}

</script>

<style>
    .el-row {
      margin-bottom: 20px;
      &:last-child {
        margin-bottom: 0;
      }
    }
    .el-col {
      border-radius: 4px;
    }
    .bg-purple {
      background: #d3dce6;
    }
    .bg-purple-light {
      background: #e5e9f2;
    }
    .grid-content {
      border-radius: 4px;
      min-height: 36px;
    }

    #image{
      width: 250px;
      height: 200px;
    }

</style>
