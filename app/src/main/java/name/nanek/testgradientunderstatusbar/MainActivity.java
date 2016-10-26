package name.nanek.testgradientunderstatusbar;

import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow(); // in Activity's onCreate() for instance
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }

        //final int transparent = Color.TRANSPARENT;
        //getWindow().setStatusBarColor(transparent);

        //makeAllTransparent(getWindow().getDecorView());

        //View main = findViewById(R.id.activity_main);
        //main.setBackgroundResource(R.drawable.gradient);
    }

    private static void makeAllTransparent(View view) {
        view.setBackgroundColor(Color.TRANSPARENT);
        view.setBackground(null);
        if (view instanceof ViewGroup) {
            ViewGroup group = (ViewGroup) view;
            for(int i = 0; i < group.getChildCount(); i++) {
                View child = group.getChildAt(i);
                makeAllTransparent(child);
            }
        }
    }


}
