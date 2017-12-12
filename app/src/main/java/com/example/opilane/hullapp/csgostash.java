package com.example.opilane.hullapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageButton;

public class csgostash extends AppCompatActivity {

    //lisan muutuja pildinupp tüübilt ImageButton
    ImageButton pildiNupp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csgostash);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
// initialize the ImageButton
        pildiNupp = (ImageButton)findViewById(R.id.pildiNupp);
        // lisan pildinupule onclicklisteneri argumendiga imageButtonHandler
        pildiNupp.setOnClickListener(imageButtonHandler);
    }
    //loon View.OnClickListeneri imageButtonHandleriga määran ta uueks View.OnClickListeneriks ja kirjutan selle üle OnClick tegevusega
    View.OnClickListener imageButtonHandler = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //määran pildinupu pildi ressurssiks drawable kaustast picture2
            // ehk kui oled vajutanud pildile siis muutub pilt teiseks
            pildiNupp.setImageResource(R.drawable.picture2);
        }
    };
}






