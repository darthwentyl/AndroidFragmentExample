package com.example.wyk5c1.listeners;

import android.widget.SeekBar;

public class CustomSeekBarListener implements SeekBar.OnSeekBarChangeListener {
    private int _seekValue = 0;

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        _seekValue = progress;
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
