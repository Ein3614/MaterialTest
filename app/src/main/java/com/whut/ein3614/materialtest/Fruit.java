package com.whut.ein3614.materialtest;

/**
 * 类描述：水果Bean类
 * 创建人：Created by Administrator on 2018/8/31.
 * 修改人：
 * 修改时间：
 */
public class Fruit {
    private String name;
    private int imageId;

    public Fruit(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }
    public int getImageId() {
        return imageId;
    }
}
