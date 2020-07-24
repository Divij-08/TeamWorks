package com.webarch.teamworks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.webarch.teamworks.Data.UserDAO;
import com.webarch.teamworks.Data.UserDatabase;
import com.webarch.teamworks.model.User;

public class MainActivity extends AppCompatActivity {

    UserDAO db;
    UserDatabase database;
    EditText Email , Password ;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        database = Room.databaseBuilder(this , UserDatabase.class,"User").allowMainThreadQueries().build();
        db = database.getUserDAO();

        Email = findViewById(R.id.email);
        Password = findViewById(R.id.password);
        login = findViewById(R.id.login);

        login. setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = Email.getText().toString().trim();
                String password = Password.getText().toString().trim();

                User user = db.getUser(email,password);
                if(user!=null)
                {
                    Intent i = new Intent(MainActivity.this , HomeActivity.class);
                    i.putExtra("User",user);
                    startActivity(i);
                    finish();
                }
                else
                {
                    Toast.makeText(MainActivity.this , "Please recheck your Email or Password",Toast.LENGTH_SHORT).show();
                }




            }
        });
    }
}