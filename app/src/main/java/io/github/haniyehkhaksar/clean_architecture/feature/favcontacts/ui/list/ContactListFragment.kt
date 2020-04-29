package io.github.haniyehkhaksar.clean_architecture.feature.favcontacts.ui.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import io.github.haniyehkhaksar.clean_architecture.R

class ContactListFragment : Fragment() {

    companion object {
        fun newInstance() = ContactListFragment()
    }

    private lateinit var viewModel: ContactListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.contact_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ContactListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
