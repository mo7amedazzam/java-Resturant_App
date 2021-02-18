package relative.alaqsa.edu.restaurant;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Application_Interface extends AppCompatActivity {
    public Button btnloin;
    public Button btnregister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application_interface);

        btnloin = findViewById(R.id.btnlogin);
        btnregister = findViewById(R.id.btnregister);

        btnloin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Application_Interface.this, "login has been clicked", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Application_Interface.this, SignIn_Activity.class);
                startActivity(intent);
            }
        });
        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Application_Interface.this,SignUp_Activity.class);
                startActivity(intent);

            }

        });

    }
}