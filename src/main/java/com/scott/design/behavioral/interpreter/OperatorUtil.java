package com.scott.design.behavioral.interpreter;

/**
 * @author xubr
 * @title: OperatorUtil
 * @projectName design_pattern
 * @description: <h1>操作工具类</h1>
 * @date 2021/3/411:01
 */
public class OperatorUtil {

    public static boolean isOperator(String symbol) {
        return (symbol.equals("*") || symbol.equals("+"));
    }

    public static Interpreter getExpressionObject(Interpreter firstExpression,
                                                  Interpreter secondExpression, String symbol) {
        if (symbol.equals("+")) {
            return new AddInterpreter(firstExpression, secondExpression);
        } else if (symbol.equals("*")) {
            return new MultiInterpreter(firstExpression, secondExpression);
        }
        return null;
    }

}
