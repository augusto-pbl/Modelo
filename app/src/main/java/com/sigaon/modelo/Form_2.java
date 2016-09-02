package com.sigaon.modelo;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by user on 02/09/2016.
 */
public class Form_2 extends Fragment {
    private Context baseContext;

    public View onCreateView (LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState ) {

        View scrollView = inflater.inflate(R.layout.form_2, container, false);

        this.baseContext = getActivity();


        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        return scrollView;
    }
}
