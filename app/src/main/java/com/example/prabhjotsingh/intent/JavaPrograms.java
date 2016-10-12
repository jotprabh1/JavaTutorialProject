package com.example.prabhjotsingh.intent;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

public class JavaPrograms extends AppCompatActivity {
    ListView list2;
    String[] data2 = {"1. 2D Array Example", "2. Addition", "3. Area of Circle", "4. Area of Rectangle", "5. Array Copy", "6. Average of Array"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        list2 = (ListView) findViewById(R.id.list2);
        ArrayAdapter<String> ar2 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, data2);
        list2.setAdapter(ar2);
        list2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(JavaPrograms.this, Programs.class);
                i.putExtra("key",position);
                startActivity(i);
            }
        });
    }

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
        if(id==R.id.tutorials)
        {
            Intent i=new Intent(this,JavaTutorials.class);
            startActivity(i);
        }
        if (id == R.id.programs) {
            Intent i=new Intent(this,JavaPrograms.class);
            startActivity(i);
        }

        if (id == R.id.exit) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
