package com.example.rentalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
public void logout(View view){
    FirebaseAuth.getInstance().signOut();
    startActivity(new Intent(MainActivity.this,login.class));
    finish();
}


//        toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//
//    }
//
//
//    public void ButtonClick(View view) {
//        EditText et1 = (EditText) findViewById(R.id.myemail);
//        EditText et2 = (EditText) findViewById(R.id.mypass);
//
//        String email = et1.getText().toString();
//        String pass = et2.getText().toString();
//        // code that links to the database in this case we'll use one email and password.
//
//        String oemail = "maddy";
//        String opass = "maddy";
//
//        //Sets the conditions to be met
//
//        if (email.equals(oemail) && pass.equals(opass)) {
//            Intent intent = new Intent(this, Navigation2.class);
//            startActivity(intent);
//        } else {
//            Toast toast = Toast.makeText(this, "Invalid Email/Password", Toast.LENGTH_LONG);
//            toast.show();
//        }
//
//    }


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//        if (id == R.id.action_share) {
//            return true;
//        }
//        if (id == R.id.action_aboutus) {
//            return true;
//        }
//
//
//        return super.onOptionsItemSelected(item);
//    }
}
