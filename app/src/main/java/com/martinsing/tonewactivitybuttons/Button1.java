package com.martinsing.tonewactivitybuttons;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Button1 extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private TextView content1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button1);

        content1 = (TextView) findViewById(R.id.textView);
        content1.setText(R.string.context1);

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), Button2.class);
                view.getContext().startActivity(Intent);
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), Button3.class);
                view.getContext().startActivity(Intent);
            }
        });
//        The disadvantage here is that there will be a lot of anonymous classes which will make readability difficult when reviewing.
    }
}

