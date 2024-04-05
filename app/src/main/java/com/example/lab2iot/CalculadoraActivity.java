package com.example.lab2iot;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CalculadoraActivity extends AppCompatActivity {

    // 0->nada; 1->suma; 2->resta; 3->mult; 4->div
    int operacion = 0;
    double numero1 = 0.0;
    TextView tv_numero1;
    TextView tv_numero2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        Button btnIgual = findViewById(R.id.button19);
        Button btnBorrar = findViewById(R.id.button17);
        tv_numero1 = findViewById(R.id.tv_num1);
        tv_numero2 = findViewById(R.id.tv_num2);

        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num2 = Double.parseDouble(tv_numero2.getText().toString());
                double resultado = 0.0;
                switch (operacion) {
                    case 1:
                        resultado = numero1 + num2;
                        break;
                    case 2:
                        resultado = numero1 - num2;
                        break;
                    case 3:
                        resultado = numero1 * num2;
                        break;
                    case 4:
                        if (num2 != 0) {
                            resultado = numero1 / num2;
                        } else {
                            tv_numero2.setText("Error: No se puede dividir por cero");
                            return;
                        }
                        break;
                }
                tv_numero2.setText(String.valueOf(resultado));
                tv_numero1.setText("");
            }
        });

        btnBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_numero1.setText("");
                tv_numero2.setText("");
                operacion = 0;
            }
        });


    }



    /*public void clicNumero(View view) {
        String num2 = tv_numero2.getText().toString();

        switch (view.getId()) {
            case R.id.button18:
                tv_numero2.setText(num2 + "0");
                break;
            case R.id.button13:
                tv_numero2.setText(num2 + "1");
                break;
            case R.id.button14:
                tv_numero2.setText(num2 + "2");
                break;
            case R.id.button15:
                tv_numero2.setText(num2 + "3");
                break;
            case R.id.button9:
                tv_numero2.setText(num2 + "4");
                break;
            case R.id.button10:
                tv_numero2.setText(num2 + "5");
                break;
            case R.id.button11:
                tv_numero2.setText(num2 + "6");
                break;
            case R.id.button:
                tv_numero2.setText(num2 + "7");
                break;
            case R.id.button21:
                tv_numero2.setText(num2 + "8");
                break;
            case R.id.button22:
                tv_numero2.setText(num2 + "9");
                break;
        }
    }

    public void clicOperacion(View view) {
        String num2 = tv_numero2.getText().toString();
        numero1 = Double.parseDouble(num2);
        tv_numero2.setText("");
        switch (view.getId()) {
            case R.id.button20:
                tv_numero1.setText(num2 + "+");
                operacion = 1;
                break;
            case R.id.button16:
                tv_numero1.setText(num2 + "-");
                operacion = 2;
                break;
            case R.id.button12:
                tv_numero1.setText(num2 + "*");
                operacion = 3;
                break;
            case R.id.button23:
                tv_numero1.setText(num2 + "/");
                operacion = 4;
                break;
        }
    }*/
}
