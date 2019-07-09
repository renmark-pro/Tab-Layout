package com.aliyanaresorts.tablayoutcustom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabAdapter adapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);

        adapter = new TabAdapter(getSupportFragmentManager());
        adapter.addFragment(new Tab1Fragment(), "1 Frag");
        adapter.addFragment(new Tab2Fragment(), "Tab 2 Frag");
        adapter.addFragment(new Tab3Fragment(), "3 Frag");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        for (int i = 0 ; i<2 ; i++ ){
            tabLayout.getTabAt(i).setIcon(tabIcons[i]);
        }

    }

    private int[] tabIcons = {
            R.drawable.ic_android_black_24dp,
            R.drawable.ic_assignment_return_black_24dp,
            R.drawable.ic_android_black_24dp
    };

}
