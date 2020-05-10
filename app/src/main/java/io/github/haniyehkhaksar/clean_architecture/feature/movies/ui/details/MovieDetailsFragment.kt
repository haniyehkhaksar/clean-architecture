package io.github.haniyehkhaksar.clean_architecture.feature.movies.ui.details

import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import io.github.haniyehkhaksar.clean_architecture.R
import io.github.haniyehkhaksar.clean_architecture.base.ui.fragment.BaseFragment

class MovieDetailsFragment : BaseFragment() {

    companion object {
        fun newInstance() = MovieDetailsFragment()
    }

    private lateinit var viewModel: MovieDetailsViewModel
    override val layoutResourceId: Int
        get() = R.layout.movie_details_fragment

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MovieDetailsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
