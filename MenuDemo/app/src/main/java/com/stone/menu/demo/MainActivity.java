package com.stone.menu.demo;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    MenuItem item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);

        item = menu.findItem(R.id.main1);
        Toast.makeText(getApplicationContext(), item.getActionView() +"", Toast.LENGTH_SHORT).show();

        return true;
    }

    @Override
    protected void onResume() {
        super.onResume();
        if(null != item){
            item.setIcon(R.mipmap.ic_launcher_round);
        }
    }
}
