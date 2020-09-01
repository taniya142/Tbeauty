package com.delta.layouts;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;

public class Layout5 extends AppCompatActivity {
    ListView listView;
    Toolbar toolbar;


    ArrayList<brand> items = new ArrayList<>();

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.more);


        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        listView = (ListView) findViewById(R.id.myList);

        items.add(new brand("Benefit", R.drawable.benefit));
        items.add(new brand("BH cosmetics", R.drawable.bh));
        items.add(new brand("Bobbi Brown", R.drawable.loreal));
        items.add(new brand("e.l.f", R.drawable.elf));
        items.add(new brand("Lakme", R.drawable.lakme));
        items.add(new brand("L'oreal", R.drawable.loreal));
        items.add(new brand("Mac", R.drawable.mac));
        items.add(new brand("Maybelline", R.drawable.maybe));
        items.add(new brand("Sephora", R.drawable.sephora));
        items.add(new brand("Smashbox", R.drawable.smashbox));
        items.add(new brand("Sugar", R.drawable.sugar));
        items.add(new brand("Too faced", R.drawable.toofaced));


        listView.setAdapter(new myadapter(Layout5.this, R.layout.brandlist, items));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.layout, menu);

//        final MenuItem menuItem = menu.findItem(R.id.search);
//        SearchView searchView = (SearchView) menuItem.getActionView();
//
//        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String query) {
//                return false;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String newText) {
//                ArrayList<brand> results = new ArrayList<>();
//                for (brand x : items) {
//                    if (x.brand_name.contains(newText))
//                        results.add(x);
//                }
//                ((myadapter) listView.getAdapter()).update(results);
//
//                return false;
//            }
//        });
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        if (id == R.id.action_share) {
            return true;
        }
        if (id == R.id.search) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
