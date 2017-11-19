package hello.youtube.com.emergency;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main8Activity extends AppCompatActivity {
    TextView T8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        T8=(TextView)findViewById(R.id.textView8);
        T8.setText("Select a Division to Search");
    }

    public void dhaka1(View view)
    {
        Intent intent2 =new Intent(Main8Activity.this,Main9Activity .class);
        startActivity(intent2);
    }
}
