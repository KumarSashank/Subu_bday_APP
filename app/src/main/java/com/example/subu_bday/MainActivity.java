package com.example.subu_bday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button yes,no;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes=findViewById(R.id.yes);
        no=findViewById(R.id.no);
        yes.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent i = new Intent(MainActivity.this, yes_wish.class);
                startActivity(i);
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
           public void onClick(View v) {
               // Perform action on click
               Intent i = new Intent(MainActivity.this, no_wish.class);
               startActivity(i);
           }
        });
    }
}