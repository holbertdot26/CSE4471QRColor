package edu.osu.cse4471.zxingpoc;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ColorChooser extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_chooser);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_color_chooser, menu);
        return true;
    }
}