package com.ruoyi.web.controller.goods;

import com.ruoyi.framework.web.domain.server.Sys;
import com.ruoyi.system.domain.SysGood;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GoodsController {
    ArrayList<SysGood> list = new ArrayList<>();
    {
        SysGood good1 = new SysGood("101", "古井贡酒", "好喝", "https://pic12.secooimg.com/imgextra/2020/0413/08b7521604a646928d536918bf799d5b.jpg", 3);
        SysGood good2 = new SysGood("102", "口子窖酒", "好喝", "https://img11.360buyimg.com/imgzone/jfs/t1/119438/13/22208/64135/620de8f9Ec7cb98a8/aab242e3eab3686b.jpg", 3);
        SysGood good3 = new SysGood("103", "奇瑞汽车", "好开", "https://2c.zol-img.com.cn/product/13/226/cefjbcwLtVsIc.jpg", 1);
        SysGood good4 = new SysGood("104", "江淮汽车", "好开", "https://imagecn.gasgoo.com/Upload/Files/201212260307163article.jpg", 1);
        SysGood good5 = new SysGood("105", "太平猴魁", "好香", "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimg.alicdn.com%2Fi3%2F1659651562%2FO1CN01A6hUO11NPRJ5PQqiF_%21%211659651562.jpg&refer=http%3A%2F%2Fimg.alicdn.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1686815885&t=b918e9e021bafffed6d678dd95de004a", 4);
        SysGood good6 = new SysGood("106", "黄山毛峰", "好香", "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimg.alicdn.com%2Fbao%2Fuploaded%2Fi1%2F4109145794%2FO1CN017zZJw01sfhOg2Kxzw_%21%210-item_pic.jpg_310x310.jpg&refer=http%3A%2F%2Fimg.alicdn.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1686815960&t=8d0504f641a092649031c6eafa52e618", 4);
        SysGood good7 = new SysGood("107", "长鑫存储颗粒", "好强", "https://n.sinaimg.cn/sinakd2021610s/292/w640h452/20210610/652e-krhvrxt6085433.jpg", 2);
        SysGood good8 = new SysGood("108", "大别山", "好美", "https://society.yunnan.cn/pic/003/025/173/00302517377_0756fb32.jpg", 5);
        SysGood good9 = new SysGood("109", "金种子酒", "好喝", "https://img20.360buyimg.com/imgzone/jfs/t1/116736/35/25456/93568/62b43382Ed3f33c64/c206968899335283.jpg", 3);
        SysGood good10 = new SysGood("110", "宣酒", "好喝", "https://img20.360buyimg.com/vc/jfs/t24601/354/686379913/300390/a8a58fd3/5b769da2Nd11b8aa4.jpg", 3);
        SysGood good11 = new SysGood("111", "迎驾贡酒", "好喝", "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimg.alicdn.com%2Fimgextra%2Fi2%2F2224068301%2FTB2IDfelFXXXXcHXXXXXXXXXXXX_%21%212224068301.jpg&refer=http%3A%2F%2Fimg.alicdn.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1686896951&t=9d64b15b5bb5d5f41a15195b408cfd01", 3);
        SysGood good12 = new SysGood("112", "高炉家酒", "好喝", "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fsafe-img.xhscdn.com%2Fbw1%2F3d8e3cf9-3cfd-4ddf-b11d-4ef71540b20b%3FimageView2%2F2%2Fw%2F1080%2Fformat%2Fjpg&refer=http%3A%2F%2Fsafe-img.xhscdn.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1686898011&t=d87e70eb84b74972a6fe7414c749e00c", 3);
        SysGood good13 = new SysGood("113", "蔚来汽车", "好开", "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fsafe-img.xhscdn.com%2Fbw1%2F8a3e125c-4fc0-41e9-9afb-1eed8c5ed49a%3FimageView2%2F2%2Fw%2F1080%2Fformat%2Fjpg&refer=http%3A%2F%2Fsafe-img.xhscdn.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1686897538&t=202abdd94f7c1af522c6fc5e60c8733a", 1);
        SysGood good14 = new SysGood("114", "安驰汽车", "好开", "https://tjcz.cheshizh.com/i/carpic/80/490_52823b.jpg", 1);
        SysGood good15 = new SysGood("115", "安凯汽车", "好开", "https://img2.baidu.com/it/u=3582829738,2220874633&fm=253&fmt=auto&app=138&f=JPEG?w=510&h=500", 1);
        SysGood good16 = new SysGood("116", "星马汽车", "好开", "https://zj-static.lmjx.net/upload/202203/25/1200w901h1648180071858733.jpg%21605x375.jpg", 1);
        SysGood good17 = new SysGood("117", "文王贡酒", "好喝", "https://img12.360buyimg.com/imgzone/jfs/t1/210671/33/13540/121997/61c2d4c4Eacb9eb05/4deaaa95f100267d.jpg", 3);
        SysGood good18 = new SysGood("118", "皖酒", "好喝", "https://img2.baidu.com/it/u=2474984244,2663021422&fm=253&fmt=auto&app=138&f=JPEG?w=696&h=500", 3);
        SysGood good19 = new SysGood("119", "金坛子酒", "好喝", "https://img2.baidu.com/it/u=4186703617,125616773&fm=253&fmt=auto&app=138&f=JPEG?w=564&h=500", 3);
        SysGood good20 = new SysGood("120", "店小二酒", "好喝", "https://www.sanyue.com/jiameng/public/pinpai/pic/JV6XZ5IB3537.jpg", 3);
        SysGood good21 = new SysGood("121", "六安瓜片", "好香", "https://img0.baidu.com/it/u=2335284504,3786373319&fm=253&fmt=auto&app=138&f=JPEG?w=310&h=310", 4);
        SysGood good22 = new SysGood("122", "祁门红茶", "好香", "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimg.alicdn.com%2Fbao%2Fuploaded%2Fi2%2F78077919%2FTB23LMLjpXXXXboXpXXXXXXXXXX_%21%2178077919.jpg&refer=http%3A%2F%2Fimg.alicdn.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1686898440&t=67ae92613a99d0a8ee7a4c36705bb061", 4);
        SysGood good23 = new SysGood("123", "屯溪绿茶", "好香", "https://img1.baidu.com/it/u=248405995,1631146250&fm=253&fmt=auto&app=138&f=JPEG?w=495&h=419", 4);
        SysGood good24 = new SysGood("124", "霍山黄芽", "好香", "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimg.alicdn.com%2Fbao%2Fuploaded%2Fi3%2F2841516464%2FTB2MSGXaai5V1BjSspcXXcSrFXa_%21%212841516464.jpg&refer=http%3A%2F%2Fimg.alicdn.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1686898649&t=ff608fc6f0e7b977a4396cb95c9f10a3", 4);
        SysGood good25 = new SysGood("125", "美亚CG系列人工智能广泛用途色选机", "集成靶向定位、双智能识别等先进色选科技，智慧超群，剔除精准。", "http://img1.cnpowder.com.cn/img/daily/2019/05/09/093116_129988_product_c20189_o.jpg", 2);
        SysGood good26 = new SysGood("126", "美亚X射线检查安检机", "赋予不同物品不同饱和度的不同颜色，帮助操作员高效识别出被检物里的违禁品。", "http://img1.cnpowder.com.cn/img/product/2017/08/meiyagd-20170831111824-761_o.jpg", 2);
        SysGood good27 = new SysGood("127", "讯飞智能翻译机4.0", "AI翻译，听得清，听得懂，译得准，发音美，够自然。", "https://img.xunfei.cn/mall/ifly-mall-shop/images/202304/goods-thumbs/202304171617277137.jpg", 2);
        SysGood good28 = new SysGood("128", "科大讯飞AI学习机T10", "熊小球AI语言，领略中华文化，学习汉字拼音。", "https://img.xunfei.cn/mall/ifly-mall-shop/images/202206/goods-img/202206292133036318.jpg", 2);
        SysGood good29 = new SysGood("129", "岳西翠兰", "好香", "https://img1.baidu.com/it/u=2555367444,2706563465&fm=253&fmt=auto&app=138&f=JPEG?w=310&h=310", 4);
        SysGood good30 = new SysGood("130", "泾县特尖", "好香", "https://pic.chayi5.com/2019/0125/2326001742.jpg", 4);
        SysGood good31 = new SysGood("131", "涌溪火青", "好香", "http://t14.baidu.com/it/u=4123040264,2087876191&fm=224&app=112&f=JPEG?w=500&h=500", 4);
        SysGood good32 = new SysGood("132", "桐城小花", "好香", "http://t13.baidu.com/it/u=1326285973,2157138292&fm=224&app=112&f=JPEG?w=500&h=500", 4);
        SysGood good33 = new SysGood("133", "黄山", "好美", "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fsafe-img.xhscdn.com%2Fbw1%2F0a3abc43-c670-4291-8f50-665a41a8fd5a%3FimageView2%2F2%2Fw%2F1080%2Fformat%2Fjpg&refer=http%3A%2F%2Fsafe-img.xhscdn.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1686901567&t=29f04f5a135fafabaafcbc82d1d16e55", 5);
        SysGood good34 = new SysGood("134", "九华山", "好美", "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fsafe-img.xhscdn.com%2Fbw1%2Fda7533f1-d578-4232-91e7-dea18a76d366%3FimageView2%2F2%2Fw%2F1080%2Fformat%2Fjpg&refer=http%3A%2F%2Fsafe-img.xhscdn.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1686901601&t=dcb75ad0d31ea5cf91560a38a82e4778", 5);
        SysGood good35 = new SysGood("135", "齐云山", "好美", "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fsafe-img.xhscdn.com%2Fbw1%2Fd931209b-f05f-49a9-9830-d3082b184503%3FimageView2%2F2%2Fw%2F1080%2Fformat%2Fjpg&refer=http%3A%2F%2Fsafe-img.xhscdn.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1686901656&t=2e67b0e59c2062501682d7a6535ca061", 5);
        SysGood good36 = new SysGood("136", "天柱山", "好美", "https://www.gpbctv.com/uploads/20210811/16286683901GwST6.jpg", 5);
        SysGood good37 = new SysGood("137", "琅琊山", "好美", "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fss2.meipian.me%2Fusers%2F6723751%2F4d036f09fa9446a3b99c1d117934eb18.jpeg%3Fmeipian-raw%2Fbucket%2Fivwen%2Fkey%2FdXNlcnMvNjcyMzc1MS80ZDAzNmYwOWZhOTQ0NmEzYjk5YzFkMTE3OTM0ZWIxOC5qcGVn%2Fsign%2F7334ff86bc824ff6511ef437ca53188d.jpg&refer=http%3A%2F%2Fss2.meipian.me&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1686902035&t=747e20ca02b7bc3672ab7781717b1f05", 5);

        list.add(good1);list.add(good2);list.add(good3);list.add(good4);
        list.add(good5);list.add(good6);list.add(good7);list.add(good8);

        list.add(good9);list.add(good10);list.add(good11);list.add(good12);
        list.add(good13);list.add(good14);list.add(good15);list.add(good16);

        list.add(good17);list.add(good18);list.add(good19);list.add(good20);
        list.add(good21);list.add(good22);list.add(good23);list.add(good24);

        list.add(good25);list.add(good26);list.add(good27);list.add(good28);
        list.add(good29);list.add(good30);list.add(good31);list.add(good32);

        list.add(good33);list.add(good34);list.add(good35);list.add(good36);
        list.add(good37);
    }
    @RequestMapping("/goods/list/id")
    public List<SysGood> getGoodById(Integer id) {

        return null;
    }

    @RequestMapping("/goods/list/category")
    public List<SysGood> getGoodListByCategory(Integer category) {

        ArrayList<SysGood> listOfCategory = new ArrayList<>();
        for (SysGood good: list) {
            if (good.getCategory() == category){
                listOfCategory.add(good);
            }
        }
        return listOfCategory;
    }

    @RequestMapping("/goods/list")
    public List<SysGood> getGoodsList() {            //用于返回产品列表
        return list;
    }

}
