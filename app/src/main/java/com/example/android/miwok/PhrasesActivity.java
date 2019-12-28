package com.example.android.miwok;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class PhrasesActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new PhrasesFragment()).commit();
    }
}

//    private MediaPlayer mMediaPlayer;
//
//    private AudioManager mAudioManager;
//
//    AudioManager.OnAudioFocusChangeListener mAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener()
//    {
//        @Override
//        public void onAudioFocusChange(int focusChange)
//        {
//            if(focusChange==AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK || focusChange==AudioManager.AUDIOFOCUS_LOSS_TRANSIENT)
//            {
//                mMediaPlayer.pause();
//                mMediaPlayer.seekTo(0);
//            }
//            else if(focusChange==AudioManager.AUDIOFOCUS_GAIN)
//                mMediaPlayer.start();
//            else if(focusChange==AudioManager.AUDIOFOCUS_LOSS)
//                releaseMediaPlayer();
//        }
//    };
//
//    private MediaPlayer.OnCompletionListener mCompletionListener= new MediaPlayer.OnCompletionListener() {
//        @Override
//        public void onCompletion(MediaPlayer mp) {
//        releaseMediaPlayer();
//        }
//    };
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        releaseMediaPlayer();
//        Log.v("PhrasesActivity","PhrasesActivity_MediaPlayer_Released");
//    }
//
//    private void releaseMediaPlayer()
//    {
//        if(mMediaPlayer!=null)
//        {
//            mMediaPlayer.release();
//            mMediaPlayer=null;
//        }
//    }
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.word_list);
//
//
//        final ArrayList<Word> Words = new ArrayList<>();
//        Words.add(new Word("Where are you going?","minto wuksus",
//                R.raw.phrase_where_are_you_going));
//        Words.add(new Word("What is your name?","tinnә oyaase'nә",
//                R.raw.phrase_what_is_your_name));
//        Words.add(new Word("My name is...","oyaaset...",
//                R.raw.phrase_my_name_is));
//        Words.add(new Word("How are you feeling?","michәksәs?",
//                R.raw.phrase_how_are_you_feeling));
//        Words.add(new Word("I’m feeling good.","kuchi achit",
//                R.raw.phrase_im_feeling_good));
//        Words.add(new Word("Are you coming?","әәnәs'aa?",
//                R.raw.phrase_are_you_coming));
//        Words.add(new Word("Yes, I’m coming.","hәә’ әәnәm",
//                R.raw.phrase_yes_im_coming));
//        Words.add(new Word("I’m coming.","әәnәm",
//                R.raw.phrase_im_coming));
//        Words.add(new Word("Let’s go.","yoowutis",
//                R.raw.phrase_lets_go));
//        Words.add(new Word("Come here.","әnni'nem",
//                R.raw.phrase_come_here));
//
//        WordAdapter adapter = new WordAdapter(this,Words,R.color.category_phrases);
//        ListView listView = findViewById(R.id.wordview);
//
//
//
//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Word word = Words.get(position);
//                releaseMediaPlayer();
//                mMediaPlayer=MediaPlayer.create(PhrasesActivity.this,word.getAudioResourceId());
//                mMediaPlayer.start();
//            }
//        });
//        listView.setAdapter(adapter);
//
//    }
//
////    @Override
////    protected void onStop() {
////        super.onStop();
////        releaseMediaPlayer();
////        Log.v("PhrasesActivity","MediaPlayer_Released");
////    }
//
//
//}
