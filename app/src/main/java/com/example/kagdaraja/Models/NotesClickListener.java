package com.example.kagdaraja.Models;

import androidx.cardview.widget.CardView;

import com.example.kagdaraja.Models.notes;

public interface NotesClickListener {
    void onClick(notes notes);
    void onLongClick(notes notes, CardView cardView);

}
