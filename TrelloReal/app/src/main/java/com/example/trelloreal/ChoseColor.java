package com.example.trelloreal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

public class ChoseColor extends LinearLayout {

    Context context;
    public ChoseColor(Context context) {
        super(context);
    }

    public ChoseColor(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        this.context = context;
        Intialize();

    }

    public ChoseColor(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private void Intialize() {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.chosel_color,this);

    }
}
