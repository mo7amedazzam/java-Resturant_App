package relative.alaqsa.edu.restaurant;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter2 extends RecyclerView.Adapter<MyAdapter2.MyViewHolder> {
    public int images2[];
    String data2[];

    ArrayList<User> list2;
    Context context;

    public MyAdapter2(ArrayList<User> list2, Context context) {
        this.list2 = list2;
        this.context = context;
    }

    public MyAdapter2(Context ct, String s1[], int img[]) {
        context = ct;
        data2 = s1;
        images2 = img;
    }

    @NonNull
    @Override
    public MyAdapter2.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.activity_open_meals, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final User user2 = list2.get(position);
        holder.ImgBurgar.setImageResource(user2.getImage());
        holder.N_Burgar.setText(user2.getName());
        holder.price.setText(user2.getName());
        holder.Ingredients.setText(user2.getName());
        holder.Ingredients.setText(user2.getName());

    }


    @Override
    public int getItemCount() {

        return list2.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView ImgBurgar;
        TextView N_Burgar;
        TextView price;
        TextView Ingredients;
        ConstraintLayout mainLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            N_Burgar = itemView.findViewById(R.id.N_Burgar);
            ImgBurgar = itemView.findViewById(R.id.ImgBurgar);
            price = itemView.findViewById(R.id.price);
            Ingredients = itemView.findViewById(R.id.Ingredients);
            mainLayout = itemView.findViewById(R.id.mainLayout);


        }
    }
}