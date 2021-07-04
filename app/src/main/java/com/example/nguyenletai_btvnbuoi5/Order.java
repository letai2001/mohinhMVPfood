package com.example.nguyenletai_btvnbuoi5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Order extends AppCompatActivity implements iOrder {
    ListView lvContact;
    Food food1,food2,food3,food4,food5,food6;
    List<Food> foodList;
   ImageView btnCart;
    TextView tvCount;
    Button btnOrder;
    TextView tvThanks;
    TextView tvTotals;
    int count  = 0;
    int price = 0;
    List<String> foodinCart;
OrderPresenter orderPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        lvContact = findViewById(R.id.lvContact);
        btnCart = findViewById(R.id.btnCart);
        foodList =new ArrayList<>();
        foodinCart = new ArrayList<>();
        tvCount = findViewById(R.id.tvCount);
        btnOrder = findViewById(R.id.btnOrder);
        tvThanks = findViewById(R.id.tvThanks);
        tvTotals = findViewById(R.id.tvTotal);
        food1 = new Food("Pizza Panda",10);
        food2 = new Food("KFC Super",15);
        food3 = new Food("Breads Eggs",20);
        food4 = new Food("Coca Cola",25);
        food5 = new Food("Chicken Super",30);
        food6 = new Food("Cup Cake",35);
        foodList.add(food1);
        foodList.add(food2);
        foodList.add(food3);
        foodList.add(food4);
        foodList.add(food5);
        foodList.add(food6);
        AdapterFood adapterFood= new AdapterFood(foodList);
        lvContact.setAdapter(adapterFood);

        btnCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),Cart.class);
                intent.putExtra("tvTotalCa",price );
                intent.putStringArrayListExtra("arraylist", (ArrayList<String>) foodinCart);
                startActivity(intent);
            }

        });


        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          @Override
          public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            orderPresenter.setItemonClick( foodinCart,foodList,count,price, position);
          }

      });

      btnOrder.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
            orderPresenter.setOrderonClick( count ,  price);
          }
      });
    }

    @Override
    public void onItemClick(int count, int price) {
        tvCount.setText(String.valueOf(count));
        tvThanks.setText("");
        tvTotals.setText(String.valueOf(price)+"$");
    }

    @Override
    public void onCartClick(Class mess) {
        Intent intent = new Intent(getBaseContext(),Cart.class);
        intent.putExtra("tvTotalCa",price );
        intent.putStringArrayListExtra("arraylist", (ArrayList<String>) foodinCart);
        startActivity(intent);
    }
    @Override
    public void onOrderClick(int count , int price) {
        tvCount.setText("0");
        tvThanks.setText("Thank you!Your order is sent to restaurant!");
        foodinCart.clear();
        count = 0;
        tvTotals.setText("0$");
        price = 0;

    }
}