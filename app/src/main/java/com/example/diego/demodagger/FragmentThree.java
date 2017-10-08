package com.example.diego.demodagger;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import javax.inject.Inject;


public class FragmentThree extends Fragment {

    @Inject
    ProvidedObj providedObj;
    @Inject
    ProvidedBObj providedBObj;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Injector.getParentBComponent().inject(this);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_layout, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        TextView textView = (TextView) getView().findViewById(R.id.text_view);
        textView.setText("ParentB\n" +
                "ProvideObj HashCode: " + providedObj.hashCode()
                + "\nProvidedObjB HashCode: " + Integer.toString(providedBObj.hashCode()));
    }
}
