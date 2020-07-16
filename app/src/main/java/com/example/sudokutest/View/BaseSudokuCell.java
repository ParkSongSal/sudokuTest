package com.example.sudokutest.View;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class BaseSudokuCell extends View {


    private int value;

    public BaseSudokuCell(Context context) {
        super(context);
    }




    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, widthMeasureSpec);
    }

    public void setValue(int value){
        this.value = value;

        invalidate();
    }

    public int getValue(){
        return value;
    }
}
