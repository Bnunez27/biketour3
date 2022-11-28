package cl.bastian.biketour2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import cl.bastian.biketour2.modelo.RegistroActividadDiaria;

public class Registroactividades extends AppCompatActivity {

    private CalendarView calendarView;
    private EditText caloriasDiarias;
    private EditText kmDiarias;
    private EditText duracionDiarias;
    private TextView fecha_actividad;
    private Button guardar;



    private FirebaseDatabase database;
    private DatabaseReference myRef;
    FirebaseAuth mAuth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registroactividades);

        calendarView = findViewById(R.id.calendarView);
        caloriasDiarias = findViewById(R.id.text_calorias);
        kmDiarias = findViewById(R.id.text_km);
        duracionDiarias = findViewById(R.id.text_duracion);
        fecha_actividad = findViewById(R.id.text_fecha);

        guardar = findViewById(R.id.button_agregar);

        mAuth = FirebaseAuth.getInstance();


         database = FirebaseDatabase.getInstance();
         myRef = database.getReference("Registro Actividad");


        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                String fechaSeleccionada = dayOfMonth+"/"+month+"/"+year;




                fecha_actividad.setText(fechaSeleccionada);



            }
        });

        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                guardarActividadDiaria(fecha_actividad.getText().toString(), caloriasDiarias.getText().toString(), kmDiarias.getText().toString(), duracionDiarias.getText().toString());
            }
        });



    }
    public void guardarActividadDiaria(String fecha, String calorias, String km, String duracion){
        RegistroActividadDiaria registroActividadDiaria = new RegistroActividadDiaria(fecha, calorias, km, duracion);

        if (mAuth.getCurrentUser()!=null)
        myRef.child(mAuth.getCurrentUser().getUid()).setValue(registroActividadDiaria).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void unused) {
                Toast.makeText(Registroactividades.this,"Se ha guardado correctamente", Toast.LENGTH_SHORT).show();

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(Registroactividades.this,"No se ha guardado correctamente", Toast.LENGTH_SHORT).show();


            }
        });

    }

}