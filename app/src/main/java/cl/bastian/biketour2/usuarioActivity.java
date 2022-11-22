package cl.bastian.biketour2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class usuarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);
    }

    public void irMapa(View View) {
        Intent i = new Intent(this, mapa2Activity.class);
        startActivity(i);
    }

    public void irLista(View View) {
        Intent i = new Intent(this, ListaActivity.class);
        startActivity(i);
    }
}
