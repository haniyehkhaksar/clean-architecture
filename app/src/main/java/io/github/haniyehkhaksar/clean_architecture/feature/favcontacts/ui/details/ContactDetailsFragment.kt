package io.github.haniyehkhaksar.clean_architecture.feature.favcontacts.ui.details

import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import io.github.haniyehkhaksar.clean_architecture.R
import io.github.haniyehkhaksar.clean_architecture.base.ui.fragment.BaseFragment

class ContactDetailsFragment : BaseFragment() {

    companion object {
        fun newInstance() = ContactDetailsFragment()
    }

    private lateinit var viewModel: ContactDetailsViewModel
    override val layoutResourceId: Int
        get() = R.layout.contact_details_fragment

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ContactDetailsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
