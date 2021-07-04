package com.example.nguyenletai_btvnbuoi5;

import java.util.List;

public class OrderPresenter {
    iOrder iOrder;

    public OrderPresenter(iOrder iOrder) {
        this.iOrder = iOrder;
    }
    public void  setCartonClick()
    {
        iOrder.onCartClick(Cart.class);
    }
    public void setItemonClick(    List<String> foodinCart,
            List<Food> foodList,int count ,int price,int position)
    {
        count++;
        price += foodList.get(position).getMoney();
        iOrder.onItemClick(count,price);
        foodinCart.add(foodList.get(position).getName());

    }
    public void setOrderonClick(int count , int price)
    {
        iOrder.onOrderClick( count , price);
    }
}
