package com.example.cse15u006.customview;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button customToast = (Button)findViewById(R.id.show_custom_toast);
        //Show custom toast message when button is clicked
        customToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "hi", Toast.LENGTH_LONG);
                toast.show();
                LayoutInflater inflater = getLayoutInflater();
                View toastLayout = inflater.inflate(R.layout.customtoast, (ConstraintLayout) findViewById(R.id.custom_toast_layout));

                Toast toast1 = new Toast(getApplicationContext());
                toast1.setDuration(Toast.LENGTH_LONG);
                toast1.setView(toastLayout);
                toast1.show();
            }
        });
    }


}
