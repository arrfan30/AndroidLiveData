package com.journaldev.androidlivedata;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.journaldev.androidlivedata.databinding.DataBindingExampleBinding;

public class DataBindingMain extends AppCompatActivity {
    String TAG = "DataBindingMain";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DataBindingExampleBinding dataBindingExampleBinding = DataBindingUtil.setContentView(this, R.layout.data_binding_example);

        PersonPOJO personVO = new PersonPOJO("Elon Musk", "Entrepreneur, Engineer, Inventor, Investor");
        dataBindingExampleBinding.setPersonpojo(personVO);




    }
}
