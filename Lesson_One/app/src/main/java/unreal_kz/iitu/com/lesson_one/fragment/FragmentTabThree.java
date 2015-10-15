package unreal_kz.iitu.com.lesson_one.fragment;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.SeekBar;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import unreal_kz.iitu.com.lesson_one.R;

/**
 * Created by Unreal_KZ on 02.10.2015.
 */
public class FragmentTabThree extends Fragment{

    private static final int LAYOUT = R.layout.fragment_layout_map;
    private View view;
    private GoogleMap mMap;
    /*private int progress_value = 16;
    private int initialProgressNumber = 0;*/

    public static FragmentTabThree getInstance() {
        Bundle args = new Bundle();
        FragmentTabThree fragmentTabThree = new FragmentTabThree();
        fragmentTabThree.setArguments(args);
        return fragmentTabThree;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        try {
            setUpMapIfNeeded();
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        view = inflater.inflate(LAYOUT,container,false);
        return view;
    }

    private void setUpMapIfNeeded() {
        if (mMap == null){
            //mMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
            mMap = ((SupportMapFragment) getActivity().getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
            if (mMap != null){
                setUpMap();
            }
        }
    }

    private void setUpMap() {
        mMap.setMyLocationEnabled(true);
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);

        //LocationManager locManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        //Criteria criteria = new Criteria();
        //String provider = locManager.getBestProvider(criteria, true);
        //Location myLocation = locManager.getLastKnownLocation(provider);


        /*double myLatitude = myLocation.getLatitude();
        double myLongitude = myLocation.getLongitude();
        LatLng myLatLongPos = new LatLng(myLatitude,myLongitude);*/

        //mMap.moveCamera(CameraUpdateFactory.newLatLng(myLatLongPos));
        //mMap.animateCamera(CameraUpdateFactory.zoomTo(progress_value));
        //txtView.setText("Progress: " + seek_bar.getProgress());
        //initialProgressNumber = seek_bar.getProgress();
        /*seek_bar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        //int ZoomingNumber = 0;
                        if (seekBar.getProgress() > initialProgressNumber) {
                            progress_value += (seekBar.getProgress()-initialProgressNumber);
                            mMap.animateCamera(CameraUpdateFactory.zoomTo(progress_value));
                            initialProgressNumber = seekBar.getProgress();
                        } else {
                            progress_value -= (initialProgressNumber-seekBar.getProgress());
                            mMap.animateCamera(CameraUpdateFactory.zoomTo(progress_value));
                            initialProgressNumber = seekBar.getProgress();
                        }
                    }
                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                    }
                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                    }
                }
        );*/


        //mMap.addMarker(new MarkerOptions().position(new LatLng(myLatitude, myLongitude)).title("You are here!"));
    }
}
