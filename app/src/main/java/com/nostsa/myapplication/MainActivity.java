package com.nostsa.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.view.Display;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

import static android.os.SystemClock.sleep;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    public void pata(View view) {
        TextView tv1 = (TextView) findViewById(R.id.tv1);
        TextView tv2 = (TextView) findViewById(R.id.tv2);
        TextView tv3 = (TextView) findViewById(R.id.tv3);
        TextView tv4 = (TextView) findViewById(R.id.tv4);
        TextView tv5 = (TextView) findViewById(R.id.tv5);
        TextView tv6 = (TextView) findViewById(R.id.tv6);
        TextView tv7 = (TextView) findViewById(R.id.tv7);
        TextView tv8 = (TextView) findViewById(R.id.tv8);
        TextView tv9 = (TextView) findViewById(R.id.tv9);
        TextView tv10 = (TextView) findViewById(R.id.tv10);
        TextView tv11 = (TextView) findViewById(R.id.tv11);
        TextView tv12 = (TextView) findViewById(R.id.tv12);
        TextView tv13 = (TextView) findViewById(R.id.tv13);



        if(tv1.getVisibility()==View.VISIBLE){
            tv1.setVisibility(View.INVISIBLE);
        } else if(tv2.getVisibility()==View.VISIBLE){
            tv2.setVisibility(View.INVISIBLE);
        }else if(tv3.getVisibility()==View.VISIBLE){
            tv3.setVisibility(View.INVISIBLE);
        }else if(tv4.getVisibility()==View.VISIBLE){
            tv4.setVisibility(View.INVISIBLE);
        }else if(tv5.getVisibility()==View.VISIBLE){
            tv5.setVisibility(View.INVISIBLE);
        } else if(tv6.getVisibility()==View.VISIBLE){
            tv6.setVisibility(View.INVISIBLE);
        }else if(tv7.getVisibility()==View.VISIBLE){
            tv7.setVisibility(View.INVISIBLE);
        }else if(tv8.getVisibility()==View.VISIBLE){
            tv8.setVisibility(View.INVISIBLE);
        }else if(tv9.getVisibility()==View.VISIBLE){
            tv9.setVisibility(View.INVISIBLE);
        }else if(tv10.getVisibility()==View.VISIBLE){
            tv10.setVisibility(View.INVISIBLE);
        }else if(tv11.getVisibility()==View.VISIBLE){
            tv11.setVisibility(View.INVISIBLE);
        }else if(tv12.getVisibility()==View.VISIBLE){
            tv12.setVisibility(View.INVISIBLE);
        }else if(tv13.getVisibility()==View.VISIBLE){
            tv13.setVisibility(View.INVISIBLE);
        }




        ImageView img = (ImageView) findViewById(R.id.imageView);
        TranslateAnimation animation = new TranslateAnimation(0.0f, 70.0f,
                0.0f, 0.0f);          //  new TranslateAnimation(xFrom,xTo, yFrom,yTo)
        animation.setDuration(100);  // animation duration
        animation.setRepeatCount(5);  // animation repeat count
        animation.setRepeatMode(2);   // repeat animation (left to right, right to left )
        //animation.setFillAfter(true);


        img.startAnimation(animation);  // start animation

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
               Answer();
            }
        }, 700);


    }



    public void Answer() {
    Random r = new Random();
    int random = r.nextInt(13-0)+0;

        TextView tv1 = (TextView) findViewById(R.id.tv1);
        TextView tv2 = (TextView) findViewById(R.id.tv2);
        TextView tv3 = (TextView) findViewById(R.id.tv3);
        TextView tv4 = (TextView) findViewById(R.id.tv4);
        TextView tv5 = (TextView) findViewById(R.id.tv5);
        TextView tv6 = (TextView) findViewById(R.id.tv6);
        TextView tv7 = (TextView) findViewById(R.id.tv7);
        TextView tv8 = (TextView) findViewById(R.id.tv8);
        TextView tv9 = (TextView) findViewById(R.id.tv9);
        TextView tv10 = (TextView) findViewById(R.id.tv10);
        TextView tv11 = (TextView) findViewById(R.id.tv11);
        TextView tv12 = (TextView) findViewById(R.id.tv12);
        TextView tv13 = (TextView) findViewById(R.id.tv13);



    if (random == 0) {
        tv1.setVisibility(View.VISIBLE);
        tv2.setVisibility(View.INVISIBLE);
        tv3.setVisibility(View.INVISIBLE);
        tv4.setVisibility(View.INVISIBLE);
        tv5.setVisibility(View.INVISIBLE);
        tv6.setVisibility(View.INVISIBLE);
        tv7.setVisibility(View.INVISIBLE);
        tv8.setVisibility(View.INVISIBLE);
        tv9.setVisibility(View.INVISIBLE);
        tv10.setVisibility(View.INVISIBLE);
        tv11.setVisibility(View.INVISIBLE);
        tv12.setVisibility(View.INVISIBLE);
        tv13.setVisibility(View.INVISIBLE);
    } else if (random == 1) {
        tv2.setVisibility(View.VISIBLE);
        tv1.setVisibility(View.INVISIBLE);
        tv3.setVisibility(View.INVISIBLE);
        tv4.setVisibility(View.INVISIBLE);
        tv5.setVisibility(View.INVISIBLE);
        tv6.setVisibility(View.INVISIBLE);
        tv7.setVisibility(View.INVISIBLE);
        tv8.setVisibility(View.INVISIBLE);
        tv9.setVisibility(View.INVISIBLE);
        tv10.setVisibility(View.INVISIBLE);
        tv11.setVisibility(View.INVISIBLE);
        tv12.setVisibility(View.INVISIBLE);
        tv13.setVisibility(View.INVISIBLE);
    } else if (random == 2) {
        tv3.setVisibility(View.VISIBLE);
        tv1.setVisibility(View.INVISIBLE);
        tv2.setVisibility(View.INVISIBLE);
        tv4.setVisibility(View.INVISIBLE);
        tv5.setVisibility(View.INVISIBLE);
        tv6.setVisibility(View.INVISIBLE);
        tv7.setVisibility(View.INVISIBLE);
        tv8.setVisibility(View.INVISIBLE);
        tv9.setVisibility(View.INVISIBLE);
        tv10.setVisibility(View.INVISIBLE);
        tv11.setVisibility(View.INVISIBLE);
        tv12.setVisibility(View.INVISIBLE);
        tv13.setVisibility(View.INVISIBLE);
    } else if (random == 3) {
        tv4.setVisibility(View.VISIBLE);
        tv3.setVisibility(View.INVISIBLE);
        tv2.setVisibility(View.INVISIBLE);
        tv1.setVisibility(View.INVISIBLE);
        tv5.setVisibility(View.INVISIBLE);
        tv6.setVisibility(View.INVISIBLE);
        tv7.setVisibility(View.INVISIBLE);
        tv8.setVisibility(View.INVISIBLE);
        tv9.setVisibility(View.INVISIBLE);
        tv10.setVisibility(View.INVISIBLE);
        tv11.setVisibility(View.INVISIBLE);
        tv12.setVisibility(View.INVISIBLE);
        tv13.setVisibility(View.INVISIBLE);
    }else if (random == 4) {
        tv4.setVisibility(View.INVISIBLE);
        tv3.setVisibility(View.INVISIBLE);
        tv2.setVisibility(View.INVISIBLE);
        tv1.setVisibility(View.INVISIBLE);
        tv5.setVisibility(View.VISIBLE);
        tv6.setVisibility(View.INVISIBLE);
        tv7.setVisibility(View.INVISIBLE);
        tv8.setVisibility(View.INVISIBLE);
        tv9.setVisibility(View.INVISIBLE);
        tv10.setVisibility(View.INVISIBLE);
        tv11.setVisibility(View.INVISIBLE);
        tv12.setVisibility(View.INVISIBLE);
        tv13.setVisibility(View.INVISIBLE);
    }else if (random == 5) {
        tv4.setVisibility(View.INVISIBLE);
        tv3.setVisibility(View.INVISIBLE);
        tv2.setVisibility(View.INVISIBLE);
        tv1.setVisibility(View.INVISIBLE);
        tv5.setVisibility(View.INVISIBLE);
        tv6.setVisibility(View.VISIBLE);
        tv7.setVisibility(View.INVISIBLE);
        tv8.setVisibility(View.INVISIBLE);
        tv9.setVisibility(View.INVISIBLE);
        tv10.setVisibility(View.INVISIBLE);
        tv11.setVisibility(View.INVISIBLE);
        tv12.setVisibility(View.INVISIBLE);
        tv13.setVisibility(View.INVISIBLE);
    }else if (random == 6) {
        tv4.setVisibility(View.INVISIBLE);
        tv3.setVisibility(View.INVISIBLE);
        tv2.setVisibility(View.INVISIBLE);
        tv1.setVisibility(View.INVISIBLE);
        tv5.setVisibility(View.INVISIBLE);
        tv6.setVisibility(View.INVISIBLE);
        tv7.setVisibility(View.VISIBLE);
        tv8.setVisibility(View.INVISIBLE);
        tv9.setVisibility(View.INVISIBLE);
        tv10.setVisibility(View.INVISIBLE);
        tv11.setVisibility(View.INVISIBLE);
        tv12.setVisibility(View.INVISIBLE);
        tv13.setVisibility(View.INVISIBLE);
    }else if (random == 7) {
        tv4.setVisibility(View.INVISIBLE);
        tv3.setVisibility(View.INVISIBLE);
        tv2.setVisibility(View.INVISIBLE);
        tv1.setVisibility(View.INVISIBLE);
        tv5.setVisibility(View.INVISIBLE);
        tv6.setVisibility(View.INVISIBLE);
        tv7.setVisibility(View.INVISIBLE);
        tv8.setVisibility(View.VISIBLE);
        tv9.setVisibility(View.INVISIBLE);
        tv10.setVisibility(View.INVISIBLE);
        tv11.setVisibility(View.INVISIBLE);
        tv12.setVisibility(View.INVISIBLE);
        tv13.setVisibility(View.INVISIBLE);
    }else if (random == 8) {
        tv4.setVisibility(View.INVISIBLE);
        tv3.setVisibility(View.INVISIBLE);
        tv2.setVisibility(View.INVISIBLE);
        tv1.setVisibility(View.INVISIBLE);
        tv5.setVisibility(View.INVISIBLE);
        tv6.setVisibility(View.INVISIBLE);
        tv7.setVisibility(View.INVISIBLE);
        tv8.setVisibility(View.INVISIBLE);
        tv9.setVisibility(View.VISIBLE);
        tv10.setVisibility(View.INVISIBLE);
        tv11.setVisibility(View.INVISIBLE);
        tv12.setVisibility(View.INVISIBLE);
        tv13.setVisibility(View.INVISIBLE);
    }else if (random == 9) {
        tv4.setVisibility(View.INVISIBLE);
        tv3.setVisibility(View.INVISIBLE);
        tv2.setVisibility(View.INVISIBLE);
        tv1.setVisibility(View.INVISIBLE);
        tv5.setVisibility(View.INVISIBLE);
        tv6.setVisibility(View.INVISIBLE);
        tv7.setVisibility(View.INVISIBLE);
        tv8.setVisibility(View.INVISIBLE);
        tv9.setVisibility(View.INVISIBLE);
        tv10.setVisibility(View.VISIBLE);
        tv11.setVisibility(View.INVISIBLE);
        tv12.setVisibility(View.INVISIBLE);
        tv13.setVisibility(View.INVISIBLE);
    }else if (random == 10) {
        tv4.setVisibility(View.INVISIBLE);
        tv3.setVisibility(View.INVISIBLE);
        tv2.setVisibility(View.INVISIBLE);
        tv1.setVisibility(View.INVISIBLE);
        tv5.setVisibility(View.INVISIBLE);
        tv6.setVisibility(View.INVISIBLE);
        tv7.setVisibility(View.INVISIBLE);
        tv8.setVisibility(View.INVISIBLE);
        tv9.setVisibility(View.INVISIBLE);
        tv10.setVisibility(View.INVISIBLE);
        tv11.setVisibility(View.VISIBLE);
        tv12.setVisibility(View.INVISIBLE);
        tv13.setVisibility(View.INVISIBLE);
    }else if (random == 11) {
        tv4.setVisibility(View.INVISIBLE);
        tv3.setVisibility(View.INVISIBLE);
        tv2.setVisibility(View.INVISIBLE);
        tv1.setVisibility(View.INVISIBLE);
        tv5.setVisibility(View.INVISIBLE);
        tv6.setVisibility(View.INVISIBLE);
        tv7.setVisibility(View.INVISIBLE);
        tv8.setVisibility(View.INVISIBLE);
        tv9.setVisibility(View.INVISIBLE);
        tv10.setVisibility(View.INVISIBLE);
        tv11.setVisibility(View.INVISIBLE);
        tv12.setVisibility(View.VISIBLE);
        tv13.setVisibility(View.INVISIBLE);
    }else if (random == 12) {
        tv4.setVisibility(View.INVISIBLE);
        tv3.setVisibility(View.INVISIBLE);
        tv2.setVisibility(View.INVISIBLE);
        tv1.setVisibility(View.INVISIBLE);
        tv5.setVisibility(View.INVISIBLE);
        tv6.setVisibility(View.INVISIBLE);
        tv7.setVisibility(View.INVISIBLE);
        tv8.setVisibility(View.INVISIBLE);
        tv9.setVisibility(View.INVISIBLE);
        tv10.setVisibility(View.INVISIBLE);
        tv11.setVisibility(View.INVISIBLE);
        tv12.setVisibility(View.INVISIBLE);
        tv13.setVisibility(View.VISIBLE);
    }





}
}
