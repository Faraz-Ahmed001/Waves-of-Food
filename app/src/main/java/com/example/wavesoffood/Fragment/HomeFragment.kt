package com.example.wavesoffood.Fragment

import android.R.attr.scaleType
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.interfaces.ItemClickListener
import com.denzcoskun.imageslider.models.SlideModel
import com.example.wavesoffood.R
import com.example.wavesoffood.adapter.PopularAdapter
import com.example.wavesoffood.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        // Inflate the layout for this fragment
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imageList = ArrayList<SlideModel>()
        imageList.add(SlideModel(R.drawable.banner4, ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.banner5, ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.banner6, ScaleTypes.FIT))

        val imageSlider = binding.imageSlider
        imageSlider.setImageList(imageList)
        imageSlider.setImageList(imageList, ScaleTypes.FIT)
        imageSlider.setItemClickListener(object : ItemClickListener {
            override fun doubleClick(position: Int) {
                TODO("Not yet implemented")
            }

            override fun onItemSelected(position: Int) {
                val itemPosition = imageList[position]
                val itemMessage = "Selected Image $position"
                Toast.makeText(requireContext(), itemMessage, Toast.LENGTH_SHORT).show()
            }
        })
        val foodName = listOf("Pizza", "Burger", "Hotdog", "Sandwich", "Fried Rice", "Hotdog")
        val price = listOf("$5", "$3", "$4", "$7", "$10", "$5")
        val popularFoodImages = listOf(R.drawable.menuphoto, R.drawable.menuphoto1, R.drawable.menuphoto2, R.drawable.menuphoto3, R.drawable.photomenu, R.drawable.photomenu1, R.drawable.photomenu2)
        val adapter = PopularAdapter(foodName, price, popularFoodImages)
        binding.popularRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.popularRecyclerView.adapter = adapter


    }

    companion object {

    }

}