package com.scott.design.behavioral.template_method;

/**
 * @author xubr
 * @title: FECourse
 * @projectName design_pattern
 * @description: <h1>前端课程</h1>
 * @date 2021/3/315:29
 */
public class FECourse extends ACourse {

    private boolean needWriteArticleFlag = false;

    @Override
    void packageCourse() {
        System.out.println("提供课程的前端源代码");
        System.out.println("提供课程的图片等多媒体素材");
    }

    public FECourse(boolean needWriteArticleFlag) {
        this.needWriteArticleFlag = needWriteArticleFlag;
    }

    @Override
    protected boolean needWriteArticle() {
        return this.needWriteArticleFlag;
    }
}
