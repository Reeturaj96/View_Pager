package com.example.viewpager;

import android.os.Bundle;
import com.google.android.material.tabs.TabLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import TabFragments.BlankFragment;
import TabFragments.BlankFragment2;
import TabFragments.BlankFragment3;

public class MainActivity extends AppCompatActivity
{
    ViewPager viewPager;
    TabLayout tabLayout;

    BlankFragment blankFragment;
    BlankFragment2 blankFragment2;
    BlankFragment3 blankFragment3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        viewPager=findViewById(R.id.viewPager);
        tabLayout=findViewById(R.id.tablayout);

        blankFragment=new BlankFragment();
        blankFragment2=new BlankFragment2();
        blankFragment3=new BlankFragment3();

        MyPagerAdapter myPagerAdapter = new MyPagerAdapter(this, getSupportFragmentManager());
        tabLayout.setupWithViewPager(viewPager);
        viewPager.setAdapter(myPagerAdapter);


    }

}
