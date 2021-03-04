package com.scott.design.behavioral.commend;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xubr
 * @title: Staff
 * @projectName design_pattern
 * @description: <h1>命令模式-职工类</h1>
 * @date 2021/3/416:11
 */
public class Staff {

    private List<Command> commands = new ArrayList<>();

    public void addCommend(Command command) {
        commands.add(command);
    }

    public void executeCommands() {
        commands.forEach(Command::execute);
        commands.clear();
    }


}
