package com.mrubel.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText et1, et2;
    Button b;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.username);
        et2 = (EditText) findViewById(R.id.password);

        b = (Button) findViewById(R.id.submit);

        tv = (TextView) findViewById(R.id.showing);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String user = et1.getText().toString();
                String pass = et2.getText().toString();

                tv.setText("Your user name is: "+user+"\n"+
                "Your Password is: "+pass);

            }
        });



    }
}
