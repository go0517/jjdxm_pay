package com.dou361.pay;


public abstract class OnPayListener {

    private static final String TAG = OnPayListener.class.getName();

    public void onStartPay() {
    }

    public abstract void onPaySuccess();

    public abstract void onPayFail(String code, String msg);

}
