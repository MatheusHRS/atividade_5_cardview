package br.edu.unis.sqlite;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;


public class UserActivity extends AppCompatActivity {

    RecyclerView rvUsers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_rv);
        SQLiteHelper db = SQLiteHelper.getInstance(this);

        rvUsers = findViewById(R.id.user_rv);
        rvUsers.setLayoutManager(new LinearLayoutManager(this));

        List<User> userList = db.findUsers();

        UserAdapter adapter = new UserAdapter(userList);

        rvUsers.setAdapter(adapter);
    }
}