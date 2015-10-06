package com.restrepo.ricardo.practica4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

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

        if (id == R.id.action_hotel) {
            Toast.makeText(this, "Menu Hoteles presionado", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, HotelActivty.class);
            startActivity(i);
            return true;
        }

        if (id == R.id.action_bares) {
            Toast.makeText(this, "Menu Bares presionado", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, BaresActivity.class);
            startActivity(i);
            return true;
        }

        if (id == R.id.action_info) {
            Toast.makeText(this, "Menu Turismo presionado", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, TurismoActivity.class);
            startActivity(i);
            return true;
        }


        if (id == R.id.action_demo) {
            Toast.makeText(this, "Menu Demografia presionado", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, DemoActivity.class);
            startActivity(i);
            return true;
        }

        if (id == R.id.action_about) {
            Toast.makeText(this, "Menu AcercaDe presionado", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, AboutActivity.class);
            startActivity(i);
            return true;
        }

        /*if (id == R.id.action_settings) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }
}
