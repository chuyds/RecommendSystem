<template>
  <div id="index">

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

    <main>
          <!-- organic food section -->
        <section class="about-section">
            <div class="container">
                <div class="row">
                    <div class="col-xl-6 col-md-12 ">
                        <div class="organic-food">
                            <img src="https://ts1.cn.mm.bing.net/th/id/R-C.a59e279aaaa5220a995ef601c9b965d8?rik=61Whez3BUEfHfw&riu=http%3a%2f%2fn.sinaimg.cn%2fsinakd20210109ac%2f172%2fw1653h919%2f20210109%2f11e8-khmyntz8981549.jpg&ehk=g%2bk%2fE7ntPbG2NGweE7dw3K2dYrYwY0DU1dMLx2r4T%2fI%3d&risl=&pid=ImgRaw&r=0" alt="">
                        </div>
                    </div>
                    <div class="col-xl-6 col-md-12 ">
                        <div class=" base_header_left">
                            <small>Welcome To NIO ET7</small>
                            <h3>LEAD THE CHANGE</h3>
                        </div>
                        <div class="about_item">
                            <h4>智能电动旗舰轿车</h4>
                            <p>蔚来ET7是蔚来汽车的旗舰电动轿车型号，ET7是一款豪华电动轿车，注重舒适性、性能和智能化技术。在动力方面，ET7搭载了一种电动驱动系统，提供强大的性能。ET7还引入了一系列先进的智能技术。
                            它配备了蔚来的第二代车载超级计算机，具备高级驾驶辅助功能，如自动驾驶、智能语音控制和自动泊车等。</p>
                        </div>

                    </div>
                </div>
            </div>
        </section>
        <!-- end food section -->

        <!-- service section -->
        <section class="service-section">
<!--            <div class="animate_icon">
                <div class="animate_item animate_item1">
                    <img src="static/picture/animate_icon1.png" alt="">
                </div>
                <div class="animate_item animate_item2">
                    <img src="static/picture/animate_icon2.png" alt="">
                </div>
                <div class="animate_item animate_item3">
                    <img src="static/picture/animate_icon3.png" alt="">
                </div>
                <div class="animate_item animate_item4">
                    <img src="static/picture/animate_icon4.png" alt="">
                </div>
            </div> -->
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <div class="base-header">
                            <small>安徽省高新产业</small>
                            <h3>智能化汽车</h3>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-4 col-sm-12">
                        <div class="service-item">
                            <div class="img_serv">
                                <a href="service-page.html">
                                    <img src="https://n.sinaimg.cn/sinakd20210712ac/675/w1300h975/20210712/9841-19c837894d876f75e41c662d91c62f0c.jpg" alt="service">
                                </a>
                            </div>
                            <div class="service_text">
                                <a href="service-page.html">
                                    <h4>2023年全新一代瑞虎3x</h4>
                                </a>
                                <p>以“真诚”为约，奇瑞与淄博开启一场双向奔赴。“三好国民车”奇瑞全新一代瑞虎3x于山东淄博“人间烟火之夜”焕新上市。
                                瑞虎3x以引领时尚风潮的新感官设计带来全新外观设计，整体车身动线更加流畅和动感，尾部的一体贯穿式尾灯如画龙点睛，勾勒出整车风尚之感。</p>
                            </div>
                            <a class="serv_link" href="service-page.html"><i class="icon-glyph-40"></i></a>
                        </div>
                    </div>
                    <div class="col-md-4 col-sm-12">
                        <div class="service-item">
                            <div class="img_serv">
                                <a href="service-page.html">
                                    <img src="https://img4.cheshi-img.com/202111/10/nuih2hpr3m.png" alt="service">
                                </a>
                            </div>
                            <div class="service_text">
                                <a href="service-page.html">
                                    <h4>强力混动新能源瑞虎7 PLUS</h4>
                                </a>
                                <p>奇瑞强动力电混SUV 瑞虎7 PLUS 新能源以“最科技化、最国际化、最用户化”的跃迁式全新展台形象强势登陆2023上海国际车展。
                                作为奇瑞汽车旗下首款搭载8155智慧生态平台的车型，以24.6吋曲面沉浸式环绕屏，与更符合人体工学结构打造的环抱式座舱设计相得益彰。</p>
                            </div>
                            <a class="serv_link" href="service-page.html"><i class="icon-glyph-40"></i></a>
                        </div>
                    </div>
                    <div class="col-md-4 col-sm-12">
                        <div class="service-item">
                            <div class="img_serv">
                                <a href="service-page.html">
                                    <img src="https://p26.toutiaoimg.com/origin/tos-cn-i-qvj2lq49k0/f7d441f331554e9ab6cfb4e4ab98c58b?from=pc" alt="" srcset="">
                                </a>
                            </div>
                            <div class="service_text">
                                <a href="service-page.html">
                                    <h4>高能低耗瑞虎8 PRO新能源</h4>
                                </a>
                                <p>2023年奇瑞推出全新“强动力5+2座电混SUV”——瑞虎8 PRO新能源汽车，“高能和低耗”要兼得，才是出行最优解。瑞虎8 PRO新能源搭载了混合动力专用1.5T超效发动机+双电机的动力组合，系统综合功率240kW，远超合资主流车型，百公里加速只需7.2秒。</p>
                            </div>
                            <a class="serv_link" href="service-page.html"><i class="icon-glyph-40"></i></a>
                        </div>
                    </div>
                </div>
            </div>

            <br><br><br>

            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <div class="base-header">
                            <small>安徽省文化产业</small>
                            <h3>徽 + 产业</h3>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-4 col-sm-12">
                        <div class="service-item">
                            <div class="img_serv">
                                <a href="service-page.html">
                                    <img src="https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimg.alicdn.com%2Fbao%2Fuploaded%2Fi1%2F2890305967%2FTB2CBBBb6gy_uJjSZKbXXXXkXXa_%21%210-paimai.jpg&refer=http%3A%2F%2Fimg.alicdn.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1686638364&t=30f032bc55c771fc142b2ea3ff9def05" alt="service">
                                </a>
                            </div>
                            <div class="service_text">
                                <a href="service-page.html">
                                    <h4>徽 + 酒</h4>
                                </a>
                                <p>古井贡酒产自安徽省亳州市，属于大曲浓香型白酒，有“酒中牡丹”之称、被称为中国八大名酒之一。其渊源
                                始于建安元年（196年）曹操将家乡亳州产的“九酝春酒”和酿造方法进献给汉献帝刘协。具有“色清如水晶，
                                香醇如幽兰，入口甘美醇和，回昧经久不息”的特点。以安徽淮北平原优质小麦、古井镇优质地下水以及颗粒饱满、
                                糯性强的优质高梁为原料，利用其自然微生物环境，按古井贡酒传统工艺生产而成。</p>
                            </div>
                            <a class="serv_link" href="service-page.html"><i class="icon-glyph-40"></i></a>
                        </div>
                    </div>
                    <div class="col-md-4 col-sm-12">
                        <div class="service-item">
                            <div class="img_serv">
                                <a href="service-page.html">
                                    <img src="https://dili.chazidian.com/uploadfile/dili/baike/2017/05/24/4055690084.jpg" alt="service">
                                </a>
                            </div>
                            <div class="service_text">
                                <a href="service-page.html">
                                    <h4>徽 + 山</h4>
                                </a>
                                <p>黄山，古称黟山，位于安徽省黄山市境内，是中华十大名山之一、世界文化与自然遗产。东起黄狮岭，西至小岭脚，
                                北始二龙桥，南达汤口镇，山境南北长约40千米，东西宽约30千米，总占地面积约1200平方千米，属亚热带季风气候，由于山高谷深，气候呈垂直变化；
                                以奇松、怪石、云海、温泉、冬雪“五绝”及历史遗存、书画、文学、传说、名人“五胜”著称于世，有“天下第一奇山”、
                                “天开图画”、“松海云川”之称。</p>
                            </div>
                            <a class="serv_link" href="service-page.html"><i class="icon-glyph-40"></i></a>
                        </div>
                    </div>
                    <div class="col-md-4 col-sm-12">
                        <div class="service-item">
                            <div class="img_serv">
                                <a href="service-page.html">
                                    <img src="https://img1.baidu.com/it/u=64830204,4271128327&fm=253&fmt=auto&app=138&f=JPEG?w=400&h=400" alt="service">
                                </a>
                            </div>
                            <div class="service_text">
                                <a href="service-page.html">
                                    <h4>徽 + 茶</h4>
                                </a>
                                <p>安徽盛产茶叶，中国十大名茶之中，安徽茶叶占三成。其中的黄山毛峰产于安徽省黄山（徽州）一带，所以又称徽茶，
                                由清代光绪年间谢裕大茶庄所创制。每年清明谷雨，选摘良种茶树“黄山种”、“黄山大叶种”等的初展肥壮嫩芽，手工炒制，
                                该茶外形微卷，状似雀舌，绿中泛黄，银毫显露，且带有金黄色鱼叶（俗称黄金片）。入杯冲泡雾气结顶，汤色清碧微黄，
                                叶底黄绿有活力，滋味醇甘，香气如兰，韵味深长。</p>
                            </div>
                            <a class="serv_link" href="service-page.html"><i class="icon-glyph-40"></i></a>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- end service section -->

        <!-- video section -->
        <section class="video-section">
            <div class="container">
                <div class="row">
                    <div class="col-sm-12">
                        <div class="video_wrp">
                            <p>奇瑞2022</p>
                            <h2>2022年奇瑞汽车销售情况喜人<br> 成为25年来最佳</h2>
                        </div>
                        <div class="funfact_wapr row">
                            <div class="col-md-4 col-sm-12">
                                <div class="facts_wrapper">
                                    <div class="icon-lay"><i class="icon-glyph-142"></i></div>
                                    <h3 class="stat-count count">80+</h3>
                                    <h5>出口国家数</h5>
                                </div>
                            </div>
                            <div class="col-md-4 col-sm-12">
                                <div class="facts_wrapper">
                                    <div class="icon-lay"><i class="icon-glyph-226"></i></div>
                                    <h3 class="stat-count count">45+</h3>
                                    <h5>出口量（单位：万） </h5>
                                </div>
                            </div>
                            <div class="col-md-4 col-sm-12">
                                <div class="facts_wrapper">
                                    <div class="icon-lay"><i class="icon-glyph-2"></i></div>
                                    <h3 class="stat-count count">123+</h3>
                                    <h5>总销售量（单位：万） </h5>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- end video section -->

        <!-- product section -->
        <section class="product-section">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <div class="base-header">
                            <small>构建全场景智能出行体系 </small>
                            <h3>奇瑞致力打造智能汽车新生态</h3>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-3 col-sm-12">
                        <div class="testimonial-item">
                            <div class="inner-item">
                                <a href="javascript:void(0)" class="product-img">
                                    <img src="https://img.chery.cn/mall/item5.18/2023051815443961127977.png" alt="">
                                </a>
                                <div class="product_info">
                                    <h4> 全新一代瑞虎3x </h4>
                                    <span>☆</span>
                                    <br>
                                    <span class="product_price">采用复合材料车身设计并配备有多项智能科技。</span>
                                </div>
                                <!-- 弹出购物车小图标 -->
<!--                                <div class="product-action">
                                    <div class="product-action-inner">
                                        <div class="product-action-item">
                                            <a href="shopping-cart.html"><i class="icon-glyph-13"></i></a>
                                        </div>
                                        <div class="product-action-item">
                                            <a href="404-notfound.html"><i class="icon-glyph-52"></i></a>
                                        </div>
                                    </div>
                                </div> -->
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3 col-sm-12">
                        <div class="testimonial-item">
                            <div class="inner-item">
                                <a href="javascript:void(0)" class="product-img">
                                    <img src="https://img.chery.cn/mall/item7%E6%9C%88%E7%A7%AF%E5%88%86%E5%95%86%E5%9F%8E%E4%B8%8A%E6%96%B0%E4%BA%A7%E5%93%81/2022070115221850846284.png" alt="">
                                </a>
                                <div class="product_info">
                                    <h4>瑞虎8PLUS 鲲鹏版</h4>
                                    <span>☆</span>
                                    <br>
                                    <span class="product_price">采用领先的鲲鹏芯片技术，搭载华为鸿蒙OS操作系统。</span>
                                </div>
<!--                                <div class="product-action">
                                    <div class="product-action-inner">
                                        <div class="product-action-item">
                                            <a href="shopping-cart.html"><i class="icon-glyph-13"></i></a>
                                        </div>
                                        <div class="product-action-item">
                                            <a href="404-notfound.html"><i class="icon-glyph-52"></i></a>
                                        </div>
                                    </div>
                                </div> -->
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3 col-sm-12">
                        <div class="testimonial-item">
                            <div class="inner-item">
                                <a href="javascript:void(0)" class="product-img">
                                    <img src="https://img.chery.cn/mall/item2023%E6%AC%BE%E7%91%9E%E8%99%8E5x/%E5%A4%B4%E5%9B%BE/2023042720570198593116.png" alt="">
                                </a>
                                <div class="product_info">
                                    <h4>2023款 瑞虎5x</h4>
                                    <span>☆</span>
                                    <br>
                                    <span class="product_price">搭载全新的1.5T涡轮增压发动机，并配备ACC,AEB等智能科技。</span>
                                </div>
<!--                                <div class="product-action">
                                    <div class="product-action-inner">
                                        <div class="product-action-item">
                                            <a href="shopping-cart.html"><i class="icon-glyph-13"></i></a>
                                        </div>
                                        <div class="product-action-item">
                                            <a href="404-notfound.html"><i class="icon-glyph-52"></i></a>
                                        </div>
                                    </div>
                                </div> -->
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3 col-sm-12">
                        <div class="testimonial-item">
                            <div class="inner-item">
                                <a href="javascript:void(0)" class="product-img">
                                    <img src="https://img.chery.cn/mall/item%E7%91%9E%E8%99%8E9/2023022720300118815673.png" alt="">
                                </a>
                                <div class="product_info">
                                    <h4> 瑞虎9 </h4>
                                    <span>☆</span>
                                    <br>
                                    <span class="product_price">豪华SUV流畅动感，搭载高性能发动机，采用智能科技配置。</span>
                                </div>
<!--                                <div class="product-action">
                                    <div class="product-action-inner">
                                        <div class="product-action-item">
                                            <a href="shopping-cart.html"><i class="icon-glyph-13"></i></a>
                                        </div>
                                        <div class="product-action-item">
                                            <a href="404-notfound.html"><i class="icon-glyph-52"></i></a>
                                        </div>
                                    </div>
                                </div> -->
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- end product section -->


        <!-- process section -->
<!--        <section class="process-section">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <div class="base-header">
                            <small>产业优势</small>
                            <h3>为什么要选择我们</h3>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-3 col-sm-12">
                        <div class="process-item">
                            <div class="img_process"><img src="../../public/static/picture/process_1.png" alt=""><span>01</span>
                                <div class="angle_icon"><img src="static/picture/shape1.png" alt="">
                                </div>
                            </div>
                            <div class="process_text">
                                <h4>服务</h4>
                                <p>我们有着更优质的服务</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3 col-sm-12">
                        <div class="process-item">
                            <div class="img_process"><img src="../../public/static/picture/process_2.png" alt=""><span>02</span>
                                <div class="angle_icon"><img src="static/picture/shape2.png" alt="">
                                </div>
                            </div>
                            <div class="process_text">
                                <h4>价格</h4>
                                <p>我们有着更优惠的价格</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3 col-sm-12">
                        <div class="process-item">
                            <div class="img_process"><img src="../../public/static/picture/process_3.png" alt=""><span>03</span>
                                <div class="angle_icon"><img src="static/picture/shape1.png" alt="">
                                </div>
                            </div>
                            <div class="process_text">
                                <h4>质量</h4>
                                <p>我们产品的质量经过了市场的检验</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3 col-sm-12">
                        <div class="process-item">
                            <div class="img_process"><img src="../../public/static/picture/process_4.png" alt=""><span>04</span>
                                <div class="angle_icon"><img src="static/picture/shape2.png" alt="">
                                </div>
                            </div>
                            <div class="process_text">
                                <h4>体验</h4>
                                <p>我们的产品可以给您带来舒适的体验</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section> -->
        <!-- end process section -->

        <br><br><br>
        <!-- whychose section -->
        <section class="whychose-section">
            <div class="container">
                <div class="row">
                    <div class="col-lg-5 col-sm-12">
                        <div class="whychose_bg"></div>
                    </div>
                    <div class="col-lg-7 col-sm-12">
                        <div class="whychose_wrapper">
                            <div class=" white_header_left">
                                <small>What We Do</small>
                                <h3>Why Choose Us</h3>
                            </div>
                            <div class="special_ser_item">
                                <div class="special_ser_icon"><i class="icon-glyph-20"></i></div>
                                <h4>高品质</h4>
                                <p>我们深知只有不断提高产品质量和技术含量，才能提升企业的核心竞争优势，才能发展建立更多高素质、
                                高要求的优质客户群体。登高才能望远，质量是维护顾客忠诚的最好保证。</p>
                            </div>
                            <div class="special_ser_item">
                                <div class="special_ser_icon"><i class="icon-glyph-13"></i></div>
                                <h4>低价格</h4>
                                <p>一样的物品，一半的价钱！</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- end whychose section -->

        <!-- project section -->
 <!--       <section class="project-section">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <div class="base-header">
                            <small>Our Latest Product</small>
                            <h3>Special Gallery</h3>
                        </div>
                    </div>
                </div>
            </div>
            <div class="projects">
                <div class="container-fluid">
                    <div class="slides-3 swiper">
                        <div class="swiper-wrapper">
                            <div class="swiper-slide event-item d-flex flex-column justify-content-end">
                                <div class="slider-img">
                                    <img src="static/picture/work-1.jpg" alt="" class="project-img">
                                    <div class="project_text">
                                        <h4><a href="shop-detail.html">Juicy Grapes</a></h4><a class="project_link" href="shop-detail.html">View
                                            details >></a>
                                    </div>
                                    <div class="project-data">
                                        <div class="project-action-inner">
                                            <div class="project-action-item">
                                                <a href="404-notfound.html"><i class="icon-glyph-26"></i></a>
                                            </div>
                                            <div class="project-action-item">
                                                <a href="404-notfound.html"><i class="icon-glyph-52"></i></a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="swiper-slide event-item d-flex flex-column justify-content-end">
                                <div class="slider-img">
                                    <img src="static/picture/work-2.jpg" alt="">
                                    <div class="project_text">
                                        <h4><a href="shop-detail.html">Juicy Grapes</a></h4><a class="project_link" href="shop-detail.html">View
                                            details >></a>
                                    </div>
                                    <div class="project-data">
                                        <div class="project-action-inner">
                                            <div class="project-action-item">
                                                <a href="404-notfound.html"><i class="icon-glyph-26"></i></a>
                                            </div>
                                            <div class="project-action-item">
                                                <a href="404-notfound.html"><i class="icon-glyph-52"></i></a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="swiper-slide event-item d-flex flex-column justify-content-end">
                                <div class="slider-img">
                                    <img src="static/picture/work-3.jpg" alt="">
                                    <div class="project_text">
                                        <h4><a href="shop-detail.html">Juicy Grapes</a></h4><a class="project_link" href="shop-detail.html">View
                                            details >></a>
                                    </div>
                                    <div class="project-data">
                                        <div class="project-action-inner">
                                            <div class="project-action-item">
                                                <a href="404-notfound.html"><i class="icon-glyph-26"></i></a>
                                            </div>
                                            <div class="project-action-item">
                                                <a href="404-notfound.html"><i class="icon-glyph-52"></i></a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="text-center mt-5">
                <a href="gallery-page.html" class="more-link">View More</a>
            </div>
        </section> -->
        <!--end project section -->

        <!-- team section -->
        <section class="team-section">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <div class="base-header">
                            <small>企业云集</small>
                            <h3>知名企业家</h3>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-4 col-sm-12">
                        <div class="team-box">
                            <div class="team_img">
                                <img src="../../public/static/picture/head_logo1.png" alt="">
                            </div>
                            <div class="team_info">
                                <h4>尹同跃</h4>
                                <p>奇瑞汽车董事长</p>
<!--                                <ul class="team_social">
                                    <li><a href="javascript:void(0)"><i class="bi bi-facebook"></i></a>
                                    </li>
                                    <li><a href="javascript:void(0)"><i class="bi bi-twitter"></i></a>
                                    </li>
                                    <li><a href="javascript:void(0)"><i class="bi bi-linkedin"></i></a>
                                    </li>
                                </ul> -->
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4 col-sm-12">
                        <div class="team-box">
                            <div class="team_img">
                                <img src="../../public/static/picture/head_logo2.png" alt="">
                            </div>
                            <div class="team_info">
                                <h4>李斌</h4>
                                <p>蔚来汽车董事长兼CEO</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-4 col-sm-12">
                        <div class="team-box">
                            <div class="team_img">
                                <img src="../../public/static/picture/head_logo3.png" alt="">
                            </div>
                            <div class="team_info">
                                <h4>梁金辉</h4>
                                <p>古井集团董事长</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- end team section -->

        <!-- blog section -->
  <!--      <section class="blog-section">
            <div class="container">
                <div class="row">
                    <div class="col-sm-12 col-md-4">
                        <div class="blog-header-title">
                            <small>Articles & Tips</small>
                            <h3>Latest News</h3>
                        </div>
                        <div class="blog_info">
                            <a href="blog-detail.html">
                                <h4>How To Eat Organic Foods</h4>
                            </a>
                            <div class="d-flex align-items-center justify-content-between">
                                <div class="blog_date"><span> <i class="bi bi-calendar"></i>6 Nov 2023</span></div>
                                <span class="blog_read"><a href="blog-detail.html">Read more</a><i class="icon-right-open"></i></span>
                            </div>
                        </div>
                        <div class="blog_info">
                            <a href="blog-detail.html">
                                <h4>How To Eat Organic Foods</h4>
                            </a>
                            <div class="d-flex align-items-center justify-content-between">
                                <div class="blog_date"><span> <i class="bi bi-calendar"></i>6 Nov 2023</span></div>
                                <span class="blog_read"><a href="blog-detail.html">Read more</a><i class="icon-right-open"></i></span>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-8 col-sm-12">
                        <div class="row">
                            <div class="col-md-6 col-sm-12">
                                <div class="post-box">
                                    <div class="post-img"><img src="static/picture/blog1.jpg" class="img-fluid" alt=""></div>
                                    <div class="post_info">
                                        <a href="blog-detail.html">
                                            <h4>How To Find And Afford<br> Organic Food In Your Area</h4>
                                        </a>
                                    </div>
                                    <div class="d-flex align-items-center justify-content-between">
                                        <div class="blog_date"><span> <i class="bi bi-calendar"></i>6 Nov 2023</span>
                                        </div>
                                        <span class="blog_read"><a href="blog-detail.html">Read more</a><i class="icon-right-open"></i></span>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-6 col-sm-12">
                                <div class="post-box">
                                    <div class="post-img"><img src="static/picture/blog2.jpg" class="img-fluid" alt=""></div>
                                    <div class="post_info">
                                        <a href="blog-detail.html">
                                            <h4>How To Find And Afford<br> Organic Food In Your Area</h4>
                                        </a>
                                    </div>
                                    <div class="d-flex align-items-center justify-content-between">
                                        <div class="blog_date"><span> <i class="bi bi-calendar"></i>6 Nov 2023</span>
                                        </div>
                                        <span class="blog_read"><a href="blog-detail.html">Read more</a><i class="icon-right-open"></i></span>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section> -->
        <!-- end blog section -->

        <!-- footer section -->
        <footer class="footer-section">
            <div class="container">
                <div class="row">
                    <div class="col-lg-3 col-sm-12">
                        <div class="footer-col-1">
<!--                            <div>
                                <a href="javascript:void(0)"><img src="static/picture/footer_logo.png" alt="" class="footer-logo"></a>
                            </div> -->
                            <p style="font-size: 25px;margin-left: 20px;">
                                安徽省优势产能云服务<br><br>推荐系统
                            </p>
                        </div>
                    </div>
                    <div class="col-lg-3 col-sm-12">
                        <div class="footer-col-2">
                            <h5 class="widget-title">关于我们</h5>
                            <a href="javascript:void(0)">系统简介</a>
                            <br><br>
                            <a href="javascript:void(0)">发展历程</a>
                            <br><br>
                            <a href="javascript:void(0)">关注我们</a>
                        </div>
                    </div>

                    <div class="col-lg-3 col-sm-12">
                        <div class="footer-col-2">
                            <h5 class="widget-title">联系我们</h5>
                            <a href="javascript:void(0)">客户服务</a>
                            <br><br>
                            <a href="javascript:void(0)">合作洽谈</a>
                            <br><br>
                            <a href="javascript:void(0)">监督举报</a>
                        </div>
                    </div>

                    <div class="col-lg-3 col-sm-12">
                        <div class="footer-col-2">
                            <h5 class="widget-title">法律信息</h5>
                            <a href="javascript:void(0)">服务协议</a>
                            <br><br>
                            <a href="javascript:void(0)">隐私政策</a>
                            <br><br>
                            <a href="javascript:void(0)">知识产权</a>
                        </div>
                    </div>

                    <!-- <div class="scrollup"><span class="icon-glyph-203"></span></div> -->
                </div>
            </div>
            <div class="subfooter">
                <p>Copyright &copy; 安徽省优势产能云服务推荐系统开发团队版权所有</p>
            </div>
        </footer>
        <!--end footer section -->

    </main>

  </div>

</template>

<script>

	export default {
		data() {
			return {
				pictures: [             //轮播图
					{src: "./static/picture/slideshow1.png",alt: "一带一路",index: "0",ref: "picture"},
					{src: "./static/picture/slideshow2.jpg",alt: "汽车",index: "1",ref: "picture"},
					{src: "./static/picture/slideshow3.jpg",alt: "茶叶",index: "2",ref: "picture"},
					{src: "./static/picture/slideshow4.jpg",alt: "黄山",index: "3",ref: "picture"},
					{src: "./static/picture/slideshow5.jpg",alt: "电子",index: "4",ref: "picture"},
				],
        goods: [],              //产品列表
				mouseEnter: false,      //鼠标是否悬浮在整个区域上
				pictureShowing: 0,      //当前展示的是第几张图片，用来更新底部圆点
				hasClicked:false,       //函数节流，防止用户快速、频繁点击图片变换导致出错，flase为图片变换操作不可执行
        speed:80,               //图片移动速度
        offsetWidth:600,        //轮播图宽度，将在mounted里面动态获取
        topNav:this.$store.state.settings.topNav,
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

      offsetWidth(){        //当轮播图宽度改变时
        this.$refs.myul.style.left=0+"px";      //回到第一张图片
        this.pictureShowing = 0;
      },

      topNav(){              //用来监测topNav的改变
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

    beforeDestroy() {
      if (this.vantaEffect) {
        this.vantaEffect.destroy()
      }
    },

	    mounted() {

          let timer = setInterval(() => {           //每0.5秒更新topNav和offsetWidth
              this.topNav = this.$store.state.settings.topNav;
              this.offsetWidth = this.getOffsetWidth();     //动态获取轮播图宽度
          },500);

          // if(this.$route.path != "index"){
          //   clearInterval(timer);
          // }


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

<!-- script linked  -->
<!-- <script src="../../public/static/js/swiper-bundle.min.js"></script>
<script src="../../public/static/js/bootstrap-icons.json"></script>
<script src="../../public/static/js/jquery-3.6.0.min.js"></script>
<script src="../../public/static/js/bootstrap.min.js"></script>
<script src="../../public/static/js/custom.js"></script>
<script src="../../public/static/js/jquery.magnific-popup.js"></script> -->
<!-- <script>
  // import '../../public/static/js/jquery.magnific-popup.js'

    $(function() {
        $('.play_btn').magnificPopup({
            disableOn: 700,
            type: 'iframe',
            mainClass: 'mfp-fade',
            removalDelay: 160,
            preloader: false,
            fixedContentPos: false
        });
    });
</script> -->


<style lang="scss" scoped>
  @import '../../public/static/css/magnific-popup.css';
  @import '../../public/static/css/custom-icons.css';
  @import '../../public/static/css/swiper-bundle.min.css';
  @import '../../public/static/css/boxicons.min.css';
  @import '../../public/static/css/bootstrap-icons.css';
  @import '../../public/static/css/bootstrap.min.css';
  @import '../../public/static/css/style.css';
  // .slider-text{
  //   opacity: 1;
  // }

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
    height: 650px;
  }
  .bg-purple {
    // background: #d3dce6;
  }
  .bg-purple-light {
    // background: #e5e9f2;
  }
  .grid-content {
    border-radius: 4px;
    min-height: 200px;
  }
  .row-bg {
    padding: 10px 0;
    // background-color: #f9fafc;
  }

  .outest {
        width: 100%;
        height: 650px;
        padding: 0px;
        position: absolute;
        overflow: hidden;
        cursor: pointer;
        // background-color: bisque;
    }

  // 轮播图文字设置
  .slider-child{
    position: absolute;
    z-index: 999;
    left: 100px;
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

  a {
    color: white;
    transition: all 0.3s;
    text-decoration: none;
  }

  a:hover {
    color: deepskyblue;
  }
</style>
