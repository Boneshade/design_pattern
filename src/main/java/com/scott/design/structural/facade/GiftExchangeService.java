package com.scott.design.structural.facade;

/**
 * @author xubr
 * @title: GiftExchangeService
 * @projectName design_pattern
 * @description: <h1>外观模式接口-礼物兑换</h1>
 * @date 2021/3/116:16
 */
public class GiftExchangeService {

    private QualifyService qualifyService = new QualifyService();

    private PointsPaymentService pointsPaymentService = new PointsPaymentService();

    private ShippingService shippingService = new ShippingService();

    public void giftExchange(PointsGift pointsGift) {
        if (qualifyService.isAvailable(pointsGift)) {
            if (pointsPaymentService.pay(pointsGift)) {
                //如果支付积分成功
                String shippingOrderNo = shippingService.shipGift(pointsGift);
                System.out.println("物流系统下单成功,订单号是:"+shippingOrderNo);
            }
        }
    }

}
