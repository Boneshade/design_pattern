package com.scott.design.creational.factorymethod;

/**
 * @author xubr
 * @projectName design_pattern
 * @description: <h1>视频简单工厂</h1>
 * @date 2021/2/2315:02
 */
public abstract class VideoFactory {

    public abstract Video getVideo();

//    public static Video getVideo(Class c) {
//        Video video = null;
//        try {
//            video = (Video) Class.forName(c.getName()).newInstance();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return video;
//    }
//
//
//    public static Video getVideo(String type) {
//        if ("java".equalsIgnoreCase(type)) {
//            return new JavaVideo();
//        } else if ("python".equalsIgnoreCase(type)) {
//            return new PythonVideo();
//        }
//        return null;
//    }


}
