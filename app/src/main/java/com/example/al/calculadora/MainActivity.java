/* Aplicación de prueba para tomar el texto de un campo y mostrarlo en mensaje
*   1.- Desarrlllar la interfaz grafica que necesitemos en nuestra aplicación
*   2.- Desarrollar el archivo .class o java para darle funcionalidad a la aplicación
*
*/
package com.example.al.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    // Inicializar dos variables para los elementos de entrada de la aplicación
    private EditText inp_numero; // Varaibele para el edit text
    private Button btn_action; // variable para el boton que acciona el obtener texto y mostrarlo

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Vinculando el Input
        inp_numero = (EditText) findViewById(R.id.inp_numero);
        //fijamos un texto al editText
        inp_numero.setText("12345");
    }
    public void btn_presionado (View view) { //Método para obtener el texto y mostrarlo en mensaje
        //obtenner el texto
        String texto = inp_numero.getText().toString(); // Inicializacion de una variable texto que almacene el texto del editText
        Toast toast = Toast.makeText(getApplicationContext(), texto, Toast.LENGTH_LONG); // Uso de TOAST para mostrar el mensaje
        toast.show(); //Mostrar el mensaje
    }
}
