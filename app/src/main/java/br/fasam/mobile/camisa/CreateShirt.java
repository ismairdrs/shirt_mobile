package br.fasam.mobile.camisa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CreateShirt extends AppCompatActivity {

    EditText txtMark;
    EditText txtModel;
    EditText txtColor;
    EditText txtSpecifications;
    EditText txtSize;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_shirt);
    }

    public void CreateShirt(View view)
    {

        txtMark = findViewById(R.id.txtMark);
        txtModel = findViewById(R.id.txtModel);
        txtColor = findViewById(R.id.txtColor);
        txtSpecifications = findViewById(R.id.txtSpecifications);
        txtSize = findViewById(R.id.txtSize);

        String mark, model, color, specifications, size;
        mark = txtMark.getText().toString();
        model = txtModel.getText().toString();
        color = txtColor.getText().toString();
        specifications = txtSpecifications.getText().toString();
        size = txtSize.getText().toString();

        String shirt = String.format("Dados da camisa:\n" +
                "Marca: %s\n" +
                "Modelo: %s\n" +
                "Cor: %s\n" +
                "Especificações: %s\n" +
                "Tamanho: %s\n", mark, model, color, specifications, size);

        Toast.makeText(this, shirt, Toast.LENGTH_LONG).show();

    }
}