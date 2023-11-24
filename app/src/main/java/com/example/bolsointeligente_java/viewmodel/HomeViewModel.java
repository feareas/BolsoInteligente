package com.example.bolsointeligente_java.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<Boolean> despesasPopupVisible = new MutableLiveData<>(false);
    private MutableLiveData<Boolean> rendaPopupVisible = new MutableLiveData<>(false);
    private MutableLiveData<Boolean> metasPopupVisible = new MutableLiveData<>(false);

    public LiveData<Boolean> getDespesasPopupVisible() {
        return despesasPopupVisible;
    }

    public LiveData<Boolean> getRendaPopupVisible() {
        return rendaPopupVisible;
    }

    public LiveData<Boolean> getMetasPopupVisible() {
        return metasPopupVisible;
    }

    public void showDespesasPopup() {
        despesasPopupVisible.setValue(true);
    }

    public void showRendaPopup() {
        rendaPopupVisible.setValue(true);
    }

    public void showMetasPopup() {
        metasPopupVisible.setValue(true);
    }

    public void closeDespesasPopup() {
        despesasPopupVisible.setValue(false);
    }

    public void closeRendaPopup() {
        rendaPopupVisible.setValue(false);
    }

    public void closeMetasPopup() {
        metasPopupVisible.setValue(false);
    }
}
