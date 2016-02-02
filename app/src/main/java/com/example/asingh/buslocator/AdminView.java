package com.example.asingh.buslocator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.firebase.client.Firebase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 2016asingh on 1/5/2016.
 */
public class AdminView extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_view);

        final Firebase myFirebase = new Firebase("https://tjbusfinder.firebaseio.com/");

        final EditText bus1Field = (EditText) findViewById(R.id.busNum1);
        final EditText bus2Field = (EditText) findViewById(R.id.busNum2);
        final EditText bus3Field = (EditText) findViewById(R.id.busNum3);
        final EditText bus4Field = (EditText) findViewById(R.id.busNum4);
        final EditText bus5Field = (EditText) findViewById(R.id.busNum5);
        final EditText bus6Field = (EditText) findViewById(R.id.busNum6);
        final EditText bus7Field = (EditText) findViewById(R.id.busNum7);
        final EditText bus8Field = (EditText) findViewById(R.id.busNum8);
        final EditText bus9Field = (EditText) findViewById(R.id.busNum9);
        final EditText bus10Field = (EditText) findViewById(R.id.busNum10);
        final EditText bus11Field = (EditText) findViewById(R.id.busNum11);
        final EditText bus12Field = (EditText) findViewById(R.id.busNum12);

        final Integer busSpot1 = Integer.parseInt(bus1Field.getText().toString());
        final Integer busSpot2 = Integer.parseInt(bus2Field.getText().toString());
        final Integer busSpot3 = Integer.parseInt(bus3Field.getText().toString());
        final Integer busSpot4 = Integer.parseInt(bus4Field.getText().toString());
        final Integer busSpot5 = Integer.parseInt(bus5Field.getText().toString());
        final Integer busSpot6 = Integer.parseInt(bus6Field.getText().toString());
        final Integer busSpot7 = Integer.parseInt(bus7Field.getText().toString());
        final Integer busSpot8 = Integer.parseInt(bus8Field.getText().toString());
        final Integer busSpot9 = Integer.parseInt(bus9Field.getText().toString());
        final Integer busSpot10 = Integer.parseInt(bus10Field.getText().toString());
        final Integer busSpot11 = Integer.parseInt(bus11Field.getText().toString());
        final Integer busSpot12 = Integer.parseInt(bus12Field.getText().toString());

        final Button update = (Button) findViewById(R.id.updateButton);

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myFirebase.child("1").setValue(busSpot1);
                myFirebase.child("2").setValue(busSpot2);
                myFirebase.child("3").setValue(busSpot3);
                myFirebase.child("4").setValue(busSpot4);
                myFirebase.child("5").setValue(busSpot5);
                myFirebase.child("6").setValue(busSpot6);
                myFirebase.child("7").setValue(busSpot7);
                myFirebase.child("8").setValue(busSpot8);
                myFirebase.child("9").setValue(busSpot9);
                myFirebase.child("10").setValue(busSpot10);
                myFirebase.child("11").setValue(busSpot11);
                myFirebase.child("12").setValue(busSpot12);
            }
        });

    }
}
