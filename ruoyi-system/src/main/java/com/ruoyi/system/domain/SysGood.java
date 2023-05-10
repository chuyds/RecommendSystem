package com.ruoyi.system.domain;

public class SysGood {
    //产品id
    private Integer id;
    //产品名
    private String name;
    //产品描述
    private String describe;
    //产品图片
    private byte[] image;
    //产品类别
    private Integer category;

    public SysGood() {
    }

    public SysGood(int id, String name, String describe, byte[] image, int category) {
        this.id = id;
        this.name = name;
        this.describe = describe;
        this.image = image;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "SysGood{" +
                "id=" + id +
                '}';
    }
}
