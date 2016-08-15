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
    static int count = 0;
    Button mReset;
    private static final String KEY_TEXT_VALUE = "textValue";



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
        mReset = (Button)findViewById(R.id.resetButton);
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
//        if (savedInstanceState != null) {
//            CharSequence savedText = savedInstanceState.getCharSequence(KEY_TEXT_VALUE);
//            mButton1.setText(savedText);
//            mButton2.setText(savedText);
//            mButton3.setText(savedText);
//            mButton4.setText(savedText);
//            mButton5.setText(savedText);
//            mButton6.setText(savedText);
//            mButton7.setText(savedText);
//            mButton8.setText(savedText);
//            mButton9.setText(savedText);
//        }

        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mPlayerNameT.getText().toString().equals(p1)) {
                    ttt.setmButton1("O");
                    mButton1.setText("O");
                    if (ttt.hasWon()=='w') {
                        mTurnWin.setText(R.string.win);
                        mButton1.setEnabled(false);
                        mButton2.setEnabled(false);
                        mButton3.setEnabled(false);
                        mButton4.setEnabled(false);
                        mButton5.setEnabled(false);
                        mButton6.setEnabled(false);
                        mButton7.setEnabled(false);
                        mButton8.setEnabled(false);
                        mButton9.setEnabled(false);
                    } else if(ttt.hasWon()=='l'){
                        mPlayerNameT.setText(p2);
                        countClick();
                    }

                } else if (mPlayerNameT.getText().toString().equals(p2)) {
                    ttt.setmButton1("X");
                    mButton1.setText("X");
                    if (ttt.hasWon()=='w') {
                        mTurnWin.setText(R.string.win);
                        mButton1.setEnabled(false);
                        mButton2.setEnabled(false);
                        mButton3.setEnabled(false);
                        mButton4.setEnabled(false);
                        mButton5.setEnabled(false);
                        mButton6.setEnabled(false);
                        mButton7.setEnabled(false);
                        mButton8.setEnabled(false);
                        mButton9.setEnabled(false);
                    } else if(ttt.hasWon()=='l'){
                        mPlayerNameT.setText(p1);
                        countClick();
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
                    if (ttt.hasWon()=='w') {
                        mTurnWin.setText(R.string.win);
                        mButton1.setEnabled(false);
                        mButton2.setEnabled(false);
                        mButton3.setEnabled(false);
                        mButton4.setEnabled(false);
                        mButton5.setEnabled(false);
                        mButton6.setEnabled(false);
                        mButton7.setEnabled(false);
                        mButton8.setEnabled(false);
                        mButton9.setEnabled(false);
                    } else if(ttt.hasWon()=='l'){
                        mPlayerNameT.setText(p2);
                        countClick();
                    }

                } else if (mPlayerNameT.getText().toString().equals(p2)){
                    ttt.setmButton2("X");
                    mButton2.setText("X");
                    if (ttt.hasWon()=='w') {
                        mTurnWin.setText(R.string.win);
                        mButton1.setEnabled(false);
                        mButton2.setEnabled(false);
                        mButton3.setEnabled(false);
                        mButton4.setEnabled(false);
                        mButton5.setEnabled(false);
                        mButton6.setEnabled(false);
                        mButton7.setEnabled(false);
                        mButton8.setEnabled(false);
                        mButton9.setEnabled(false);
                    } else if(ttt.hasWon()=='l'){
                        mPlayerNameT.setText(p1);
                        countClick();
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
                    if (ttt.hasWon()=='w') {
                        mTurnWin.setText(R.string.win);
                        mButton1.setEnabled(false);
                        mButton2.setEnabled(false);
                        mButton3.setEnabled(false);
                        mButton4.setEnabled(false);
                        mButton5.setEnabled(false);
                        mButton6.setEnabled(false);
                        mButton7.setEnabled(false);
                        mButton8.setEnabled(false);
                        mButton9.setEnabled(false);
                    } else if(ttt.hasWon()=='l'){
                        mPlayerNameT.setText(p2);
                        countClick();
                    }

                } else if (mPlayerNameT.getText().toString().equals(p2)){
                    ttt.setmButton3("X");
                    mButton3.setText("X");
                    if (ttt.hasWon()=='w') {
                        mTurnWin.setText(R.string.win);
                        mButton1.setEnabled(false);
                        mButton2.setEnabled(false);
                        mButton3.setEnabled(false);
                        mButton4.setEnabled(false);
                        mButton5.setEnabled(false);
                        mButton6.setEnabled(false);
                        mButton7.setEnabled(false);
                        mButton8.setEnabled(false);
                        mButton9.setEnabled(false);
                    } else if(ttt.hasWon()=='l'){
                        mPlayerNameT.setText(p1);
                        countClick();
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
                    if (ttt.hasWon()=='w') {
                        mTurnWin.setText(R.string.win);
                        mButton1.setEnabled(false);
                        mButton2.setEnabled(false);
                        mButton3.setEnabled(false);
                        mButton4.setEnabled(false);
                        mButton5.setEnabled(false);
                        mButton6.setEnabled(false);
                        mButton7.setEnabled(false);
                        mButton8.setEnabled(false);
                        mButton9.setEnabled(false);
                    } else if(ttt.hasWon()=='l'){
                        mPlayerNameT.setText(p2);
                        countClick();
                    }

                } else if (mPlayerNameT.getText().toString().equals(p2)){
                    ttt.setmButton4("X");
                    mButton4.setText("X");
                    if (ttt.hasWon()=='w') {
                        mTurnWin.setText(R.string.win);
                        mButton1.setEnabled(false);
                        mButton2.setEnabled(false);
                        mButton3.setEnabled(false);
                        mButton4.setEnabled(false);
                        mButton5.setEnabled(false);
                        mButton6.setEnabled(false);
                        mButton7.setEnabled(false);
                        mButton8.setEnabled(false);
                        mButton9.setEnabled(false);
                    } else if(ttt.hasWon()=='l'){
                        mPlayerNameT.setText(p1);
                        countClick();
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
                    if (ttt.hasWon()=='w') {
                        mTurnWin.setText(R.string.win);
                        mButton1.setEnabled(false);
                        mButton2.setEnabled(false);
                        mButton3.setEnabled(false);
                        mButton4.setEnabled(false);
                        mButton5.setEnabled(false);
                        mButton6.setEnabled(false);
                        mButton7.setEnabled(false);
                        mButton8.setEnabled(false);
                        mButton9.setEnabled(false);
                    } else if(ttt.hasWon()=='l'){
                        mPlayerNameT.setText(p2);
                        countClick();
                    }

                } else if (mPlayerNameT.getText().toString().equals(p2)){
                    ttt.setmButton5("X");
                    mButton5.setText("X");
                    if (ttt.hasWon()=='w') {
                        mTurnWin.setText(R.string.win);
                        mButton1.setEnabled(false);
                        mButton2.setEnabled(false);
                        mButton3.setEnabled(false);
                        mButton4.setEnabled(false);
                        mButton5.setEnabled(false);
                        mButton6.setEnabled(false);
                        mButton7.setEnabled(false);
                        mButton8.setEnabled(false);
                        mButton9.setEnabled(false);
                    } else if(ttt.hasWon()=='l'){
                        mPlayerNameT.setText(p1);
                        countClick();
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
                    if (ttt.hasWon()=='w') {
                        mTurnWin.setText(R.string.win);
                        mButton1.setEnabled(false);
                        mButton2.setEnabled(false);
                        mButton3.setEnabled(false);
                        mButton4.setEnabled(false);
                        mButton5.setEnabled(false);
                        mButton6.setEnabled(false);
                        mButton7.setEnabled(false);
                        mButton8.setEnabled(false);
                        mButton9.setEnabled(false);
                    } else if(ttt.hasWon()=='l'){
                        mPlayerNameT.setText(p2);
                        countClick();
                    }

                } else if (mPlayerNameT.getText().toString().equals(p2)){
                    ttt.setmButton6("X");
                    mButton6.setText("X");
                    if (ttt.hasWon()=='w') {
                        mTurnWin.setText(R.string.win);
                        mButton1.setEnabled(false);
                        mButton2.setEnabled(false);
                        mButton3.setEnabled(false);
                        mButton4.setEnabled(false);
                        mButton5.setEnabled(false);
                        mButton6.setEnabled(false);
                        mButton7.setEnabled(false);
                        mButton8.setEnabled(false);
                        mButton9.setEnabled(false);
                    } else if(ttt.hasWon()=='l'){
                        mPlayerNameT.setText(p1);
                        countClick();
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
                    if (ttt.hasWon()=='w') {
                        mTurnWin.setText(R.string.win);
                        mButton1.setEnabled(false);
                        mButton2.setEnabled(false);
                        mButton3.setEnabled(false);
                        mButton4.setEnabled(false);
                        mButton5.setEnabled(false);
                        mButton6.setEnabled(false);
                        mButton7.setEnabled(false);
                        mButton8.setEnabled(false);
                        mButton9.setEnabled(false);
                    } else if(ttt.hasWon()=='l'){
                        mPlayerNameT.setText(p2);
                        countClick();
                    }

                } else if (mPlayerNameT.getText().toString().equals(p2)){
                    ttt.setmButton7("X");
                    mButton7.setText("X");
                    if (ttt.hasWon()=='w') {
                        mTurnWin.setText(R.string.win);
                        mButton1.setEnabled(false);
                        mButton2.setEnabled(false);
                        mButton3.setEnabled(false);
                        mButton4.setEnabled(false);
                        mButton5.setEnabled(false);
                        mButton6.setEnabled(false);
                        mButton7.setEnabled(false);
                        mButton8.setEnabled(false);
                        mButton9.setEnabled(false);
                    } else if(ttt.hasWon()=='l'){
                        mPlayerNameT.setText(p1);
                        countClick();
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
                    if (ttt.hasWon()=='w') {
                        mTurnWin.setText(R.string.win);
                        mButton1.setEnabled(false);
                        mButton2.setEnabled(false);
                        mButton3.setEnabled(false);
                        mButton4.setEnabled(false);
                        mButton5.setEnabled(false);
                        mButton6.setEnabled(false);
                        mButton7.setEnabled(false);
                        mButton8.setEnabled(false);
                        mButton9.setEnabled(false);
                    } else if(ttt.hasWon()=='l'){
                        mPlayerNameT.setText(p2);
                        countClick();
                    }

                } else if (mPlayerNameT.getText().toString().equals(p2)){
                    ttt.setmButton8("X");
                    mButton8.setText("X");
                    if (ttt.hasWon()=='w') {
                        mTurnWin.setText(R.string.win);
                        mButton1.setEnabled(false);
                        mButton2.setEnabled(false);
                        mButton3.setEnabled(false);
                        mButton4.setEnabled(false);
                        mButton5.setEnabled(false);
                        mButton6.setEnabled(false);
                        mButton7.setEnabled(false);
                        mButton8.setEnabled(false);
                        mButton9.setEnabled(false);
                    } else if(ttt.hasWon()=='l'){
                        mPlayerNameT.setText(p1);
                        countClick();
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
                    if (ttt.hasWon()=='w') {
                        mTurnWin.setText(R.string.win);
                        mButton1.setEnabled(false);
                        mButton2.setEnabled(false);
                        mButton3.setEnabled(false);
                        mButton4.setEnabled(false);
                        mButton5.setEnabled(false);
                        mButton6.setEnabled(false);
                        mButton7.setEnabled(false);
                        mButton8.setEnabled(false);
                        mButton9.setEnabled(false);
                    } else if(ttt.hasWon()=='l'){
                        mPlayerNameT.setText(p2);
                        countClick();
                    }

                } else if (mPlayerNameT.getText().toString().equals(p2)){
                    ttt.setmButton9("X");
                    mButton9.setText("X");
                    if (ttt.hasWon()=='w') {
                        mTurnWin.setText(R.string.win);
                        mButton1.setEnabled(false);
                        mButton2.setEnabled(false);
                        mButton3.setEnabled(false);
                        mButton4.setEnabled(false);
                        mButton5.setEnabled(false);
                        mButton6.setEnabled(false);
                        mButton7.setEnabled(false);
                        mButton8.setEnabled(false);
                        mButton9.setEnabled(false);
                    } else if(ttt.hasWon()=='l'){
                        mPlayerNameT.setText(p1);
                        countClick();
                    }
                }

            }
        });
        mReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = 0;
                ttt.winning = 'l';
                mTurnWin.setText(R.string.turnwin);
                ttt.setmButton1("");
                mButton1.setText("");
                ttt.setmButton2("");
                mButton2.setText("");
                ttt.setmButton3("");
                mButton3.setText("");
                ttt.setmButton4("");
                mButton4.setText("");
                ttt.setmButton5("");
                mButton5.setText("");
                ttt.setmButton6("");
                mButton6.setText("");
                ttt.setmButton7("");
                mButton7.setText("");
                ttt.setmButton8("");
                mButton8.setText("");
                ttt.setmButton9("");
                mButton9.setText("");
                mPlayerNameT.setText(p1);
                mButton1.setEnabled(true);
                mButton2.setEnabled(true);
                mButton3.setEnabled(true);
                mButton4.setEnabled(true);
                mButton5.setEnabled(true);
                mButton6.setEnabled(true);
                mButton7.setEnabled(true);
                mButton8.setEnabled(true);
                mButton9.setEnabled(true);
            }
        });

    }

    public void countClick(){
        count++;
        if (count== 9){
            mTurnWin.setText(R.string.draw);
            mPlayerNameT.setText("");
            mButton1.setEnabled(false);
            mButton2.setEnabled(false);
            mButton3.setEnabled(false);
            mButton4.setEnabled(false);
            mButton5.setEnabled(false);
            mButton6.setEnabled(false);
            mButton7.setEnabled(false);
            mButton8.setEnabled(false);
            mButton9.setEnabled(false);
        }
    }

//    protected void onSaveInstanceState (Bundle outState) {
//        super.onSaveInstanceState(outState);
//        outState.putCharSequence(KEY_TEXT_VALUE, mButton1.getText());
//        outState.putCharSequence(KEY_TEXT_VALUE, mButton2.getText());
//        outState.putCharSequence(KEY_TEXT_VALUE, mButton3.getText());
//        outState.putCharSequence(KEY_TEXT_VALUE, mButton4.getText());
//        outState.putCharSequence(KEY_TEXT_VALUE, mButton5.getText());
//        outState.putCharSequence(KEY_TEXT_VALUE, mButton6.getText());
//        outState.putCharSequence(KEY_TEXT_VALUE, mButton7.getText());
//        outState.putCharSequence(KEY_TEXT_VALUE, mButton8.getText());
//        outState.putCharSequence(KEY_TEXT_VALUE, mButton9.getText());
//    }
}
