package com.example.opilane.hullapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//skins stash nupu tegevus -> nuppu vajutades käivitud meetod siht, mis viib teise klassi ehk kasutaja mõistes viib ta telefonis äpi teisele lehele
    public void Siht(View view) {
        Intent intent = new Intent(MainActivity.this, csgostash.class);
        startActivity(intent);
    }
//netilehte nupu tegevus -> nupule vajutades avab netilehekülje
    public void netileht(View view) {
        String url="https://csgostash.com/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);

    }
    //skins nupu tegevus -> nupule vajutades käivitud meetod Saada, mis viib teise klassi ehk kasutaja mõistes viib ta telefonis äpi teisele lehele
    public void Saada(View view) {
        Intent intent = new Intent(MainActivity.this, Skins.class);
        startActivity(intent);
    }
}
