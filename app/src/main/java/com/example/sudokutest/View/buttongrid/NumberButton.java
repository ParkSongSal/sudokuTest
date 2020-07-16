package com.example.sudokutest.View.buttongrid;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

import com.example.sudokutest.GameEngine;

public class NumberButton extends androidx.appcompat.widget.AppCompatButton implements View.OnClickListener {

    private int number;
    public NumberButton(Context context, AttributeSet attrs){
        super(context,attrs);
        setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        GameEngine.getInstance().setNumber(number);
    }

    public void setNumber(int number){
        this.number = number;
    }
}
