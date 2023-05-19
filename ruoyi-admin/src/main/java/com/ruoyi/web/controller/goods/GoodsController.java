package com.ruoyi.web.controller.goods;

import com.ruoyi.system.domain.SysGood;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GoodsController {
    ArrayList<SysGood> list = new ArrayList<>();
    {
        SysGood good1 = new SysGood("101", "古井贡酒", "色清如水晶、香纯似幽兰、入口甘美醇和、回味经久不息。", "https://pic12.secooimg.com/imgextra/2020/0413/08b7521604a646928d536918bf799d5b.jpg", 2);
        SysGood good2 = new SysGood("102", "口子窖酒", "隔壁千家醉，开坛十里香。", "https://img11.360buyimg.com/imgzone/jfs/t1/119438/13/22208/64135/620de8f9Ec7cb98a8/aab242e3eab3686b.jpg", 2);
        SysGood good3 = new SysGood("103", "奇瑞瑞虎9", "新一代全球旗舰SUV。", "https://www.chery.cn/media/7925/%E8%A7%86%E9%A2%91286.jpg", 1);
        SysGood good4 = new SysGood("104", "奇瑞瑞虎8PRO 新能源", "超强动力，超级电混。", "https://www.chery.cn/media/7678/%E7%BE%8E%E8%BD%A6%E5%9B%BE286x192-1.jpg", 1);
        SysGood good5 = new SysGood("105", "太平猴魁", "全身白毫，茂盛而不显，含而不露，色泽苍绿，品其味则幽香扑鼻，醇厚爽口，回味无穷。", "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimg.alicdn.com%2Fi3%2F1659651562%2FO1CN01A6hUO11NPRJ5PQqiF_%21%211659651562.jpg&refer=http%3A%2F%2Fimg.alicdn.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1686815885&t=b918e9e021bafffed6d678dd95de004a", 3);
        SysGood good6 = new SysGood("106", "黄山毛峰", "清代江澄云《素壶便录》记述：“黄山有云雾茶，气息恬雅，芳香扑鼻，绝无俗味，当为茶品中第一”。", "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimg.alicdn.com%2Fbao%2Fuploaded%2Fi1%2F4109145794%2FO1CN017zZJw01sfhOg2Kxzw_%21%210-item_pic.jpg_310x310.jpg&refer=http%3A%2F%2Fimg.alicdn.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1686815960&t=8d0504f641a092649031c6eafa52e618", 3);
        SysGood good7 = new SysGood("107", "琅琊山", "琅琊山享有“皖东明珠”之美誉，有醉翁亭、琅琊阁、城西湖、姑山湖、胡古等旅游景点。", "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fss2.meipian.me%2Fusers%2F6723751%2F4d036f09fa9446a3b99c1d117934eb18.jpeg%3Fmeipian-raw%2Fbucket%2Fivwen%2Fkey%2FdXNlcnMvNjcyMzc1MS80ZDAzNmYwOWZhOTQ0NmEzYjk5YzFkMTE3OTM0ZWIxOC5qcGVn%2Fsign%2F7334ff86bc824ff6511ef437ca53188d.jpg&refer=http%3A%2F%2Fss2.meipian.me&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1686902035&t=747e20ca02b7bc3672ab7781717b1f05", 4);
        SysGood good8 = new SysGood("108", "大别山", "大别山山峦叠嶂，峰峦起伏，山头云雾缭绕，景色宛如画卷般瑰丽。", "https://society.yunnan.cn/pic/003/025/173/00302517377_0756fb32.jpg", 4);
        SysGood good9 = new SysGood("109", "金种子酒", "滴滴乾坤酒，杯杯岁月香。", "https://img20.360buyimg.com/imgzone/jfs/t1/116736/35/25456/93568/62b43382Ed3f33c64/c206968899335283.jpg", 2);
        SysGood good10 = new SysGood("110", "宣酒", "绵柔净爽、窖香浓郁、香味谐调，宣酒特贡，小窖绵柔，巧夺天工，江南一绝。", "https://img20.360buyimg.com/vc/jfs/t24601/354/686379913/300390/a8a58fd3/5b769da2Nd11b8aa4.jpg", 2);
        SysGood good11 = new SysGood("111", "迎驾贡酒", "窖香幽雅、浓中带酱，绵甜爽口、诸味协调。", "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimg.alicdn.com%2Fimgextra%2Fi2%2F2224068301%2FTB2IDfelFXXXXcHXXXXXXXXXXXX_%21%212224068301.jpg&refer=http%3A%2F%2Fimg.alicdn.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1686896951&t=9d64b15b5bb5d5f41a15195b408cfd01", 2);
        SysGood good12 = new SysGood("112", "高炉家酒", "入口绵甜净爽，香味纯正，酒体协调，回味悠长。", "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fsafe-img.xhscdn.com%2Fbw1%2F3d8e3cf9-3cfd-4ddf-b11d-4ef71540b20b%3FimageView2%2F2%2Fw%2F1080%2Fformat%2Fjpg&refer=http%3A%2F%2Fsafe-img.xhscdn.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1686898011&t=d87e70eb84b74972a6fe7414c749e00c", 2);
        SysGood good13 = new SysGood("113", "奇瑞瑞虎7PLUS 新能源", "超强动力，超级电混。", "https://www.chery.cn/media/7636/2.jpg", 1);
        SysGood good14 = new SysGood("114", "奇瑞艾瑞泽8", "每一面皆赢面。", "https://www.chery.cn/media/6595/2-286192.jpg", 1);
        SysGood good15 = new SysGood("115", "奇瑞艾瑞泽GX冠军版", "冠军实力，无所匹敌。", "https://www.chery.cn/media/3243/268180-1.jpg", 1);
        SysGood good16 = new SysGood("116", "奇瑞欧萌达", "动感溜背造型，双层运动尾翼+个性小鸭尾。", "https://www.chery.cn/media/6282/2%E6%AC%A7%E8%90%8C%E8%BE%BE-%E5%89%8D45%E5%BA%A6%E4%BF%AF%E8%A7%86%E8%B7%AF%E8%B7%91-0602-286192.jpg", 1);
        SysGood good17 = new SysGood("117", "文王贡酒", "源于自然，以质取胜，品质文王。", "https://img12.360buyimg.com/imgzone/jfs/t1/210671/33/13540/121997/61c2d4c4Eacb9eb05/4deaaa95f100267d.jpg", 2);
        SysGood good18 = new SysGood("118", "皖酒", "酒体清爽、口感柔和、香气浓郁、回味悠长。", "https://img2.baidu.com/it/u=2474984244,2663021422&fm=253&fmt=auto&app=138&f=JPEG?w=696&h=500", 2);
        SysGood good19 = new SysGood("119", "金坛子酒", "清如水晶、香如幽兰、入口绵甜、回味经久不息。", "https://img2.baidu.com/it/u=4186703617,125616773&fm=253&fmt=auto&app=138&f=JPEG?w=564&h=500", 2);
        SysGood good20 = new SysGood("120", "店小二酒", "香、醇、甜、净、爽、酒体丰满，醇正协和。", "https://www.sanyue.com/jiameng/public/pinpai/pic/JV6XZ5IB3537.jpg", 2);
        SysGood good21 = new SysGood("121", "六安瓜片", "明朝茶学家许次纾《茶疏》记述：“天下名山，必产灵草，江南地暖，故独宜茶，大江以北，则称六安”。", "https://img0.baidu.com/it/u=2335284504,3786373319&fm=253&fmt=auto&app=138&f=JPEG?w=310&h=310", 3);
        SysGood good22 = new SysGood("122", "祁门红茶", "条索紧结，细小如眉，苗秀显毫，色泽乌润；茶叶香气清香持久，似果香又似兰花香。", "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimg.alicdn.com%2Fbao%2Fuploaded%2Fi2%2F78077919%2FTB23LMLjpXXXXboXpXXXXXXXXXX_%21%2178077919.jpg&refer=http%3A%2F%2Fimg.alicdn.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1686898440&t=67ae92613a99d0a8ee7a4c36705bb061", 3);
        SysGood good23 = new SysGood("123", "屯溪绿茶", "条索紧结、匀整壮实、色泽绿润、香高持久，带熟板栗香或蕴藏兰花香。", "https://img1.baidu.com/it/u=248405995,1631146250&fm=253&fmt=auto&app=138&f=JPEG?w=495&h=419", 3);
        SysGood good24 = new SysGood("124", "霍山黄芽", "外形挺直微展，色泽黄绿披毫，香气清香持久，汤色黄绿明亮，滋味浓厚鲜醇回甘，叶底微黄明亮。", "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimg.alicdn.com%2Fbao%2Fuploaded%2Fi3%2F2841516464%2FTB2MSGXaai5V1BjSspcXXcSrFXa_%21%212841516464.jpg&refer=http%3A%2F%2Fimg.alicdn.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1686898649&t=ff608fc6f0e7b977a4396cb95c9f10a3", 3);
        SysGood good25 = new SysGood("115", "蔚来ET7", "智能电动旗舰轿车，拥有同级领先的纵向及横向尺寸，让每一位乘客都享有自由开阔的空间。", "https://n.sinaimg.cn/sinakd20210710ac/129/w995h734/20210710/cd8f-d5d7d7485f3a2cd0d2b08e7fd4347d7e.png", 1);
        SysGood good26 = new SysGood("115", "蔚来ES8", "一台能满足工作、家庭、社交和探索全场景需求的智能电动旗舰SUV。", "https://n.sinaimg.cn/sinacn20110/121/w1536h985/20181227/92f0-hqtwzee0862900.jpg", 1);
        SysGood good27 = new SysGood("115", "江淮思皓爱跑", "智能电动轿车，超长续航，百变空间，智能生态，舒享安全。", "https://x0.ifengimg.com/ucms/2022_31/C654ED4FC556FB08E33013A474C69451EF9F1496_size277_w1500_h1000.jpg", 1);
        SysGood good28 = new SysGood("115", "江淮思皓E50A", "高能纯电轿跑，畅快起步领先一步，是激情更是纵情驾驭。", "https://cools.qctt.cn/1648538315682.png", 1);
        SysGood good29 = new SysGood("129", "岳西翠兰", "其外形优美，芽叶相连，自然舒展，酷似小兰花；其汤翠绿明亮，香气持久；其味醇厚而回甘。", "https://img1.baidu.com/it/u=2555367444,2706563465&fm=253&fmt=auto&app=138&f=JPEG?w=310&h=310", 3);
        SysGood good30 = new SysGood("130", "泾县特尖", "色泽翠绿、匀润显毫、嫩香持久、高爽馥郁、滋味鲜醇、甘爽耐泡、汤色嫩绿、清澈明亮、匀整肥壮。", "https://pic.chayi5.com/2019/0125/2326001742.jpg", 3);
        SysGood good31 = new SysGood("131", "涌溪火青", "色泽墨绿油润、隐毫；香气清香持久；滋味醇厚，回味甘甜；汤色嫩绿，清澈明亮。", "http://t14.baidu.com/it/u=4123040264,2087876191&fm=224&app=112&f=JPEG?w=500&h=500", 3);
        SysGood good32 = new SysGood("132", "桐城小花", "外形舒展、色泽翠绿、形似兰花；汤色嫩绿明亮；香气清鲜持久有兰花香；滋味鲜醇回甘。", "http://t13.baidu.com/it/u=1326285973,2157138292&fm=224&app=112&f=JPEG?w=500&h=500", 3);
        SysGood good33 = new SysGood("133", "黄山", "云阴带残日，怅别此何时。欲望黄山道，无由见所思。", "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fsafe-img.xhscdn.com%2Fbw1%2F0a3abc43-c670-4291-8f50-665a41a8fd5a%3FimageView2%2F2%2Fw%2F1080%2Fformat%2Fjpg&refer=http%3A%2F%2Fsafe-img.xhscdn.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1686901567&t=29f04f5a135fafabaafcbc82d1d16e55", 4);
        SysGood good34 = new SysGood("134", "九华山", "峰峦叠嶂，碧水如镜，青山浮水，倒影翩翩，两岸景色犹如百里画廊。", "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fsafe-img.xhscdn.com%2Fbw1%2Fda7533f1-d578-4232-91e7-dea18a76d366%3FimageView2%2F2%2Fw%2F1080%2Fformat%2Fjpg&refer=http%3A%2F%2Fsafe-img.xhscdn.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1686901601&t=dcb75ad0d31ea5cf91560a38a82e4778", 4);
        SysGood good35 = new SysGood("135", "齐云山", "齐云山与壁云齐，四顾青山座座低。隔继往来南北雁，只容日月过东西。", "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fsafe-img.xhscdn.com%2Fbw1%2Fd931209b-f05f-49a9-9830-d3082b184503%3FimageView2%2F2%2Fw%2F1080%2Fformat%2Fjpg&refer=http%3A%2F%2Fsafe-img.xhscdn.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1686901656&t=2e67b0e59c2062501682d7a6535ca061", 4);
        SysGood good36 = new SysGood("136", "天柱山", "奇峰出奇云，秀木含秀气。清晏皖公山，巉绝称人意。", "https://www.gpbctv.com/uploads/20210811/16286683901GwST6.jpg", 4);


        list.add(good1);list.add(good2);list.add(good3);list.add(good4);
        list.add(good5);list.add(good6);list.add(good7);list.add(good8);

        list.add(good9);list.add(good10);list.add(good11);list.add(good12);
        list.add(good13);list.add(good14);list.add(good15);list.add(good16);

        list.add(good17);list.add(good18);list.add(good19);list.add(good20);
        list.add(good21);list.add(good22);list.add(good23);list.add(good24);

        list.add(good25);list.add(good26);list.add(good27);list.add(good28);
        list.add(good29);list.add(good30);list.add(good31);list.add(good32);

        list.add(good33);list.add(good34);list.add(good35);list.add(good36);

    }
    @RequestMapping("/goods/list/id")
    public List<SysGood> getGoodById(String id) {

        return null;
    }

    @RequestMapping("/goods/list/category")
    public List<SysGood> getGoodsListByCategory(Integer category) {

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
