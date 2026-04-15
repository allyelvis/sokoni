package com.aenzbi.sokoni.auth;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {

    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        auth = FirebaseAuth.getInstance();

        auth.signInWithEmailAndPassword("test@mail.com", "123456")
            .addOnCompleteListener(task -> {
                if (task.isSuccessful()) {
                    // login success
                }
            });
    }
}
