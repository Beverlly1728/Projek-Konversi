package id.example.shashank.projectunitkonversi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
CardView CdTemp;
CardView CdMasa;
CardView CdJarakk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CdTemp = findViewById(R.id.CdTemp);
        CdTemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DetailSuhuActivity.class));
            }
        });

     
        setContentView(R.layout.activity_main);
        CdMasa = findViewById(R.id.CdMasa);
        CdMasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DetailMasaActivity.class));
            }
        });

        setContentView(R.layout.activity_main);
        CdJarakk = findViewById(R.id.CdJarak);
        CdJarakk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DetailJarakActivity.class));
            }
        });

    }
}