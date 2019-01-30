package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Good Morning", "Kalimera"));
        words.add(new Word("Good Evening", "Kalispera"));
        words.add(new Word("Good Night", "Kalinichta"));
        words.add(new Word("Hello", "Giassou"));
        words.add(new Word("Yes", "Ne"));
        words.add(new Word("No", "Ochi"));
        words.add(new Word("What is your name?", "Pos se lene"));
        words.add(new Word("Thank you", "Efcharisto"));
        words.add(new Word("Please/You're Welcome", "Parakalo"));
        words.add(new Word("What time is it", "Ti ora eene"));
        words.add(new Word("Good", "Kalo"));
        words.add(new Word("How much is it?", "Poso Kani"));
        words.add(new Word("I want", "Thelo"));
        words.add(new Word("I love you", "Sagapo"));
        words.add(new Word("Today", "Seemera"));
        words.add(new Word("Tomorrow", "Avrio"));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView ListView = (ListView) findViewById(R.id.list);

        ListView.setAdapter(adapter);
    }
}

