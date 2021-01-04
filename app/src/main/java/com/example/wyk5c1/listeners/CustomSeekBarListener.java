package com.example.wyk5c1.listeners;

import android.widget.EditText;
import android.widget.SeekBar;

import com.example.wyk5c1.callback.ToolbarCallback;

public class CustomSeekBarListener implements SeekBar.OnSeekBarChangeListener {
    private ToolbarCallback _toolbarCallback;
    private EditText _editText;

    public CustomSeekBarListener(ToolbarCallback toolbarCallback, EditText editText) {
        _toolbarCallback = toolbarCallback;
        _editText = editText;
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        int fontSize = 20 + progress / 5;
        _toolbarCallback.onButtonClick(fontSize, _editText.getText().toString());
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
