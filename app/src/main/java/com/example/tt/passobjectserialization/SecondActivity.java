package com.example.tt.passobjectserialization;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class SecondActivity extends ActionBarActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        text = (TextView) findViewById(R.id.text);

        Intent intent = getIntent();
       Person per =(Person) intent.getSerializableExtra("person");
        text.setText(per.toString());

    }


}
