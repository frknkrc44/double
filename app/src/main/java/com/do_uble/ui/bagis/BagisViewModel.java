package com.do_uble.ui.bagis;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BagisViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public BagisViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is bagis fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}