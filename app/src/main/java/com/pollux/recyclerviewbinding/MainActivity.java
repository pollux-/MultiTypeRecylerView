package com.pollux.recyclerviewbinding;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.pollux.recyclerviewbinding.model.BaseModel;
import com.pollux.recyclerviewbinding.model.Collection;
import com.pollux.recyclerviewbinding.model.Product;
import com.pollux.recyclerviewbinding.model.Recipe;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        List<BaseModel> baseModels = new ArrayList<>();
        Product product = new Product();
        product.setTitle("BBQ Chicken");
        baseModels.add(product);
        Recipe recipe = new Recipe();
        recipe.setTitle("Pulled Pork");
        baseModels.add(recipe);
        Collection collection = new Collection();
        collection.setTitle("Recipe Collection");
        baseModels.add(collection);
        Recipe recipe2 = new Recipe();
        recipe2.setTitle("Pulled Chicken");
        baseModels.add(recipe2);
        Collection collection2 = new Collection();
        collection2.setTitle("Hot and Spicy Collection");
        baseModels.add(collection2);
        Recipe recipe3 = new Recipe();
        recipe3.setTitle("Beef pepper fry");
        baseModels.add(recipe3);

        RecyclerView list = (RecyclerView) findViewById(R.id.list);
        list.setLayoutManager(new LinearLayoutManager(this));
        list.setAdapter(new InventoryAdapter(baseModels,this));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
