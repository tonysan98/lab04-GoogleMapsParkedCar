package edu.msudenver.tonysan.lab_04_googlemapsparkedcar

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import edu.msudenver.tonysan.lab_04_googlemapsparkedcar.R

class DetailFragment : Fragment() {

    private lateinit var viewModel: ParkingLocationViewModel
    private lateinit var locationTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(ParkingLocationViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_detail, container, false)
        locationTextView = view.findViewById(R.id.locationTextView) // Assuming the TextView has this ID
        observeParkingLocation()
        return view
    }

    private fun observeParkingLocation() {
        viewModel.parkingLocation.observe(viewLifecycleOwner) { newLocation ->
            locationTextView.text = newLocation ?: "Location not set"
        }
    }
}
