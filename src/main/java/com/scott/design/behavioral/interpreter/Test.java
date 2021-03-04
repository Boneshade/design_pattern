package com.scott.design.behavioral.interpreter;

/**
 * @author xubr
 * @title: Test
 * @projectName design_pattern
 * @description: <h1>解释器测试类</h1>
 * @date 2021/3/410:53
 */
public class Test {

    public static void main(String[] args) {
        String xubrInput="6 100 11 + *";
        XubrExpressionParser xubrExpressionParser = new XubrExpressionParser();
        int result = xubrExpressionParser.parse(xubrInput);
        System.out.println("解释器计算结果: " + result);
    }

}
