package com.scott.design.creational.abstractfactory;

import com.scott.design.creational.abstractfactory.Video;

/**
 * @author xubr
 * @title: CourseFactory
 * @projectName design_pattern
 * @description: <h1>�γ̵ĳ��󹤳�</h1>
 * @date 2021/2/2410:04
 */
public interface CourseFactory {

    /**
     * <h2>��ȡͬһ����Ʒ�ȼ�����Ƶ<h2/>
     * @return
     */
    Video getVideo();

    /**
     * <h2>��ȡͬһ����Ʒ�ȼ����ּ�<h2/>
     * @return
     */
    Article getArticle();


}
