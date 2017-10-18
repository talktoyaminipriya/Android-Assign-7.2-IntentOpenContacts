package com.example.intentopencontacts;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            Button bn2 = (Button) findViewById(R.id.bt2);
            bn2.setOnClickListener(new View.OnClickListener() {

                @Override

                public void onClick(View v) {
                    Intent in = new Intent();
                    in.setAction(Intent.ACTION_VIEW);
                    in.setData(ContactsContract.Contacts.CONTENT_URI);
                    startActivity(in);
                }
            });
    }
}
