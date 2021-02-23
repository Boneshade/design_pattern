package com.scott.design.creational.simplefactory;

/**
 * @author xubr
 * @title: Test
 * @projectName design_pattern
 * @description: <h1>简单工厂的测试类<h1/>
 * @date 2021/2/2314:59
 */
public class Test {

    public static void main(String[] args) {
//        Video video = VideoFactory.getVideo("java");
//        System.out.println(video);

        Video video = VideoFactory.getVideo(JavaVideo.class);
        System.out.println(video);

    }

}
