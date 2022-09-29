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
        if(num1.getText().toString().isEmpty()||num2.getText().toString().isEmpty()){
            result.setText("No has introducido numeros");
        }else {
            // Obtenemos los números
            int n1=Integer.parseInt(num1.getText().toString());
            int n2=Integer.parseInt(num2.getText().toString());
            if (view.getId() == R.id.bsuma) {
                // Hacemos la suma establecemos el resultado en el TextView
                result.setText(""+(n1+n2));
            }
            if (view.getId() == R.id.bresta) {
                // Hacemos la resta establecemos el resultado en el TextView
                result.setText(""+(n1-n2));
            }
            if (view.getId() == R.id.bmultiplicar) {
                // Hacemos la multiplicacion establecemos el resultado en el TextView
                result.setText(""+(n1*n2));
            }
            if (view.getId() == R.id.bdivision) {
                // Comprbamos la division por 0 Hacemos la division establecemos el resultado en el TextView
                if(n2==0) result.setText("No se puede dividir entre 0");
                else result.setText("" + (n1 / n2));
            }
        }
    }
}