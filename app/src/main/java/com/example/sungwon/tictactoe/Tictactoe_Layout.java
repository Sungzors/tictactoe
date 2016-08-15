package com.example.sungwon.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Tictactoe_Layout extends AppCompatActivity {
    TextView mPlayerNameT;
    TextView mTurnWin;
    Button mButton1;
    Button mButton2;
    Button mButton3;
    Button mButton4;
    Button mButton5;
    Button mButton6;
    Button mButton7;
    Button mButton8;
    Button mButton9;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tictactoe__layout);
        mPlayerNameT = (TextView)findViewById(R.id.playerNameT);
        mTurnWin = (TextView)findViewById(R.id.turnwin);
        mButton1 = (Button)findViewById(R.id.button1);
        mButton2 = (Button)findViewById(R.id.button2);
        mButton3 = (Button)findViewById(R.id.button3);
        mButton4 = (Button)findViewById(R.id.button4);
        mButton5 = (Button)findViewById(R.id.button5);
        mButton6 = (Button)findViewById(R.id.button6);
        mButton7 = (Button)findViewById(R.id.button7);
        mButton8 = (Button)findViewById(R.id.button8);
        mButton9 = (Button)findViewById(R.id.button9);
        Intent intent = getIntent();
        final String p1 = intent.getStringExtra("player1");
        final String p2 = intent.getStringExtra("player2");
        CharSequence buttonchar1 = mButton1.getText();
        CharSequence buttonchar2 = mButton2.getText();
        CharSequence buttonchar3 = mButton3.getText();
        CharSequence buttonchar4 = mButton4.getText();
        CharSequence buttonchar5 = mButton5.getText();
        CharSequence buttonchar6 = mButton6.getText();
        CharSequence buttonchar7 = mButton7.getText();
        CharSequence buttonchar8 = mButton8.getText();
        CharSequence buttonchar9 = mButton9.getText();
        final TicTacToe ttt = new TicTacToe(buttonchar1, buttonchar2, buttonchar3, buttonchar4, buttonchar5, buttonchar6, buttonchar7, buttonchar8, buttonchar9);


        mPlayerNameT.setText(p1);

        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mPlayerNameT.getText().toString().equals(p1)) {
                    ttt.setmButton1("O");
                    mButton1.setText("O");
                    if (ttt.hasWon()) {
                        mTurnWin.setText(R.string.win);
                    } else if(!ttt.hasWon()){
                        mPlayerNameT.setText(p2);
                    }

                } else if (mPlayerNameT.getText().toString().equals(p2)) {
                    ttt.setmButton1("X");
                    mButton1.setText("X");
                    if (ttt.hasWon()) {
                        mTurnWin.setText(R.string.win);
                    } else if(!ttt.hasWon()){
                        mPlayerNameT.setText(p1);
                    }
                }
            }
        });
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mPlayerNameT.getText().toString().equals(p1)) {
                    ttt.setmButton2("O");
                    mButton2.setText("O");
                    if (ttt.hasWon()) {
                        mTurnWin.setText(R.string.win);
                    } else if(!ttt.hasWon()){
                        mPlayerNameT.setText(p2);
                    }

                } else if (mPlayerNameT.getText().toString().equals(p2)){
                    ttt.setmButton2("X");
                    mButton2.setText("X");
                    if (ttt.hasWon()) {
                        mTurnWin.setText(R.string.win);
                    } else if(!ttt.hasWon()){
                        mPlayerNameT.setText(p1);
                    }
                }
            }
        });
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mPlayerNameT.getText().toString().equals(p1)) {
                    ttt.setmButton3("O");
                    mButton3.setText("O");
                    if (ttt.hasWon()) {
                        mTurnWin.setText(R.string.win);
                    } else if(!ttt.hasWon()){
                        mPlayerNameT.setText(p2);
                    }

                } else if (mPlayerNameT.getText().toString().equals(p2)){
                    ttt.setmButton3("X");
                    mButton3.setText("X");
                    if (ttt.hasWon()) {
                        mTurnWin.setText(R.string.win);
                    } else if(!ttt.hasWon()){
                        mPlayerNameT.setText(p1);
                    }
                }
            }
        });
        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mPlayerNameT.getText().toString().equals(p1)) {
                    ttt.setmButton4("O");
                    mButton4.setText("O");
                    if (ttt.hasWon()) {
                        mTurnWin.setText(R.string.win);
                    } else if(!ttt.hasWon()){
                        mPlayerNameT.setText(p2);
                    }

                } else if (mPlayerNameT.getText().toString().equals(p2)){
                    ttt.setmButton4("X");
                    mButton4.setText("X");
                    if (ttt.hasWon()) {
                        mTurnWin.setText(R.string.win);
                    } else if(!ttt.hasWon()){
                        mPlayerNameT.setText(p1);
                    }
                }
            }
        });
        mButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mPlayerNameT.getText().toString().equals(p1)) {
                    ttt.setmButton5("O");
                    mButton5.setText("O");
                    if (ttt.hasWon()) {
                        mTurnWin.setText(R.string.win);
                    } else if(!ttt.hasWon()){
                        mPlayerNameT.setText(p2);
                    }

                } else if (mPlayerNameT.getText().toString().equals(p2)){
                    ttt.setmButton5("X");
                    mButton5.setText("X");
                    if (ttt.hasWon()) {
                        mTurnWin.setText(R.string.win);
                    } else if(!ttt.hasWon()){
                        mPlayerNameT.setText(p1);
                    }
                }
            }
        });
        mButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mPlayerNameT.getText().toString().equals(p1)) {
                    ttt.setmButton6("O");
                    mButton6.setText("O");
                    if (ttt.hasWon()) {
                        mTurnWin.setText(R.string.win);
                    } else if(!ttt.hasWon()){
                        mPlayerNameT.setText(p2);
                    }

                } else if (mPlayerNameT.getText().toString().equals(p2)){
                    ttt.setmButton6("X");
                    mButton6.setText("X");
                    if (ttt.hasWon()) {
                        mTurnWin.setText(R.string.win);
                    } else if(!ttt.hasWon()){
                        mPlayerNameT.setText(p1);
                    }
                }
            }
        });
        mButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mPlayerNameT.getText().toString().equals(p1)) {
                    ttt.setmButton7("O");
                    mButton7.setText("O");
                    if (ttt.hasWon()) {
                        mTurnWin.setText(R.string.win);
                    } else if(!ttt.hasWon()){
                        mPlayerNameT.setText(p2);
                    }

                } else if (mPlayerNameT.getText().toString().equals(p2)){
                    ttt.setmButton7("X");
                    mButton7.setText("X");
                    if (ttt.hasWon()) {
                        mTurnWin.setText(R.string.win);
                    } else if(!ttt.hasWon()){
                        mPlayerNameT.setText(p1);
                    }
                }
            }
        });
        mButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mPlayerNameT.getText().toString().equals(p1)) {
                    ttt.setmButton8("O");
                    mButton8.setText("O");
                    if (ttt.hasWon()) {
                        mTurnWin.setText(R.string.win);
                    } else if(!ttt.hasWon()){
                        mPlayerNameT.setText(p2);
                    }

                } else if (mPlayerNameT.getText().toString().equals(p2)){
                    ttt.setmButton8("X");
                    mButton8.setText("X");
                    if (ttt.hasWon()) {
                        mTurnWin.setText(R.string.win);
                    } else if(!ttt.hasWon()){
                        mPlayerNameT.setText(p1);
                    }
                }
            }
        });
        mButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mPlayerNameT.getText().toString().equals(p1)) {
                    ttt.setmButton9("O");
                    mButton9.setText("O");
                    if (ttt.hasWon()) {
                        mTurnWin.setText(R.string.win);
                    } else if(!ttt.hasWon()){
                        mPlayerNameT.setText(p2);
                    }

                } else if (mPlayerNameT.getText().toString().equals(p2)){
                    ttt.setmButton9("X");
                    mButton9.setText("X");
                    if (ttt.hasWon()) {
                        mTurnWin.setText(R.string.win);
                    } else if(!ttt.hasWon()){
                        mPlayerNameT.setText(p1);
                    }
                }
            }
        });
    }
}
