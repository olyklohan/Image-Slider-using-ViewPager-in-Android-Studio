//MainActivity.java file

package org.geeksforgeeks.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //creating object of ViewPager
    ViewPager mViewPager;

    //images array
    int[] images = {R.drawable.a1, R.drawable.a2, R.drawable.a3, R.drawable.a4,
                    R.drawable.a5, R.drawable.a6, R.drawable.a7, R.drawable.a8};

    //Creating Object of ViewPagerAdapter
    ViewPagerAdapter mViewPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing the ViewPager Object
        mViewPager = (ViewPager)findViewById(R.id.viewPagerMain);

        //Initializing the ViewPagerAdapter
        mViewPagerAdapter = new ViewPagerAdapter(MainActivity.this, images);

        //Adding the Adapter to the ViewPager
        mViewPager.setAdapter(mViewPagerAdapter);


    }





}