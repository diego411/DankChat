package com.flxrs.dankchat.chat.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.flxrs.dankchat.databinding.SearchFragmentBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SearchFragment: Fragment() {

    private var bindingRef: SearchFragmentBinding? = null
    private val binding get() = bindingRef!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        println("Dank")
        bindingRef = SearchFragmentBinding.inflate(inflater, container, false).apply {
            searchToolbar.setNavigationOnClickListener { activity?.onBackPressed() }
            searchViewpager.setup()
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }

    override fun onDestroyView() {
        super.onDestroyView()
        bindingRef = null
    }

    private fun ViewPager2.setup() {

    }

    companion object {
        private val TAG = SearchFragment::class.java.simpleName
    }
}