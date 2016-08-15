package com.example.sungwon.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText mPlayer1;
    EditText mPlayer2;
    Button mStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPlayer1 = (EditText)findViewById(R.id.player1Name);
        mPlayer2 = (EditText)findViewById(R.id.player2Name);
        mStart = (Button)findViewById(R.id.startButton);
    }
}
