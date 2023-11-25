package com.example.bolsointeligente_java.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

import com.example.bolsointeligente_java.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class CadastroActivity extends AppCompatActivity {
    private TextInputLayout nomeContainer, sobrenomeContainer, CpfContainer, senhaContainer, confirmSenhaContainer, emailContainer, telefoneContainer, dataNascimentoContainer;
    private RadioGroup radioGroupGenero, radioAceitaEmail, radioAceitaSms, radioAceitaLigacao, radioAceitaWhatsapp;
    private TextInputEditText editNome, editSobrenome, editCpf, editSenha, editConfirmSenha, editEmail, editTelefone, editDataNascimento;
    private Button buttonCadastrarUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        // Inicialize todos os elementos do layout
        nomeContainer = findViewById(R.id.nomeContainer);
        sobrenomeContainer = findViewById(R.id.sobrenomeContainer);
        CpfContainer = findViewById(R.id.CpfContainer);
        senhaContainer = findViewById(R.id.senhaContainer);
        confirmSenhaContainer = findViewById(R.id.confirmSenhaContainer);
        emailContainer = findViewById(R.id.emailContainer);
        telefoneContainer = findViewById(R.id.telefoneContainer);
        dataNascimentoContainer = findViewById(R.id.dataNascimentoContainer);
        radioGroupGenero = findViewById(R.id.radioGroupGenero);
        radioAceitaEmail = findViewById(R.id.radioAceitaEmail);
        radioAceitaSms = findViewById(R.id.radioAceitaSms);
        radioAceitaLigacao = findViewById(R.id.radioAceitaLigacao);
        radioAceitaWhatsapp = findViewById(R.id.radioAceitaWhatsapp);
        editNome = findViewById(R.id.editNome);
        editSobrenome = findViewById(R.id.editSobrenome);
        editCpf = findViewById(R.id.editCpf);
        editSenha = findViewById(R.id.editSenha);
        editConfirmSenha = findViewById(R.id.editConfirmSenha);
        editEmail = findViewById(R.id.editEmail);
        editTelefone = findViewById(R.id.editTelefone);
        editDataNascimento = findViewById(R.id.editDataNascimento);
        buttonCadastrarUsuario = findViewById(R.id.buttonCadastrarUsuario);

        buttonCadastrarUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validateFields()) {
                    // Os campos estão preenchidos corretamente, você pode prosseguir com o processo de cadastro.
                    irTelaLogin();
                }
            }
        });
    }

    private boolean validateFields() {
        boolean allFieldsValid = true;

        if (TextUtils.isEmpty(editNome.getText())) {
            nomeContainer.setError("Digite seu nome");
            allFieldsValid = false;
        } else {
            nomeContainer.setError(null);
        }

        if (TextUtils.isEmpty(editSobrenome.getText())) {
            sobrenomeContainer.setError("Digite seu sobrenome");
            allFieldsValid = false;
        } else {
            sobrenomeContainer.setError(null);
        }

        if (TextUtils.isEmpty(editCpf.getText())) {
            CpfContainer.setError("Digite seu CPF");
            allFieldsValid = false;
        } else {
            CpfContainer.setError(null);
        }

        if (TextUtils.isEmpty(editSenha.getText())) {
            senhaContainer.setError("Digite sua senha");
            allFieldsValid = false;
        } else {
            senhaContainer.setError(null);
        }

        if (TextUtils.isEmpty(editConfirmSenha.getText())) {
            confirmSenhaContainer.setError("Confirme sua senha");
            allFieldsValid = false;
        } else {
            confirmSenhaContainer.setError(null);
        }

        if (TextUtils.isEmpty(editEmail.getText())) {
            emailContainer.setError("Digite seu email");
            allFieldsValid = false;
        } else {
            emailContainer.setError(null);
        }

        if (TextUtils.isEmpty(editTelefone.getText())) {
            telefoneContainer.setError("Digite seu telefone");
            allFieldsValid = false;
        } else {
            telefoneContainer.setError(null);
        }

        if (TextUtils.isEmpty(editDataNascimento.getText())) {
            dataNascimentoContainer.setError("Digite sua data de nascimento");
            allFieldsValid = false;
        } else {
            dataNascimentoContainer.setError(null);
        }

        if (radioGroupGenero.getCheckedRadioButtonId() == -1) {
            findViewById(R.id.erroGroupGenero).setVisibility(View.VISIBLE);
            allFieldsValid = false;
        } else {
            findViewById(R.id.erroGroupGenero).setVisibility(View.INVISIBLE);
        }

        if (radioAceitaEmail.getCheckedRadioButtonId() == -1) {
            findViewById(R.id.erroGroupEmail).setVisibility(View.VISIBLE);
            allFieldsValid = false;
        } else {
            findViewById(R.id.erroGroupEmail).setVisibility(View.INVISIBLE);
        }

        if (radioAceitaSms.getCheckedRadioButtonId() == -1) {
            findViewById(R.id.erroGroupSms).setVisibility(View.VISIBLE);
            allFieldsValid = false;
        } else {
            findViewById(R.id.erroGroupSms).setVisibility(View.INVISIBLE);
        }

        if (radioAceitaLigacao.getCheckedRadioButtonId() == -1) {
            findViewById(R.id.erroGroupLigacao).setVisibility(View.VISIBLE);
            allFieldsValid = false;
        } else {
            findViewById(R.id.erroGroupLigacao).setVisibility(View.INVISIBLE);
        }

        if (radioAceitaWhatsapp.getCheckedRadioButtonId() == -1) {
            findViewById(R.id.erroGroupWhatsapp).setVisibility(View.VISIBLE);
            allFieldsValid = false;
        } else {
            findViewById(R.id.erroGroupWhatsapp).setVisibility(View.INVISIBLE);
        }

        if (radioGroupGenero.getCheckedRadioButtonId() == -1) {
            findViewById(R.id.erroGroupGenero).setVisibility(View.VISIBLE);
            allFieldsValid = false;
        } else {
            findViewById(R.id.erroGroupGenero).setVisibility(View.INVISIBLE);
        }


        return allFieldsValid;
    }

    private void irTelaLogin() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}
