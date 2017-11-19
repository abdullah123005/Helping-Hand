package hello.youtube.com.emergency;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {


    TextView T4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        T4=(TextView)findViewById(R.id.textView4);
        T4.setText("Select a District to Search");
    }


    public void dhaka1(View view)
    {
        Intent intent1 =new Intent(Main4Activity.this,Main6Activity .class);
        startActivity(intent1);
    }

}
