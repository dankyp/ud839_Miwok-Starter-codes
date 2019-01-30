package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("One","Ena",R.drawable.number_one));
        words.add(new Word("Two", "Dio",R.drawable.number_two));
        words.add(new Word("Three","Tria",R.drawable.number_three));
        words.add(new Word("Four","Tessera",R.drawable.number_four));
        words.add(new Word("Five","Pente",R.drawable.number_five));
        words.add(new Word("Six","Exi",R.drawable.number_six));
        words.add(new Word("Seven","Efta",R.drawable.number_seven));
        words.add(new Word("Eight","Octo",R.drawable.number_eight));
        words.add(new Word("Nine","Ennea",R.drawable.number_nine));
        words.add(new Word("Ten","Deka",R.drawable.number_ten));
        words.add(new Word("Eleven","Endeka"));
        words.add(new Word("Twelve","Dodeka"));
        words.add(new Word("Thirteen","Deka-Tria"));
        words.add(new Word("Fourteen","Deka-Tessera"));
        words.add(new Word("Fifteen","Deka-Pente"));
        words.add(new Word("Sixteen","Deka-Exi"));
        words.add(new Word("Seventeen","Deka-Efta"));
        words.add(new Word("Eighteen","Deka-Octo"));
        words.add(new Word("Nineteen","Deka-Ennea"));
        words.add(new Word("Twenty","Ikosi"));
        words.add(new Word("Thirty","Trianda"));
        words.add(new Word("Fourty","Saranda"));
        words.add(new Word("Fifty","Peninda"));
        words.add(new Word("Sixty","Exinda"));
        words.add(new Word("Seventy","Evdominda"));
        words.add(new Word("Eighty","Ogdonda"));
        words.add(new Word("Ninety","Eneninda"));
        words.add(new Word("One Hundred","Ekato"));

        WordAdapter  adapter = new WordAdapter(this,words);

        ListView ListView = (ListView) findViewById(R.id.list);

        ListView.setAdapter(adapter);

        // LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);

        //for (int index = 0; index < words.size(); index++) //index = index +1


        //create a new Textview
        //   TextView wordView = new TextView(this);
        //Set the word to be a word at the current index
        //   wordView.setText(words.get(index));
        //Add this textview as another child to the root view of this layout
        //   rootView.addView(wordView);


    }
    }



