package com.example.nguyenletai_btvnbuoi5;

public class FoodinCart {
    String name;
    int count;

    public FoodinCart(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


}

