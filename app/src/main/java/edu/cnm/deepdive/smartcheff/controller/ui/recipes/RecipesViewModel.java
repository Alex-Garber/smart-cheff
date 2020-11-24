package edu.cnm.deepdive.smartcheff.controller.ui.recipes;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RecipesViewModel extends ViewModel {

  private MutableLiveData<String> mText;

  public RecipesViewModel() {
    mText = new MutableLiveData<>();
    mText.setValue("");
  }

  public LiveData<String> getText() {
    return mText;
  }
}