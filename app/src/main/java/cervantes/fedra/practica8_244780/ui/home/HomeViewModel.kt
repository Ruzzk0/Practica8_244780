package cervantes.fedra.practica8_244780.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>("This is the home Fragment")
    val text: LiveData<String> get() = _text


    fun updateText(newText: String) {
        _text.value = newText
    }
}
