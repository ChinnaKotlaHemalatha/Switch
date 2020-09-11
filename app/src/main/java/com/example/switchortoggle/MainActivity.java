package com.example.switchortoggle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;


public class MainActivity extends AppCompatActivity {
ImageView imageview;
SwitchCompat switchCompat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageview=(ImageView)findViewById(R.id.imageview);
        switchCompat=(SwitchCompat) findViewById(R.id.switchButton);
        imageview.setImageDrawable(getResources().getDrawable(R.drawable.download));
        switchCompat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (switchCompat.isChecked()) {
                    imageview.setImageDrawable(getResources().getDrawable(R.drawable.images));
                   Toast.makeText( MainActivity.this,"Power:On", LENGTH_SHORT ).show();
            } else {
            imageview.setImageDrawable(getResources().getDrawable(R.drawable.download));
                    Toast.makeText(MainActivity.this,"Power:Off", LENGTH_SHORT).show();
        }
            }
        });

    }
}