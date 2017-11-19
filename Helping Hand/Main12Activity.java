package hello.youtube.com.emergency;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main12Activity extends AppCompatActivity {
    TextView T12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
        T12=(TextView)findViewById(R.id.textView12);
        T12.setText("Select a District to Search");
    }
    public void dhaka4(View view)
    {
        Intent intent1 =new Intent(Main12Activity.this,Main13Activity .class);
        startActivity(intent1);
    }
}
