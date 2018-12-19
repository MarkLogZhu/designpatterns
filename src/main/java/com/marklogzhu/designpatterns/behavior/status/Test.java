package com.marklogzhu.designpatterns.behavior.status;

public class Test {

    public static void main(String[] args) {
        VideoContext videoContext = new VideoContext();
        videoContext.setVideoStatus(new PlayStatus());
        System.out.println("当前视频状态：" +videoContext.getVideoStatus().getClass().getSimpleName());
        videoContext.speed();
        System.out.println("当前视频状态：" +videoContext.getVideoStatus().getClass().getSimpleName());
        videoContext.stop();
        System.out.println("当前视频状态：" +videoContext.getVideoStatus().getClass().getSimpleName());
        videoContext.speed();
        System.out.println("当前视频状态：" +videoContext.getVideoStatus().getClass().getSimpleName());
    }
}
