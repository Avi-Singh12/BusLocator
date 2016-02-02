package com.example.asingh.buslocator;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

import java.util.Map;

/**
 * Created by 2016asingh on 1/5/2016.
 */
public class StudentView extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_view);

        final Firebase myFirebase = new Firebase("https://tjbusfinder.firebaseio.com/");

        final TextView bus1 = (TextView) findViewById(R.id.busNum1);
        final TextView bus2 = (TextView) findViewById(R.id.busNum2);
        final TextView bus3 = (TextView) findViewById(R.id.busNum3);
        final TextView bus4 = (TextView) findViewById(R.id.busNum4);
        final TextView bus5 = (TextView) findViewById(R.id.busNum5);
        final TextView bus6 = (TextView) findViewById(R.id.busNum6);
        final TextView bus7 = (TextView) findViewById(R.id.busNum7);
        final TextView bus8 = (TextView) findViewById(R.id.busNum8);
        final TextView bus9 = (TextView) findViewById(R.id.busNum9);
        final TextView bus10 = (TextView) findViewById(R.id.busNum10);
        final TextView bus11 = (TextView) findViewById(R.id.busNum11);
        final TextView bus12 = (TextView) findViewById(R.id.busNum12);


        myFirebase.child("1").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                bus1.setText(dataSnapshot.getValue().toString());
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        myFirebase.child("2").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                bus2.setText(dataSnapshot.getValue().toString());
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        myFirebase.child("3").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                bus3.setText(dataSnapshot.getValue().toString());
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        myFirebase.child("4").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                bus4.setText(dataSnapshot.getValue().toString());
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        myFirebase.child("5").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                bus5.setText(dataSnapshot.getValue().toString());
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        myFirebase.child("6").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                bus6.setText(dataSnapshot.getValue().toString());
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        myFirebase.child("7").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                bus7.setText(dataSnapshot.getValue().toString());
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        myFirebase.child("8").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                bus8.setText(dataSnapshot.getValue().toString());
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        myFirebase.child("9").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                bus9.setText(dataSnapshot.getValue().toString());
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        myFirebase.child("10").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                bus10.setText(dataSnapshot.getValue().toString());
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        myFirebase.child("11").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                bus11.setText(dataSnapshot.getValue().toString());
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
        myFirebase.child("12").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                bus12.setText(dataSnapshot.getValue().toString());
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

    }
}
