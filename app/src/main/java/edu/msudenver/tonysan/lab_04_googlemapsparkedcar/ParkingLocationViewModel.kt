package edu.msudenver.tonysan.lab_04_googlemapsparkedcar

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ParkingLocationViewModel : ViewModel() {
    // MutableLiveData to hold the string of the saved parking location
    val parkingLocation: MutableLiveData<String> = MutableLiveData()
}