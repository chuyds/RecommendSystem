<template>
  <div id="index">
    <el-row>
      <el-col :span="24">
        <div class="grid-content bg-purple-dark">
          <!-- 最外层div -->
          <div id="slide" class="outest" @mouseover="mouseEnter = true" @mouseleave="mouseEnter = false" >
            <!-- 向左img -->
            <img class="icon _left" src="../img/左箭头.png" alt="向左" v-show="mouseEnter" @click="gotoLast()"/>
            <!-- 主要图片 -->
            <ul id="imgsList" ref="myul">
              <li v-for="e of pictures" :key="e.index" :ref="e.ref">
                <img :src="e.src" :alt="e.alt" />
              </li>
            </ul>
            <!-- 底部小圆圈的设置 -->
            <div class="mydiv" v-show="mouseEnter">
              <div class="empty-cicle" v-for="e of pictures" :key="e.index" ref="cicle" @click="gotoDirectly(e.index)" ></div>
            </div>
            <!-- 向右div -->
            <img class="icon _right" src="../img/右箭头.png" alt="向右" v-show="mouseEnter" @click="gotoNext()"/>
          </div>
        </div>

      </el-col>
    </el-row>

    <el-row>

      <el-col :span="12" class="card-box">
        <el-card>
          <div class="el-table el-table--enable-row-hover el-table--medium">
              <img src="../img/1.jpg" alt="奇瑞汽车">
              <tr>
                <td class="el-table__cell is-leaf">
                  奇瑞新能源汽车技术有限公司于2010年4月正式成立，是奇瑞率先布局新能源产业后成立的一家独立子公司。2016年11月，奇瑞新能源拿到了发改委批准的新建纯电动乘用车生产项目资质，正式开启造车之路。
                </td>
              </tr>
          </div>
        </el-card>
      </el-col>

      <el-col :span="12" class="card-box">
        <el-card>
          <div class="el-table el-table--enable-row-hover el-table--medium">
                <img src="../img/2.jpg" alt="图片">
                <tr>
                  <td class="el-table__cell is-leaf">
                    致钛7100plush：采用国产长鑫颗粒，最高连续读取速度为3631.48MB/s，连续写入速度达到2520.22MB/s。同时，最大4K随机读取速度达到了929.96MB/s，最大4K随机写入速度为408.52MB/s。
                  </td>
                </tr>
          </div>
        </el-card>
      </el-col>
    </el-row>


    <el-row>
      <el-col :span="8" class="card-box">
        <el-card>
          <div class="el-table el-table--enable-row-hover el-table--medium">
                <img src="../img/3.jpg" alt="白酒">
                <tr>
                  <td class="el-table__cell is-leaf">
                    致钛7100plush：采用国产长鑫颗粒，最高连续读取速度为3631.48MB/s，连续写入速度达到2520.22MB/s。同时，最大4K随机读取速度达到了929.96MB/s，最大4K随机写入速度为408.52MB/s。
                  </td>
                </tr>
          </div>
        </el-card>
      </el-col>

      <el-col :span="8" class="card-box">
        <el-card>
          <div class="el-table el-table--enable-row-hover el-table--medium">
                <img src="../img/4.jpg" alt="茶叶图片">
                <tr>
                  <td class="el-table__cell is-leaf">
                    致钛7100plush：采用国产长鑫颗粒，最高连续读取速度为3631.48MB/s，连续写入速度达到2520.22MB/s。同时，最大4K随机读取速度达到了929.96MB/s，最大4K随机写入速度为408.52MB/s。
                  </td>
                </tr>
          </div>
        </el-card>
      </el-col>

      <el-col :span="8" class="card-box">
        <el-card>
          <div class="el-table el-table--enable-row-hover el-table--medium">
                <img src="../img/5.jpg" alt="黄山图片">
                <tr>
                  <td class="el-table__cell is-leaf">
                    致钛7100plush：采用国产长鑫颗粒，最高连续读取速度为3631.48MB/s，连续写入速度达到2520.22MB/s。同时，最大4K随机读取速度达到了929.96MB/s，最大4K随机写入速度为408.52MB/s。
                  </td>
                </tr>
          </div>
        </el-card>
      </el-col>
    </el-row>

    <el-row>
      <el-col :span="12" class="card-box"><div class="grid-content bg-purple">hhh</div></el-col>
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

					{src: "https://th.bing.com/th/id/R.b400119f09fb40efd5bb2bf24c5eedfe?rik=yD4slOarNqj5vA&riu=http%3a%2f%2fimg.yipic.cn%2fthumb%2ff0708c1d%2f0bfc4812%2f22e7f44a%2ff4429daf%2fbig_f0708c1d0bfc481222e7f44af4429daf.png%3fx-oss-process%3dimage%2fformat%2cwebp%2fsharpen%2c100&ehk=%2bSWnN54ZKx8LaEmlf0EbyfQKimIHAWR65S3o0%2bUKmRg%3d&risl=&pid=ImgRaw&r=0",alt: "一带一路",index: "0",ref: "picture",},
					{src: "https://pic1.zhimg.com/v2-c033cec25c1c4d1c0ecfb19e3e2222fe_r.jpg?source=1940ef5c",alt: "风景",index: "1",ref: "picture",},
					{src: "https://ts1.cn.mm.bing.net/th/id/R-C.b196b408634f2ce5134dcf8ead4b8e59?rik=pdN5KKTNSansVg&riu=http%3a%2f%2fimg.mm4000.com%2ffile%2f0%2f5d%2f9b1a116d73.jpg&ehk=3i5WDN140E3CU1XKf1inmGX3sFKYHUgNUD3VVSBvh44%3d&risl=&pid=ImgRaw&r=0",alt: "黄山",index: "2",ref: "picture",},
					{src: "https://th.bing.com/th/id/R.07ca4de0567767ee8a941530613e8fb0?rik=7HeC7NE8EAUnTw&riu=http%3a%2f%2faticoc.com%2fuploadfiles%2f2021%2f06%2f20210630182313678.jpg%3fMzMuanBn&ehk=QtjaEYrwyH1h6uQaqe%2bv%2fME6Uz0RT6CA0YIxNWSIecQ%3d&risl=&pid=ImgRaw&r=0",alt: "安徽茶叶",index: "3",ref: "picture",},
					{src: "https://ts1.cn.mm.bing.net/th/id/R-C.6391c62ea3845c4c2f137a245b9ce48b?rik=lmnP8dnsib4KLw&riu=http%3a%2f%2fwww.sinaimg.cn%2fqc%2fautoimg%2fcar%2f16%2f88%2f129618816_src.JPG&ehk=b5zYL1YweIIiYS847jZ4zL0csJjQJH3s88vJDRHq%2fL4%3d&risl=&pid=ImgRaw&r=0",alt: "汽车",index: "4",ref: "picture",},
				],
				mouseEnter: false,      //鼠标是否悬浮在整个区域上
				pictureShowing: 0,      //当前展示的是第几张图片，用来更新底部圆点
				hasClicked:false,       //函数节流，防止用户快速、频繁点击图片变换导致出错，flase为图片变换操作不可执行
        speed:80,               //图片移动速度
        offsetWidth:600,        //轮播图宽度，将在mounted里面动态获取
        topNav:this.$store.state.settings.topNav
			};
		},

		watch: {
			// mouseEnter: {                           //鼠标移入区域，图片切换停止，离开则继续
			// 	immediate: true,
			// 	handler(newval, oldval) {           //使其在页面一上来就能执行
			// 		if (!newval) {
			// 			this.$mytimer = setInterval(() => {
			// 				if (this.pictureShowing < this.pictures.length-1) {
			// 					this.pictureShowing++;
			// 				} else {
			// 					this.pictureShowing = 0;
			// 				}
			// 				this.changeDefault(this.speed);
			// 			}, 1000);
			// 		} else {
			// 			clearInterval(this.$mytimer);
			// 		}
			// 	},
			// },

      topNav(newValue,oldValue){              //用来监测topNav的改变
        this.$refs.myul.style.left=0+"px";
        this.pictureShowing = 0;
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
	        // document.addEventListener('visibilitychange',()=>{
	        //     if(document.visibilityState === 'hidden'){
	        //         clearInterval(this.$mytimer);
	        //     }else if(document.visibilityState === 'visible'){
	        //         this.$mytimer= setInterval(() => {
	        //                 if (this.pictureShowing < this.pictures.length-1) {
	        //                     this.pictureShowing++;
	        //                 } else {
	        //                     this.pictureShowing = 0;
	        //                 }
	        //                 this.changeDefault(this.speed);
	        //             }, 1000);
	        //     }
	        // })

          setInterval(() => {           //每0.5秒更新topNav
              this.topNav = this.$store.state.settings.topNav;
          },500);

          this.offsetWidth = this.getOffsetWidth();     //动态获取轮播图宽度

	        let li_0 = this.$refs[`picture`][0];
	        let li_end = li_0.cloneNode(true);
	        this.$refs.myul.appendChild(li_end);            //克隆第一张图片，加到ul最后展示的位置

	        this.$refs.myul.style.position = "absolute";
	        this.$refs.myul.style.left = 0 + "px";

	        this.$refs.cicle[0].style.background = "black";    //挂载时展示第一张图片，默认第一个圆圈被填充
	    },

	    methods: {
          getOffsetWidth(){
            var outestElt = document.getElementById("slide");
            var offsetWidth = outestElt.offsetWidth;
            return offsetWidth;
          },
	        changeDefault(speed) {                  //切换下一张图片    speed为每毫秒移动的距离
              this.offsetWidth = this.getOffsetWidth();     //动态获取轮播图宽度
	            let t = 0;                          //根据每秒移动的位移控制单次位移结束
	            let timer = setInterval(() => {
	                t++;
	                this.$refs.myul.style.left = this.$refs.myul.offsetLeft - Number(speed) + "px";

	                if (t >= this.offsetWidth/speed) {
	                    if(this.$refs.myul.offsetLeft<=-1*this.offsetWidth*5){             //当最后一张图片（第一张的克隆）刚好完全展示时回到第一张完全展示时的位置
	                        this.$refs.myul.style.left=0+"px";
	                    }
	                    clearInterval(timer);
	                    this.hasClicked=false;
                      t = 0;
	                }
	            }, 1);
	        },
	        quickTurn(count,index,method) {              //count为用户点击的点与当前 被填充点 的距离
              this.offsetWidth = this.getOffsetWidth();     //动态获取轮播图宽度
              // alert("width:"+this.offsetWidth+"    left:"+this.$refs.myul.offsetLeft);
	            let currentX = this.$refs.myul.offsetLeft;
	            let t = setInterval(() => {
                if(method === "next"){
                  if(this.$refs.myul.offsetLeft >= -1*this.offsetWidth*index+count*this.speed){
                    this.$refs.myul.style.left = this.$refs.myul.offsetLeft - count * this.speed + "px";
                  }else{
                    this.$refs.myul.style.left = this.$refs.myul.offsetLeft - count * 1 + "px";
                  }
                }
                if(method === "last"){
                  if(this.$refs.myul.offsetLeft <= -1*this.offsetWidth*index+count*this.speed){
                    this.$refs.myul.style.left = this.$refs.myul.offsetLeft - count * this.speed + "px";
                  }else{
                    this.$refs.myul.style.left = this.$refs.myul.offsetLeft - count * 1 + "px";
                  }
                }

                if (this.$refs.myul.offsetLeft === currentX - this.offsetWidth * count) {     //刚好到达目的图片
                    if(index===0){
                        this.$refs.myul.style.left=0+"px";
                    }
                    clearInterval(t);
                    this.hasClicked=false;
                }
	            }, 1);
	        },
	        gotoPicture(index,method) {
	            let id = Number(index);
	            let showing = this.pictureShowing;
	            if (id === showing) {
	                return null;
	            } else {
	                this.quickTurn(index - showing,index,method);
	                this.pictureShowing = index;
	            }
	        },
	        gotoLast(){             //上一张
              this.offsetWidth = this.getOffsetWidth();     //动态获取轮播图宽度
	            if(this.hasClicked){
	                return null;
	            }
	            this.hasClicked=true;
	            if(Number(this.pictureShowing)===0){
	                this.$refs.myul.style.left=-1*this.offsetWidth*5+"px";
	                this.pictureShowing=this.pictures.length-1;
	                this.quickTurn(-1,this.pictureShowing,"last");
	            }else{
	                this.gotoPicture(this.pictureShowing-1,"last");
	            }
	        },
	        gotoNext(){             //下一张
	            if(this.hasClicked){
	                return null;
	            }
	            this.hasClicked=true;
	            if(Number(this.pictureShowing)===this.pictures.length-1){
	                this.changeDefault(this.speed);
	                this.pictureShowing=0;
	            }else{
	                this.gotoPicture(this.pictureShowing+1,"next")
	            }
	        },
	        gotoDirectly(index){    //跳到某一张
	            if(this.hasClicked){
	                return null;
	            }
	            this.hasClicked=true;
              if(index>this.pictureShowing){
                this.gotoPicture(index,"next");
              }else{
                this.gotoPicture(index,"last");
              }

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
      width: 60px;
      height: 60px;
      position: absolute;
      top: 270px;
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
      left: 45%;
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
