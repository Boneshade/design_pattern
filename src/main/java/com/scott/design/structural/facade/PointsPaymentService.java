package com.scott.design.structural.facade;

/**
 * @author xubr
 * @title: PointsPaymentService
 * @projectName design_pattern
 * @description: <h1>����֧��</h1>
 * @date 2021/3/116:14
 */
public class PointsPaymentService {

    public boolean pay(PointsGift pointsGift) {
        //�ۼ�����
        System.out.println("֧��" + pointsGift.getName() + "���ֳɹ�");
        return true;
    }


}
