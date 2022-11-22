package cl.bastian.biketour2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class RegistroActividadesActivity extends AppCompatActivity {
    private EditText mEdittextCalorias;
    private Button mBtnenviaractividad;
    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_actividades);

        mEdittextCalorias = (EditText) findViewById(R.id.calorias);
        mBtnenviaractividad = (Button) findViewById(R.id.btningresaractividad);

        mDatabase = FirebaseDatabase.getInstance().getReference();

        mBtnenviaractividad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mensaje = mEdittextCalorias.getText().toString();
                mDatabase.child("").setValue(mEdittextCalorias);

            }
        });
    }
}