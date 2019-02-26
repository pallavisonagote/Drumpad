package com.example.drumpad;

import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;

    private SoundPool soundPool;
    private int sound1;
    private int sound2;
    private int sound3;
    private int sound4;
    private int sound5;
    private int sound6;
    private int sound7;
    private int sound8;
    private int sound9;
    private int sound10;
    private int sound11;
    private int sound12;

    private Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1=(Button)findViewById(R.id.play1);
        b2=(Button)findViewById(R.id.play2);
        b3=(Button)findViewById(R.id.play3);

        b4=(Button)findViewById(R.id.play4);
        b5=(Button)findViewById(R.id.play5);
        b6=(Button)findViewById(R.id.play6);

        b7=(Button)findViewById(R.id.play7);
        b8=(Button)findViewById(R.id.play8);
        b9=(Button)findViewById(R.id.play9);

        b10=(Button)findViewById(R.id.play10);
        b11=(Button)findViewById(R.id.play11);
        b12=(Button)findViewById(R.id.play12);

        soundPool=new SoundPool(2, AudioManager.STREAM_MUSIC,0);

        sound1=soundPool.load(getApplicationContext(),R.raw.sound1,1);
        sound2=soundPool.load(getApplicationContext(),R.raw.sound2,1);
        sound3=soundPool.load(getApplicationContext(),R.raw.sound3,1);
        sound4=soundPool.load(getApplicationContext(),R.raw.sound4,1);
        sound5=soundPool.load(getApplicationContext(),R.raw.sound12,1);
        sound6=soundPool.load(getApplicationContext(),R.raw.sound6,1);
        sound7=soundPool.load(getApplicationContext(),R.raw.sound7,1);
        sound8=soundPool.load(getApplicationContext(),R.raw.sound11,1);
        sound9=soundPool.load(getApplicationContext(),R.raw.sound9,1);
        sound10=soundPool.load(getApplicationContext(),R.raw.sound10,1);
        sound11=soundPool.load(getApplicationContext(),R.raw.sound8,1);
        sound12=soundPool.load(getApplicationContext(),R.raw.sound5,1);


        aSwitch=(Switch)findViewById(R.id.switch1);

            aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked==true){
                        Toast.makeText(getBaseContext(),"3D mode is on\n\n please use earphones",Toast.LENGTH_LONG).show();

                        Intent intent =new Intent(MainActivity.this,new1.class);

                        startActivity(intent);


                    }
                }
            });



            b1.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                        soundPool.play(sound1,1.0f,1.0f,0,0,0f);


                    return false;
                }
            });

            b2.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    soundPool.play(sound2,1.0f,1.0f,0,0,0f);

                    return false;
                }
            });

            b3.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    soundPool.play(sound3,1.0f,1.0f,0,0,0f);

                    return false;
                }
            });

            b4.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    soundPool.play(sound4,1.0f,1.0f,0,0,0f);

                    return false;
                }
            });

            b5.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    soundPool.play(sound5,1.0f,1.0f,0,0,1f);

                    return false;
                }
            });

            b6.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    soundPool.play(sound6,1.0f,1.0f,0,0,0f);

                    return false;
                }
            });

            b7.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    soundPool.play(sound7,1.0f,1.0f,0,0,0f);

                    return false;
                }
            });
            b8.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    soundPool.play(sound8,1.0f,1.0f,0,0,0f);

                    return false;
                }
            });

            b9.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    soundPool.play(sound9,2.0f,3.0f,0,0,0f);

                    return false;
                }
            });

            b10.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    soundPool.play(sound10,1.0f,1.0f,0,0,0f);

                    return false;
                }
            });

            b11.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    soundPool.play(sound11,1.0f,1.0f,0,0,0f);

                    return false;
                }
            });

            b12.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    soundPool.play(sound12,1.0f,1.0f,0,0,0f);

                    return false;
                }
            });
        }



}
