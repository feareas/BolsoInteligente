package com.example.bolsointeligente_java.view;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.ViewModelProvider;
import com.example.bolsointeligente_java.R;
import com.example.bolsointeligente_java.viewmodel.LoginViewModel;

public class LoginActivity extends AppCompatActivity {

    private LoginViewModel viewModel;
    private EditText emailEditText;
    private EditText passwordEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        viewModel = new ViewModelProvider(this).get(LoginViewModel.class);

        emailEditText = findViewById(R.id.editEmail);
        passwordEditText = findViewById(R.id.editSenha);
        loginButton = findViewById(R.id.butt_login);

        viewModel.email().observe(this, email -> emailEditText.setText(email));
        viewModel.senha().observe(this, senha -> passwordEditText.setText(senha));

        loginButton.setOnClickListener(view -> {
            String email = emailEditText.getText().toString();
            String password = passwordEditText.getText().toString();
            boolean allFieldsValid = true;

            if (email.isEmpty()) {
                emailEditText.setError("Digite seu Email");
                allFieldsValid = false;
            }

            if (password.isEmpty()) {
                passwordEditText.setError("Digite sua Senha");
                allFieldsValid = false;
            }

            if (!email.isEmpty() && !password.isEmpty()) {
                Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        TextView txtCadastroUsuario = findViewById(R.id.txtCadastroUsuario);
        txtCadastroUsuario.setOnClickListener(view -> {
            irTelaCadastro();
        });

        TextView txtEsqueciSenha = findViewById(R.id.txtEsqueciSenha);
        txtEsqueciSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navegue para a tela de recuperação de senha (RecoverActivity)
                Intent intent = new Intent(LoginActivity.this, RecoverActivity.class);
                startActivity(intent);
            }
        });
    }

    public void irTelaCadastro() {
        Intent intent = new Intent(this, CadastroActivity.class);
        startActivity(intent);
    }
}