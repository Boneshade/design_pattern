package com.scott.design.behavioral.interpreter;

/**
 * @author xubr
 * @title: AddInterpreter
 * @projectName design_pattern
 * @description: <h1>加法解释器</h1>
 * @date 2021/3/410:51
 */
public class AddInterpreter implements Interpreter {

    private Interpreter firstExpression, secondExpression;

    public AddInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpret() {
        return this.firstExpression.interpret() + this.secondExpression.interpret();
    }

    @Override
    public String toString() {
        return "+";
    }
}
