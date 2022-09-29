package com.example.riviera_charters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText username = findViewById(R.id.usrtxt);
        EditText password = findViewById(R.id.passtxt);

        Button loginbtn = findViewById(R.id.loginbtn);

        //usuario y pass de prueba Juan y 123492

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("Juan") && password.getText().toString().equals("123492")){
                    //si es correcto
                    Toast.makeText(MainActivity.this,"Login Correcto", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this, Home.class));

                }else
                    //si es incorrecto
                    Toast.makeText(MainActivity.this,"Error, Intenta de nuevo", Toast.LENGTH_SHORT).show();

            }
        });

    }
}