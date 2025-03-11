package com.example.Muistio;
import java.util.ArrayList;
public class NoteStorage {

    private static NoteStorage instance;
    private ArrayList<Note> notes;

    private NoteStorage() {
        notes = new ArrayList<>();
    }

    public static NoteStorage getInstance(){
        if (instance == null) {
            instance = new NoteStorage();
        }
        return instance;
    }

    public void addNote(String title, String content){

        Note newnote = new Note(title, content);

        notes.add(newnote);
    }

    public ArrayList<Note> getNotes() {
        return notes;
    }


}
