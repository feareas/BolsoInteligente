package com.example.bolsointeligente_java.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.bolsointeligente_java.R;

public class SacActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sac);

        ImageView imagVoltar = findViewById(R.id.imag_voltar);
        Button buttonEnviar = findViewById(R.id.selecionarshops);

        imagVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SacActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SacActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}