package com.hfad.starbuzz;
import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.AdapterView;
import android.widget.ListView;
import android.view.View;
public class MainActivity extends Activity {@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    //Создать OnItemClickListener
    AdapterView.OnItemClickListener itemClickListener =
            new AdapterView.OnItemClickListener(){
                public void onItemClick(AdapterView<?> listView,
                                        View itemView,
                                        int position,
                                        long id) {
                    if (position == 0) {
                        Intent intent = new Intent(MainActivity.this,
                                DrinkCategoryActivity.class);
                        startActivity(intent);
                    }
                }
            };
    //Добавить слушателя к списковому представлению
    ListView listView = (ListView) findViewById(R.id.list_options);
    listView.setOnItemClickListener(itemClickListener);
}
}