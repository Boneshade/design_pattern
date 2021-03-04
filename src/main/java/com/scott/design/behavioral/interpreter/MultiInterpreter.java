package com.scott.design.behavioral.interpreter;

/**
 * @author xubr
 * @title: MultiInterpreter
 * @projectName design_pattern
 * @description: <h1>乘法解释器</h1>
 * @date 2021/3/410:38
 */
public class MultiInterpreter implements Interpreter {

    private Interpreter firstExpression, secondExpress;

    public MultiInterpreter(Interpreter firstExpression, Interpreter secondExpress) {
        this.firstExpression = firstExpression;
        this.secondExpress = secondExpress;
    }

    @Override
    public int interpret() {
        return this.firstExpression.interpret() * this.secondExpress.interpret();
    }

    @Override
    public String toString() {
        return "*";
    }
}
