package com.example.android_exo;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // enlève la barre tout en haut (batterie, etc...)
//        getActionBar().hide();  // for hiding
//        Objects.requireNonNull(getSupportActionBar()).hide();
        // enlevons la bare en haut
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        System.out.println("hello");

        ImageButton de = findViewById(R.id.de);
        de.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this); //nom de la page
                builder.setTitle(R.string.start) // set le titre
                        .setMessage(R.string.lanch) //set le message
                        .setPositiveButton("Continuer", ((dialogInterface, i) -> {
                            dialogInterface.dismiss();
                            Intent intent = new Intent(MainActivity.this, jeu_de.class);
                            startActivity(intent);
                        }))
                        .show();
            }

        });



        ImageButton splash = findViewById(R.id.splash);
        splash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this); //nom de la page
                builder.setTitle(R.string.titre_spla) // set le titre
                        .setMessage(R.string.start_spla) //set le message
                        .setPositiveButton("ok", ((dialogInterface, i) -> {
                            dialogInterface.dismiss();
                            Intent intent = new Intent(MainActivity.this, Splashscr.class);
                            startActivity(intent);

                        }))
                        .show();
            }
        });

        ImageButton love = findViewById(R.id.Love_machine);
        love.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this); //nom de la page
                builder.setTitle(R.string.start_lo) // set le titre
                        .setMessage(R.string.lanch_lo) //set le message
                        .setPositiveButton("Continuer", ((dialogInterface, i) -> {
                            dialogInterface.dismiss();
                            Intent intent = new Intent(MainActivity.this, love.class);
                            startActivity(intent);
                        }))
                        .show();
            }

        });

    }
}