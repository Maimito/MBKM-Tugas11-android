package com.mbkm.tugas11_gits;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView mBottomnav;
    private Fragment fragment;
    String PackageName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBottomnav = (BottomNavigationView) findViewById(R.id.bottomnav);
        mBottomnav.setOnNavigationItemSelectedListener(BottomMethod);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame, new MusicFragment()).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener BottomMethod=new
            BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    fragment = null;
                    switch (item.getItemId()){
                        case R.id.music_menu:
                            fragment = new MusicFragment();
                            setTitle("Music");
                            break;

                        case R.id.video_menu:
                            fragment = new VideoFragment();
                            setTitle("Video");
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,fragment).commit();
                    return true;
                }
            };

    public String retrievePackageName(){
       String PackageName = getPackageName();
        return retrievePackageName();
    }
}

