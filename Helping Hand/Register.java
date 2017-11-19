package hello.youtube.com.emergency;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by SI ABDULLAH on 10/17/2016.
 */
public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        final EditText userName= (EditText)findViewById(R.id.etNewName);
        final EditText password= (EditText)findViewById(R.id.etNewPassword);
        final EditText email= (EditText)findViewById(R.id.etNewEmail);
        final EditText contact= (EditText)findViewById(R.id.etNewContact);
        Button btnRegister=(Button)findViewById(R.id.btnNewRegister);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences preferences =getSharedPreferences("ABC",MODE_PRIVATE);
                String newUser=userName.getText().toString();
                String newPassword=password.getText().toString();
                String newEmail=email.getText().toString();
                String newContact=contact.getText().toString();

                SharedPreferences.Editor editor=preferences.edit();
                editor.putString(newUser + newPassword + "data",newUser + "/n" + newEmail + newContact +"data");
                editor.commit();

                Intent loginScreen =new Intent(Register.this,Main100Activity.class);
                startActivity(loginScreen);
            }
        });

    }
}

