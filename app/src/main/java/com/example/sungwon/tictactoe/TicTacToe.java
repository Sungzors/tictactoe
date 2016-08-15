package com.example.sungwon.tictactoe;

/**
 * Created by SungWon on 8/14/2016.
 */
public class TicTacToe {

    CharSequence mButton1;
    CharSequence mButton2;
    CharSequence mButton3;
    CharSequence mButton4;
    CharSequence mButton5;
    CharSequence mButton6;
    CharSequence mButton7;
    CharSequence mButton8;
    CharSequence mButton9;
    char winning = 'l';
    CharSequence[] buttonArray = {mButton1, mButton2, mButton3, mButton4, mButton5, mButton6, mButton7, mButton8, mButton9};
    

    public TicTacToe(CharSequence mButton1, CharSequence mButton2, CharSequence mButton3, CharSequence mButton4, CharSequence mButton5, CharSequence mButton6, CharSequence mButton7, CharSequence mButton8, CharSequence mButton9) {
        this.mButton1 = mButton1;
        this.mButton2 = mButton2;
        this.mButton3 = mButton3;
        this.mButton4 = mButton4;
        this.mButton5 = mButton5;
        this.mButton6 = mButton6;
        this.mButton7 = mButton7;
        this.mButton8 = mButton8;
        this.mButton9 = mButton9;
    }

// String mButton1, String mButton2, String mButton3, String mButton4, String mButton5, String mButton6, String mButton7, String mButton8, String mButton9


    public CharSequence getmButton1() {
        return mButton1;
    }

    public void setmButton1(CharSequence mButton1){
        this.mButton1 = mButton1;
    }

    public CharSequence getmButton2() {
        return mButton2;
    }

    public void setmButton2(CharSequence mButton2) {
        this.mButton2 = mButton2;
    }

    public CharSequence getmButton3() {
        return mButton3;
    }

    public void setmButton3(CharSequence mButton3) {
        this.mButton3 = mButton3;
    }

    public CharSequence getmButton4() {
        return mButton4;
    }

    public void setmButton4(CharSequence mButton4) {
        this.mButton4 = mButton4;
    }

    public CharSequence getmButton5() {
        return mButton5;
    }

    public void setmButton5(CharSequence mButton5) {
        this.mButton5 = mButton5;
    }

    public CharSequence getmButton6() {
        return mButton6;
    }

    public void setmButton6(CharSequence mButton6) {
        this.mButton6 = mButton6;
    }

    public CharSequence getmButton7() {
        return mButton7;
    }

    public void setmButton7(CharSequence mButton7) {
        this.mButton7 = mButton7;
    }

    public CharSequence getmButton8() {
        return mButton8;
    }

    public void setmButton8(CharSequence mButton8) {
        this.mButton8 = mButton8;
    }

    public CharSequence getmButton9() {
        return mButton9;
    }

    public void setmButton9(CharSequence mButton9) {
        this.mButton9 = mButton9;
    }
    

    public char hasWon(){

        if (mButton1.toString().equals("O")) {
            if (mButton4.toString().equals("O") && mButton7.toString().equals("O")) {
                winning = 'w';
            } else if (mButton2.toString().equals("O") && mButton3.toString().equals("O")) {
                winning = 'w';
            } else if (mButton5.toString().equals("O") && mButton9.toString().equals("O")) {
                winning = 'w';
            }
        } else if (mButton1.toString().equals("X")) {
            if (mButton4.toString().equals("X") && mButton7.toString().equals("X")) {
                winning = 'w';
            } else if (mButton2.toString().equals("X") && mButton3.toString().equals("X")) {
                winning = 'w';
            } else if (mButton5.toString().equals("X") && mButton9.toString().equals("X")) {
                winning = 'w';
            }
        }
        if (mButton2.toString().equals("O")) {
            if (mButton5.toString().equals("O") && mButton8.toString().equals("O")) {
                winning = 'w';
            }
        } else if (mButton2.toString().equals("X")) {
            if (mButton5.toString().equals("X") && mButton8.toString().equals("X")) {
                winning = 'w';
            }
        }
        if (mButton3.toString().equals("O")) {
            if (mButton6.toString().equals("O") && mButton9.toString().equals("O")) {
                winning = 'w';
            } else if (mButton5.toString().equals("O") && mButton7.toString().equals("O")) {
                winning = 'w';
            }
        } else if (mButton3.toString().equals("X")) {
            if (mButton6.toString().equals("X") && mButton9.toString().equals("X")) {
                winning = 'w';
            } else if (mButton5.toString().equals("X") && mButton7.toString().equals("X")) {
                winning = 'w';
            }
        }
        if (mButton4.toString().equals("O")) {
            if (mButton5.toString().equals("O") && mButton6.toString().equals("O")) {
                winning = 'w';
            }
        } else if (mButton4.toString().equals("X")) {
            if (mButton5.toString().equals("X") && mButton6.toString().equals("X")) {
                winning = 'w';
            }
        }
        if (mButton7.toString().equals("O")) {
            if (mButton8.toString().equals("O") && mButton9.toString().equals("O")) {
                winning = 'w';
            }
        } else if (mButton7.toString().equals("X")) {
            if (mButton8.toString().equals("X") && mButton9.toString().equals("X")) {
                winning = 'w';
            }
        }
        return winning;
    }
}
