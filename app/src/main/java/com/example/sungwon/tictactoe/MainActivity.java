package com.example.sungwon.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
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

        mStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Tictactoe_Layout.class);
                String s = mPlayer1.getText().toString();
                String t = mPlayer2.getText().toString();
                intent.putExtra("player1", s);
                intent.putExtra("player2", t);
                startActivity(intent);
            }
        });
    }
}
