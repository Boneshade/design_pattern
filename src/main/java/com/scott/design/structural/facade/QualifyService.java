package com.scott.design.structural.facade;

/**
 * @author xubr
 * @title: QualifyService
 * @projectName design_pattern
 * @description: <h1>У�����</h1>
 * @date 2021/3/116:17
 */
public class QualifyService {
    public boolean isAvailable(PointsGift pointsGift) {
        System.out.println("У��" + pointsGift.getName() + "�����ʸ�ͨ��,���ͨ��");
        return true;
    }

}
