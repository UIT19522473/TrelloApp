package com.example.trelloreal.Card;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.trelloreal.Event.EventActivity;
import com.example.trelloreal.R;

import java.util.List;

public class Adapter_Item  extends RecyclerView.Adapter<Adapter_Item.ItemHolder>{

    private Context mContext;
    private List<Item_Card> mListItem;
    public Adapter_Item(Context mContext) {
        this.mContext = mContext;
    }

    public void setData(List<Item_Card> list){

        this.mListItem = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card,parent,false);
        return new ItemHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter_Item.ItemHolder holder, int position) {
        Item_Card item_card= mListItem.get(position);
        if(item_card == null){
            return;
        }

        holder.itemTitle.setText(item_card.getTitle());
        if(item_card.getTimeEnd() != ""){
            holder.itemImgNotify.setImageResource(R.drawable.ic_baseline_timer_24);
            holder.itemTime.setText(item_card.getTimeStart()+" - "+item_card.getTimeEnd());
        }
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(mContext, ""+item_card.getTitle(), Toast.LENGTH_SHORT).show();
//                Intent[] intent = new Intent[0];
//                intent[0].setClass(mContext,EventActivity.class);

                Intent[] intent = new Intent[]{new Intent(mContext,EventActivity.class)};
                mContext.startActivities(intent);
            }
        });


        holder.linearLayout.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                mListItem.remove(position);
                notifyDataSetChanged();
                return true;
            }
        });


    }

    @Override
    public int getItemCount() {
        if(mListItem!=null){
            return mListItem.size();
        }
        return 0;
    }

    public class ItemHolder extends RecyclerView.ViewHolder{
        private LinearLayout linearLayout;
        private TextView itemTitle;
        private ImageView itemImgNotify;
        private TextView itemTime;

        public ItemHolder(@NonNull View itemView) {
            super(itemView);
            itemTitle = itemView.findViewById(R.id.txtItemTitle);
            itemImgNotify = itemView.findViewById(R.id.imgItemNotify);
            itemTime = itemView.findViewById(R.id.txtItemTime);
            linearLayout = itemView.findViewById(R.id.lnItem);

        }
    }
}
