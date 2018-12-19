package com.marklogzhu.designpatterns.behavior.status;

public abstract class VideoStatus {

    protected VideoContext videoContext;


    public void setVideoContext(VideoContext videoContext) {
        this.videoContext = videoContext;
    }

    /**
     * 播放
     */
    public abstract void play();

    /**
     * 暂停
     */
    public abstract void pause();

    /**
     * 加速
     */
    public abstract void speed();

    /**
     * 终止
     */
    public abstract void stop();
}
