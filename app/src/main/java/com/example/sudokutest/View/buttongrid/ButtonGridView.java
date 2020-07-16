package com.example.sudokutest.View.buttongrid;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;

import com.example.sudokutest.R;

public class ButtonGridView extends GridView {



    public ButtonGridView(Context context, AttributeSet attrs){
        super(context,attrs);

        ButtonGridViewAdapter gridViewAdapter = new ButtonGridViewAdapter(context);

        setAdapter(gridViewAdapter);
    }

    class ButtonGridViewAdapter extends BaseAdapter{

        private Context context;
        public ButtonGridViewAdapter(Context context){
            this.context = context;
        }
        @Override
        public int getCount() {
            return 10;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = convertView;

            if(view == null){
                LayoutInflater inflater = ((Activity) context).getLayoutInflater();
                view = inflater.inflate(R.layout.button, parent, false);

                NumberButton btn;
                btn = (NumberButton)view;
                //btn.setTextSize(10);
                btn.setId(position);

                if(position != 9){
                    btn.setText(String.valueOf(position+1));
                }else{
                    btn.setText("DEL");
                }

                return btn;
            }

            return view;
        }
    }
}
