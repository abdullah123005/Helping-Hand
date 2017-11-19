
package hello.youtube.com.emergency;

import android.content.Intent;
import android.hardware.*;
import android.hardware.Sensor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements SensorEventListener {
    TextView tv;
    private long lastUpdate;
    private SensorManager sensorManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView)findViewById(R.id.textView6);
        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        lastUpdate = System.currentTimeMillis();
       // methodSen();
    }


    public void guide(View view)
    {
        Intent intent =new Intent(MainActivity.this,Main2Activity .class);
        startActivity(intent);
    }

    public void police(View view)
    {
        Intent intent1 =new Intent(MainActivity.this,Main3Activity .class);
        startActivity(intent1);
    }
    public void fire(View view)
    {
        Intent intent2 =new Intent(MainActivity.this,Main8Activity .class);
        startActivity(intent2);
    }
    public void hospital(View view)
    {
        Intent intent2 =new Intent(MainActivity.this,Main11Activity .class);
        startActivity(intent2);
    }

    public void map(View view)
    {
        Intent intent2 =new Intent(MainActivity.this,MapsActivity.class);
        startActivity(intent2);
    }
    public void login(View view)
    {
        Intent intent2 =new Intent(MainActivity.this, Main100Activity.class);
        startActivity(intent2);
    }



    @Override
    public void onSensorChanged(SensorEvent event) {
        if (event.sensor.getType() == Sensor.TYPE_ACCELEROMETER) {
            getAccelerometer(event);
        }
    }


    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

    private void getAccelerometer(SensorEvent event) {
        float[] values = event.values;
        // Movement
        float x = values[0];
        float y = values[1];
        float z = values[2];

        float accelationSquareRoot = (x * x + y * y + z * z)
                / (SensorManager.GRAVITY_EARTH * SensorManager.GRAVITY_EARTH);

        long actualTime = System.currentTimeMillis();
        //Toast.makeText(getApplicationContext(),String.valueOf(accelationSquareRoot)+" "+SensorManager.GRAVITY_EARTH,Toast.LENGTH_SHORT).show();

        if (accelationSquareRoot >= 2) //it will be executed if you shuffle
        {
            SendMesgMethod();
            //tv.setText("sms sent");
        }
    }
    private void SendMesgMethod() {
        String phoneNumber = "01878047894";
        String message = "This is My Messge.";
        SmsManager manger = SmsManager.getDefault();
        manger.sendTextMessage(phoneNumber,null,message,null,null);
        Toast.makeText(this,"Message sent to : "+phoneNumber,Toast.LENGTH_LONG).show();
       // tv.setText("sms has been sent successfully");
    }
    @Override
    protected void onResume() {
        super.onResume();
        // register this class as a listener for the orientation and
        // accelerometer sensors
        sensorManager.registerListener(this,sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
                SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    protected void onPause() {
        // unregister listener
        super.onPause();
        sensorManager.unregisterListener(this);
    }
}
