package br.edu.unis.sqlite;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        loadWidgets();

    }

    private void loadWidgets(){

        Button btnToUsers = findViewById(R.id.btn_to_users);
        btnToUsers.setOnClickListener(view -> startActivity(new Intent(this, UserActivity.class)));

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this,CreateUserActivity.class);
                startActivity(intent);
            }
        });
    }
}

