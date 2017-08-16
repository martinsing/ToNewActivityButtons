package com.martinsing.tonewactivitybuttons;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Activity wide interface method using the switch statement. (Pro)
 * The advantage here is that all button intents are registered in the single onClick Method.
 */
public class Activity3 extends AppCompatActivity implements View.OnClickListener {

    private Button button1;
    private Button button2;
    private TextView content3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button3);

        content3 = (TextView) findViewById(R.id.textView);
        content3.setText(R.string.context3);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button1:
                Intent intent1 = new Intent(this, Activity1.class);
                startActivity(intent1);
                break;
            case R.id.button2:
                Intent intent2 = new Intent(this, Activity2.class);
                startActivity(intent2);
                break;
            default:
                break;
        }
    }
}
