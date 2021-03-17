package com.moedasvirtuai.alan.myapplication;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Banco extends SQLiteOpenHelper {
    int VERSAO_DO_BANCO = 1;
    String NOME_BANCO = "DB_AGENDA";
    String NOME_DA_TABELA = "TB_AGENDA";
    String CONLUNA_NOME = "NOME";
    String COLUNA_TELEFONE = "TELEFONE";

    public Banco(Context context) {

        super(context,NOME_BANCO,null,VERSAO_DO_BANCO);

    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        String tabela = "create table tabela("+
                "_id interger primary key autoincrement"
                + ",nome varchar(80) not null"+")";

        db.execSQL(tabela);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}



