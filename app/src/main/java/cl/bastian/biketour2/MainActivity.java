package cl.bastian.biketour2;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irIniciar (View View){
        Intent i = new Intent(this, IniciarSesionActivity.class);
        startActivity(i);
    }

    public void irRegistrarse(View View){
        Intent i = new Intent(this, RegistrarseActivity.class);
        startActivity(i);


    }

    public void irconsejo(View View){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.conaset.cl/ciclistas-recomendaciones/#:~:text=Si%20te%20desplazas%20en%20bicicleta,(uno%20detrás%20del%20otro)."));
        startActivity(i);


    }
    public void irimplemento(View View){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://blog.terranea.es/ciclismo-accesorios-ciclista-bicicleta/"));
        startActivity(i);


    }
    public void irbici(View View){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.brujulabike.com/mejores-bicicletas-carretera/"));
        startActivity(i);


    }
    public void iratracciones(View View){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tripadvisor.cl/Attractions-g317797-Activities-Chillan_Biobio_Region.html"));
        startActivity(i);


    }





}