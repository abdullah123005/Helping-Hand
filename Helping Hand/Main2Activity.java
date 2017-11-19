package hello.youtube.com.emergency;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView T1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        T1=(TextView)findViewById(R.id.textView);
        T1.setText(R.string.userGuide);
        //T1.setText("");
    }
}
