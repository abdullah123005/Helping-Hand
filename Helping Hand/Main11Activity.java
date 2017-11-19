package hello.youtube.com.emergency;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main11Activity extends AppCompatActivity {
    TextView T11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        T11=(TextView)findViewById(R.id.textView11);
        T11.setText("Select a Division to Search");
    }

    public void dhaka3(View view)
    {
        Intent intent2 =new Intent(Main11Activity.this,Main12Activity .class);
        startActivity(intent2);
    }
}
