package com.example.roomdatabaseview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.SearchView;

public class MainActivity extends AppCompatActivity {


    UserDatabase storeDatabase;

    RecyclerView recyclerView;
    UserAdapter userAdapter;
    SearchView searchView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        searchView = findViewById(R.id.searchView);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                return false;
            }
        });

        storeDatabase = UserDatabase.getDatabase(this);

        /**
         * these lines for input data in UserEntity
         */

        storeDatabase.storeDao().addTable(new UserEntity("Your Juction","Anuj","7727064399"));
        storeDatabase.storeDao().addTable(new UserEntity("Tadka Star","Subhash","9990088611"));
        storeDatabase.storeDao().addTable(new UserEntity("Fastian","Rajesh","7727164399"));
        storeDatabase.storeDao().addTable(new UserEntity("Bhook lagi","Anand","9990188611"));

        /**
         * this is input data for UserEntity2
         */

        storeDatabase.storeDao().addTable2(new UserEntity2("7727064399","Jaipur",28.052920,73.314720));
        storeDatabase.storeDao().addTable2(new UserEntity2("9990188611","Bikaner",28.052644,73.314221));
        storeDatabase.storeDao().addTable2(new UserEntity2("7727164399","Jaipur",28.053401,73.315980));
        storeDatabase.storeDao().addTable2(new UserEntity2("9990088611","Bikaner",28.084370,73.326388));
        storeDatabase.storeDao().addTable2(new UserEntity2("9990065611","Bikaner",28.0843,73.3263));


        //   List<NewTable> newTable= storeDatabase.storeDao().getAllData();
        //    Log.d("tag1",newTable.get(0).getLongtitude()+" row1");
        //  Log.d("tag1",newTable+"");
        // storeDatabase.storeDao().getNewData();
        // storeDatabase.storeDao().addNewTable(new NewTable());


//        setRecyclerView();

    }

//    private void setRecyclerView() {
//      List<NewTable> newTables = storeDatabase.storeDao().getAllData();
//      userAdapter = new UserAdapter(newTables);
//      recyclerView.setAdapter(userAdapter);
//    }

}