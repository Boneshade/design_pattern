package com.scott.design.behavioral.interpreter;

import java.util.Stack;

/**
 * @author xubr
 * @title: XubrExpressionParser
 * @projectName design_pattern
 * @description: <h1>自定义解释器</h1>
 * @date 2021/3/410:58
 */
public class XubrExpressionParser {

    private Stack<Interpreter> stack = new Stack<>();

    //静态方法是优先于对象的存在,而非静态的成员或方法是与对象同级别的存在,所以静态方法中无法直接处理非static属性
    public int parse(String str) {
        String[] strItemArray = str.split(" ");
        for (String symbol : strItemArray) {
            if (!OperatorUtil.isOperator(symbol)) {
                Interpreter numberExpression = new NumberInterpreter(symbol);
                stack.push(numberExpression);
                System.out.println(String.format("入栈: %d", numberExpression.interpret()));
            } else {
                //是运算符号,可以计算
                Interpreter firstExpression = stack.pop();
                Interpreter secondExpression = stack.pop();
                System.out.println(String.format("出栈: %d 和 %d",
                        firstExpression.interpret(), secondExpression.interpret()));

                Interpreter operator = OperatorUtil.getExpressionObject(
                        firstExpression, secondExpression, symbol);
                System.out.println(String.format("应用运算符: %s", operator));

                int result = operator.interpret();
                NumberInterpreter resultExpression = new NumberInterpreter(result);
                stack.push(resultExpression);
                System.out.println(String.format("阶段结果入栈: %d", resultExpression.interpret()));
            }
        }
        int result = stack.pop().interpret();
        return result;
    }
}
