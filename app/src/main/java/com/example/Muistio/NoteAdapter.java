package com.example.Muistio;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NoteAdapter extends RecyclerView.Adapter <NoteViewHolder>{

    private Context context;
    private ArrayList<Note> notes = new ArrayList<>();





    public NoteAdapter(Context context, ArrayList<Note> notes) {
        this.context = context;
        this.notes = notes;

    }

    @NonNull
    @Override
    public NoteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new NoteViewHolder(LayoutInflater.from(context).inflate(R.layout.noteview, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull NoteViewHolder holder, int position) {
        holder.id.setText((String.valueOf(notes.get(position).getId())));
        holder.name.setText(notes.get(position).getTitle());
        holder.content.setText(notes.get(position).getContent());
        holder.timeAndDate.setText(notes.get(position).getTimeAndDate());
    }

    @Override
    public int getItemCount() {
        return notes.size();
    }
}
