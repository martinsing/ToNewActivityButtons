package com.martinsing.tonewactivitybuttons;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Button3 extends AppCompatActivity {

    private TextView content3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button3);

        content3 = (TextView) findViewById(R.id.textView);
        content3.setText(R.string.context3);
    }
    public void goToButton1(View view) {
        Intent Intent = new Intent(this, Button1.class);
        startActivity(Intent);
    }

    public void goToButton2(View view) {
        Intent Intent = new Intent(this, Button2.class);
        startActivity(Intent);
    }
//    Each button has it's own method that is attributed to the onClick attribute of each button
}
