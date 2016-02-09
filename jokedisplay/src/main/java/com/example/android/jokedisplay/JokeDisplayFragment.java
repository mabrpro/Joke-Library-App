package com.example.android.jokedisplay;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class JokeDisplayFragment extends Fragment {

    public JokeDisplayFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_joke_display, container, false);

        Intent intent = getActivity().getIntent();

        String joke = intent.getStringExtra(JokeDisplay.JOKE_KEY);

        TextView jokeTextView = (TextView) root.findViewById(R.id.joke_textview);

        if (joke != null && joke.length() != 0) {
            jokeTextView.setText(joke);
        }

        return root;
    }
}
