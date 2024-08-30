package com.example.atvactivities;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SegundaActivity extends AppCompatActivity {

    private TextView textNome;
    private TextView textEmail;
    private TextView textEndereco;
    private TextView textTelefone;
    private TextView textIdade;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        textNome = findViewById(R.id.textNome);
        textEmail = findViewById(R.id.textEmail);
        textEndereco = findViewById(R.id.textEndereco);
        textTelefone = findViewById(R.id.textTelefone);
        textIdade = findViewById(R.id.textIdade);

        Bundle dados = getIntent().getExtras();

        if (dados != null) {
            Usuario usuario = (Usuario) dados.getSerializable("usuario");

            if (usuario != null) {
                textNome.setText("Nome: " + usuario.getNome());
                textEmail.setText("Email: " + usuario.getEmail());
                textEndereco.setText("Endereço: " + usuario.getEndereco());
                textTelefone.setText("Telefone: " + usuario.getTelefone());
                textIdade.setText("Idade: " + usuario.getIdade());
            }
        }
    }
}
