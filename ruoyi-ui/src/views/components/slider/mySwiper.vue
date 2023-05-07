<template>
    <div class="swiper-box" ref="swiperBox">
        <!-- 滑块主体 -->
        <div class="swiper-wrapper" :style="{width: width + 'rem', height: oHeight}" @touchstart="startMove"
             @touchend="endMove" @touchmove="move" ref="sliderBox">
            <slot class="swiper-sliber" />
        </div>
        <!-- 按钮 -->
        <div class="btn-box" v-if="nextBtn" @touchstart="startMove" @touchend="endMove" @touchmove="move">
            <p @click.stop="handleLast" :class="{'click': isClickL}"><i class="iconfont icon-arrow-left-s-fill"></i></p>
            <p @click.stop="handleNext" :class="{'click': isClickR}"><i class="iconfont icon-arrow-right-s-fill"></i>
            </p>
        </div>
        <!-- 分页文字 -->
        <div v-if="pagingText !== 'none'" class="paging-text-box"
             :class="{left: pagingPosition === 'left', right: pagingPosition === 'right'}">
            <span class="paging">{{pagingText !== 'none'? pagingText : ''}}{{loop ? length-2 + '/' + index : length + '/' + (index + 1)}}</span>
        </div>
        <!-- 分页器 -->
        <div class="hint-list-box" v-if="paging !== 'none'">
            <ul class="hint-list" :class="{center: paging === 'center', right: paging === 'right' }">
                <li class="item" v-for="item in hintLen" :key="item"
                    :class="{active: (item === index && loop === true) || (!loop && item === index + 1)}">
                </li>
            </ul>
        </div>
    </div>
</template>

<script>
    export default {
        name: 'my-swiper',
        data() {
            return {
                startX: 0,
                endX: 0,
                nowLeft: 0,
                isClickL: false,
                isClickR: false,
                length: 0,
                index: 0,
                width: 0,
                resistance: 1,
                itemWidth: 0,
                timer: null,
                autoTimer: null,
                zoomTimer: null
            }
        },
        props: {
            oHeight: { //设置组件高度
                type: String,
                default: 'auto'
            },
            nextBtn: { //是否显示切换按钮默认false
                type: Boolean,
                default: false
            },
            loop: {     //是否循环播放默认false
                type: Boolean,
                default: false
            },
            paging: {   // 是否显示分页器默认none不显示 可选 left， center， right
                type: String,
                default: 'center'
            },
            pagingText: { // 是否显示页数 默认none不显示 传入字符串为页数文字前缀
                type: String,
                default: 'none'
            },
            pagingPosition: { //页数定位默认center居中 可选left  right
                type: String,
                default: 'center'
            },
            defaultIndex: { //默认开始轮播索引 默认0 请填写你传入元素长度内的 数字
                type: Number,
                default: 0
            },
            automation: { // 是否自动轮播 为0时不自动轮播  默认3000 每3000ms轮播一次
                type: Number,
                default: 0
            },
            zoom: {   // 是否启动zoom模式 要配合子组件宽度一起使用 必须在loop模式下开启
                type: Boolean,
                default: false
            },
            retract: {  // 是否缩进显示 要配合子组件宽度一起使用 必须在loop模式下开启
                type: Boolean,
                default: false
            }
        },
        methods: {
            // 手指点击时触发方法， 主要记录手指要开始滑动时x坐标用于计算滑动结束与开始的差值， 触控时清除 自动轮播与轮播动画的定时器
            startMove(e) {
                clearInterval(this.timer)                       // 清除轮播动画定时器
                clearInterval(this.autoTimer)                   // 清除自动轮播定时器
                this.startX = e.targetTouches[0].clientX        // 获取触控时x坐标
                this.nowLeft = this.$refs.sliderBox.offsetLeft  // 记录当前滑块left值
            },
            // 手指拖动时触发的，滑动动画
            slider(nowX) {
                if (this.$refs.sliderBox.offsetLeft > 0 && !this.loop) { // 不是循环模式下 在第一个元素向右拖拽时速度衰减
                    this.resistance += 0.03
                    window.console.log(55555)
                    this.$refs.sliderBox.style.left = (nowX - this.startX) / this.resistance + 'px'
                    return
                } else if (this.$refs.sliderBox.offsetLeft < -this.maxLeft && !this.loop) { // 不是循环模式下 在最后一个元素向左拖拽时速度衰减
                    this.resistance += 0.03
                    this.$refs.sliderBox.style.left = this.nowLeft + (nowX - this.startX) / this.resistance + 'px'
                    return
                }
                this.$refs.sliderBox.style.left = this.nowLeft + (nowX - this.startX) + 'px'
            },
            // 根据子元素计算 滑块宽度
            getItemDom() {
                let itemArr = Array.prototype.slice.call(this.$refs.sliderBox.children, 0)
                this.length = this.$refs.sliderBox.children.length
                itemArr.forEach((ele) => {
                    this.width += parseFloat(ele.style.width)
                })
            },
            // zoom模式下滑动动画
            zoomMove(nowX) {
                if (nowX - this.startX < 0) {
                    let scale = (-(nowX - this.startX) * 0.001) + 0.8 > 1 ? 1 : (-(nowX - this.startX) * 0.001) + 0.8
                    let opacity = (-(nowX - this.startX) * 0.001) + 0.5 > 1 ? 1 : (-(nowX - this.startX) * 0.0015) + 0.5
                    this.$refs.sliderBox.children[this.index + 1].style.transform = 'scale(' + scale + ')'
                    this.$refs.sliderBox.children[this.index + 1].style.opacity = opacity
                } else {
                    let scale = ((nowX - this.startX) * 0.001) + 0.8 > 1 ? 1 : ((nowX - this.startX) * 0.001) + 0.8
                    let opacity = ((nowX - this.startX) * 0.001) + 0.5 > 1 ? 1 : ((nowX - this.startX) * 0.0015) + 0.5
                    this.$refs.sliderBox.children[this.index - 1].style.transform = 'scale(' + scale + ')'
                    this.$refs.sliderBox.children[this.index - 1].style.opacity = opacity
                }
            },
            // 手指拖动时触发该方法
            move(e) {
                let nowX = e.targetTouches[0].clientX
                this.slider(nowX)                           // 调用滑动动画函数
                this.zoom && this.zoomMove(nowX)            // 调用zoom动画函数
            },
            // 拖动结束时触发 该方法
            endMove(e) {
                this.endX = e.changedTouches[0].clientX
                if (this.resistance !== 1) this.resistance = 1
                // 判断拖动距离 是否改变index
                if (this.distance > 50) {
                    this.handleLast('touch')
                } else if (this.distance < -50) {
                    this.handleNext('touch')
                } else {
                    this.animation(this.$refs.sliderBox, this.target)
                }
                // 在自动轮播时 拖动结束重新启动定时器
                this.autoTimer = this.automation ? this.handleAuto() : null
            },
            // 切换下一个函数， 主要以改变index方式切换
            handleLast(isTouch) {
                this.isClickL = true
                if (!this.loop) {
                    if (!this.index && isTouch !== 'touch') {
                        this.index = this.length - 1
                    } else if (this.index) {
                        this.index--
                    } else {
                        this.animation(this.$refs.sliderBox, this.target)
                    }
                } else {
                    if (this.index === 1) {
                        this.transposition()
                        this.index = this.length - 2
                    } else {
                        this.index--
                    }
                }
                this.zoom && this.$refs.sliderBox && this.zoomAnimation(this.$refs.sliderBox.children[this.index])
                setTimeout(() => {
                    this.isClickL = false
                }, 300)
            },
            // 切换上一个函数， 主要以改变index方式切换
            handleNext(isTouch) {
                this.isClickR = true
                if (!this.loop) {
                    if (this.index === this.length - 1 && isTouch !== 'touch') {
                        this.index = 0
                    } else if (this.index !== this.length - 1) {
                        this.index++
                    } else {
                        this.animation(this.$refs.sliderBox, this.target)
                    }
                } else {
                    if (this.index === this.length - 2) {
                        this.transposition('isLast')
                        this.index = 1
                    } else {
                        this.index++
                    }
                }
                this.zoom && this.$refs.sliderBox && this.zoomAnimation(this.$refs.sliderBox.children[this.index])
                setTimeout(() => {
                    this.isClickR = false
                }, 300)
            },
            // 切换动画
            animation(dom, target) {
                clearInterval(this.timer)
                let origin = null
                let speed = null
                this.timer = setInterval(() => {
                    origin = dom.offsetLeft
                    speed = (target - origin) / 9
                    speed = speed > 0 ? Math.ceil(speed) : Math.floor(speed)
                    if (Math.abs(target - dom.offsetLeft) < 2) {
                        dom.style.left = target + 'px'
                        clearInterval(this.timer)
                        return
                    }
                    dom.style.left = origin + speed + 'px'
                }, 16)
                this.endX = 0
                this.startX = 0
                if (this.zoom) {
                    this.isZoomActive()
                }
            },
            // zoom动画
            zoomAnimation(dom) {
                clearInterval(this.zoomTimer)
                let originScale = Number(this.getDomTransform(dom, 'scale'))
                let originOpacity = Number(dom.style.opacity)
                if (originScale === 1 && originOpacity === 1) {
                    clearInterval(this.zoomTimer)
                    return
                }
                let speed = 0.02
                this.zoomTimer = setInterval(() => {
                    if (originScale >= 1 && originOpacity >= 1) {
                        clearInterval(this.zoomTimer)
                        return
                    }
                    originScale += speed
                    originOpacity += speed
                    dom.style.transform = originScale > 1 ? `scale(1)` : `scale(${originScale})`
                    dom.style.opacity = originOpacity
                }, 16)
            },
            // 获取元素transform函数
            getDomTransform(dom, type) {
                let transformStr = dom.style.transform
                let tarnArr = transformStr.split(' ')
                let obj = {}
                tarnArr.forEach(item => {
                    let tempArr = item.split('(')
                    obj[tempArr[0]] = tempArr[1].slice(0, -1)
                })
                return type ? obj[type] : obj
            },
            // loop模式的前期渲染函数， 感觉这里写的不是很美丽关键是想把，滑块中的每一项以标签形式传进来，没想到更好的方法，如果是数组的形式就要好些
            renderLoop() {
                if (this.loop) {
                    let divArr = Array.prototype.slice.call(this.$refs.sliderBox.children, 0)
                    let len = divArr.length
                    let deviceWidth = document.documentElement.clientWidth
                    let first = divArr[0].cloneNode(true)
                    let last = divArr[len - 1].cloneNode(true)
                    this.$refs.sliderBox.appendChild(first)
                    this.$refs.sliderBox.insertBefore(last, this.$refs.sliderBox.children[0])
                    setTimeout(() => {
                        this.$refs.sliderBox.style.left = -(this.defaultIndex + 1) * this.$refs.sliderBox.children[0].offsetWidth + (deviceWidth - this.$refs.sliderBox.children[0].offsetWidth)/2 + 'px'
                        window.console.log('-----', this.$refs.sliderBox.style.left)
                        if (this.defaultIndex <= this.length - 1) {
                            this.index = this.defaultIndex + 1
                        }
                    })

                } else {
                    setTimeout(() => {
                        this.$refs.sliderBox.style.left = -this.defaultIndex * this.$refs.sliderBox.children[0].offsetWidth + 'px'
                        this.index = this.defaultIndex
                    })
                }
                this.getItemDom()
            },
            // zoom模式中样式调整
            isZoomActive() {
                if (this.$refs.sliderBox) {
                    for (let i = 0; i < this.$refs.sliderBox.children.length; i++) {
                        if (i !== this.index) {
                            this.$refs.sliderBox.children[i].style.transform = 'scale(0.8)'
                            this.$refs.sliderBox.children[i].style.opacity = '0.5'
                        } else {
                            this.$refs.sliderBox.children[i].style.transform = 'scale(1)'
                            this.$refs.sliderBox.children[i].style.opacity = '1'
                        }
                    }
                }
            },
            // 循环模式中的换位函数
            transposition(isLast) {
                if (isLast) {
                    if (this.$refs.sliderBox) this.$refs.sliderBox.style.left = this.distance + 'px'
                    return
                }
                this.$refs.sliderBox.style.left = -(this.length - 1) * this.$refs.sliderBox.children[0].offsetWidth + this.distance + 'px'
            },
            // 启动自动模式
            handleAuto() {
                if (this.automation) {
                    return (setInterval(() => {
                        this.handleNext()
                    }, this.automation))

                }
            }
        },
        computed: {
            // 手指触碰与离开的差值
            distance() {
                return this.endX - this.startX
            },
            // 计算滑块目的地
            target() {
                if (this.swiperWidth - this.$refs.sliderBox.children[0].offsetWidth !== 0 && this.retract) {
                    return -this.index * this.$refs.sliderBox.children[0].offsetWidth + (this.swiperWidth - this.$refs.sliderBox.children[0].offsetWidth) / 2
                }
                return -this.index * this.$refs.sliderBox.children[0].offsetWidth
            },
            // 分页个数
            hintLen() {
                return this.loop && this.length ? this.length - 2 : this.length
            },
            // box宽度
            swiperWidth() {
                return this.$refs.swiperBox && this.$refs.swiperBox.offsetWidth
            },
            // 滑块极限值
            maxLeft() {
                return this.$refs.sliderBox && this.$refs.sliderBox.offsetWidth - this.$refs.sliderBox.children[0].offsetWidth
            }
        },
        watch: {
            // 监控index变化
            index() {
                this.animation(this.$refs.sliderBox, this.target)
            }
        },
        mounted() {
            this.renderLoop()
            this.autoTimer = this.automation ? this.handleAuto() : null
        },
        beforeDestroy() {
            clearInterval(this.timer)
            clearInterval(this.autoTimer)
            clearInterval(this.zoomTimer)
        }
    }
</script>

<style lang="scss" scoped>
    .swiper-box {
        width: 100%;
        overflow: hidden;
        position: relative;
        .swiper-wrapper {
            position: relative;
            overflow: hidden;
            display: flex;
        }
        .btn-box {
            position: absolute;
            width: 100%;
            top: 50%;
            display: flex;
            justify-content: space-between;
            transform: translateY(-50%);
            overflow: hidden;
            p {
                overflow: hidden;
                color: rgba(4, 4, 4, .4);
                background-color: rgba(8, 8, 8, .1);
                &.click {
                    background-color: rgba(8, 8, 8, .6);
                    .iconfont {
                        color: rgba(4, 4, 4, .6);
                    }
                }
                .iconfont {
                    font-size: .8rem;
                }
            }
        }
        .hint-list-box {
            position: absolute;
            width: 100%;
            bottom: .2rem;
            .hint-list {
                display: flex;
                &.center {
                    justify-content: center;
                }
                &.right {
                    justify-content: flex-end;
                }
            }
            .item {
                width: .2rem;
                height: .2rem;
                border-radius: 50%;
                background-color: #eeeeec;
                margin-left: .2rem;
                &.active {
                    background: linear-gradient(#6a3, #4e6);
                }
            }
        }
        .paging-text-box {
            position: absolute;
            top: .1rem;
            text-align: center;
            width: 100%;
            &.right {
                text-align: right;
                span {
                    margin-right: 1rem;
                }
            }
            &.left {
                text-align: left;
                span {
                    margin-left: 1rem;
                }
            }
        }
    }
</style>
