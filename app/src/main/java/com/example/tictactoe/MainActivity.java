package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    int activePlayer = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.btn1) {
            btn1.setText(String.valueOf(activePlayer));
            btn1.setEnabled(false);
        }
        else if (view.getId() == R.id.btn2) {
            btn2.setText(String.valueOf(activePlayer));
            btn2.setEnabled(false);
        }
        else if (view.getId() == R.id.btn3) {
            btn3.setText(String.valueOf(activePlayer));
            btn3.setEnabled(false);
        } else if (view.getId() == R.id.btn4) {
            btn4.setText(String.valueOf(activePlayer));
            btn4.setEnabled(false);
        }
        else if (view.getId() == R.id.btn5) {
            btn5.setText(String.valueOf(activePlayer));
            btn5.setEnabled(false);
        }
        else if (view.getId() == R.id.btn6) {
            btn6.setText(String.valueOf(activePlayer));
            btn6.setEnabled(false);
        }
        else if (view.getId() == R.id.btn7) {
            btn7.setText(String.valueOf(activePlayer));
            btn7.setEnabled(false);
        } else if (view.getId() == R.id.btn8) {
            btn8.setText(String.valueOf(activePlayer));
            btn8.setEnabled(false);
        }
        else if(view.getId() == R.id.btn9) {
            btn9.setText(String.valueOf(activePlayer));
            btn9.setEnabled(false);
        }

        if (activePlayer == 0)
            activePlayer = 1;
        else
            activePlayer = 0;

        int result = checkWin();

        if (result == 0) {
            Toast.makeText(this, "No winner, game is continuting", Toast.LENGTH_SHORT).show();
        } else {
            btn1.setEnabled(true);
            btn1.setText("1");
            btn2.setEnabled(true);
            btn2.setText("2");
            btn3.setEnabled(true);
            btn3.setText("3");
            btn4.setEnabled(true);
            btn4.setText("4");
            btn5.setEnabled(true);
            btn5.setText("5");
            btn6.setEnabled(true);
            btn6.setText("6");
            btn7.setEnabled(true);
            btn7.setText("7");
            btn8.setEnabled(true);
            btn8.setText("8");
            btn9.setEnabled(true);
            btn9.setText("9");
        }
    }

    private int checkWin() {

        if (btn1.getText().equals(btn2.getText()) && btn2.getText().equals(btn3.getText())) {
            Toast.makeText(this, "Winner Declared: Winner is" + btn1.getText(), Toast.LENGTH_LONG).show();
            return 1;
        } else if (btn4.getText().equals(btn5.getText()) && btn5.getText().equals(btn6.getText())) {
            Toast.makeText(this, "Winner Declared: Winner is" + btn1.getText(), Toast.LENGTH_LONG).show();
            return 1;
        } else if (btn7.getText().equals(btn8.getText()) && btn8.getText().equals(btn9.getText())) {
            Toast.makeText(this, "Winner Declared: Winner is" + btn1.getText(), Toast.LENGTH_LONG).show();
            return 1;
        } else if (btn1.getText().equals(btn4.getText()) && btn4.getText().equals(btn7.getText())) {
            Toast.makeText(this, "Winner Declared: Winner is" + btn1.getText(), Toast.LENGTH_LONG).show();
            return 1;
        } else if (btn2.getText().equals(btn5.getText()) && btn5.getText().equals(btn8.getText())) {
            Toast.makeText(this, "Winner Declared: Winner is" + btn1.getText(), Toast.LENGTH_LONG).show();
            return 1;
        } else if (btn3.getText().equals(btn6.getText()) && btn6.getText().equals(btn9.getText())) {
            Toast.makeText(this, "Winner Declared: Winner is" + btn1.getText(), Toast.LENGTH_LONG).show();
            return 1;
        } else if (btn1.getText().equals(btn5.getText()) && btn5.getText().equals(btn9.getText())) {
            Toast.makeText(this, "Winner Declared: Winner is" + btn1.getText(), Toast.LENGTH_LONG).show();
            return 1;
        } else if (btn3.getText().equals(btn5.getText()) && btn5.getText().equals(btn7.getText())) {
            Toast.makeText(this, "Winner Declared: Winner is" + btn1.getText(), Toast.LENGTH_LONG).show();
            return 1;
        }else
            return 0;
    }

}



