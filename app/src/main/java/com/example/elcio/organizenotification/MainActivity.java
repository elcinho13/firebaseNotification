package com.example.elcio.organizenotification;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if (getIntent().getExtras() != null) {
            for (String key : getIntent().getExtras().keySet()) {
                Object value = getIntent().getExtras().get(key);
                Log.d(TAG, "Key: " + key + " Value: " + value);
            }

        }

        subTopic();
        logTokem();
    }

    private void subTopic(){

        FirebaseMessaging.getInstance().subscribeToTopic("news");

    }

    private void logTokem(){
        String Tokem = FirebaseInstanceId.getInstance().getToken();

        String menseger = getString(R.string.msg_token_fmt, Tokem);
        Log.d(TAG, menseger);
        Toast.makeText(this, menseger, Toast.LENGTH_SHORT).show();
    }


}
