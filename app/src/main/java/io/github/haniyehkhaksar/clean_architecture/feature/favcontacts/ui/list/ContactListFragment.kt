package io.github.haniyehkhaksar.clean_architecture.feature.favcontacts.ui.list

import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import io.github.haniyehkhaksar.clean_architecture.R
import io.github.haniyehkhaksar.clean_architecture.base.ui.fragment.BaseFragment

class ContactListFragment : BaseFragment() {

    companion object {
        fun newInstance() = ContactListFragment()
    }

    private lateinit var viewModel: ContactListViewModel
    override val layoutResourceId: Int
        get() = R.layout.contact_list_fragment

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ContactListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
