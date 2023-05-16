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

        list.add(good1);
        list.add(good2);
        list.add(good3);
        list.add(good4);
        list.add(good5);
        list.add(good6);
        list.add(good7);
        list.add(good8);
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
