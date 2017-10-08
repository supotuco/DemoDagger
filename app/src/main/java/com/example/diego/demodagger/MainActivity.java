package com.example.diego.demodagger;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Injector.initialize();
        Fragment fragment = new FragmentOne();


        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container_1, fragment)
                .commit();

        fragment = new FragmentTwo();

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container_2, fragment)
                .commit();

        fragment = new FragmentThree();

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container_3_1, fragment)
                .commit();

        fragment = new FragmentThree();

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container_3_2, fragment)
                .commit();

        fragment = new FragmentFour();

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container_4_1, fragment)
                .commit();

        fragment = new FragmentFour();

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container_4_2, fragment)
                .commit();
    }
}
