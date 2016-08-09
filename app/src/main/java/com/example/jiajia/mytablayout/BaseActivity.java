package com.example.jiajia.mytablayout;

import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

/**
 * Created by jiajia on 2016/8/9.
 */
public class BaseActivity  extends AppCompatActivity{
    public Toolbar toolbar;
    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);
        toolbar = (Toolbar) findViewById(R.id.tb_toolbar);
        setSupportActionBar(toolbar);
    }
}
