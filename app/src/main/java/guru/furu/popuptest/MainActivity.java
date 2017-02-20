package guru.furu.popuptest;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import io.github.douglasjunior.androidSimpleTooltip.SimpleTooltip;

public class MainActivity extends AppCompatActivity {

    Button testButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testButton = (Button) findViewById(R.id.button);

        testButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final SimpleTooltip tooltip =  new SimpleTooltip.Builder(MainActivity.this)
                        .anchorView(testButton)
                        .contentView(R.layout.test_bubble)
                        .dismissOnInsideTouch(false)
                        .gravity(Gravity.TOP)
                        .arrowColor(Color.BLACK)
                        .transparentOverlay(true)
                        .build();

                tooltip.findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "TOUCHED BUTTON 1", Toast.LENGTH_SHORT).show();
                    }
                });

                tooltip.findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "TOUCHED BUTTON 2", Toast.LENGTH_SHORT).show();
                    }
                });


                tooltip.findViewById(R.id.btn3).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "TOUCHED BUTTON 3", Toast.LENGTH_SHORT).show();
                    }
                });

                tooltip.show();
            }
        });
    }
}
