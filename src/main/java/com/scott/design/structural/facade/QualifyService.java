package com.scott.design.structural.facade;

/**
 * @author xubr
 * @title: QualifyService
 * @projectName design_pattern
 * @description: <h1>校验服务</h1>
 * @date 2021/3/116:17
 */
public class QualifyService {
    public boolean isAvailable(PointsGift pointsGift) {
        System.out.println("校验" + pointsGift.getName() + "积分资格通过,库存通过");
        return true;
    }

}
