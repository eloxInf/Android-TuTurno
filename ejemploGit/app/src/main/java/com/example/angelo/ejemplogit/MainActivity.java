package com.example.angelo.ejemplogit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
    }
        int numerxo23 = 1;
        int numerxo2 = 1;
        String algo  = "Hola Mundo";
        String algodoss ="La incidencia se corrigio correctamente";
        String holaMundos ="La incidencia se encuentra correcta";
        String holaMundofff ="La incidencia se encuentra correcta";
        String holaMundoffrrf ="La incidencia se encuentra correcta";
        int numero = 1;
        int numerodos = 3;
        int numerodosf = 3;
        int numerodosg = 3;
        return super.onOptionsItemSelected(item);
    }
}
