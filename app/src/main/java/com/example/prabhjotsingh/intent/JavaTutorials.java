package com.example.prabhjotsingh.intent;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class JavaTutorials extends AppCompatActivity {
    ListView list;
    String[] data={"1. Introduction","2. Features","3. Pros and Cons", "4. Environment Setup","5. First Program","6. Variables"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.list);
        ArrayAdapter<String> ar = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, data);
        list.setAdapter(ar);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(JavaTutorials.this, Introduction.class);
                i.putExtra("key",position);
                startActivity(i);
            }
        });
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
