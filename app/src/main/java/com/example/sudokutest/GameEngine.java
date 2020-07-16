package com.example.sudokutest;

import android.content.Context;

import com.example.sudokutest.View.GameGrid;

public class GameEngine {

    private static GameEngine instance;

    private GameGrid grid = null;

    private GameEngine(){}

    public static GameEngine getInstance(){
        if(instance == null){
            instance = new GameEngine();
        }
        return instance;
    }

    public void createGrid(Context context){
        int [][] Sudoku = SudokuGenerator.getInstance().generateGrid();
        grid = new GameGrid(context);
        grid.setGrid(Sudoku);

    }

    public GameGrid getGrid(){
        return grid;
    }
}
