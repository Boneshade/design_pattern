package com.scott.design.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

/**
 * @author xubr
 * @title: ArticleApprover
 * @projectName design_pattern
 * @description: <h1>责任链模式-手记审批人</h1>
 * @date 2021/3/59:55
 */
public class ArticleApprover extends Approver {

    @Override
    public void deploy(Course course) {
        if (StringUtils.isNotEmpty(course.getArticle())) {
            System.out.println(course.getName() + "含有手记,批准");
            if (approver != null) {
                approver.deploy(course);
            }
        }else {
            System.out.println(course.getName()+"不含有手记,不批准,流程结束");
            return;
        }


    }
}
