package com.example.trelloreal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ChoseScreen extends LinearLayout {

    Context context;
    GridView gridView;
    ImageButton imageButton;

    ArrayList<CellGrid> ListCell;
    GridAdapter gridAdapter;

    public ChoseScreen(Context context) {
        super(context);
    }

    public ChoseScreen(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        this.context = context;
        Intialize();
    }

    private void LoadDataScreen() {
        ListCell = new ArrayList<>();

        ListCell.add(new CellGrid("no 1",R.drawable.ic_launcher_background));
        ListCell.add(new CellGrid("no 2",R.drawable.ic_launcher_background));
        ListCell.add(new CellGrid("no 3",R.drawable.ic_launcher_background));
        ListCell.add(new CellGrid("no 4",R.drawable.ic_launcher_background));
        ListCell.add(new CellGrid("no 5",R.drawable.ic_launcher_background));
        ListCell.add(new CellGrid("no 1",R.drawable.ic_launcher_background));
        ListCell.add(new CellGrid("no 2",R.drawable.ic_launcher_background));
        ListCell.add(new CellGrid("no 3",R.drawable.ic_launcher_background));
        ListCell.add(new CellGrid("no 4",R.drawable.ic_launcher_background));
        ListCell.add(new CellGrid("no 5",R.drawable.ic_launcher_background));
    }

    private void Intialize() {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.chose_screen,this);

        gridView = view.findViewById(R.id.grvChoseScreen);
        //imageButton = view.findViewById(R.id.imgBtnChoseScreen);
        LoadDataScreen();

        gridAdapter = new GridAdapter(context,R.layout.cell_grid,ListCell);
        gridView.setAdapter(gridAdapter);
    }

    public ChoseScreen(Context context, @Nullable  AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


}
