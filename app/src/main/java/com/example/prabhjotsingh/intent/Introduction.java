package com.example.prabhjotsingh.intent;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class Introduction extends AppCompatActivity {
    TextView txt1;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);
        txt1=(TextView)findViewById(R.id.textIntro);
        Toolbar t=(Toolbar)findViewById(R.id.toolbar);
        t.setTitleTextColor(Color.WHITE);
        i=getIntent().getExtras().getInt("key");
        switch (i)
        {
            case 0: txt1.setText(Html.fromHtml(getString(R.string.intro)));
                    t.setTitle(getString(R.string.title_activity_introduction));
                    break;
            case 1: txt1.setText(Html.fromHtml(getString(R.string.features)));
                    t.setTitle(getString(R.string.title_activity_features));
                    break;
            case 2: txt1.setText(Html.fromHtml(getString(R.string.pros)));
                    t.setTitle(getString(R.string.title_activity_prosand_cons));
                    break;
            case 3: txt1.setText(Html.fromHtml(getString(R.string.environment)));
                    t.setTitle(getString(R.string.title_activity_environment_setup));
                    break;
            case 4: txt1.setText(Html.fromHtml(getString(R.string.first_program)));
                t.setTitle(getString(R.string.activity_first_program));
                break;
            case 5: txt1.setText(Html.fromHtml(getString(R.string.variables)));
                t.setTitle(getString(R.string.activity_variables));
                break;

        }

    }

}
