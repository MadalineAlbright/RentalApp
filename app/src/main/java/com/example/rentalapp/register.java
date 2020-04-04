package com.example.rentalapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class register extends AppCompatActivity {
    EditText mName,mEmail,mPass,mPhone;
    Button mRegisterBtn;
    TextView mLoginButton;
    FirebaseAuth fAuth;
    ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        mName=findViewById(R.id.myname);
        mEmail=findViewById(R.id.myemail);
        mPass=findViewById(R.id.mypass);
        mPhone=findViewById(R.id.myphone);
        mRegisterBtn=findViewById(R.id.register);
       mLoginButton=findViewById(R.id.createtext);

       fAuth=FirebaseAuth.getInstance();
       progressBar=findViewById(R.id.progressBar);

       if(fAuth.getCurrentUser() !=null){
           startActivity(new Intent(register.this,MainActivity.class));
           finish();
       }

        mLoginButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(register.this,login.class));
            }
        });


       mRegisterBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String email = mEmail.getText().toString().trim();
               String password = mPass.getText().toString().trim();

               if (TextUtils.isEmpty(email)) {
                   mEmail.setError("Email is Required");
                   return;
               }
               if (TextUtils.isEmpty(password)) {
                   mPass.setError("Password is Required");
                   return;
               }
               if (password.length() < 6) {
                   mPass.setError("Password must be >=6 characters");
                   return;
               }
               progressBar.setVisibility(View.VISIBLE);

               //register the user in firebase

               fAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                   @Override
                   public void onComplete(@NonNull Task<AuthResult> task) {
                       if (task.isSuccessful()) {
                           Toast.makeText(register.this, "User Created", Toast.LENGTH_SHORT).show();
                           startActivity(new Intent(register.this, MainActivity.class));
                       } else {
                           Toast.makeText(register.this, "Error!" + task.getException().getMessage(),Toast.LENGTH_SHORT).show();

                       }
                   }
               });

           }


       });

    }

}



