package cervantes.fedra.practica8_244780.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import cervantes.fedra.practica8_244780.R

class DashboardViewModel : ViewModel() {


    private val _text = MutableLiveData<String>().apply {
        value = "This is the Dashboard Fragment"
    }


    val text: LiveData<String> = _text


    fun setText(newText: String) {
        _text.value = newText
    }
}
