package com.example.android_exo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class jeu_de extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeu_de);

        Button laun = findViewById(R.id.laun);
        Button fin = findViewById(R.id.fin);

        fin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }

        });

        TextView aff = findViewById(R.id.affiche);
        aff.setText("0");
        TextView textres= (TextView) findViewById(R.id.textres);
        textres.setVisibility(View.INVISIBLE);
        TextView res = (TextView) findViewById(R.id.res);
        res.setVisibility(View.INVISIBLE);

        TextView merci = (TextView) findViewById(R.id.merci);
        merci.setVisibility(View.INVISIBLE);

        laun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText ch = (EditText) findViewById(R.id.face);


// si la chaine ch est bien vide alors...
                if (ch.getText().toString().equals("")) {

                    AlertDialog.Builder builder = new AlertDialog.Builder(jeu_de.this); //nom de la page
                    builder.setTitle(R.string.titre_de) // set le titre
                            .setMessage(R.string.text_de) //set le message
                            .setPositiveButton("ok", ((dialogInterface, i) -> {
                                dialogInterface.dismiss();
                            }))
                            .show();

//                    nb = Integer.parseInt(ch.getText().toString());
//                    System.out.println(nb);
//                    int ran = new Random().nextInt(nb);
////                int de = ran.nextInt(6);
//                    System.out.println(ran);
//                    System.out.println("hello ca va");

                    ;
                } else {

                    int nb = Integer.parseInt(ch.getText().toString()); // transforme un string en int

                    aff.setText(ch.getText().toString()); // affiche un text (settext) récupéré (gettext) sur ch sous forme de string
                    System.out.println("dé a "+ nb+" Faces");
                    int ran = new Random().nextInt(nb-1)+1;
//                int de = ran.nextInt(6);
                    System.out.println("le chiffre aléatoire est "+ran);
                    System.out.println("Merci d'avoir jouer");
                    res.setText(String.valueOf(ran)); // affiche un int sous forme de string
                    res.setVisibility(View.VISIBLE);
                    textres.setVisibility(View.VISIBLE);
                    merci.setVisibility(View.VISIBLE);


                }
            }

            ;
        });
    }
}