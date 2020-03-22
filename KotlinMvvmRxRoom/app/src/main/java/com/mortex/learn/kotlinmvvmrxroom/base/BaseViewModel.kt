package com.mortex.learn.kotlinmvvmrxroom.base

import androidx.lifecycle.ViewModel
import com.mortex.learn.kotlinmvvmrxroom.di.NetworkModule
import com.mortex.learn.kotlinmvvmrxroom.di.injection.componenet.DaggerViewModelInjector
import com.mortex.learn.kotlinmvvmrxroom.di.injection.componenet.ViewModelInjector
import com.mortex.learn.kotlinmvvmrxroom.ui.post_list.PostListViewModel

abstract class BaseViewModel: ViewModel() {

    private val injector: ViewModelInjector = DaggerViewModelInjector
        .builder()
        .networkModule(NetworkModule)
        .build()

    init {
        inject()
    }

    /**
     * Injects the required dependencies
     */
    private fun inject() {
        when (this) {
            is PostListViewModel -> injector.inject(this)
        }
    }
}