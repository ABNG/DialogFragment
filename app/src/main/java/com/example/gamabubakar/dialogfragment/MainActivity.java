package com.example.gamabubakar.dialogfragment;

import android.app.AlertDialog;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void setTime(String time){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true)
                .setTitle("You Selected")
                .setMessage(time)
                .show();
    }

    public void showTime(View view) {
        FragmentManager fm=getFragmentManager();
        PopupTime pt=new PopupTime();
        pt.show(fm,"show Fragment");
    }

    public void setDate(String date){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true)
                .setTitle("You Selected")
                .setMessage(date)
                .show();
    }

    public void ShowDate(View view) {
        FragmentManager fm=getFragmentManager();
        PopupDate pd=new PopupDate();
        pd.show(fm,"show Fragment");
    }
}
