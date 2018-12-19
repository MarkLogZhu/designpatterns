package com.marklogzhu.designpatterns.behavior.status;

/**
 * 播放状态
 */
public class PlayStatus extends VideoStatus {

    @Override
    public void play() {
        System.out.println("视频正在播放中......");
    }

    @Override
    public void pause() {
        super.videoContext.setVideoStatus(VideoContext.PAUSE_STATUS);
    }

    @Override
    public void speed() {
        super.videoContext.setVideoStatus(VideoContext.SPEED_STATUS);
    }

    @Override
    public void stop() {
        super.videoContext.setVideoStatus(VideoContext.STOP_STATUS);
    }
}
