<template>
  <div id="index">

    <div class="grid-content bg-purple-dark">
      <!-- 最外层div -->
      <div id="slide" class="outest" @mouseover="mouseEnter = true" @mouseleave="mouseEnter = false" >
<!--       <div class="slider-text slider-child">
            <h5>服务导航</h5>
            <h2>安徽省优势产能云服务<br>推荐系统 & </h2>
            <p>欢迎使用安徽省云服务推荐系统，希望对您有所帮助！</p>
           <div>
                <a href="contact.html" class="more-link">Contact Us</a>
            </div>
        </div> -->
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
                            <img src="static/picture/oragnic-food.jpg" alt="">
                        </div>
                    </div>
                    <div class="col-xl-6 col-md-12 ">
                        <div class=" base_header_left">
                            <small>Welcome To Our Nutrify Farms</small>
                            <h3>Organic Food - Farm Fresh<br> Produce Right To Your Door</h3>
                        </div>
                        <div class="about_item">
                            <h4>Natural Products</h4>
                            <p>Organically grown crops tend to use natural fertilizers like manure to improve plant
                                growth. Animals raised organically are also not given antibiotic organic hormones most
                                commonly purchased organic .</p>
                        </div>
                        <div class="about_item">
                            <h4>Wheat Cultivation</h4>
                            <p>Organically grown crops tend to use natural fertilizers like manure to improve plant
                                growth. Animals raised organically are also not given antibiotic organic hormones most
                                commonly purchased organic .</p>
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
                            <h3>AI + 产业</h3>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-4 col-sm-12">
                        <div class="service-item">
                            <div class="img_serv">
                                <a href="service-page.html">
                                    <img src="https://x0.ifengimg.com/res/2023/50E43DE0647FE98F8788D840C0F433E21719180B_size51_w744_h558.jpg" alt="service">
                                </a>
                            </div>
                            <div class="service_text">
                                <a href="service-page.html">
                                    <h4>AI + 汽车</h4>
                                </a>
                                <p>NIO Assisted and Intelligent Driving蔚来自动驾驶，从地图定位到感知算法，从底层系统到控制策略，拥有全栈自动驾驶技术能力；
                                逐步实现高速、城区、泊车和换电场景的全覆盖，解放时间，减少事故，带来安全放松的点到点自动驾驶体验。</p>
                            </div>
                            <a class="serv_link" href="service-page.html"><i class="icon-glyph-40"></i></a>
                        </div>
                    </div>
                    <div class="col-md-4 col-sm-12">
                        <div class="service-item">
                            <div class="img_serv">
                                <a href="service-page.html">
                                    <img src="https://t12.baidu.com/it/u=2684164636,201624218&fm=30&app=106&f=JPEG?w=640&h=366&s=F30386AC92A3CEE74E027109030070DA" alt="service">
                                </a>
                            </div>
                            <div class="service_text">
                                <a href="service-page.html">
                                    <h4>AI + 半导体</h4>
                                </a>
                                <p>半导体产业是战略新兴产业，是安徽省产业制造转型升级的得力抓手，是以智能制造、数字制造提升传统产业的突破口。
                                其中典型的代表有长鑫存储，打破国外存储半导体领域的封锁，用自身硬实力征服了众多用户，成为中国新时代发展中又一耀眼的名片。</p>
                            </div>
                            <a class="serv_link" href="service-page.html"><i class="icon-glyph-40"></i></a>
                        </div>
                    </div>
                    <div class="col-md-4 col-sm-12">
                        <div class="service-item">
                            <div class="img_serv">
                                <a href="service-page.html">
                                    <img src="https://www.iflytek.com/static/img/tab3-5.99dd029.png" alt="service">
                                </a>
                            </div>
                            <div class="service_text">
                                <a href="service-page.html">
                                    <h4>AI + 工业</h4>
                                </a>
                                <p>科大讯飞，以“让AI赋能工业场景”为研发理念，研发出了讯飞工业AI一体机，
                                其基于讯飞智能语音技术打造的能为应用系统开发提供语音转写、语音合成、语义理解、
                                声纹识别能力的软硬一体设备，通过对AI一体机的二次开发，可以满足用户在应用系统开发过程中集成语音AI能力的需求。</p>
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
                                北始二龙桥，南达汤口镇，山境南北长约40千米，东西宽约30千米，总占地面积约1200平方千米，属亚热带季风气候；
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
<!--
                            <div class="play_video"><a class="play_btn" href="javascript:;"><i class="bi bi-play-fill"></i></a>
                            </div>
                           -->
                            <p>芜湖奇瑞2022</p>
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

        <!-- process section -->
        <section class="process-section">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <div class="base-header">
                            <small>Working Process</small>
                            <h3>How Does We Work</h3>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-3 col-sm-12">
                        <div class="process-item">
                            <div class="img_process"><img src="static/picture/process_1.png" alt=""><span>01</span>
                                <div class="angle_icon"><img src="static/picture/shape1.png" alt="">
                                </div>
                            </div>
                            <div class="process_text">
                                <h4>Step 01</h4>
                                <p>Organically grown crops tend use natural fertilizers like manure to improve growth to
                                    plant . </p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3 col-sm-12">
                        <div class="process-item">
                            <div class="img_process"><img src="static/picture/process_2.png" alt=""><span>02</span>
                                <div class="angle_icon"><img src="static/picture/shape2.png" alt="">
                                </div>
                            </div>
                            <div class="process_text">
                                <h4>Step 02</h4>
                                <p>Organically grown crops tend use natural fertilizers like manure to improve growth to
                                    plant . </p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3 col-sm-12">
                        <div class="process-item">
                            <div class="img_process"><img src="static/picture/process_3.png" alt=""><span>03</span>
                                <div class="angle_icon"><img src="static/picture/shape1.png" alt="">
                                </div>
                            </div>
                            <div class="process_text">
                                <h4>Step 03</h4>
                                <p>Organically grown crops tend use natural fertilizers like manure to improve growth to
                                    plant . </p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3 col-sm-12">
                        <div class="process-item">
                            <div class="img_process"><img src="static/picture/process_4.png" alt=""><span>04</span>
                                <div class="angle_icon"><img src="static/picture/shape2.png" alt="">
                                </div>
                            </div>
                            <div class="process_text">
                                <h4>Step 04</h4>
                                <p>Organically grown crops tend use natural fertilizers like manure to improve growth to
                                    plant . </p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- end process section -->

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
                                <div class="special_ser_icon"><i class="icon-glyph-11"></i></div>
                                <h4>Quick Response </h4>
                                <p>Emergency response time is one hour or less guaranteed at live<br> person will answer
                                    your call or you can enter service</p>
                            </div>
                            <div class="special_ser_item">
                                <div class="special_ser_icon"><i class="icon-glyph-30"></i></div>
                                <h4>Very Fast Services</h4>
                                <p>Emergency response time is one hour or less guaranteed at live <br>person will answer
                                    your call or you can enter service</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- end whychose section -->

        <!-- product section -->
        <section class="product-section">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <div class="base-header">
                            <small>Our Featured Products</small>
                            <h3>Organic Products</h3>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-3 col-sm-12">
                        <div class="testimonial-item">
                            <div class="inner-item">
                                <a href="javascript:void(0)" class="product-img">
                                    <img src="static/picture/product_1.png" alt="">
                                </a>
                                <div class="product_info">
                                    <h4> Juicy Grapes </h4>
                                    <ul class="product_rating">
                                        <li><i class="bi bi-star-fill"></i></li>
                                        <li><i class="bi bi-star-fill"></i></li>
                                        <li><i class="bi bi-star-fill"></i></li>
                                        <li><i class="bi bi-star-fill"></i></li>
                                        <li><i class="bi bi-star-fill"></i></li>
                                    </ul><span class="product_price">$46.00</span>
                                </div>
                                <div class="product-action">
                                    <div class="product-action-inner">
                                        <div class="product-action-item">
                                            <a href="shopping-cart.html"><i class="icon-glyph-13"></i></a>
                                        </div>
                                        <div class="product-action-item">
                                            <a href="404-notfound.html"><i class="icon-glyph-52"></i></a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3 col-sm-12">
                        <div class="testimonial-item">
                            <div class="inner-item">
                                <a href="javascript:void(0)" class="product-img">
                                    <img src="static/picture/product_2.png" alt="">
                                </a>
                                <div class="product_info">
                                    <h4> Red Watermelon </h4>
                                    <ul class="product_rating">
                                        <li><i class="bi bi-star-fill"></i></li>
                                        <li><i class="bi bi-star-fill"></i></li>
                                        <li><i class="bi bi-star-fill"></i></li>
                                        <li><i class="bi bi-star-fill"></i></li>
                                        <li><i class="bi bi-star-fill"></i></li>
                                    </ul><span class="product_price">$56.00</span>
                                </div>
                                <div class="product-action">
                                    <div class="product-action-inner">
                                        <div class="product-action-item">
                                            <a href="shopping-cart.html"><i class="icon-glyph-13"></i></a>
                                        </div>
                                        <div class="product-action-item">
                                            <a href="404-notfound.html"><i class="icon-glyph-52"></i></a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3 col-sm-12">
                        <div class="testimonial-item">
                            <div class="inner-item">
                                <a href="javascript:void(0)" class="product-img">
                                    <img src="static/picture/product_3.png" alt="">
                                </a>
                                <div class="product_info">
                                    <h4> Juicy Orange </h4>
                                    <ul class="product_rating">
                                        <li><i class="bi bi-star-fill"></i></li>
                                        <li><i class="bi bi-star-fill"></i></li>
                                        <li><i class="bi bi-star-fill"></i></li>
                                        <li><i class="bi bi-star-fill"></i></li>
                                        <li><i class="bi bi-star-fill"></i></li>
                                    </ul><span class="product_price">$46.00</span>
                                </div>
                                <div class="product-action">
                                    <div class="product-action-inner">
                                        <div class="product-action-item">
                                            <a href="shopping-cart.html"><i class="icon-glyph-13"></i></a>
                                        </div>
                                        <div class="product-action-item">
                                            <a href="404-notfound.html"><i class="icon-glyph-52"></i></a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3 col-sm-12">
                        <div class="testimonial-item">
                            <div class="inner-item">
                                <a href="javascript:void(0)" class="product-img">
                                    <img src="static/picture/product_4.png" alt="">
                                </a>
                                <div class="product_info">
                                    <h4> Fresh Banana </h4>
                                    <ul class="product_rating">
                                        <li><i class="bi bi-star-fill"></i></li>
                                        <li><i class="bi bi-star-fill"></i></li>
                                        <li><i class="bi bi-star-fill"></i></li>
                                        <li><i class="bi bi-star-fill"></i></li>
                                        <li><i class="bi bi-star-fill"></i></li>
                                    </ul><span class="product_price">$46.00</span>
                                </div>
                                <div class="product-action">
                                    <div class="product-action-inner">
                                        <div class="product-action-item">
                                            <a href="shopping-cart.html"><i class="icon-glyph-13"></i></a>
                                        </div>
                                        <div class="product-action-item">
                                            <a href="404-notfound.html"><i class="icon-glyph-52"></i></a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- end product section -->

        <!-- pricing section -->
        <section class="pricing-section">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <div class="base-header">
                            <small>Our Special Plan</small>
                            <h3>Our Pricing</h3>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-4 col-sm-12">
                        <div class="pricing-box">
                            <h4>Basic Plan</h4>
                            <h2>$27<span>/month</span></h2>
                            <ul>
                                <li>3 Bedrooms cleaning</li>
                                <li>Vacuuming</li>
                                <li>2 Bathroom cleaning</li>
                                <li>Mirror Cleaning</li>
                                <li>1 Livingroom cleaning</li>
                                <li>Window Sills</li>
                            </ul>
                            <a class="more-link" href="contact.html"> Order Now </a>
                        </div>
                    </div>
                    <div class="col-md-4 col-sm-12">
                        <div class="pricing-box active">
                            <h4>Premium Plan</h4>
                            <h2>$29<span>/month</span></h2>
                            <ul>
                                <li>3 Bedrooms cleaning</li>
                                <li>Vacuuming</li>
                                <li>2 Bathroom cleaning</li>
                                <li>Mirror Cleaning</li>
                                <li>1 Livingroom cleaning</li>
                                <li>Window Sills</li>
                            </ul>
                            <a class="more-link" href="contact.html"> Order Now </a>
                        </div>
                    </div>
                    <div class="col-md-4 col-sm-12">
                        <div class="pricing-box">
                            <h4>Standard Plan</h4>
                            <h2>$68<span>/month</span></h2>
                            <ul>
                                <li>3 Bedrooms cleaning</li>
                                <li>Vacuuming</li>
                                <li>2 Bathroom cleaning</li>
                                <li>Mirror Cleaning</li>
                                <li>1 Livingroom cleaning</li>
                                <li>Window Sills</li>
                            </ul>
                            <a class="more-link" href="contact.html"> Order Now </a>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- end pricing section -->

        <!-- project section -->
        <section class="project-section">
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
        </section>
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
                                <h4>刘庆峰</h4>
                                <p>科大讯飞董事长</p>
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
                                <h4>章燎原</h4>
                                <p>三只松鼠电子商务有限公司创始人兼CEO</p>
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
                                <img src="../../public/static/picture/head_logo3.png" alt="">
                            </div>
                            <div class="team_info">
                                <h4>田明</h4>
                                <p>合肥美亚光电技术股份有限公司董事长</p>
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
                </div>
            </div>
        </section>
        <!-- end team section -->

        <!-- testimonial section -->
        <section class="testimonial-section">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <div class="base-header">
                            <small>Client Satisfait</small>
                            <h3>What Client's Say</h3>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-6 col-sm-12 testimonial_img">
                        <div class="testimonial_img">
                            <img src="static/picture/testimonial1.jpg" alt="">
                            <img src="static/picture/testimonial2.jpg" alt="">
                            <img src="static/picture/testimonial3.jpg" alt="">
                            <img src="static/picture/testimonial4.jpg" alt="">
                        </div>
                    </div>
                    <div class="col-md-6 col-sm-12">
                        <section id="testimonials" class="testimonials section-bg">
                            <div class="slides-1 swiper" data-aos="fade-up" data-aos-delay="100">
                                <div class="swiper-wrapper">
                                    <div class="swiper-slide">
                                        <div class="testimonial-items">
                                            <div class="testimonial-content">
                                                <div class="testi_info">
                                                    <p>Organically grown crops tend use natural fertilizer like manure
                                                        to improve growth to plant as amet cons adip scing elited id
                                                        lectus quis dui euismod con after.</p>
                                                </div>
                                                <div class="testi_img"><img src="static/picture/testimonial3.jpg" alt="">
                                                    <h4>Adam Crew<span>Manager</span></h4>
                                                </div>
                                            </div>
                                        </div>
                                    </div><!-- End testimonial item -->
                                    <div class="swiper-slide">
                                        <div class="testimonial-items">
                                            <div class="testimonial-content">
                                                <div class="testi_info">
                                                    <p>Organically grown crops tend use natural fertilizer like manure
                                                        to improve growth to plant as amet cons adip scing elited id
                                                        lectus quis dui euismod con after.</p>
                                                </div>
                                                <div class="testi_img"><img src="static/picture/testimonial1.jpg" alt="">
                                                    <h4>Adam Crew<span>Manager</span></h4>
                                                </div>
                                            </div>
                                        </div>
                                    </div><!-- End testimonial item -->
                                    <div class="swiper-slide">
                                        <div class="testimonial-items">
                                            <div class="testimonial-content">
                                                <div class="testi_info">
                                                    <p>Organically grown crops tend use natural fertilizer like manure
                                                        to improve growth to plant as amet cons adip scing elited id
                                                        lectus quis dui euismod con after.</p>
                                                </div>
                                                <div class="testi_img"><img src="static/picture/testimonial2.jpg" alt="">
                                                    <h4>Adam Crew<span>Manager</span></h4>
                                                </div>
                                            </div>
                                        </div>
                                    </div><!-- End testimonial item -->
                                </div>
                            </div>
                        </section>
                    </div>
                </div>
            </div>
        </section>
        <!-- end testimonial section -->

        <!-- blog section -->
        <section class="blog-section">
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
        </section>
        <!-- end blog section -->

        <!-- clients section -->
        <section class="client-section">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <div class="clients-slider swiper">
                            <div class="swiper-wrapper align-items-center">
                                <div class="swiper-slide"><img src="static/picture/client-1.png" class="img-fluid" alt=""></div>
                                <div class="swiper-slide"><img src="static/picture/client-2.png" class="img-fluid" alt=""></div>
                                <div class="swiper-slide"><img src="static/picture/client-3.png" class="img-fluid" alt=""></div>
                                <div class="swiper-slide"><img src="static/picture/client-4.png" class="img-fluid" alt=""></div>
                                <div class="swiper-slide"><img src="static/picture/client-1.png" class="img-fluid" alt=""></div>
                                <div class="swiper-slide"><img src="static/picture/client-2.png" class="img-fluid" alt=""></div>
                                <div class="swiper-slide"><img src="static/picture/client-3.png" class="img-fluid" alt=""></div>
                                <div class="swiper-slide"><img src="static/picture/client-4.png" class="img-fluid" alt=""></div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- end clients section -->

        <!-- contact section -->
        <section class="contact-section">
            <div class="contact_bg"></div>
            <div class="container">
                <div class="contact_wrp">
                    <div class="row">
                        <div class="col-12">
                            <div class="contact_header_title">
                                <small>Get In Touch</small>
                                <h3>Send Us Message</h3>
                            </div>
                            <div class="contact-form">
                                <form method="post">
                                    <div class="row">
                                        <div class="col-lg-6 col-sm-12">
                                            <input type="text" class="con-field " placeholder="Enter Your Name" value="">
                                        </div>
                                        <div class="col-lg-6 col-sm-12">
                                            <input type="text" class="con-field " placeholder="Enter Your Email" value="">
                                        </div>
                                        <div class="col-lg-12 col-sm-12">
                                            <input type="text" class=" con-field" placeholder="Enter Your Subject" value="">
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-lg-12 col-sm-12">
                                            <!-- <textarea rows="5" class="con-field" placeholder="your message">
                                            </textarea> -->
                                            <textarea rows="5" class="con-field" placeholder="Describe yourself here..."></textarea>
                                        </div>
                                        <div class="submit-area">
                                            <a href="javascript:void(0)" class="more-link">Send Message</a>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!--end contact section -->

        <!-- footer section -->
        <footer class="footer-section">
            <div class="container">
                <div class="row">
                    <div class="col-lg-3 col-sm-12">
                        <div class="footer-col-1">
                            <div>
                                <a href="javascript:void(0)"><img src="static/picture/footer_logo.png" alt="" class="footer-logo"></a>
                            </div>
                            <p>
                                Loren ipsum dolor conse ctetur at adipis cing elit sed do eiu smod of tempor inci didunt
                                know youlab a et dolore magna aliqua
                            </p>
                            <div>
                                <ul class="footer-li">
                                    <li><a href="javascript:void(0)"><i class="bi bi-facebook"></i></a></li>
                                    <li><a href="javascript:void(0)"><i class="bi bi-twitter"></i></a></li>
                                    <li><a href="javascript:void(0)"><i class="bi bi-instagram"></i></a></li>
                                    <li><a href="javascript:void(0)"><i class="bi bi-pinterest"></i></a></li>
                                    <li><a href="javascript:void(0)"><i class="bi bi-behance"></i></a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-sm-12">
                        <div class="footer-col-2">
                            <h5 class="widget-title">Quick Link</h5>
                            <ul>
                                <li><a href="javascript:void(0)">Help and
                                        Ordering</a></li>
                                <li><a href="javascript:void(0)">Return &
                                        Cancellation</a></li>
                                <li><a href="javascript:void(0)">Online Organic
                                        Service</a></li>
                                <li><a href="javascript:void(0)">Delevery
                                        Schedule</a></li>
                                <li><a href="javascript:void(0)">Online Organic
                                        Service</a></li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-lg-3 col-sm-12">
                        <div class="footer-col-3">
                            <h5 class="widget-title">Latest Articles</h5>
                            <div class="footer_recent_blog">
                                <img src="static/picture/blog1.jpg" alt="">
                                <div>
                                    <span> <i class="bi bi-calendar"></i>6 Nov 2023</span>
                                    <p>How to Eat Organic<br> Foods</p>
                                </div>
                            </div>
                            <div class="footer_recent_blog">
                                <img src="static/picture/blog1.jpg" alt="">
                                <div>
                                    <span> <i class="bi bi-calendar"></i>6 Nov 2023</span>
                                    <p>How to Eat Organic<br> Foods</p>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-sm-12">
                        <div class="footer-col-4">
                            <h5 class="widget-title">Newsletter</h5>
                            <p class="col-4-p">
                                Subscribe our newsletter to get more update & join to Nutrify</p>
                            <form action="javascript:void(0)" method="post">
                                <input class="email_field" type="text" placeholder="Enter Your Email Address">
                                <a href="javascript:void(0)" class="more-link">Subscribe</a>
                            </form>
                        </div>
                    </div>
                    <div class="scrollup"><span class="icon-glyph-203"></span></div>
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
					{src: "https://imgguancha.gmw.cn/attachement/png/site2/20210204/f44d305ea4db218627381d.png",alt: "一带一路",index: "0",ref: "picture"},
					{src: "https://n.sinaimg.cn/sinakd20110/600/w1920h1080/20210917/2302-bea3254e6fdb329865a16d294495c0ed.jpg",alt: "汽车",index: "1",ref: "picture"},
					{src: "https://ts1.cn.mm.bing.net/th/id/R-C.b196b408634f2ce5134dcf8ead4b8e59?rik=pdN5KKTNSansVg&riu=http%3a%2f%2fimg.mm4000.com%2ffile%2f0%2f5d%2f9b1a116d73.jpg&ehk=3i5WDN140E3CU1XKf1inmGX3sFKYHUgNUD3VVSBvh44%3d&risl=&pid=ImgRaw&r=0",alt: "黄山",index: "2",ref: "picture"},
					{src: "https://th.bing.com/th/id/R.07ca4de0567767ee8a941530613e8fb0?rik=7HeC7NE8EAUnTw&riu=http%3a%2f%2faticoc.com%2fuploadfiles%2f2021%2f06%2f20210630182313678.jpg%3fMzMuanBn&ehk=QtjaEYrwyH1h6uQaqe%2bv%2fME6Uz0RT6CA0YIxNWSIecQ%3d&risl=&pid=ImgRaw&r=0",alt: "茶叶",index: "3",ref: "picture"},
					{src: "https://www.gpbctv.com/uploads/20211028/1635434179YB7xkJ.jpg",alt: "电子",index: "4",ref: "picture"},
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
</style>
