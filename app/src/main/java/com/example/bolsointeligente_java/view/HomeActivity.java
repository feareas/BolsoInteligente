package com.example.bolsointeligente_java.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.bolsointeligente_java.R;

public class HomeActivity extends AppCompatActivity {

    private CardView cardDespesas, cardRenda, cardMetas, cardHistorico, cardSac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Encontre os CardViews por ID
        cardDespesas = findViewById(R.id.card_mapa);
        cardRenda = findViewById(R.id.card_restaurantes);
        cardMetas = findViewById(R.id.card_eventos);
        cardHistorico = findViewById(R.id.card_recompensas);
        cardSac = findViewById(R.id.card_sac);

        // Defina OnClickListener para cada CardView
        cardDespesas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Iniciar a atividade DespesaActivity
                Intent intent = new Intent(HomeActivity.this, DespesaActivity.class);
                startActivity(intent);
            }
        });

        cardRenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Iniciar a atividade RendaActivity
                Intent intent = new Intent(HomeActivity.this, RendaActivity.class);
                startActivity(intent);
            }
        });

        cardMetas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Iniciar a atividade MetasActivity
                Intent intent = new Intent(HomeActivity.this, MetasActivity.class);
                startActivity(intent);
            }
        });

        cardHistorico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Iniciar a atividade HistoricoActivity
                Intent intent = new Intent(HomeActivity.this, HistoricoActivity.class);
                startActivity(intent);
            }
        });

        cardSac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Iniciar a atividade SacActivity
                Intent intent = new Intent(HomeActivity.this, SacActivity.class);
                startActivity(intent);
            }
        });
    }
}