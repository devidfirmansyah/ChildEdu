package com.example.childedu.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.childedu.R;
import com.example.childedu.fragments.BirdFragment;
import com.example.childedu.fragments.CatFragment;
import com.example.childedu.fragments.CowFragment;
import com.example.childedu.fragments.DeskripsiFragment;
import com.example.childedu.fragments.DogFragment;
import com.example.childedu.fragments.ElephantFragment;
import com.example.childedu.fragments.FrogFragment;
import com.example.childedu.fragments.HomeFragment;
import com.example.childedu.fragments.HorseFragment;
import com.example.childedu.fragments.LionFragment;
import com.example.childedu.fragments.MonkeyFragment;
import com.example.childedu.fragments.SuaraFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener, DeskripsiFragment.OnFragmentInteractionListener, SuaraFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        loadFragment(new HomeFragment());
    }

    private boolean loadFragment(Fragment fragment){
        if(fragment != null){
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, fragment)
                        .addToBackStack(null)
                        .commit();
                return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        Fragment fragment = null;

        switch (menuItem.getItemId()){
            case R.id.action_home:
                fragment = new HomeFragment();
                break;
            case R.id.action_deskripsi:
                fragment = new DeskripsiFragment();
                break;
            case R.id.action_suara:
                fragment = new SuaraFragment();
        }

        return loadFragment(fragment);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @Override
    public void onmateri1Clicked() {
        getSupportFragmentManager().beginTransaction().addToBackStack(null)
                .replace(R.id.fragment_container, new MonkeyFragment())
                .commit();
    }

    @Override
    public void onmateri2Clicked() {
        getSupportFragmentManager().beginTransaction().addToBackStack(null)
                .replace(R.id.fragment_container, new HorseFragment())
                .commit();
    }

    @Override
    public void onmateri3Clicked() {
        getSupportFragmentManager().beginTransaction().addToBackStack(null)
                .replace(R.id.fragment_container, new ElephantFragment())
                .commit();
    }

    @Override
    public void onmateri4Clicked() {
        getSupportFragmentManager().beginTransaction().addToBackStack(null)
                .replace(R.id.fragment_container, new LionFragment())
                .commit();
    }

    @Override
    public void onmateri5Clicked() {
        getSupportFragmentManager().beginTransaction().addToBackStack(null)
                .replace(R.id.fragment_container, new CatFragment())
                .commit();
    }

    @Override
    public void onmateri6Clicked() {
        getSupportFragmentManager().beginTransaction().addToBackStack(null)
                .replace(R.id.fragment_container, new DogFragment())
                .commit();
    }

    @Override
    public void onmateri7Clicked() {
        getSupportFragmentManager().beginTransaction().addToBackStack(null)
                .replace(R.id.fragment_container, new CowFragment())
                .commit();
    }

    @Override
    public void onmateri8Clicked() {
        getSupportFragmentManager().beginTransaction().addToBackStack(null)
                .replace(R.id.fragment_container, new BirdFragment())
                .commit();
    }

    @Override
    public void onmateri9Clicked() {
        getSupportFragmentManager().beginTransaction().addToBackStack(null)
                .replace(R.id.fragment_container, new FrogFragment())
                .commit();
    }


    @Override
    public void onsound1Clicked() {
        MediaPlayer mySong;
        mySong = MediaPlayer.create(MainActivity.this,R.raw.monyet);
        mySong.setLooping(false);
        mySong.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mySong.start();
    }

    @Override
    public void onsound2Clicked() {
        MediaPlayer mySong;
        mySong = MediaPlayer.create(MainActivity.this,R.raw.kuda);
        mySong.setLooping(false);
        mySong.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mySong.start();
    }

    @Override
    public void onsound3Clicked() {
        MediaPlayer mySong;
        mySong = MediaPlayer.create(MainActivity.this,R.raw.gajah);
        mySong.setLooping(false);
        mySong.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mySong.start();
    }

    @Override
    public void onsound4Clicked() {
        MediaPlayer mySong;
        mySong = MediaPlayer.create(MainActivity.this,R.raw.singa);
        mySong.setLooping(false);
        mySong.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mySong.start();
    }

    @Override
    public void onsound5Clicked() {
        MediaPlayer mySong;
        mySong = MediaPlayer.create(MainActivity.this,R.raw.kucing);
        mySong.setLooping(false);
        mySong.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mySong.start();
    }

    @Override
    public void onsound6Clicked() {
        MediaPlayer mySong;
        mySong = MediaPlayer.create(MainActivity.this,R.raw.anjing);
        mySong.setLooping(false);
        mySong.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mySong.start();
    }

    @Override
    public void onsound7Clicked() {
        MediaPlayer mySong;
        mySong = MediaPlayer.create(MainActivity.this,R.raw.sapi);
        mySong.setLooping(false);
        mySong.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mySong.start();
    }

    @Override
    public void onsound8Clicked() {
        MediaPlayer mySong;
        mySong = MediaPlayer.create(MainActivity.this,R.raw.burung);
        mySong.setLooping(false);
        mySong.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mySong.start();
    }

    @Override
    public void onsound9Clicked() {
        MediaPlayer mySong;
        mySong = MediaPlayer.create(MainActivity.this,R.raw.katak);
        mySong.setLooping(false);
        mySong.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mySong.start();
    }
}
