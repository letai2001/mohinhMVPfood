package com.example.nguyenletai_btvnbuoi5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Cart extends AppCompatActivity {
    ListView lvContactCast;
    TextView tvTotalCart;
    ImageButton btnBack;
    private ArrayList<String> listcart;
    List<FoodinCart> foodListCart;
    List<String> temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        lvContactCast = findViewById(R.id.lvContactCast);
        foodListCart = new ArrayList<>();
        temp = new ArrayList<>();

        tvTotalCart = findViewById(R.id.tvTotalCart);
        btnBack = findViewById(R.id.btnBack);
        Intent intent = getIntent();
        int totalprice = intent.getIntExtra("tvTotalCa",0);
       listcart = intent.getStringArrayListExtra("arraylist");
        for (int i = 0; i < listcart.size(); i++) {
            if (!temp.contains(listcart.get(i))) {
                temp.add(listcart.get(i));
            }
        }


       for(int i = 0;i<temp.size();i++)
       {
        String fic = temp.get(i)+"("+String.valueOf(index.indexOfarray(listcart,i))+")";
          foodListCart.add(new FoodinCart(fic,index.indexOfarray(listcart,i)));
       }
        AdapterFoodinCart adapterFoodinCart= new AdapterFoodinCart(foodListCart);
        lvContactCast.setAdapter(adapterFoodinCart);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getBaseContext(), Order.class);
                startActivity(intent1);
            }
        });

        tvTotalCart.setText(String.valueOf(totalprice));
    }
}