package com.example.week4day4hw;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.net.Uri;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements CelebrityTopViewFragment.OnFragmentInteractionListener,CelebListBottomFragment.OnFragmentInteractionListener  {
FragmentManager myFragmentManager;
CelebListBottomFragment bottomFragment;
CelebrityTopViewFragment topViewFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // populateList();
        myFragmentManager =getSupportFragmentManager();
        bottomFragment = bottomFragment.newInstance("","");
        myFragmentManager.beginTransaction().add(R.id.flBottomLayout,bottomFragment).commit();
        topViewFragment = topViewFragment.newInstance("","");
        myFragmentManager.beginTransaction().add(R.id.flTopView,topViewFragment).commit();

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void sendPath(int path , String description) {
        topViewFragment.setFragmentViews(path,description);
    }

//

}
