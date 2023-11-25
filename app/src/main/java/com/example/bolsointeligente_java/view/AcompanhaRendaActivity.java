package com.example.bolsointeligente_java.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.bolsointeligente_java.R;

public class AcompanhaRendaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acompanha_renda);

        ImageView imagVoltar = findViewById(R.id.imag_voltar);

        imagVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AcompanhaRendaActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

    }
}