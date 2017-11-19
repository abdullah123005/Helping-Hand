package hello.youtube.com.emergency;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    TextView T3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        T3=(TextView)findViewById(R.id.textView3);
        T3.setText("Select a Division to Search");
    }


    public void dhaka(View view)
    {
        Intent intent2 =new Intent(Main3Activity.this,Main4Activity .class);
        startActivity(intent2);
    }

    public void barisal(View view)
    {
        Intent intent3 =new Intent(Main3Activity.this,Main5Activity .class);
        startActivity(intent3);
    }



}
