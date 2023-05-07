<template>
  <div id="index">
    <el-row>
      <el-col :span="24">
        <div class="grid-content bg-purple-dark">
          <!-- 最外层div -->
          <div class="outest" @mouseover="mouseEnter = true" @mouseleave="mouseEnter = false" >
            <!-- 向左img -->
            <img class="icon _left" src="../img/向左.png" alt="向左" v-show="mouseEnter" @click="gotoLast()"/>
            <!-- 主要图片 -->
            <ul ref="myul">
              <li v-for="e of pictures" :key="e.index" :ref="e.ref">
                <img :src="e.src" :alt="e.alt" />
              </li>
            </ul>
            <!-- 底部小圆圈的设置 -->
            <div class="mydiv" v-show="mouseEnter">
              <div class="empty-cicle" v-for="e of pictures" :key="e.index" ref="cicle" @click="gotoDirectly(e.index)" ></div>
            </div>
            <!-- 向右div -->
            <img class="icon _right" src="../img/向右.png" alt="向右" v-show="mouseEnter" @click="gotoNext()"/>
          </div>
        </div>

      </el-col>
    </el-row>

    <el-row>
      <el-col :span="12"><div class="grid-content bg-purple">hhh</div></el-col>
      <el-col :span="12"><div class="grid-content bg-purple-light">hhh</div></el-col>
    </el-row>
    <el-row>
      <el-col :span="8"><div class="grid-content bg-purple">hh</div></el-col>
      <el-col :span="8"><div class="grid-content bg-purple-light">hh</div></el-col>
      <el-col :span="8"><div class="grid-content bg-purple"></div>12</el-col>
    </el-row>
    <el-row>
      <el-col :span="6"><div class="grid-content bg-purple"></div></el-col>
      <el-col :span="6"><div class="grid-content bg-purple-light"></div></el-col>
      <el-col :span="6"><div class="grid-content bg-purple"></div></el-col>
      <el-col :span="6"><div class="grid-content bg-purple-light"></div></el-col>
    </el-row>
    <el-row>
      <el-col :span="4"><div class="grid-content bg-purple"></div></el-col>
      <el-col :span="4"><div class="grid-content bg-purple-light"></div></el-col>
      <el-col :span="4"><div class="grid-content bg-purple"></div></el-col>
      <el-col :span="4"><div class="grid-content bg-purple-light"></div></el-col>
      <el-col :span="4"><div class="grid-content bg-purple"></div></el-col>
      <el-col :span="4"><div class="grid-content bg-purple-light"></div></el-col>
    </el-row>
  </div>

</template>

<script>
	export default {
		data() {
			return {
				pictures: [
					{src: "https://img0.baidu.com/it/u=1491296277,1329539836&fm=253&fmt=auto&app=138&f=JPEG?w=800&h=500",alt: "撸起袖子加油干",index: "0",ref: "picture",},
					{src: "https://img2.baidu.com/it/u=141235511,288522525&fm=253&fmt=auto&app=138&f=JPEG?w=500&h=263",alt: "植树造林",index: "1",ref: "picture",},
					{src: "https://img1.baidu.com/it/u=2564747122,3162867613&fm=253&fmt=auto&app=138&f=JPEG?w=888&h=500",alt: "疫情防控常态化",index: "2",ref: "picture",},
					{src: "https://img1.baidu.com/it/u=1221896196,2147882061&fm=253&fmt=auto&app=138&f=JPEG?w=500&h=250",alt: "1FCA0F23.png戴头盔",index: "3",ref: "picture",},
					{src: "https://img1.baidu.com/it/u=3117634844,2583644829&fm=253&fmt=auto&app=138&f=JPEG?w=1024&h=492",alt: "培育文明之魂",index: "4",ref: "picture",},
				],
				mouseEnter: false,      //鼠标是否悬浮在整个区域上
				pictureShowing: 0,      //当前展示的是第几张图片，用来更新底部圆点
				hasClicked:false,       //函数节流，防止用户快速、频繁点击图片变换导致出错，flase为图片变换操作不可执行
			};
		},

		watch: {
			mouseEnter: {                           //鼠标移入区域，图片切换停止，离开则继续
				immediate: true,
				handler(newval, oldval) {           //使其在页面一上来就能执行
					if (!newval) {
						this.$mytimer = setInterval(() => {
							if (this.pictureShowing < this.pictures.length-1) {
								this.pictureShowing++;
							} else {
								this.pictureShowing = 0;
							}
							this.changeDefault(10);
						}, 3000);
					} else {
						clearInterval(this.$mytimer);
					}
				},
			},
			pictureShowing(newval) {                //当改变图片时，更新底部小圆圈
				for (let i = 0; i < this.pictures.length; i++) {
					(this.$refs.cicle)[i].style.background = "";
				}
				(this.$refs.cicle)[newval].style.background = "black";
			}
		},

	    mounted() {
	        // console.log(this.$refs[`picture`])          //是一个 Array 包含 5 个 li 元素

	        // 解决当前页面被最小化后，用户再打开时，轮播图播放情况出现异常的情况
	        // 监视浏览器窗口的改变，当浏览器窗口最小化时，将默认定时器停掉，当浏览器可视时，再开启
	        document.addEventListener('visibilitychange',()=>{
	            if(document.visibilityState === 'hidden'){
	                clearInterval(this.$mytimer);
	            }else if(document.visibilityState === 'visible'){
	                this.$mytimer= setInterval(() => {
	                        if (this.pictureShowing < this.pictures.length-1) {
	                            this.pictureShowing++;
	                        } else {
	                            this.pictureShowing = 0;
	                        }
	                        this.changeDefault(10);
	                    }, 3000);
	            }
	        })

	        let li_0 = this.$refs[`picture`][0];
	        let li_end = li_0.cloneNode(true);
	        this.$refs.myul.appendChild(li_end);            //克隆第一张图片，加到ul最后展示的位置

	        this.$refs.myul.style.position = "absolute";
	        this.$refs.myul.style.left = 0 + "px";

	        this.$refs.cicle[0].style.background = "black";    //挂载时展示第一张图片，默认第一个圆圈被填充
	    },

	    methods: {
	        changeDefault(speed) {                  //切换下一张图片    speed为每毫秒移动的距离
	            let t = 0;                          //根据每秒移动的位移控制单次位移结束
	            let timer = setInterval(() => {
	                t++;
	                this.$refs.myul.style.left = this.$refs.myul.offsetLeft - Number(speed) + "px";

	                if (t === 600/speed) {
	                    if(this.$refs.myul.offsetLeft===-3000){             //当最后一张图片（第一张的克隆）刚好完全展示时回到第一张完全展示时的位置
	                        this.$refs.myul.style.left=0+"px";
	                    }
	                    clearInterval(timer);
	                    this.hasClicked=false;
	                }
	            }, 1);
	        },
	        quickTurn(count,index) {              //count为用户点击的点与当前 被填充点 的距离
	            let currentX = this.$refs.myul.offsetLeft;
	            let t = setInterval(() => {
	                this.$refs.myul.style.left = this.$refs.myul.offsetLeft - count * 20 + "px";
	                if (this.$refs.myul.offsetLeft === currentX - 600 * count) {
	                    if(index===0){
	                        this.$refs.myul.style.left=0+"px";
	                    }
	                    clearInterval(t);
	                    this.hasClicked=false;
	                }
	            }, 1);
	        },
	        gotoPicture(index) {
	            let id = Number(index);
	            let showing = this.pictureShowing;
	            if (id === showing) {
	                return null;
	            } else {
	                this.quickTurn(index - showing,index);
	                this.pictureShowing = index;
	            }
	        },
	        gotoLast(){             //上一张
	            if(this.hasClicked){
	                return null;
	            }
	            this.hasClicked=true;
	            if(Number(this.pictureShowing)===0){
	                this.$refs.myul.style.left=-3000+"px";
	                this.pictureShowing=this.pictures.length-1;
	                this.quickTurn(-1,this.pictureShowing);
	            }else{
	                this.gotoPicture(this.pictureShowing-1);
	            }
	        },
	        gotoNext(){             //下一张
	            if(this.hasClicked){
	                return null;
	            }
	            this.hasClicked=true;
	            if(Number(this.pictureShowing)===this.pictures.length-1){
	                this.changeDefault(20);
	                this.pictureShowing=0;
	            }else{
	                this.gotoPicture(this.pictureShowing+1)
	            }
	        },
	        gotoDirectly(index){    //跳到某一张
	            if(this.hasClicked){
	                return null;
	            }
	            this.hasClicked=true;
	            this.gotoPicture(index);
	        }
	    }
	};

</script>


<style lang="scss" scoped>
  .el-row {
    margin-bottom: 20px;
    &:last-child {
      margin-bottom: 0;
    }
  }
  .el-col {
    border-radius: 4px;
  }
  .bg-purple-dark {
    background: #99a9bf;
    height: 600px;
  }
  .bg-purple {
    background: #d3dce6;
  }
  .bg-purple-light {
    background: #e5e9f2;
  }
  .grid-content {
    border-radius: 4px;
    min-height: 200px;
  }
  .row-bg {
    padding: 10px 0;
    background-color: #f9fafc;
  }

  .outest {
        width: 100%;
        height: 600px;
        border: 2px rgb(115, 170, 243) solid;
        border-radius: 5px;
        padding: 0px;
        position: absolute;
        overflow: hidden;
        cursor: pointer;
        background-color: bisque;
    }
  /** 轮播图片设置 */
  ul {
      margin: 0px;
      padding: 0px;
      width: calc(6 * 100%);
      height: 100%;
  }
  ul > li {
      width: calc(1 / 6 * 100%);
      height: 100%;
      list-style: none;
      float: left;
  }
  li > img {
      width: 100%;
      height: 100%;
  }
  /* 左右图标设置 */
  .icon {
      width: 30px;
      height: 60px;
      position: absolute;
      top: 170px;
      z-index: 2;
      opacity: 0.5;
  }
  ._left {
      left: 0px;
  }
  ._right {
      right: 0px;
  }
  /* 底部小圆圈的设置 */
  .mydiv {
      width: auto;
      height: 30px;
      display: inline-block;
      position: absolute;
      bottom: 0px;
      left: 250px;
      z-index: 5;
      opacity: 0.5;
  }
  .empty-cicle {
      display: inline-block;
      width: 10px;
      height: 10px;
      border: 2px solid black;
      border-radius: 90px;
      z-index: 5;
      margin-right: 5px;
  }
</style>
