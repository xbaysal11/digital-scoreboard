package com.example.digital_scoreboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int redScoreNum = 0;
    private int blueScoreNum = 0;
    private int redFallNum = 0;
    private int blueFallNum = 0;
    private int zero = 0;


    private TextView redScore , blueScore, redFall, blueFall;
    private Button redPlus, bluePlus, blueFallBtn, redFallBtn, clearBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        redScore = findViewById(R.id.redScore);
        blueScore = findViewById(R.id.blueScore);
        redFall = findViewById(R.id.redFall);
        blueFall = findViewById(R.id.blueFall);

        redPlus = findViewById(R.id.redPlus);
        bluePlus = findViewById(R.id.bluePlus);
        clearBtn = findViewById(R.id.clearBtn);
        redFallBtn = findViewById(R.id.redFallBtn);
        blueFallBtn = findViewById(R.id.blueFallBtn);

        redPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redScoreNum = redScoreNum +1;
                redScore.setText(String.valueOf(redScoreNum));
            }
        });
        bluePlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blueScoreNum = blueScoreNum +1;
                blueScore.setText(String.valueOf(blueScoreNum));
            }
        });
        redFallBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                redFallNum = redFallNum +1;
                redFall.setText(String.valueOf(redFallNum));
            }
        });
        blueFallBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blueFallNum = blueFallNum +1;
                blueFall.setText(String.valueOf(blueFallNum));
            }
        });
        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blueFallNum= 0;
                redFallNum= 0;
                blueScoreNum= 0;
                redScoreNum= 0;
                blueFall.setText(String.valueOf(blueFallNum));
                redFall.setText(String.valueOf(redFallNum));
                redScore.setText(String.valueOf(redScoreNum));
                blueScore.setText(String.valueOf(blueScoreNum));
            }
        });
    }
}
