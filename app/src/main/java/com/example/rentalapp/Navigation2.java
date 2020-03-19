package com.example.rentalapp;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.widget.Button;
import android.widget.Toast;

public class Navigation2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_navigation2);




    }

        public  void  viewgallery(View view){

            Intent intent =new Intent(Navigation2.this, Gallery.class);
            startActivity(intent);


        }

        public  void  location(View view){

            Toast.makeText(this, " Am working but please put code in the Navigation2 java class  ", Toast.LENGTH_LONG).show();


        }

        public  void  testimonials(View view){

            Toast.makeText(this, " Am working but please put code in the Navigation2 java class  ", Toast.LENGTH_LONG).show();



        }

        public  void  contactus(View view){

            Toast.makeText(this, " Am working but please put code in the Navigation2 java class  ", Toast.LENGTH_LONG).show();



        }





}
