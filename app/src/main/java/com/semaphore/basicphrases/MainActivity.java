package com.semaphore.basicphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;

public class MainActivity extends AppCompatActivity {

    //create the playPhrase function
    public void playPhrase(View view){
        Button buttonPressed = (Button) view;

        // get the tag of the button that has been pressed
        Log.i("Button pressed", "Button: " + buttonPressed.getTag().toString());
        MediaPlayer mPlayer = MediaPlayer.create(this, getResources().getIdentifier(buttonPressed.getTag().toString(), "raw", getPackageName()));
        mPlayer.start();
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}