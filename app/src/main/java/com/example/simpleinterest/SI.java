package com.example.simpleinterest;

public class SI {

    private float Price;
    private float Rate;
    private float Time;


    public void setPrice(float price) {
        Price = price;
    }

    public void setRate(float rate) {
        Rate = rate;
    }

    public void setTime(float time) {
        Time = time;
    }

    public float Calc()
    {
        return (Price * Rate * Time)/100;
    }
}
