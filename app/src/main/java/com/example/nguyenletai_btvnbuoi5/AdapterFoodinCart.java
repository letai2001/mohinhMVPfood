package com.example.nguyenletai_btvnbuoi5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class AdapterFoodinCart extends BaseAdapter {
    List<FoodinCart> foodListCart;
    public AdapterFoodinCart(List<FoodinCart> foodListCart) {
        this.foodListCart = foodListCart;
    }

    @Override


    public int getCount() {
        return foodListCart.size();
    }

    @Override
    public Object getItem(int position) {
        return foodListCart.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_foodincart,parent,false);
        TextView tvName;
        tvName = view.findViewById(R.id.tvNameFoodinCart);
        FoodinCart foodinCart = foodListCart.get(position);
        tvName.setText(foodinCart.getName());
        return view;
    }
}
