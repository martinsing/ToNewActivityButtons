package com.martinsing.tonewactivitybuttons;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Using the onClick attribute of the Button. (Beginner)
 * Each button has it's own method that is attributed to the onClick attribute of each button
 */
public class Activity1 extends AppCompatActivity {

    private TextView content1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button1);

        content1 = (TextView) findViewById(R.id.textView);
        content1.setText(R.string.context1);
    }

    public void goToActivity2(View view) {
        Intent Intent = new Intent(this, Activity2.class);
        startActivity(Intent);
    }

    public void goToActivity3(View view) {
        Intent Intent = new Intent(this, Activity3.class);
        startActivity(Intent);
    }
}
