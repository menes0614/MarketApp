package com.example.marketapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.marketapp.R;
import com.example.marketapp.model.SizinIcin;

import java.util.List;

public class SizinIcinAdapter extends RecyclerView.Adapter<SizinIcinAdapter.BestForYouWievHolder> {

    Context context;
    List<SizinIcin> sizinIcinList;

    public SizinIcinAdapter(Context context, List<SizinIcin> sizinIcinList) {
        this.context = context;
        this.sizinIcinList = sizinIcinList;
    }

    @NonNull
    @Override
    public BestForYouWievHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BestForYouWievHolder(LayoutInflater.from(context).inflate(R.layout.sizin_icin_arayuz, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull BestForYouWievHolder holder, int position) {

        holder.itemImage.setImageResource(sizinIcinList.get(position).getImageUrl());
        holder.itemName.setText(sizinIcinList.get(position).getName());
        holder.itemTime.setText(sizinIcinList.get(position).getTime());
        holder.iremPrice.setText(sizinIcinList.get(position).getPrice());
        holder.itemRating.setRating(Float.parseFloat(sizinIcinList.get(position).getRating()));

    }

    @Override
    public int getItemCount() {
        return sizinIcinList.size();
    }

    public static final class BestForYouWievHolder extends RecyclerView.ViewHolder{

        ImageView itemImage;
        TextView iremPrice, itemTime, itemName;
        RatingBar itemRating;

        public BestForYouWievHolder(@NonNull View itemView) {
            super(itemView);

            itemImage = itemView.findViewById(R.id.item_image);
            iremPrice = itemView.findViewById(R.id.item_price);
            itemTime = itemView.findViewById(R.id.irem_time);
            itemName = itemView.findViewById(R.id.item_name);
            itemRating = itemView.findViewById(R.id.ratingBar);


        }
    }

}
