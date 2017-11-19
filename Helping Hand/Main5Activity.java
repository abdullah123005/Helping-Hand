package hello.youtube.com.emergency;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {

TextView T2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        T2=(TextView)findViewById(R.id.textView2);
        T2.setText("Select a District to Search");
    }
}
