package com.example.android_exo;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.lang.reflect.Array;

public class love extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love);

//        char c = 'a';
//        System.out.println(c);
//        int nb = (int) c - 96;
//        System.out.println(nb);
        EditText pr1 = findViewById(R.id.pr1);
        EditText pr2 = findViewById(R.id.pr2);
        Button btn = findViewById(R.id.bttn);

        //String st = pr1.getText().toString().toLowerCase();
        //char[] tab1 = st.toCharArray();

        btn.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View view) {
                int total1 = 0;
                int total2 = 0;
                if ((pr1.getText().toString().equals("")) || (pr2.getText().toString().equals(""))) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(love.this); //nom de la page
                    builder.setTitle(R.string.att) // set le titre
                            .setMessage(R.string.tex_att) //set le message
                            .setPositiveButton("ok", ((dialogInterface, i) -> {
                                dialogInterface.dismiss();

                            }))
                            .show();
                    System.out.println(pr1.getText());

                } else {
//                    System.out.println("longueur du 1er prénom : " +pr1.getText().length());

                    String st2 = pr2.getText().toString().toLowerCase();
                    String st1 = String.valueOf(pr1.getText()).toLowerCase();

                    System.out.println(st1);
                    System.out.println(st2);

                    char[] tab1 = st1.toCharArray();
                    char[] tab2 = st2.toCharArray();
                    //System.out.println(st);

                    for (int i = 0; i < pr1.getText().length(); i++) {

                        int nb1 = (int) tab1[i] - 96;

                        System.out.println(tab1[i]+" vaut "+nb1);

                        total1 += nb1;


//                            System.out.println(tab2[i]+" vaut "+nb2);


                        }
                   System.out.println(total1);
                    if (total1 >=10){
//                        String mi_to1 = String.valueOf(total1).substring(0,1);


                        do {
                            int tabuse = total1;
                            total1=0;
                            char[] A = String.valueOf(tabuse).toCharArray();
                            for(char a : String.valueOf(tabuse).toCharArray()){
                                int chiffre = Integer.parseInt(String.valueOf(a));
                                System.out.println(chiffre);
                                total1 +=chiffre;
                            }
//                            int prem = Integer.parseInt(String.valueOf(A[0]));
//                            int sec = Integer.parseInt(String.valueOf(A[1]));
//                            total1 = prem + sec;
//                            System.out.println(prem);
//                            System.out.println(sec);
                            System.out.println(total1);

                        }while(total1>=10);
//                        System.out.println(mi_to1.toCharArray());
//
//                        System.out.println("le 1er chiffre est : "+mi_to1);

                    }
//                    System.out.println("longueur du mot : " + pr1.getText().length());
//                    for (int i = 0; i < pr2.getText().length(); i++) {
//
//                        System.out.println(tab2[i]);
//                    }
//                    System.out.println("longueur du mot : " + pr2.getText().length());


                }

            }
        });
    }
}