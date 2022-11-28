package cl.bastian.biketour2;

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

import cl.bastian.biketour2.databinding.ActivityMapasCicloviasBinding;

public class MapasCicloviasActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapasCicloviasBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapasCicloviasBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng CicloVia1 = new LatLng(-36.591607, -72.122103);
        LatLng Ciclovia1Corte = new LatLng(-36.597105, -72.112338);
        LatLng Ciclovia1Fin = new LatLng(-36.602359, -72.090800);

        LatLng CicloVia2 = new LatLng(-36.59870520570339, -72.10606662369409);
        LatLng Ciclovia2Fin = new LatLng(-36.61286336041238, -72.11136336191565);

        LatLng CicloVia3 = new LatLng(-36.59795478891502, -72.10913712909115);
        LatLng Ciclovia3Fin = new LatLng(-36.61169346027103, -72.11428282063459);

        LatLng CicloVia4 = new LatLng(-36.608343322898904, -72.09326503094216);
        LatLng Ciclovia4Fin = new LatLng(-36.604006875004124, -72.11142090326348);

        LatLng CicloVia5 = new LatLng(-36.613319410316926, -72.09510996218664);
        LatLng Ciclovia5Fin = new LatLng(-36.60887114227067, -72.11329700222643);

        LatLng CicloVia6 = new LatLng(-36.59644443695199, -72.11379561775328);
        LatLng Ciclovia6Fin = new LatLng(-36.60166768439881, -72.1179168783061);

        LatLng CicloVia7 = new LatLng(-36.61703112967001, -72.0964099246243);
        LatLng Ciclovia7Fin = new LatLng(-36.61368102414811, -72.11136673102816);

        LatLng CicloVia8 = new LatLng(-36.61371762417304, -72.11211238512756);
        LatLng Ciclovia8Fin = new LatLng(-36.6206015963335, -72.12209692470589);

        LatLng CicloVia9 = new LatLng(-36.62301263763275, -72.12649574768332);
        LatLng Ciclovia9Fin = new LatLng(-36.6216521307393, -72.13675251476239);





        mMap.addPolyline((new PolylineOptions()).add(CicloVia1, Ciclovia1Corte, Ciclovia1Fin, CicloVia2, Ciclovia2Fin).
                width(5).color(Color.RED).geodesic(true));

        mMap.addPolyline((new PolylineOptions()).add(CicloVia3, Ciclovia3Fin).
                width(5).color(Color.RED).geodesic(true));

        mMap.addPolyline((new PolylineOptions()).add(CicloVia4, Ciclovia4Fin).
                width(5).color(Color.RED).geodesic(true));

        mMap.addPolyline((new PolylineOptions()).add(CicloVia5, Ciclovia5Fin).
                width(5).color(Color.RED).geodesic(true));

        mMap.addPolyline((new PolylineOptions()).add(CicloVia6, Ciclovia6Fin).
                width(5).color(Color.RED).geodesic(true));

        mMap.addPolyline((new PolylineOptions()).add(CicloVia7, Ciclovia7Fin).
                width(5).color(Color.RED).geodesic(true));

        mMap.addPolyline((new PolylineOptions()).add(CicloVia8, Ciclovia8Fin).
                width(5).color(Color.RED).geodesic(true));

        mMap.addPolyline((new PolylineOptions()).add(CicloVia9, Ciclovia9Fin).
                width(5).color(Color.RED).geodesic(true));



        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(CicloVia1, 14));
    }
}