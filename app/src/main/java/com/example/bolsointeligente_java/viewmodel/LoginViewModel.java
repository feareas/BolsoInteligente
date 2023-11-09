package com.example.bolsointeligente_java.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.bolsointeligente_java.view.LoginActivity;

public class LoginViewModel extends ViewModel {
    private final MutableLiveData<String> email = new MutableLiveData<>();
    private final MutableLiveData<String> senha = new MutableLiveData<>();
    private final MutableLiveData<String> msgUsername = new MutableLiveData<>();
    private final MutableLiveData<String> msgSenha = new MutableLiveData<>();

    public MutableLiveData<String> email() {
        return email;
    }

    public MutableLiveData<String> senha() {
        return senha;
    }

    public MutableLiveData<String> msgUsername() {
        return msgUsername;
    }

    public MutableLiveData<String> msgSenha() {
        return msgSenha;
    }

    public void validarCampos() {
        String emailValue = email.getValue();
        String senhaValue = senha.getValue();

        if (emailValue == null || emailValue.isEmpty()) {
            msgUsername.setValue("Campo de e-mail vazio");
        } else {
            msgUsername.setValue(null);
        }

        if (senhaValue == null || senhaValue.isEmpty()) {
            msgSenha.setValue("Campo de senha vazio");
        } else {
            msgSenha.setValue(null);
        }
    }

    public void login(String email, String senha, OnLoginResultListener listener) {
        // Aqui você pode implementar a lógica de login
        // Verifique as credenciais, faça uma chamada de API, etc.

        if (email.equals("seu_email") && senha.equals("sua_senha")) {
            listener.onLoginSuccess();
        } else {
            listener.onLoginError("Credenciais inválidas");
        }
    }


    public interface OnLoginResultListener {
        void onLoginSuccess();
        void onLoginError(String errorMessage);
    }
}
