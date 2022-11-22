package cl.bastian.biketour2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListaActivity extends AppCompatActivity {
    private ListView listView;
    private ArrayList <String> lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);


        listView = findViewById(R.id.listview);
        lista = new ArrayList<>();
        lista.add("lista 1");
        lista.add("lista 2");
        lista.add("lista 3");
        lista.add("lista 4");
        lista.add("lista 5");

        ArrayAdapter <String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, lista);

        listView.setAdapter(adapter);


    }
}