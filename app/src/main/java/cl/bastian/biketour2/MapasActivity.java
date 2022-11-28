package cl.bastian.biketour2;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import cl.bastian.biketour2.databinding.ActivityMapasBinding;

public class MapasActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapasBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapasBinding.inflate(getLayoutInflater());
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
        LatLng chillan = new LatLng(-36.60918152118628, -72.10268187695465);
        LatLng Estadio = new LatLng(-36.6183272113095, -72.10775125368606);
        LatLng plaza_Chillan_Viejo = new LatLng(-36.62201177261145, -72.13112378513317);
        LatLng quilamapu = new LatLng(-36.59061693567719, -72.0898129171628);
        LatLng outletvivo = new LatLng(-36.58873831951046, -72.07638081400813);
        LatLng cementerio = new LatLng(-36.61131205983396, -72.14984122372276);
        LatLng catedral = new LatLng(-36.60686717289794, -72.10210306123456);
        LatLng mercado = new LatLng(-36.61047434188362, -72.10105431890071);


        mMap.addMarker(new MarkerOptions().position(chillan).title("Chillan"));
        mMap.addMarker(new MarkerOptions().position(Estadio).title("Estadio De Chillan"));
        mMap.addMarker(new MarkerOptions().position(plaza_Chillan_Viejo).title("Plaza Chillan Viejo"));
        mMap.addMarker(new MarkerOptions().position(quilamapu).title("Parque Quilamapu"));
        mMap.addMarker(new MarkerOptions().position(outletvivo).title("Outlet Vivo Chillan"));
        mMap.addMarker(new MarkerOptions().position(cementerio).title("Cementerio Chillan"));
        mMap.addMarker(new MarkerOptions().position(catedral).title("Catedral De Chillan"));
        mMap.addMarker(new MarkerOptions().position(mercado).title("Mercado De Chillan"));


        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(chillan, 15 ));
    }
}