package com.example.tugas2login;

import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class tugas2register extends AppCompatActivity {

    Button pindahlogin;
    Button pindahregis;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tugas2register);
        pindahlogin = findViewById(R.id.kotaklogin);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        pindahlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masuklogin = new Intent(tugas2register.this, tugas3loginactivity.class);
                startActivity(masuklogin);
            }
        });

        pindahregis = findViewById(R.id.register);

        pindahregis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukreg = new Intent(tugas2register.this, tugas3register.class);
                startActivity(masukreg);
            }
        });
    }
}
