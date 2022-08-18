package com.example.sortedodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textViewTitle;
    private Button buttonAction;
    private ArrayList<String> messages = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewTitle = findViewById(R.id.title_text);
        buttonAction = findViewById(R.id.button_action);

        messages.add("Não deixem que diga que você não consegue.\nDiga você mesmo: Eu não consigo!");
        messages.add("Calma! É só uma fase ruim. Logo vai piorar!");
        messages.add("Só dará errado se você tentar.");
        messages.add("O esforço de hoje é o fracasso de amanhã.");
        messages.add("Se a vida tentar te derrunar lembre\n que do chão você não passa.");
        messages.add("Se quiser algo mal feito, faça você mesmo.");
        messages.add("Nenhum obstáculo é grande para quem desiste.");

        buttonAction.setOnClickListener(v -> {
                Random random = new Random();
                int index = random.nextInt(messages.size());
                String message = messages.get(index);
                textViewTitle.setText(message);
            }
        );
    }
}