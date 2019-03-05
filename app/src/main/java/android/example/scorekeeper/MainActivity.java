package android.example.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score_a = 0;
    int score_b = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayTeamAScore(int score){
        TextView scoreTeamA = findViewById(R.id.team_a_score);
        scoreTeamA.setText(String.valueOf(score));
    }

    public void touchDownTeamA(View view){
        score_a = score_a + 6;
        displayTeamAScore(score_a);
    }

    public void fieldGoalTeamA(View view){
        score_a = score_a + 3;
        displayTeamAScore(score_a);
    }

    public void kickTeamA(View view){
        score_a = score_a + 1;
        displayTeamAScore(score_a);
    }

    public void displayTeamBScore(int score){
        TextView scoreTeamB = findViewById(R.id.team_b_score);
        scoreTeamB.setText(String.valueOf(score));
    }

    public void touchDownTeamB(View view){
        score_b = score_b + 6;
        displayTeamBScore(score_b);
    }

    public void fieldGoalTeamB(View view){
        score_b = score_b + 3;
        displayTeamBScore(score_b);
    }

    public void kickTeamB(View view){
        score_b = score_b + 1;
        displayTeamBScore(score_b);
    }

    public void resetCounter(View view){
        score_a = 0;
        score_b = 0;
        displayTeamAScore(score_a);
        displayTeamBScore(score_b);
    }
}
