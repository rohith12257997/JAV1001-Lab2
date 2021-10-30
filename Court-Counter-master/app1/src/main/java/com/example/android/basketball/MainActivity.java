package com.example.android.basketball;


import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
/*initializing variables */
    int teamA = 0;
    int teamB = 0;

    /*incrementing score by 1 */
    public void setTeamA1(View view) {
        teamA = teamA + 1;
        score_board_a_current(teamA);
    }
    /*incrementing score by 2 */
    public void setTeamA2(View view) {
        teamA = teamA + 2;
        score_board_a_current(teamA);
    }
    /*incrementing score by 3 */
    public void setTeamA3(View view) {
        teamA = teamA + 3;
        score_board_a_current(teamA);
    }
    /*incrementing score */
    public void setTeamB1(View view) {
        teamB = teamB + 1;
        score_board_b_current(teamB);
    }
    /*incrementing score */
    public void setTeamB2(View view) {
        teamB = teamB + 2;
        score_board_b_current(teamB);
    }
    /*incrementing score */
    public void setTeamB3(View view) {
        teamB = teamB + 3;
        score_board_b_current(teamB);
    }

    /*update score */
    @SuppressLint("SetTextI18n")
    public void score_board_a_current(int number) {
        TextView textView = findViewById(R.id.score_board_team_A);
        textView.setText("" + number);
    }

    /*update score */
    @SuppressLint("SetTextI18n")
    public void score_board_b_current(int number) {
        TextView textView = findViewById(R.id.score_board_team_B);
        textView.setText("" + number);
    }
}
