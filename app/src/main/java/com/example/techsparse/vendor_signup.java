package com.example.techsparse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class vendor_signup extends AppCompatActivity {
    Button v_signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendor_signup);
        v_signup=(Button)findViewById(R.id.v_signup);
        v_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(vendor_signup.this,vendor_page.class);
                startActivity(intent);
            }
        });

    }
}
