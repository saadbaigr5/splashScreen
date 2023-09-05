package com.example.splashscree;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {
// yaha mainfest file main changes kia hain Main.activity ki jagah splash or splash ki jaga Main.activity kia ha takay Main.Activity execute na ho.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
// Handler ek meathod ha jis sa same time par 2 screens parellel chal rahi hain ismain post delay splash screen ko roka ga for few seconds.
        // post delay main 2 cheezain required hain pehli to runnable jo ham new sa initiate karain ga dusri delayble ka kitni dair ka lia delay hoga


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent ihome = new Intent(SplashScreen.this , MainActivity.class); // ya simply intent ki class ha jo screen linking karti ha
                startActivity(ihome);
                finish();  //ya batae ga ka ek dafa hi ya activity of splash hogi uska baad nahi hogi jab aap backpress karain ga

            }
        } ,4000);



    }
}