package com.example.sudokutest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GameEngine.getInstance().createGrid(this);

    }

    private void printSudoku(int Sudoku[][]) {
        for (int x = 0; x < 9; x++) {
            for (int y = 0; y < 9; y++) {
                //Log.d("TAG","Sudoku " + Sudoku[x][y]+"|");
                System.out.print(Sudoku[x][y] + "|");
            }
            System.out.println();
            //Log.d("TAG","Sudoku");
        }
    }
}