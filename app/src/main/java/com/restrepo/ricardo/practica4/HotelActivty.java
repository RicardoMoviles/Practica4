package com.restrepo.ricardo.practica4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class HotelActivty extends AppCompatActivity {

    ArrayAdapter<String> adaptador;
    ListView lstNombres;

    private Lista_Entrada[] datos =
            new Lista_Entrada[] {
                    new Lista_Entrada(R.drawable.hotelembera, "Hotel Embera", "Calle 100 #103-49", "(574)828 15 88"),
                    new Lista_Entrada(R.drawable.hotelguateque, "Hotel Guateque", "Carrera 102 #91-20","(574)828 84 34"),
                    new Lista_Entrada(R.drawable.hoteloscar, "Hotel el Oscar", "Carrera 102 #98-10", "(574)828 81 84") };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_activty);

        Adapter adaptador = new Adapter(this, datos);

        lstNombres = (ListView) findViewById(R.id.Lst2);

        lstNombres.setAdapter(adaptador);

        lstNombres.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String seleccion = ((Lista_Entrada) parent.getItemAtPosition(position)).getNombreh();

                Toast.makeText(HotelActivty.this, seleccion, Toast.LENGTH_SHORT).show();

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hotel_activty, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        /*if (id == R.id.action_settings) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }
}
