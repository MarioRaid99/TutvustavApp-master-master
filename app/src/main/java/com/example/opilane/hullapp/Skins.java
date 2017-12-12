package com.example.opilane.hullapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;

public class Skins extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skins);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
// avab veebivaates lehekülje, ei kasuta selleks telefonis olevaid browsereid
//  täpsem lugemine -> https://developer.android.com/reference/android/webkit/WebView.html
        WebView webview = new WebView(this);
        setContentView(webview);

        webview.loadUrl("https://csgostash.com/weapon/AK-47");
    }}


