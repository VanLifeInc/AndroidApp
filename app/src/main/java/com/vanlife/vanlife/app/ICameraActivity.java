package com.vanlife.vanlife.app;

/**
 * Created by User on 6/5/2018.
 */

public interface ICameraActivity {

    void setCameraFrontFacing();

    void setCameraBackFacing();

    boolean isCameraFrontFacing();

    boolean isCameraBackFacing();

    void setFrontCameraId(String cameraId);

    void setBackCameraId(String cameraId);

    String getFrontCameraId();

    String getBackCameraId();
}
