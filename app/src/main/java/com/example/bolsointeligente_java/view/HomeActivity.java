package com.example.bolsointeligente_java.view;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.bolsointeligente_java.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        CardView cardDespesas = findViewById(R.id.card_despesas);
        CardView cardRenda = findViewById(R.id.card_renda);
        CardView cardMetas = findViewById(R.id.card_metas);
        CardView cardSac = findViewById(R.id.card_sac);


        cardDespesas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(HomeActivity.this);
                builder.setTitle("Opções");
                builder.setItems(new CharSequence[]{"Cadastrar Nova Despesa", "Acompanhar Despesas"}, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        switch (which) {
                            case 0:
                                Intent cadastrarDespesaIntent = new Intent(HomeActivity.this, DespesaActivity.class);
                                startActivity(cadastrarDespesaIntent);
                                break;
                            case 1:
                                Intent acompanharDespesasIntent = new Intent(HomeActivity.this, AcompanhaDespesaActivity.class);
                                startActivity(acompanharDespesasIntent);
                                break;
                        }
                    }
                });
                builder.show();
            }
        });

        cardRenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(HomeActivity.this);
                builder.setTitle("Opções");
                builder.setItems(new CharSequence[]{"Cadastrar Nova Renda", "Acompanhar Rendas"}, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        switch (which) {
                            case 0:
                                Intent cadastrarRendaIntent = new Intent(HomeActivity.this, RendaActivity.class);
                                startActivity(cadastrarRendaIntent);
                                break;
                            case 1:
                                Intent acompanharRendasIntent = new Intent(HomeActivity.this, AcompanhaRendaActivity.class);
                                startActivity(acompanharRendasIntent);
                                break;
                        }
                    }
                });
                builder.show();
            }
        });

        cardMetas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                Intent intent = new Intent(HomeActivity.this, MetasActivity.class);
                startActivity(intent);
            }
        });

        cardSac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                Intent intent = new Intent(HomeActivity.this, SacActivity.class);
                startActivity(intent);
            }
        });
    }
}
