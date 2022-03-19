package com.moch.maps;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.moch.maps.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
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

        LatLng rumah = new LatLng(-6.167109, 106.628779);
        mMap.addMarker(new MarkerOptions().position(rumah).title("Ini maps rumah saya"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rumah));

        LatLng unpam = new LatLng(-6.345972175147943, 106.69165561779744);
        mMap.addMarker(new MarkerOptions().position(unpam).title("Ini maps unpam"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(unpam));

        LatLng sekolah = new LatLng(-6.1932826538301855,  106.62980845366656);
        mMap.addMarker(new MarkerOptions().position(sekolah).title("Ini maps Sekolah saya dulu"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sekolah));

    }
}