package com.av.act13.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;



//El viewmodel es un elemento garantiza que la informacion que se muestran en las interfaces no se pierdan al momento
//de realizar un cambio de pantalla o alguna accion, permitiendo que la indformacion permanezca
public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Este es el fragmento de Inicio");
    }

    public LiveData<String> getText() {
        return mText;
    }
}