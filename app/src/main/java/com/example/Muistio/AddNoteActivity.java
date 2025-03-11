package com.example.Muistio;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class AddNoteActivity extends AppCompatActivity {

    private EditText TitleEdit, ContentEdit;
    private NoteStorage NoteStorage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_note);

        TitleEdit = findViewById(R.id.TitleEdit);
        ContentEdit = findViewById(R.id.ContentEdit);

        NoteStorage = com.example.Muistio.NoteStorage.getInstance(); ;

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }
    public void saveNote(View view) {
        String title = TitleEdit.getText().toString();
        String content = ContentEdit.getText().toString();

        NoteStorage.addNote(title, content);
        finish();

    }
}
