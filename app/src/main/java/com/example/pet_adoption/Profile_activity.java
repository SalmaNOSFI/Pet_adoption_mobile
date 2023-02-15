package com.example.pet_adoption;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Profile_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        ImageView backtoDash;
        LinearLayout changeLang;
        TextView logout;

        backtoDash = findViewById(R.id.btn_back);
        changeLang = findViewById(R.id.linearLayout5);
        logout = findViewById(R.id.logout);
   /*
        backtoDash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Profile_activity.this, DashBord.class);
                startActivity(i);
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Profile_activity.this, DashBord.class);
                startActivity(i);
            }
        });

        */
    }
}
