package com.example.event_handling;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements
 GestureDetector.OnGestureListener , GestureDetector.OnDoubleTapListener{
    private TextView tv;
    private GestureDetector gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
Toast.makeText(MainActivity.this, "Firebase connection successful" ,Toast.LENGTH_LONG).show();
        //mapping screen component to object
        tv=(TextView) findViewById(R.id.msg);
        this.gestureDetector =new GestureDetector(this,this);
        gestureDetector.setOnDoubleTapListener(this);

        //getting value of id
        Button myButton=findViewById(R.id.click);

        //set the event handle "set-onClick"
        myButton.setOnClickListener(
                //specify the interface method
            new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView myText =findViewById(R.id.editText);
                    myText.setText("saved");
                    myText.setTextSize(30);
                }
            });

    }
    @Override
    public boolean onTouchEvent( MotionEvent event){
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        tv.setText("single tap");
        //write the function u needed
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        tv.setText("double tap");
        //write ur functions
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        tv.setText("double tap");
        //write ur functions here
        return false;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {

        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        tv.setText("scroll down");
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        tv.setText("Long press");

    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        tv.setText("Flinging");
        return false;
    }
}
