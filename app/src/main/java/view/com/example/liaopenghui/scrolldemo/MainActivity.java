package view.com.example.liaopenghui.scrolldemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;

import view.com.example.liaopenghui.scrolldemo.view.MyScrollView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private RelativeLayout titleBgRl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyScrollView myScrollView = (MyScrollView) findViewById(R.id.myScrollView);
        titleBgRl = (RelativeLayout) findViewById(R.id.titleBgRl);
        titleBgRl.getBackground().setAlpha(0);
        myScrollView.setOnScrollChanged(new MyScrollView.OnMyScrollChanged() {
            @Override
            public void getParams(int l, int t, int oldl, int oldt) {
//                Log.e(TAG,l+"::::::"+t+":::::::"+oldl+";;;;;;"+oldt);
                       float a = (float) ((float)t/1000.00);
if(t>0) {
    int alpha = (int) (a * 255);
    Log.e(TAG, "得到的透明度:" + alpha + "aaaaaaa" + a);
    titleBgRl.getBackground().setAlpha(alpha);
}
            }
        });
    }
}
