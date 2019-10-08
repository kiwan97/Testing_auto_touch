package com.example.kiwankim.myapplication4;

import android.app.Instrumentation;
import android.hardware.input.InputManager;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.io.DataOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    LinearLayout ll;
    TextView tt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ll = findViewById(R.id.LLY);
        ll.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(),"Clicked",Toast.LENGTH_SHORT).show();
            }
        });
        final InputManager inputmanager;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {


            }
        }, 3000);


    }
    public void onClick(View v){
        Toast.makeText(getApplicationContext(),"Clicked",Toast.LENGTH_SHORT);
    }
}
