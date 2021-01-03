package com.example.wyk5c1;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.example.wyk5c1.callback.ToolbarCallback;

public class MainActivity extends FragmentActivity
                          implements ToolbarCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onButtonClick(int position, String text) {
        TextFragment textFragment = (TextFragment) getSupportFragmentManager().findFragmentById(R.id.textFragment);
        textFragment.changeTextProperties(position, text);
    }
}