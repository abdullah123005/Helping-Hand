package hello.youtube.com.emergency;


import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main100Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main100);
        final EditText etName=(EditText)findViewById(R.id.etName);
        final EditText etPassword=(EditText)findViewById(R.id.etPassword);

        Button btnLogin=(Button)findViewById(R.id.btnLogin);
        Button btnRegister=(Button)findViewById(R.id.btnRegister);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user=etName.getText().toString();
                String password=etPassword.getText().toString();

                SharedPreferences preferences=getSharedPreferences("ABC",MODE_PRIVATE);
                String userDetails=preferences.getString(user + password + "data" , "Username or Password is incorrect.");
                SharedPreferences.Editor editor =preferences.edit();
                editor.putString("display",userDetails);
                editor.commit();

                Intent displayScreen=new Intent(Main100Activity.this,DisplayScreen.class);
                startActivity(displayScreen);
            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerScreen=new Intent(Main100Activity.this,Register.class);
                startActivity(registerScreen);
            }
        });
    }
}

