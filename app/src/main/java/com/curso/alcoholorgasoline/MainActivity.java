package com.curso.alcoholorgasoline;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editPrecoAlcool;
    private EditText editPrecoGasolina;
    private TextView textResultado;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPrecoAlcool = findViewById(R.id.editAlcool);
        editPrecoGasolina = findViewById(R.id.editGasolina);
        textResultado = findViewById(R.id.textResultado);

    }

    public void calcularPreco(View view ){

        Double precoAlcool = Double.parseDouble(editPrecoAlcool.getText().toString());
        Double precoGasolina = Double.parseDouble(editPrecoGasolina.getText().toString());



        /* Aqui fará o calculo (precoAlcool/ precoGasolina)

                Se resultado >=0.7 Mais viavel usar gasolina
                Senão for mais viavel usar Alcool

        */

        Double resultado = precoAlcool/precoGasolina;

        if(resultado >= 0.7){

            textResultado.setText("Melhor usar gasolina");

        }else {
             textResultado.setText("Melhor usar Alcool");
        }

    }

}
