package com.example.tugas2login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class tbtampilanawal extends AppCompatActivity {

    Button masukscan;

    Button pindahredeem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.tbtampilanawal);
        masukscan = findViewById(R.id.scanbarcodee);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        masukscan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahkescan = new Intent(tbtampilanawal.this, scantutupbotol.class);
                startActivity(pindahkescan);
            }
        });
        pindahredeem = findViewById(R.id.buttonreedem);

        pindahredeem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukkeredeem = new Intent(tbtampilanawal.this, redeemvaganza.class);
                startActivity(masukkeredeem);
            }
        });
    }
}
