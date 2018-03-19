package com.example.matteobellinaso.tablayout;

import android.app.FragmentManager;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;

import com.example.matteobellinaso.tablayout.Item.ItemList;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ItemList.initData(this);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        SimpleFragmentPagerAdapter simpleFragmentPagerAdapter = new SimpleFragmentPagerAdapter(this, getSupportFragmentManager() );

        viewPager.setAdapter(simpleFragmentPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.sibling_tabs);

        tabLayout.setupWithViewPager(viewPager);

    }
}
