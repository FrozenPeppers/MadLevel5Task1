package nl.jorisebbelaar.madlevel5example.ui.main

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import nl.jorisebbelaar.madlevel5example.database.NoteRepository

class MainActivityViewModel(application: Application) : AndroidViewModel(application) {

    private val noteRepository = NoteRepository(application.applicationContext)

    val note = noteRepository.getNotepad()
}