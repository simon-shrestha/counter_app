package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    public static final String TAG = "MainActivity";

    private Button countButton;
    private Button toastButton;
    private TextView textView;
    private int count;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countButton = findViewById(R.id.count); //connecting java object to xml component
        toastButton = findViewById(R.id.toast);
        textView = findViewById(R.id.text);

//        count.setOnClickListener(new View.OnClickListener()
//        {
//            @Override
//            public void onClick(View v)
//            {
//                count++;
//                textView.setText(""+count);
//            }
//        });
//
//        toast.setOnClickListener(new View.OnClickListener()
//        {
//            @Override
//            public void onClick(View v)
//            {
//                Toast.makeText(MainActivity.this, "This is a toast",
//                Toast.LENGTH_LONG).show();
//            }
//        });
    }

    public void count(View view){
        count++;
        textView.setText(""+count);
        Log.d(TAG, ""+count);
        int x = 6/2;
    }

    public void toast(View view)
    {
        Toast.makeText(MainActivity.this, "This is a toast", Toast.LENGTH_LONG).show();
    }
}
