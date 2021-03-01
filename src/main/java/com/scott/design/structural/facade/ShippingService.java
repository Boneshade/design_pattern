package com.scott.design.structural.facade;

/**
 * @author xubr
 * @title: ShippingService
 * @projectName design_pattern
 * @description: <h1>物流对接</h1>
 * @date 2021/3/116:19
 */
public class ShippingService {
    public String shipGift(PointsGift pointsGift){
        //物流系统的对接逻辑
        System.out.println(pointsGift.getName()+"进入物流系统");
        //物流号
        String shippingOrderNo = "666";
        return shippingOrderNo;
    }


}
