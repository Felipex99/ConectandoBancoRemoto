package com.example.bancorequest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    AppCompatButton enviar;
    AppCompatEditText nome;
    AppCompatEditText email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        campos();
        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Dados enviados com sucesso", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void campos(){
        enviar = findViewById(R.id.enviar);
        nome = findViewById(R.id.nome);
        email  = findViewById(R.id.email);
    }
}