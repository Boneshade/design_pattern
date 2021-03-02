package com.scott.design.structural.facade;

/**
 * @author xubr
 * @title: GiftExchangeService
 * @projectName design_pattern
 * @description: <h1>���ģʽ�ӿ�-����һ�</h1>
 * @date 2021/3/116:16
 */
public class GiftExchangeService {

    private QualifyService qualifyService = new QualifyService();

    private PointsPaymentService pointsPaymentService = new PointsPaymentService();

    private ShippingService shippingService = new ShippingService();

    public void giftExchange(PointsGift pointsGift) {
        if (qualifyService.isAvailable(pointsGift)) {
            if (pointsPaymentService.pay(pointsGift)) {
                //���֧�����ֳɹ�
                String shippingOrderNo = shippingService.shipGift(pointsGift);
                System.out.println("����ϵͳ�µ��ɹ�,��������:"+shippingOrderNo);
            }
        }
    }

}
