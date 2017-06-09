package com.layout.liza.collectionviewsfirst;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;

/**
 * Created by liza on 6/8/17.
 */

public class MainActivity extends Activity {

    String[] arrayToShow = {"asda", "asdwsfef", "asddffca", "asfevfdbg", "asdfv", "asdf",
            "asda", "asdwsfef", "asddffca", "asfevfdbg", "asdfv", "asdf",
            "asda", "asdwsfef", "asddffca", "asfevfdbg", "asdfv", "asdf",
            "asda", "asdwsfef", "asddffca", "asfevfdbg", "asdfv", "asdf",
            "asda", "asdwsfef", "asddffca", "asfevfdbg", "asdfv", "asdf",
            "asda", "asdwsfef", "asddffca", "asfevfdbg", "asdfv", "asdf"};
    ListVsDataAdapter adapter = new ListVsDataAdapter();


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ListView list = (ListView) findViewById(R.id.list_view);
        adapter.setData(arrayToShow);
        list.setAdapter(adapter);
    }
}
