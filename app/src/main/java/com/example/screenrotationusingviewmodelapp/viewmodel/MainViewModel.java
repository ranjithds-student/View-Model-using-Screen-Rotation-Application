package com.example.screenrotationusingviewmodelapp.viewmodel;

import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    private int number = 0;


    public int getNumber() {
        return number;
    }

    public void incrementNumber() {
        number++;
    }


}
