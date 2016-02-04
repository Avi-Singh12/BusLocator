package com.example.asingh.buslocator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

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
        Firebase.setAndroidContext(this);

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

        myFirebase.child("1").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                bus1Field.setText(dataSnapshot.getValue().toString());
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        myFirebase.child("2").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                bus2Field.setText(dataSnapshot.getValue().toString());
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        myFirebase.child("3").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                bus3Field.setText(dataSnapshot.getValue().toString());
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        myFirebase.child("4").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                bus4Field.setText(dataSnapshot.getValue().toString());
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        myFirebase.child("5").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                bus5Field.setText(dataSnapshot.getValue().toString());
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        myFirebase.child("6").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                bus6Field.setText(dataSnapshot.getValue().toString());
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        myFirebase.child("7").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                bus7Field.setText(dataSnapshot.getValue().toString());
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        myFirebase.child("8").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                bus8Field.setText(dataSnapshot.getValue().toString());
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        myFirebase.child("9").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                bus9Field.setText(dataSnapshot.getValue().toString());
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        myFirebase.child("10").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                bus10Field.setText(dataSnapshot.getValue().toString());
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        myFirebase.child("11").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                bus11Field.setText(dataSnapshot.getValue().toString());
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        myFirebase.child("12").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                bus12Field.setText(dataSnapshot.getValue().toString());
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        final Button update = (Button) findViewById(R.id.updateButton);

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                final Integer busSpot1 = Integer.parseInt(bus1Field.getText().toString());
//                final Integer busSpot2 = Integer.parseInt(bus2Field.getText().toString());
//                final Integer busSpot3 = Integer.parseInt(bus3Field.getText().toString());
//                final Integer busSpot4 = Integer.parseInt(bus4Field.getText().toString());
//                final Integer busSpot5 = Integer.parseInt(bus5Field.getText().toString());
//                final Integer busSpot6 = Integer.parseInt(bus6Field.getText().toString());
//                final Integer busSpot7 = Integer.parseInt(bus7Field.getText().toString());
//                final Integer busSpot8 = Integer.parseInt(bus8Field.getText().toString());
//                final Integer busSpot9 = Integer.parseInt(bus9Field.getText().toString());
//                final Integer busSpot10 = Integer.parseInt(bus10Field.getText().toString());
//                final Integer busSpot11 = Integer.parseInt(bus11Field.getText().toString());
//                final Integer busSpot12 = Integer.parseInt(bus12Field.getText().toString());

                final String busSpot1 = bus1Field.getText().toString();
                final String busSpot2 = bus2Field.getText().toString();
                final String busSpot3 = bus3Field.getText().toString();
                final String busSpot4 = bus4Field.getText().toString();
                final String busSpot5 = bus5Field.getText().toString();
                final String busSpot6 = bus6Field.getText().toString();
                final String busSpot7 = bus7Field.getText().toString();
                final String busSpot8 = bus8Field.getText().toString();
                final String busSpot9 = bus9Field.getText().toString();
                final String busSpot10 = bus10Field.getText().toString();
                final String busSpot11 = bus11Field.getText().toString();
                final String busSpot12 = bus12Field.getText().toString();

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

                Toast.makeText(AdminView.this, "Bus Locations Successfully Updated", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
