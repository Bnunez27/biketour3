package cl.bastian.biketour2;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

import cl.bastian.biketour2.databinding.ActivityMapa2Binding;

public class mapa2Activity extends FragmentActivity implements OnMapReadyCallback {
    private GoogleMap mMap;
    LatLng CicloVia1 = new LatLng(-36.591607, -72.122103);
    LatLng Ciclovia1Corte = new LatLng(-36.597105, -72.112338);
    LatLng Ciclovia1Fin = new LatLng(-36.602359, -72.090800);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa2);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.getUiSettings().setCompassEnabled(true);
        mMap.getUiSettings().setIndoorLevelPickerEnabled(true);

        // Add a marker in Sydney and move the camera
        LatLng Rburger = new LatLng(-36.6083147, -72.1115355);
        mMap.addMarker(new MarkerOptions().position(Rburger).title("Randy's Burger").snippet("Rosas #820, Chillán"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Rburger, 15.0f));
        //mMap.moveCamera((CameraUpdateFactory.zoomIn()));

        LatLng tentao = new LatLng(-36.611901, -72.094490);
        mMap.addMarker(new MarkerOptions().position(tentao).title("Tentao").snippet("Av. Argentina #772, Chillán"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(tentao, 15.0f));
        //mMap.moveCamera((CameraUpdateFactory.zoomIn()));

        LatLng papajohns = new LatLng(-36.607104, -72.092423);
        mMap.addMarker(new MarkerOptions().position(papajohns).title("Papa John's").snippet("Av. Argentina #387, Chillán"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(papajohns, 15.0f));
        //mMap.moveCamera((CameraUpdateFactory.zoomIn()));

        LatLng xavisfries = new LatLng(-36.617089, -72.097370);
        mMap.addMarker(new MarkerOptions().position(xavisfries).title("Xavi's Fries").snippet("Av. Collín #1160, Chillán"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(xavisfries, 15.0f));
        //mMap.moveCamera((CameraUpdateFactory.zoomIn()));

        LatLng ramona = new LatLng(-36.601067, -72.105452);
        mMap.addMarker(new MarkerOptions().position(ramona).title("La Ramona").snippet("Claudio Arrau #117, Chillán"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ramona, 15.0f));
        //mMap.moveCamera((CameraUpdateFactory.zoomIn()));

        LatLng quincho = new LatLng(-36.613266, -72.094749);
        mMap.addMarker(new MarkerOptions().position(quincho).title("Quincho Sandwich").snippet("Av. Argentina #889, Chillán"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(quincho, 15.0f));
        //mMap.moveCamera((CameraUpdateFactory.zoomIn()));

        mMap.addPolyline((new PolylineOptions()).add(CicloVia1, Ciclovia1Corte, Ciclovia1Fin).
                width(5).color(Color.RED).geodesic(true));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(CicloVia1, 14));


    }
}