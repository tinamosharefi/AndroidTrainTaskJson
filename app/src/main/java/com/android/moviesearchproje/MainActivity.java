package com.android.moviesearchproje;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText edttitle=findViewById(R.id.edttitle);
        Button btnsearch=findViewById(R.id.btnsearch);
btnsearch.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String title=edttitle.getText().toString();
       // Toast.makeText(MainActivity.this,title,Toast.LENGTH_LONG).show();
        Intent intent=new Intent(MainActivity.this,PageTitle.class);
        intent.putExtra("title",title);
         startActivity(intent);

    }
});
    }
}
