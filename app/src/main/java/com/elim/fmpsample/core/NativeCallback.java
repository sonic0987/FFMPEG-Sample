package com.elim.fmpsample.core;

public interface NativeCallback {
    void onFrame(byte[] frame, int nChannel, int width, int height);
}
