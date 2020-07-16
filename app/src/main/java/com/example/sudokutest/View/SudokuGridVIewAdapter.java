package com.example.sudokutest.View;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.sudokutest.GameEngine;
import com.example.sudokutest.R;

public class SudokuGridVIewAdapter extends BaseAdapter {

    private Context context;

    public SudokuGridVIewAdapter(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return 81;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;

        if(view == null){
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            view = inflater.inflate(R.layout.cell, parent, false);
        }

        int x = position % 9;
        int y = position / 9;

        SudokuCell cell = (SudokuCell)view;
        cell.setNumber(GameEngine.getInstance().getSudoku()[x][y]);

        return view;
    }
}
