package com.example.trelloreal.Card;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.applandeo.materialcalendarview.CalendarView;
import com.example.trelloreal.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CreateCardActivity extends AppCompatActivity{
    private RecyclerView rcvCreate;
    private Adapter_Item adapterItem;
    private List<Item_Card> listItem;


    private ImageButton btnBack;
    private ImageButton btnCreate;

    private CalendarView clvBottom;
    private RecyclerView rcvBottom;

    int i = 0;

    ImageButton btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_card);
        listItem = new ArrayList<>();


        rcvCreate = findViewById(R.id.rcvCreate);
        adapterItem = new Adapter_Item(this);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2,RecyclerView.VERTICAL,false);
        rcvCreate.setLayoutManager(gridLayoutManager);
        adapterItem.setData(listItem);
        rcvCreate.setAdapter(adapterItem);


        btnAdd = findViewById(R.id.btnAddCreateActivity);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setListItem(""+i,"12 am","12 pm");
                i++;
            }
        });




        btnBack = findViewById(R.id.imgBtnBackCreate);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });



        btnCreate = findViewById(R.id.imgButtonCalendarCreate);
        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BottomSheetDialog bottomSheetDialog;
                bottomSheetDialog = new BottomSheetDialog(CreateCardActivity.this,R.style.BottomSheetDialogTheme);

                bottomSheetDialog.setContentView(R.layout.bottomdialg);

                rcvBottom = bottomSheetDialog.findViewById(R.id.rcvBottomDialog);

                List<Item_Card> listItem2 = new ArrayList<>();


                Adapter_Item adapterItem2 = new Adapter_Item(CreateCardActivity.this);

                GridLayoutManager gridLayoutManager = new GridLayoutManager(CreateCardActivity.this,1,RecyclerView.VERTICAL,false);
                rcvBottom.setLayoutManager(gridLayoutManager);
                adapterItem2.setData(listItem2);
                rcvBottom.setAdapter(adapterItem2);


                listItem2.add(new Item_Card("demo","2","212"));
                listItem2.add(new Item_Card("demo","2","212"));
                listItem2.add(new Item_Card("demo","2","212"));
                listItem2.add(new Item_Card("demo","2","212"));
                listItem2.add(new Item_Card("demo","2","212"));
                adapterItem2.notifyDataSetChanged();

                bottomSheetDialog.show();
            }

        });

    }

    private void setListItem(String Title,String TimeStart, String TimeEnd){
        listItem.add(new Item_Card(Title,TimeStart,TimeEnd));
        adapterItem.notifyDataSetChanged();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}

