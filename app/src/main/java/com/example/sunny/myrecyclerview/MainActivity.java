package com.example.sunny.myrecyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.sunny.myrecyclerview.anim.AnimActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goAnim(View view){
        Intent intent = new Intent(this, AnimActivity.class);
        startActivity(intent);
    }

    public void goA(View view){

    }

    public void goB(View view){

    }
}
