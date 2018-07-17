package com.hb.sseung.godbody;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by sseung on 2018-07-17.
 */

public class SummaryActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        //현재 날짜 정보 가저옴
        //long now = System.currentTimeMillis();
        //Date date = new Date(now);
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //String strCurrentDate = sdf.format(date);
        //현재 날짜 표시
        //TextView textDate = (TextView) findViewById(R.id.textDate);
        //textDate.setText(strCurrentDate);
    }

}
