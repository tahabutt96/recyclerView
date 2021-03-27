package com.arsalan.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class productadapter  extends
        RecyclerView.Adapter<productadapter.productViewHolder> {
    Context context;
    List<productmodel> productList;
    public productadapter(Context context, List<productmodel> productList) {
        this.context = context;
        this.productList = productList;
    }
    @NonNull
    @Override
    public productViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int
            viewType) {
        LayoutInflater inflator = LayoutInflater.from(context);
        View itemView = inflator.inflate(R.layout.listview, null);
        productViewHolder holder = new productViewHolder(itemView);
        return holder;
    }
    @Override
    public void onBindViewHolder(@NonNull productViewHolder holder, int position) {
        productmodel product = productList.get(position);
        holder.productImageView.setImageResource(product.getImage());
        holder.productHeading.setText(product.getHeading());
        holder.productDes.setText(product.getDes());
    }
    @Override
    public int getItemCount() {
        return productList.size();
    }
    class productViewHolder extends RecyclerView.ViewHolder {
        ImageView productImageView;
        TextView productHeading, productDes;
        public productViewHolder(@NonNull View itemView) {
            super(itemView);
            productImageView = itemView.findViewById(R.id.my_product);
            productHeading = itemView.findViewById(R.id.head_txt);
            productDes = itemView.findViewById(R.id.des_txt);
        }
    }
}
