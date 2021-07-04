package com.example.nguyenletai_btvnbuoi5;

public class LoginPresenter {
    private  iLogin iLogin;

    public LoginPresenter(iLogin iLogin) {
        this.iLogin = iLogin;
    }
    public void  setonClick()
    {
        iLogin.clickLogin(Order.class);
    }

}
