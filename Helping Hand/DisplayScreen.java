package hello.youtube.com.emergency;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by SI ABDULLAH on 10/18/2016.

 import android.content.SharedPreferences;
 import android.os.Bundle;
 import android.support.v7.app.AppCompatActivity;
 import android.widget.TextView;

 /**
 * Created by SI ABDULLAH on 10/17/2016.
 */
public class DisplayScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_info);
        SharedPreferences preferences = getSharedPreferences("ABC",MODE_PRIVATE);
        String display=preferences.getString("display","");

        TextView displayinfo=(TextView)findViewById(R.id.textViewName);
        displayinfo.setText(display);
    }
}
