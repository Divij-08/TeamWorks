package com.webarch.teamworks;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import com.webarch.teamworks.Data.UserDAO;
import com.webarch.teamworks.Data.UserDatabase;
import com.webarch.teamworks.model.User;

public class RegistrationActivity extends AppCompatActivity {

    EditText name , Email , pass , cnfPass ;
    Button register;
    private UserDAO userDAO;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

         name = findViewById(R.id.name);
         Email = findViewById(R.id.email);
         pass = findViewById(R.id.password);
         cnfPass = findViewById(R.id.ConfPass);
         register = findViewById(R.id.register);

         userDAO =  Room.databaseBuilder(this , UserDatabase.class,"User").allowMainThreadQueries().build().getUserDAO();

         register.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 String userName = name.getText().toString().trim();
                 String email = Email.getText().toString().trim();
                 String password = pass.getText().toString().trim();
                 String ConfirmPassword = cnfPass.getText().toString().trim();

                 if(password.equals(ConfirmPassword)){
                     User user = new User(email , userName , password);
                     userDAO.insert(user);
                     Intent intent = new Intent(RegistrationActivity.this , MainActivity.class);
                     startActivity(intent);
                 }
                 else
                 {
                     Toast.makeText(RegistrationActivity.this ,"Passwords Mismatch",Toast.LENGTH_SHORT).show();
                 }

             }
         });
    }
}
