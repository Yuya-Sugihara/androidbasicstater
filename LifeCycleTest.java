package com.example.sugiharayuya.androidbasicstarter;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by sugiharayuya on 西暦2017/09/27.
 */

public class LifeCycleTest extends Activity {
    StringBuilder builder=new StringBuilder();
    TextView textView;

    private void log(String text){
        Log.d("LifeCycleTest",text);
        builder.append(text);
        builder.append("\n");
        textView.setText(builder.toString());
    }

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        textView=new TextView(this);
        textView.setText(builder.toString());
        setContentView(textView);
        log("created");
    }

    public void onResume(){
        super.onResume();
        log("resumed");
    }

    protected void onPause(){
        super.onPause();
        log("paused");
        if(isFinishing()){
            log("finishing");
        }
    }
}
