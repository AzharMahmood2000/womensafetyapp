package com.example.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        // Find the button and set an onClickListener
        Button btnOpenSecond = findViewById(R.id.btn_next);
        btnOpenSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the Register activity (correct class name)
                Intent intent = new Intent(Welcome.this, Register.class);  // Use "Register.class" here
                startActivity(intent);
            }
        });
    }
}
