package id.example.shashank.projectunitkonversi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class DetailJarakActivity extends AppCompatActivity {

    Spinner spJarak;
    EditText edtInputJarak;
    TextView txtHasilJarak;
    Button tbHitung3;
    float hasilConversi3 = 0;
    int posConversi3 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_jarak);

        edtInputJarak = findViewById(R.id.edtInputJarak);
        txtHasilJarak = findViewById(R.id.txtHasilJarak);
        spJarak = findViewById(R.id.spJarak);
        tbHitung3 = findViewById(R.id.tbHitung3);

        String[] dataLuas = new String[] {"Km to M", "M to Cm", "Cm to Km", "Km to Cm"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, dataLuas);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spJarak.setAdapter(adapter);
        spJarak.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
                    public void onItemSelected(AdapterView<?>parent, View view, int position, long id){
                posConversi3 = position;
            }
            @Override
            public void onNothingSelected(AdapterView<?>parent) {

            }
        });
        tbHitung3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetText118n")
            @Override
            public void onClick(View v) {
                if (posConversi3==0){
                    hasilConversi3 = (float) (Double.parseDouble(edtInputJarak.getText().toString())* 100 * 100 * 100);
                    txtHasilJarak.setText(""+hasilConversi3);
                } else if (posConversi3==1) {
                    hasilConversi3 = (float) (Double.parseDouble(edtInputJarak.getText().toString())* 100 * 100);
                    txtHasilJarak.setText(""+hasilConversi3);
                } else if (posConversi3==2) {
                    hasilConversi3= (float) (Double.parseDouble(edtInputJarak.getText().toString())/ 100 / 100 / 100 /100 / 100);
                    txtHasilJarak.setText(""+hasilConversi3);
                } else if (posConversi3==3) {
                    hasilConversi3 = (float) (Double.parseDouble(edtInputJarak.getText().toString()) * 100 * 100 * 100 * 100 * 100);
                    txtHasilJarak.setText("" + hasilConversi3);
                }
            }
        });

    }
}