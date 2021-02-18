package relative.alaqsa.edu.restaurant;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import relative.alaqsa.edu.restaurant.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    public String s1[];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        s1 = getResources().getStringArray(R.array.n_Meal);

        ArrayList<User> list = new ArrayList<>();
        list.add(new User("Meal", R.drawable.bugar));
        list.add(new User("Drinks", R.drawable.drinks));
        list.add(new User("Salad", R.drawable.salad));
        list.add(new User("sandwich", R.drawable.sandwich));


        MyAdapter adapter = new MyAdapter(list, this);

        binding.recyclerView.setAdapter(adapter);


    }

}