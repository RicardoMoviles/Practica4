package com.restrepo.ricardo.practica4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class BaresActivity extends AppCompatActivity {

    ArrayAdapter<String> adaptador;
    ListView lstNombres;

    private Lista_Bar[] bares =
            new Lista_Bar[] {
                    new Lista_Bar(R.drawable.la100,"La 100", "Calle 100 #103–49", "(574)828 15 88"),
                    new Lista_Bar(R.drawable.partyxtrem, "Party Xtrem", "Carrera 105 Barrio Ortiz","--"),
                    new Lista_Bar(R.drawable.pebblespizzeria, "Pebbles Pizzeria", "Carrera 105 #100f-01", "(574) 828 31 46") };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bares);

        AdapterBar adaptador = new AdapterBar(this, bares);

        lstNombres = (ListView) findViewById(R.id.Lst3);

        lstNombres.setAdapter(adaptador);

        lstNombres.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String seleccion = ((Lista_Bar) parent.getItemAtPosition(position)).getNombreb();

                Toast.makeText(BaresActivity.this, seleccion, Toast.LENGTH_SHORT).show();

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_bares, menu);
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
