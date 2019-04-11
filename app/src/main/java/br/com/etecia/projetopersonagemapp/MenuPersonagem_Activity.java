package br.com.etecia.projetopersonagemapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuPersonagem_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_personagem_layout);
    }


    public void AbrirPersonagem(View view) {
        switch (view.getId()) {
            case R.id.IdHFerro:
                Intent intent = new Intent(MenuPersonagem_Activity.this, HomemDeFerro_Activity.class);
                startActivity(intent);
                break;
        }
        switch (view.getId()) {
            case R.id.IdANoturna:
                Intent intent = new Intent(MenuPersonagem_Activity.this, AsaNoturna_Activity.class);
                startActivity(intent);
                break;
        }

    }
}

