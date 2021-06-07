package com.example.trelloreal;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.trelloreal.Card.CreateCardActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridMain;
    ArrayList<CellGrid> ListCell;
    GridAdapter gridAdapter;

    ImageButton imgBtnAdd;

    ImageView imgDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();

        gridAdapter = new GridAdapter(this,R.layout.cell_grid,ListCell);
        gridMain.setAdapter(gridAdapter);

        imgBtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent i = new Intent(MainActivity.this, ChoseScreenActivity.class);
//                startActivity(i);
                DialogAddEvent();
            }
        });

        gridMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(MainActivity.this, CreateCardActivity.class);
                startActivity(i);
            }
        });
    }

    private void AnhXa() {
        imgBtnAdd = (ImageButton)findViewById(R.id.imgBtnAdd);
        gridMain = (GridView)findViewById(R.id.grvMain);
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    private void DialogAddEvent(){
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.add_new_cell);
        dialog.show();

        imgDialog = dialog.findViewById(R.id.imgAddTable);
        imgDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(dialog.getContext(), BackGroundActivity.class);
                startActivity(i);
                //Toast.makeText(MainActivity.this, "hello", Toast.LENGTH_SHORT).show();
            }
        });
    }
}