package com.marklogzhu.designpatterns.behavior.status;

/**
 * 暂停状态
 */
public class PauseStatus extends VideoStatus {
    @Override
    public void play() {
        super.videoContext.setVideoStatus(VideoContext.PLAY_STATUS);
    }

    @Override
    public void pause() {
        System.out.println("视频暂停播放......");
    }

    @Override
    public void speed() {
        System.out.println("错误：视频当前已暂停播放，不能加速");
    }

    @Override
    public void stop() {
        super.videoContext.setVideoStatus(VideoContext.STOP_STATUS);
    }
}
