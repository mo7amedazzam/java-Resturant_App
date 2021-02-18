package relative.alaqsa.edu.restaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ScreenMeal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_meal);

        final ImageView Ivmeal;

        Ivmeal = findViewById(R.id.Ivmeal);

        Ivmeal.setOnClickListener(v -> {
            Intent intent = new Intent(ScreenMeal.this,OpenMeals.class);
            startActivity(intent);
        });


    }
}