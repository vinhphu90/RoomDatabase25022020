package com.examplevinhphutvp.roomdatabase25022020;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.net.HttpCookie;

public class MyViewModel extends ViewModel {
    private MutableLiveData<String>mutableLiveData ;

    public MyViewModel() {
        this.mutableLiveData = new MutableLiveData<>();
    }
    public  void setValueText(String text){
        mutableLiveData.setValue(text);
    }
    public  MutableLiveData <String>getValueText(){
        return mutableLiveData ;
    }
}
