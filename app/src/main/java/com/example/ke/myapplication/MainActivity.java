package com.example.ke.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private  static final String TAG="MainActivity";
    private final int i = 6;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView) findViewById(R.id.tv1);
        Log.i(TAG,"abababababbababababbababab");
       // test();
        tv1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                System.out.println("aaaaaaaaaaaaaaa");
                int i=9;
                int j=i;
                System.out.println();
                test();
            }
        });
        //你妹的
        //加一行
        //测试数据行
        
    }
    public  void test(){
        //Log.d(TAG, "test: mytestsfkjsjfjkdshkfshdjfjhsf");
        Log.i(TAG,"NINSJKJSDKJHJKJKSDNJKJFK");
    }
}
