package com.sigaon.modelo;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by user on 02/09/2016.
 */
public class Form_1 extends Fragment  {


    private Context baseContext;

    public View onCreateView (LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState ) {

            View scrollView = inflater.inflate(R.layout.form_1, container, false);

            this.baseContext = getActivity();

            Button btn = (Button) scrollView.findViewById(R.id.btn_form2);

            btn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    Form_2 fragment = new Form_2();

                    FragmentManager fragmentManager = getFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.flContent, fragment);
                    fragmentTransaction.commit();
                    ((FragmentActivity)baseContext).setTitle("Form 2");
                }
            });

            return scrollView;
        }


}

