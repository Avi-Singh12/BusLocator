package com.example.asingh.buslocator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.firebase.client.AuthData;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;

/**
 * Created by 2016asingh on 1/5/2016.
 */
public class AdminLogin extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_login);
        Firebase.setAndroidContext(this);

        final Firebase myFirebase = new Firebase("https://tjbusfinder.firebaseio.com/");
        final EditText userNameTextField = (EditText) findViewById(R.id.userNameEditText);
        final EditText passwordTextField = (EditText) findViewById(R.id.passwordEditText);
        final Button loginButton = (Button) findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginUserOnFirebase(userNameTextField.getText().toString(), passwordTextField.getText().toString(), myFirebase);
            }
        });
    }

    public void loginUserOnFirebase(final String username, final String password, Firebase myFirebase) {
        myFirebase.authWithPassword(username, password, new Firebase.AuthResultHandler() {
            @Override
            public void onAuthenticated(AuthData authData) {
                Toast.makeText(AdminLogin.this, "New user with id: " + username + " successfully logged in", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(getApplicationContext(), AdminView.class);
                startActivity(i);
            }

            @Override
            public void onAuthenticationError(FirebaseError firebaseError) {
                switch (firebaseError.getCode()) {
                    case FirebaseError.INVALID_EMAIL:
                        Toast.makeText(AdminLogin.this, "Invalid Email or Password", Toast.LENGTH_SHORT).show();
                        break;
                    case FirebaseError.USER_DOES_NOT_EXIST:
                        Toast.makeText(AdminLogin.this, "User not in System", Toast.LENGTH_SHORT).show();
                        break;
                    case FirebaseError.INVALID_PASSWORD:
                        Toast.makeText(AdminLogin.this, "Invalid Email or Password", Toast.LENGTH_SHORT).show();
                        break;
                    case FirebaseError.AUTHENTICATION_PROVIDER_DISABLED:
                        Toast.makeText(AdminLogin.this, "Authentication Provider Disabled", Toast.LENGTH_SHORT).show();
                        break;
                    case FirebaseError.INVALID_AUTH_ARGUMENTS:
                        Toast.makeText(AdminLogin.this, "Invalid Authentication Arguments", Toast.LENGTH_SHORT).show();
                        break;
                    case FirebaseError.NETWORK_ERROR:
                        Toast.makeText(AdminLogin.this, "Network Error", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        Toast.makeText(AdminLogin.this, "Unspecified Error", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}
