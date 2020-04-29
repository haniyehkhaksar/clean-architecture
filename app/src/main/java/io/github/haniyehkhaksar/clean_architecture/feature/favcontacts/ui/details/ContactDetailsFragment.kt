package io.github.haniyehkhaksar.clean_architecture.feature.favcontacts.ui.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import io.github.haniyehkhaksar.clean_architecture.R

class ContactDetailsFragment : Fragment() {

    companion object {
        fun newInstance() = ContactDetailsFragment()
    }

    private lateinit var viewModel: ContactDetailsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.contact_details_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ContactDetailsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
