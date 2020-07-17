package com.example.sudokutest.View.sudokugrid;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class BaseSudokuCell extends View {


    private int value;
    private boolean modifiable = true;
    public BaseSudokuCell(Context context) {
        super(context);
    }




    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, widthMeasureSpec);
    }

    public void setNotModifiable(){
        modifiable = false;
    }

    public void setInitValue(int value){
        this.value = value;

        invalidate();
    }


    public void setValue(int value){
        if(modifiable){
            this.value = value;
        }


        invalidate();
    }

    public int getValue(){
        return value;
    }
}
