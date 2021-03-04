package com.scott.design.behavioral.interpreter;

/**
 * @author xubr
 * @title: NumberInterpreter
 * @projectName design_pattern
 * @description: <h1>数字解释器</h1>
 * @date 2021/3/410:49
 */
public class NumberInterpreter implements Interpreter {

    private int number;

    public NumberInterpreter(int number) {
        this.number = number;
    }

    public NumberInterpreter(String number) {
        this.number = Integer.parseInt(number);
    }

    @Override
    public int interpret() {
        return this.number;
    }
}
