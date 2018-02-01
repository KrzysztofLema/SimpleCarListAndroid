package com.lema.simplecarlist;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends FragmentActivity implements FragmentListView.CarDescListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            FragmentListView listView = new FragmentListView();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction tr = fm.beginTransaction();
            tr.add(R.id.activity, listView);
            tr.commit();
        }
    }

    @Override
    public void elementClick(int id) {
        FragmentCarsDesc fragmentCarsDesc = new FragmentCarsDesc();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        fragmentCarsDesc.setDescryptionId(id);
        ft.replace(R.id.activity,fragmentCarsDesc);
        ft.addToBackStack(null);
        ft.commit();
    }
}
