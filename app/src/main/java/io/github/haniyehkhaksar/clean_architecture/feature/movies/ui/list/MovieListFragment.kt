package io.github.haniyehkhaksar.clean_architecture.feature.movies.ui.list

import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import io.github.haniyehkhaksar.clean_architecture.R
import io.github.haniyehkhaksar.clean_architecture.base.ui.fragment.BaseFragment

class MovieListFragment : BaseFragment() {

    companion object {
        fun newInstance() = MovieListFragment()
    }

    private lateinit var viewModel: MovieListViewModel
    override val layoutResourceId: Int
        get() = R.layout.movie_list_fragment

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MovieListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
