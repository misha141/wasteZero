package com.example.wastezero;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;


public class SignInfragment extends Fragment {

    public SignInfragment() {
        //Required construtor
    }

    ImageButton crossButton;
    EditText editPhoneNumber;
    EditText editPassword;
    Button SignInButton;
    private FrameLayout parentFrameLayout;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sign_infragment, container, false);
        crossButton = view.findViewById(R.id.button_cross_signin);
        editPhoneNumber = view.findViewById(R.id.phone_number_sigin);
        editPassword = view.findViewById(R.id.password_signin);
        SignInButton = view.findViewById(R.id.button_singin);



        return view;

    }

}
