package com.example.techsparse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Customer_page extends AppCompatActivity {
Button neworder,previousorder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_page);
        neworder=(Button)findViewById(R.id.new_order);
        previousorder=(Button)findViewById(R.id.previous_order);

        neworder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Customer_page.this,Customer_neworder.class);
                startActivity(intent);
            }
        });

        previousorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Customer_page.this,customer_previousorders.class);
                startActivity(intent);

            }
        });

    }
}
