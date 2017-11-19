package hello.youtube.com.emergency;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main9Activity extends AppCompatActivity {
    TextView T9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        T9=(TextView)findViewById(R.id.textView9);
        T9.setText("Select a District to Search");
    }


    public void dhaka2(View view)
    {
        Intent intent1 =new Intent(Main9Activity.this,Main10Activity .class);
        startActivity(intent1);
    }
}
