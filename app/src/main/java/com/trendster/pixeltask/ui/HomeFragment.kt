package com.trendster.pixeltask.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.trendster.pixeltask.databinding.FragmentHomeBinding
import com.trendster.pixeltask.viewmodel.MainViewModel

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    val viewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.btnRequest.setOnClickListener {
            viewModel.getData()
            Log.d("Test", "called")
        }

        viewModel.responseData.observe(
            viewLifecycleOwner,
            {
                binding.txtItem.text = it.products.dealsOfTheDay[0].productName
                binding.txtItem1.text = it.products.dealsOfTheDay[1].productName
                binding.txtItem2.text = it.products.dealsOfTheDay[2].productName
            }
        )

        return binding.root
    }
}
