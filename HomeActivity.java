package com.example.penugasanacara4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Get the TextView for the clickable "Go to Login" link
        TextView goToLoginLink = findViewById(R.id.goToLoginLink);

        // Set an OnClickListener to navigate to the LoginActivity when clicked
        goToLoginLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the LoginActivity
                Intent intent = new Intent(HomeActivity.this, LoginActivity.class);
                startActivity(intent);
                finish(); // Optionally close the HomeActivity
            }
        });
    }
}
