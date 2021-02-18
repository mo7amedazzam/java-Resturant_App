package relative.alaqsa.edu.restaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class OpenMeals extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_meals);


        if (getIntent() != null) {
            bindData(getIntent());
        }

        findViewById(R.id.button).setOnClickListener(v -> new AlertDialog.Builder(OpenMeals.this)
                .setTitle("Confirm Message")
                .setMessage("Are you want to buy this product?")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Toast.makeText(OpenMeals.this, "Cong, you done", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(OpenMeals.this, MainActivity.class)
                                .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK));


                    }
                }).setNegativeButton(android.R.string.no, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(OpenMeals.this, "Think again please", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        }).create().show());


    }

    private void bindData(Intent intent) {

        User user = intent.getParcelableExtra("data");

        ((ImageView) findViewById(R.id.ImgBurgar)).setImageResource(user.getImage());
        ((TextView) findViewById(R.id.N_Burgar)).setText(user.getName());

    }
}