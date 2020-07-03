package com.example.viewpager;

import android.os.Bundle;
import com.google.android.material.tabs.TabLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
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

        MyPagerAdapter myPagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
        tabLayout.setupWithViewPager(viewPager);
        viewPager.setAdapter(myPagerAdapter);


    }

    class MyPagerAdapter extends FragmentPagerAdapter
    {
        String[] fragmentname={"First","Second","Third"};

        public MyPagerAdapter( FragmentManager fm) {
            super(fm);
        }


        @Override
        public Fragment getItem(int position)
        {
            switch (position)
            {
                case 0:
                    return blankFragment;
                case 1:
                    return blankFragment2;
                case 2:
                    return blankFragment3;
            }
            return null;
        }

        @Override
        public int getCount()
        {
            return fragmentname.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return fragmentname[position];
        }
    }
}
