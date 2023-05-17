package com.ruoyi.system.domain;

public class SysGood {
    //产品id
    private String id;
    //产品名
    private String name;
    //产品描述
    private String description;
    //产品图片
    private String imageUrl;
    //产品类别
    private Integer category;

    public SysGood() {
    }

    public SysGood(String id, String name, String description, String imageUrl, Integer category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "SysGood={" +
                "id=" + id +
                '}';
    }
}
