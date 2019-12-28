package com.example.android.miwok;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;



public class NumbersActivity extends AppCompatActivity
{


//    private  MediaPlayer mMediaPlayer;
//
//    /** Handles audio focus when playing a sound file */
//    private AudioManager mAudioManager;
//
//    /**
//     * This listener gets triggered whenever the audio focus changes
//     * (i.e., we gain or lose audio focus because of another app or device).
//     */
//    private AudioManager.OnAudioFocusChangeListener mOnAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() {
//        @Override
//        public void onAudioFocusChange(int focusChange) {
//            if (focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT ||
//                    focusChange == AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK) {
//                // The AUDIOFOCUS_LOSS_TRANSIENT case means that we've lost audio focus for a
//                // short amount of time. The AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK case means that
//                // our app is allowed to continue playing sound but at a lower volume. We'll treat
//                // both cases the same way because our app is playing short sound files.
//
//                // Pause playback and reset player to the start of the file. That way, we can
//                // play the word from the beginning when we resume playback.
//                mMediaPlayer.pause();
//                mMediaPlayer.seekTo(0);
//            } else if (focusChange == AudioManager.AUDIOFOCUS_GAIN) {
//                // The AUDIOFOCUS_GAIN case means we have regained focus and can resume playback.
//                mMediaPlayer.start();
//            } else if (focusChange == AudioManager.AUDIOFOCUS_LOSS) {
//                // The AUDIOFOCUS_LOSS case means we've lost audio focus and
//                // Stop playback and clean up resources
//                releaseMediaPlayer();
//            }
//        }
//    };
//
//    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
//        @Override
//        public void onCompletion(MediaPlayer mediaPlayer) {
//            // Now that the sound file has finished playing, release the media player resources.
//            releaseMediaPlayer();
//        }
//    };
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        releaseMediaPlayer();
//        Log.v("NumbersActivity","NumbersActivity_MediaPlayer_Released");
//    }
//
//    private  void releaseMediaPlayer() {
//        if (mMediaPlayer != null) {
//            // Regardless of the current state of the media player, release its resources
//            // because we no longer need it.
//            mMediaPlayer.release();
//
//            // Set the media player back to null. For our code, we've decided that
//            // setting the media player to null is an easy way to tell that the media player
//            // is not configured to play an audio file at the moment.
//            mMediaPlayer = null;
//        }
//    }
//
//
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.word_list);
//       final ArrayList<Word> Words = new ArrayList<>();
////        Words.add("One");
////        Words.add("Two");
////        Words.add("Three");
////        Words.add("Four");
////        Words.add("Five");
////        Words.add("Six");
////        Words.add("Seven");
////        Words.add("Eight");
////        Words.add("Nine");
////        Words.add("Ten");
////        Word w = new Word("one","lutti");
//
//        Words.add(new Word("one", "lutti",R.drawable.number_one,R.raw.number_one));
//        Words.add(new Word("two", "otiiko",R.drawable.number_two,R.raw.number_two));
//        Words.add(new Word("three", "tolookosu",R.drawable.number_three,R.raw.number_three));
//        Words.add(new Word("four", "oyyisa",R.drawable.number_four,R.raw.number_four));
//        Words.add(new Word("five", "massokka",R.drawable.number_five,R.raw.number_five));
//        Words.add(new Word("six", "temmokka",R.drawable.number_six,R.raw.number_six));
//        Words.add(new Word("seven", "kenekaku",R.drawable.number_seven,R.raw.number_seven));
//        Words.add(new Word("eight", "kawinta",R.drawable.number_eight,R.raw.number_eight));
//        Words.add(new Word("nine", "wo’e",R.drawable.number_nine,R.raw.number_nine));
//        Words.add(new Word("ten", "na’aacha",R.drawable.number_ten,R.raw.number_ten));
//
////        int index = 0;
//
//
//
//       WordAdapter adapter = new WordAdapter(this,Words,R.color.category_numbers);
//
////        ListView numbersView = findViewById(R.id.numbersview);
//
////       while(index<Words.size())
////       {
////            TextView numbers  = new TextView(this);
////            numbers.setText(Words.get(index));
////            numbersView.addView(numbers);
////            index++;
////       }
//
////        for(;index<Words.size();index++)
////        {
////            TextView numbers = new TextView(this);
////            numbers.setText(Words.get(index));
////            numbersView.addView(numbers);
////        }
//
//
//
//       // ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Words);
//        //ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this,R.layout.list_item,Words);
//        ListView listView = findViewById(R.id.wordview);
//
//        listView.setAdapter(adapter);
//        //GridView gridView = findViewById(R.id.numbersview);
//        //gridView.setAdapter(itemsAdapter);
//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                // currentWord = getItem(position);
//                Word word = Words.get(position);
//                releaseMediaPlayer();
//                Log.v("NumbersActivity","Current word="+word);
//                //also can write it as - word.toString();
//                mMediaPlayer = MediaPlayer.create(NumbersActivity.this,word.getAudioResourceId());
//                mMediaPlayer.start();
//                mMediaPlayer.setOnCompletionListener(mCompletionListener);
////                mMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
////                    @Override
////                    public void onCompletion(MediaPlayer mp) {
////
////                    }
////                });
//
//                //this- for context - ambiguity may arise
//                //NumbersActivity.this - for context -more precise
//            }
//        });
//
//        /**
//         * Clean up the media player by releasing its resources.
//         */
//
//
//    }


        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_category);
            getSupportFragmentManager().beginTransaction().replace(R.id.container, new NumbersFragment()).commit();
        }
    }

