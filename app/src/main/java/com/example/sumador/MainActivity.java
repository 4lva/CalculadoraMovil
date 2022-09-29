package com.example.sumador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1=findViewById(R.id.numero1);
        num2=findViewById(R.id.numero2);
        result=findViewById(R.id.resultado);
    }

    public void calcular(View view) {
        //comprobamos si se ha metido algun numero para poder calcular
        if(num1.getText().toString().isEmpty()&&num2.getText().toString().isEmpty()){
            result.setText("No has introducido numeros");
        }else {

        }

        // Obtenemos los números
        //int n1=Integer.parseInt(num1.getText().toString());
        //int n2=Integer.parseInt(num2.getText().toString());

        // Hacemos la suma
        //int suma=n1+n2;

        // Establecemos el resultado en el TextView
        //result.setText(""+suma);
    }
}