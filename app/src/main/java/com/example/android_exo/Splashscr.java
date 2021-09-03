package com.example.android_exo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class Splashscr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscr);
        //animation déclaration des anim dans la méthode onCreate()
        Animation topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation_layout);
        Animation botAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation_layout);

        //Hook  ensuite les éléments à animer
        View logo = findViewById(R.id.gestclilogo);
        View desc = findViewById(R.id.textcli);

        //Assignment affectons leur animations
        logo.setAnimation(topAnim);
        desc.setAnimation(botAnim);
        int SPLASH_SCREEN = 4000;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run(){
                //Déclaration d'une nouvelle intention
                Intent intent = new Intent(Splashscr.this, MainActivity.class);
                //démarage de l'intention
                startActivity(intent);
                //Cloture du splash Screen
                finish();
            }
        }, SPLASH_SCREEN);

    }
}