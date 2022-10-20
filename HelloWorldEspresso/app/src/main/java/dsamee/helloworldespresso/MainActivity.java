package dsamee.helloworldespresso;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import dsamee.helloworldespresso.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        TextView text = binding.textView;
        Button button = binding.button;

        text.setText("0");
        button.setOnClickListener((v) -> {
            int c = (Integer.parseInt((String) text.getText()) + 1);
            text.setText(Integer.toString(c));
        });
    }
}