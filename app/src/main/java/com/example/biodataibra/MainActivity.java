package com.example.biodataibra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alamat(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Wisma+Pison/@-6.9771728,110.4077696,18.08z/data=!4m5!3m4!1s0x2e708b4b631301bd:0xa0982d345cd6321b!8m2!3d-6.9775665!4d110.40793"));
        startActivity(intent);
    }

    public void telepon(View view)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:081228243814"));
        startActivity(intent);
    }

    public void mail(View view)
    {
        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:ibrahimmahardhikaid@gmail.com"));
        startActivity(intent);

        }

    public void bgalamat(View view)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Wisma+Pison/@-6.9771728,110.4077696,18.08z/data=!4m5!3m4!1s0x2e708b4b631301bd:0xa0982d345cd6321b!8m2!3d-6.9775665!4d110.40793"));
        startActivity(intent);
    }

    public void bgtelepon(View view)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:081228243814"));
        startActivity(intent);
    }

    public void bgmail(View view)
    {
        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:ibrahimmahardhikaid@gmail.com"));
        startActivity(intent);

    }


}