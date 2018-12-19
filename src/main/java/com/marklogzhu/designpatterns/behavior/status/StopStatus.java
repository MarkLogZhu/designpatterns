package com.marklogzhu.designpatterns.behavior.status;

/**
 * 停止状态
 */
public class StopStatus extends VideoStatus {
    @Override
    public void play() {
        super.videoContext.setVideoStatus(VideoContext.PLAY_STATUS);
    }

    @Override
    public void pause() {
        System.out.println("错误：视频当前已停止播放，不能暂停");
    }

    @Override
    public void speed() {
       System.out.println("错误：视频当前已停止播放，不能加速");
    }

    @Override
    public void stop() {
        System.out.println("视频停止播放......");
    }
}
