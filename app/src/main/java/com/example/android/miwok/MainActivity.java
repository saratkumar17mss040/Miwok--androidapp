/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

//import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{

//    setContentView(R.layout.activity_main);
//
//    // Find the view pager that will allow the user to swipe between fragments
//    ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
//
//    // Create an adapter that knows which fragment should be shown on each page
//    SimpleFragmentPagerAdapter adapter = new SimpleFragmentPagerAdapter(getSupportFragmentManager());
//
//    // Set the adapter onto the view pager
//        viewPager.setAdapter(adapter);
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_category);

        ViewPager viewPager =  findViewById(R.id.viewpager);

        SimpleFragmentPagerAdapter adapter= new SimpleFragmentPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        TabLayout tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);

    }
}
//        TextView numbers =  findViewById(R.id.numbers);
//        TextView family = findViewById(R.id.family);
//        TextView colors = findViewById(R.id.colors);
//        TextView phrases = findViewById(R.id.phrases);
//
//        numbers.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(view.getContext(),"Numbers",Toast.LENGTH_LONG).show();
//                Intent numbersIntent = new Intent(MainActivity.this,NumbersActivity.class);
//                startActivity(numbersIntent);
//            }
//        });
//
//        family.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(view.getContext(),"Family",Toast.LENGTH_LONG).show();
//                Intent familyIntent = new Intent(MainActivity.this,FamilyActivity.class);
//                startActivity(familyIntent);
//            }
//        });
//
//        colors.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(view.getContext(),"Colors",Toast.LENGTH_LONG).show();
//                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
//                startActivity(colorsIntent);
//            }
//        });
//
//        phrases.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(view.getContext(),"Phrases",Toast.LENGTH_LONG).show();
//                Intent phrasesIntent = new Intent(MainActivity.this,PhrasesActivity.class);
//                startActivity(phrasesIntent);
//            }
//        });
//
//
//    }

/*  public void openNumbersList(View view)
    {
        Intent i = new Intent(this,NumbersActivity.class);
        startActivity(i);
    }

    public void openFamilyMembers(View view)
    {
        Intent i = new Intent(this,FamilyActivity.class);
        startActivity(i);
    } */

