package com.example.Muistio;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NoteViewHolder extends RecyclerView.ViewHolder {
    TextView id, name, content, timeAndDate;
    public NoteViewHolder(@NonNull View itemView) {
        super(itemView);

        id = itemView.findViewById(R.id.NoteIdText);
        name = itemView.findViewById(R.id.NoteTitleText);
        content = itemView.findViewById(R.id.NoteContentText);
        timeAndDate = itemView.findViewById(R.id.NoteTimeAndDateText);

    }
}
