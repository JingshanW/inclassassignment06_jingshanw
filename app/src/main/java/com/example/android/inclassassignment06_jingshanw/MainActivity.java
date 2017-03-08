package com.example.android.inclassassignment06_jingshanw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.R.attr.data;

public class MainActivity extends AppCompatActivity {

    private TextView displayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayText= (TextView) findViewById(R.id.display_text);
    }


    public void addCar(View view)
    {
        Intent intent=new Intent(this,SecondActivity.class);
        startActivityForResult(intent,RequestCode.ADD_CAR);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        if (requestCode == RequestCode.ADD_CAR && resultCode == RESULT_OK) {
            Car car = (Car) intent.getSerializableExtra(Keys.CAR);
            displayText.setText(displayText.getText().toString()+"\n"+"\n"+car.toString());
        }
    }
}
