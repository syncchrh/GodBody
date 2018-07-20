package com.hb.sseung.godbody;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    Fragment1 fragment1;
    Fragment2 fragment2;
    Fragment3 fragment3;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowTitleEnabled(false);

        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
        fragment3 = new Fragment3();

        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment1).commit();

        TabLayout tabs = (TabLayout) findViewById(R.id.tabs);
        tabs.addTab(tabs.newTab().setText("Call"));
        tabs.addTab(tabs.newTab().setText("Spam"));
        tabs.addTab(tabs.newTab().setText("Information"));

        tabs.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener(){
          @Override
          public void onTabSelected(TabLayout.Tab tab){
              int position = tab.getPosition();
              Log.d("MainActivity", "선택된 탭 : " + position);

              Fragment selected = null;
              if (position == 0)
              {
                  selected = fragment1;
              }
              else if (position == 1)
              {
                  selected = fragment2;
              }
              else if (position == 2)
              {
                  selected = fragment3;
              }

              getSupportFragmentManager().beginTransaction().replace(R.id.container, selected).commit();
          }

          @Override
          public void onTabUnselected(TabLayout.Tab tab){}

          @Override
          public void onTabReselected(TabLayout.Tab tab) {}

        });

//        Button b = (Button)findViewById(R.id.button);
//        b.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view){
//                Intent intent = new Intent(getApplicationContext(), SummaryActivity.class);
//                startActivity(intent);
//            }
//        });
    }

    public void onButton(View view){
        Intent intent = new Intent(getApplicationContext(), SummaryActivity.class);
        startActivity(intent);
    }


}
