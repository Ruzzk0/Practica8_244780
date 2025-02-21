package cervantes.fedra.practica8_244780.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import cervantes.fedra.practica8_244780.R

class HomeFragment : Fragment() {

    private var remindersListView: ListView? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val root = inflater.inflate(R.layout.fragment_home, container, false)


        remindersListView = root.findViewById(R.id.reminders)

        val reminders = listOf("Reminder 1", "Reminder 2", "Reminder 3", "Reminder 4", "Reminder 5")
        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_list_item_1, reminders)
        remindersListView?.adapter = adapter

        return root
    }
}
