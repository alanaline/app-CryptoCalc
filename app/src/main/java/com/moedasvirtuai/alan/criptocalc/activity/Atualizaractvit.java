package com.moedasvirtuai.alan.criptocalc.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.moedasvirtuai.alan.criptocalc.R;

public class Atualizaractvit extends AppCompatActivity {
    Button atualizar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atualizar);


        atualizar = findViewById(R.id.btnConexao);

        atualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(Atualizaractvit.this,MainActivity.class);
                startActivity(i);
                finish();

            }
        });
    }

}
