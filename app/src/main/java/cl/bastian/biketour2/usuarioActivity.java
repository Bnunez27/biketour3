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
        Intent i = new Intent(this, MapasActivity.class);
        startActivity(i);
    }

    public void irLista(View View) {
        Intent i = new Intent(this, Registroactividades.class);
        startActivity(i);
    }

    public void irMapaCiclovia(View View) {
        Intent i = new Intent(this, MapasCicloviasActivity.class);
        startActivity(i);
    }


}
