package cervantes.fedra.practica8_244780.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import cervantes.fedra.practica8_244780.R

class DashboardFragment : Fragment() {

    private var nameEditText: EditText? = null
    private var timeEditText: EditText? = null
    private var doneButton: Button? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_dashboard, container, false)

        // Accediendo a las vistas directamente sin ViewBinding
        nameEditText = root.findViewById(R.id.name)
        timeEditText = root.findViewById(R.id.time)
        doneButton = root.findViewById(R.id.done)

        doneButton?.setOnClickListener {
            val name = nameEditText?.text.toString()
            val time = timeEditText?.text.toString()

            if (name.isEmpty() || time.isEmpty()) {
                Toast.makeText(requireContext(), "Por favor completa todos los campos", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(requireContext(), "¡Recordatorio guardado!", Toast.LENGTH_SHORT).show()
            }
        }

        return root
    }
}
