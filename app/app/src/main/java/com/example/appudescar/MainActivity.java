package com.example.appudescar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //Ação de clicar no botão 'pegar carona' vai para a tela de agendar uma carona
        Button btn_pesquisar_carona = findViewById(R.id.btn_pesquisar);

        btn_pesquisar_carona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PegarCarona.class);
                startActivity(intent);
            }
        });
        //--------------------------------------------------------------------------

        //Ação de clicar no botão 'oferecer carona' vai para a tela de oferta de carona
        Button btn_oferecer_carona = findViewById(R.id.btn_oferecer);

        btn_oferecer_carona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, OferecerCarona.class);
                startActivity(intent);
            }
        });
        //--------------------------------------------------------------------------

        //Ação de clicar no botão 'viagens' vai para a tela de viagens
        Button btn_viagens = findViewById(R.id.btn_viagens);

        btn_viagens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Viagens.class);
                startActivity(intent);
            }
        });
        //--------------------------------------------------------------------------

        //Ação de clicar no botão 'perfil' vai para a tela de perfil
        Button btn_perfil = findViewById(R.id.btn_perfil);

        btn_perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Perfil.class);
                startActivity(intent);
            }
        });
        //--------------------------------------------------------------------------

    }

}