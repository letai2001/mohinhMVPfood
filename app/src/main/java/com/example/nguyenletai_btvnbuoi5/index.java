package com.example.nguyenletai_btvnbuoi5;

import java.util.ArrayList;

public class index {
    public static int indexOfarray(ArrayList<String> foodinCart,int i)
    {
        int count  = 0;
        for(int j = 0;  j<foodinCart.size();j++)
        {
            if(foodinCart.get(i).compareTo(foodinCart.get(j))==0) count++;
        }
        return count;
    }
}
