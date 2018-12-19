package com.marklogzhu.designpatterns.behavior.status;

public class VideoContext {

    private VideoStatus videoStatus;
    public static final PlayStatus PLAY_STATUS = new PlayStatus();
    public static final PauseStatus PAUSE_STATUS = new PauseStatus();
    public static final SpeedStatus SPEED_STATUS = new SpeedStatus();
    public static final StopStatus STOP_STATUS = new StopStatus();

    public VideoStatus getVideoStatus() {
        return videoStatus;
    }

    public void setVideoStatus(VideoStatus videoStatus) {
        this.videoStatus = videoStatus;
        this.videoStatus.setVideoContext(this);
    }

    /**
     * 播放
     */
    public  void play(){
        this.videoStatus.play();
    }

    /**
     * 暂停
     */
    public void pause(){
        this.videoStatus.pause();
    }

    /**
     * 加速
     */
    public  void speed(){
        this.videoStatus.speed();
    }

    /**
     * 终止
     */
    public  void stop(){
        this.videoStatus.stop();
    }
}
