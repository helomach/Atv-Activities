package com.example.atvactivities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNome;
    private EditText editTextEmail;
    private EditText editTextEndereco;
    private EditText editTextTelefone;
    private EditText editTextIdade;
    private Button buttonSalvar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNome = findViewById(R.id.editTextNome);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextEndereco = findViewById(R.id.editTextEndereco);
        editTextTelefone = findViewById(R.id.editTextTelefone);
        editTextIdade = findViewById(R.id.editTextIdade);
        buttonSalvar = findViewById(R.id.buttonSalvar);

        buttonSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Usuario usuario = new Usuario(
                    editTextNome.getText().toString(),
                    editTextEmail.getText().toString(),
                    editTextEndereco.getText().toString(),
                    editTextTelefone.getText().toString(),
                    editTextIdade.getText().toString()
                );

                Intent intent = new Intent(MainActivity.this, SegundaActivity.class);
                intent.putExtra("usuario", usuario);
                startActivity(intent);
            }
        });
    }
}