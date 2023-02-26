package com.example.gamabubakar.dialogfragment;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TimePicker;

/**
 * Created by gamAbubakar on 1/25/2018.
 */

public class PopupTime extends DialogFragment implements View.OnClickListener{
    View view;
    TimePicker tp;
    Button btn;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.poptime,container,false);
        tp=view.findViewById(R.id.tp1);
        btn=view.findViewById(R.id.done);
        btn.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        this.dismiss();
        String time=tp.getHour()+":"+tp.getMinute();
        MainActivity ma= (MainActivity) getActivity();
        ma.setTime(time);

    }
}
