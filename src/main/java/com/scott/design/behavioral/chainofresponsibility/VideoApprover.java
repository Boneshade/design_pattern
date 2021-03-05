package com.scott.design.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

/**
 * @author xubr
 * @title: VideoApprover
 * @projectName design_pattern
 * @description: <h1>视频审核人</h1>
 * @date 2021/3/59:57
 */
public class VideoApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if (StringUtils.isNotEmpty(course.getVideo())) {
            System.out.println(course.getName() + "含有视频,批准");
            if (approver != null) {
                approver.deploy(course);
            }
        } else {
            System.out.println(course.getName() + "不含有视频,不批准,流程结束");
            return;
        }

    }
}
