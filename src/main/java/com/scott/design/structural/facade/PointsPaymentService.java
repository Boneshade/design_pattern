package com.scott.design.structural.facade;

/**
 * @author xubr
 * @title: PointsPaymentService
 * @projectName design_pattern
 * @description: <h1>积分支付</h1>
 * @date 2021/3/116:14
 */
public class PointsPaymentService {

    public boolean pay(PointsGift pointsGift) {
        //扣减积分
        System.out.println("支付" + pointsGift.getName() + "积分成功");
        return true;
    }


}
