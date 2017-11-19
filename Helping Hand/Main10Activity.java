package hello.youtube.com.emergency;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main10Activity extends AppCompatActivity {
    TextView T10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        T10=(TextView)findViewById(R.id.textView10);
        T10.setText("Click to Make a Call or Send a SMS");
    }

    public void call1(View view) {
        Intent intent3 = new Intent(Intent.ACTION_CALL);
        intent3.setData(Uri.parse("tel:123"));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {

            return;
        }
        startActivity(intent3);
    }

    public void sms(View view) {
        String phoneNumber = "01234";
        String message = "Write your sms";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:" + phoneNumber));
        intent.putExtra("sms_body", message);
        startActivity(intent);
    }
}
