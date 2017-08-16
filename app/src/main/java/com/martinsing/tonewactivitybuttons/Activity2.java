package com.martinsing.tonewactivitybuttons;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Assigning an OnClickListener() via an anonymous class. (Intermediate)
 * The disadvantage here is that there will be a lot of anonymous classes which will make
 * readability difficult when reviewing.
 */
public class Activity2 extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private TextView content2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button2);

        content2 = (TextView) findViewById(R.id.textView);
        content2.setText(R.string.context2);

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), Activity1.class);
                view.getContext().startActivity(Intent);
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), Activity3.class);
                view.getContext().startActivity(Intent);
            }
        });
    }
}

