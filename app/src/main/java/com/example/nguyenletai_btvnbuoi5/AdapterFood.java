package com.example.nguyenletai_btvnbuoi5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterFood extends BaseAdapter {


    List<Food> foodList;

    public AdapterFood(List<Food> foodList) {
        this.foodList = foodList;
    }
    @Override
    public int getCount() {
        return foodList.size() ;
    }

    @Override
    public Object getItem(int position) {
        return foodList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_food,parent,false);
        TextView tvName,tvMoney;
        tvName = view.findViewById(R.id.tvNamefood);
        tvMoney = view.findViewById(R.id.tvMoney);
       Food food = foodList.get(position);
        tvName.setText(food.getName());
       tvMoney.setText(String.valueOf(food.getMoney())+"$");
        return view;
    }
}
