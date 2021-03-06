package com.example.miki_proba.mau;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class Lose extends AppCompatActivity {

    private Boolean exit = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lose);
        Log.d("LOG_lose","Start");

    }

    public void Onclick(View view){
        Intent tothird = new Intent(Lose.this, ThirdActivity.class);
        startActivity(tothird);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LOG_lose","Start");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LOG_lose","Pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LOG_lose","Resume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LOG_lose","Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LOG_lose", "Destroy");
    }

    @Override
    public void onBackPressed() {
        if (exit) {

            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);

        } else {
            Toast.makeText(this, "Press Back again to Exit.",
                    Toast.LENGTH_SHORT).show();
            exit = true;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    exit = false;
                }
            }, 3 * 1000);

        }

    }
}
