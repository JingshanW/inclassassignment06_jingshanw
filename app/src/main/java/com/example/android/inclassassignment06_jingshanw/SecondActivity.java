package com.example.android.inclassassignment06_jingshanw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import static android.R.attr.data;
import static android.R.attr.value;

public class SecondActivity extends AppCompatActivity {

    private TextView brand;
    private TextView price;
    private CheckBox suv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        brand= (TextView) findViewById(R.id.brand);
        price= (TextView) findViewById(R.id.price);
        suv= (CheckBox) findViewById(R.id.suv_checkbox);
    }

    public void submitCar(View view)
    {
        String b=brand.getText().toString();
        int p=Integer.parseInt(price.getText().toString());
        boolean su = ((CheckBox) findViewById(R.id.suv_checkbox)).isChecked();

        Car car=new Car(b,su,p);
        Intent intent=new Intent();
        intent.putExtra(Keys.CAR,car);
        setResult(RESULT_OK,intent);
        finish();
    }
}
