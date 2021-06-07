package com.example.trelloreal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class GridAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<CellGrid> cellGridList;

    public GridAdapter(Context context, int layout, List<CellGrid> cellGridList) {
        this.context = context;
        this.layout = layout;
        this.cellGridList = cellGridList;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public int getLayout() {
        return layout;
    }

    public void setLayout(int layout) {
        this.layout = layout;
    }

    public List<CellGrid> getCellGridList() {
        return cellGridList;
    }

    public void setCellGridList(List<CellGrid> cellGridList) {
        this.cellGridList = cellGridList;
    }

    @Override
    public int getCount() {
        return cellGridList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder{
        ImageView imgHinh;
        TextView txtTitle;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

        if(convertView == null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout,null);
            holder.imgHinh = (ImageView)convertView.findViewById(R.id.imgBgrCell);
            holder.txtTitle = (TextView)convertView.findViewById(R.id.txtTileCell);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }

        CellGrid cellGrid = cellGridList.get(position);

        holder.imgHinh.setImageResource(cellGrid.getImage());
        holder.txtTitle.setText(cellGrid.getTitle());
        return convertView;
    }
}
