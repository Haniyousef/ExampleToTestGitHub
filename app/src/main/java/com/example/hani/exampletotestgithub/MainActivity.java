package com.example.hani.exampletotestgithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    private void testUpload(){
        int i=1+1 ;

        // make my first change in this file
        // notic >>>> the color of file name mean that there is change in file not add to github
        int x=2+2;

        // add this line and below to branch01 to show compare between this branch and master branch
        String z="test";
    }

}
