package com.example.prabhjotsingh.intent;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.widget.TextView;


public class Programs extends AppCompatActivity {
    TextView txt5;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_features);
        txt5 = (TextView) findViewById(R.id.text5);
        Toolbar t = (Toolbar) findViewById(R.id.toolbar);
        t.setTitleTextColor(Color.WHITE);
        i = getIntent().getExtras().getInt("key");
        switch (i) {
            case 0:
                txt5.setText(Html.fromHtml(getString(R.string.twoD_array)));
                t.setTitle(getString(R.string.activity_2D_array));
                break;
            case 1:
                txt5.setText(Html.fromHtml(getString(R.string.Addition)));
                t.setTitle(getString(R.string.activity_Addition));
                break;
            case 2:
                txt5.setText(Html.fromHtml(getString(R.string.area_circle)));
                t.setTitle(getString(R.string.activity_area_circle));
                break;
            case 3:
                txt5.setText(Html.fromHtml(getString(R.string.area_rect)));
                t.setTitle(getString(R.string.activity_Area_Rectangle));
                break;
            case 4:
                txt5.setText(Html.fromHtml(getString(R.string.Array_copy)));
                t.setTitle(getString(R.string.activity_Array_copy));
                break;
            case 5:
                txt5.setText(Html.fromHtml(getString(R.string.average_array)));
                t.setTitle(getString(R.string.activity_average_array));
                break;
        }
    }
}

