package com.marklogzhu.designpatterns.behavior.status;

/**
 * 加速状态
 */
public class SpeedStatus extends VideoStatus {
    @Override
    public void play() {
        System.out.println("错误：视频当前已再播放中");
    }

    @Override
    public void pause() {
        super.videoContext.setVideoStatus(VideoContext.PAUSE_STATUS);
    }

    @Override
    public void speed() {
        System.out.println("视频加速播放中......");
    }

    @Override
    public void stop() {
        super.videoContext.setVideoStatus(VideoContext.STOP_STATUS);
    }
}
