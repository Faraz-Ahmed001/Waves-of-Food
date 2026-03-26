package com.example.wavesoffood

import android.R
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.wavesoffood.databinding.ActivityChooseLocationBinding

class ChooseLocationActivity : AppCompatActivity() {
    private val binding: ActivityChooseLocationBinding by lazy {
        ActivityChooseLocationBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val locationList: Array<String> = arrayOf(
            "Clifton", "Defence (DHA)", "Saddar", "Gulshan-e-Iqbal", "Gulistan-e-Johar", "North Nazimabad", "Federal B Area (FB Area)", "PECHS", "Bahadurabad", "Tariq Road", "Shahrah-e-Faisal", "Korangi", "Landhi", "Malir", "Nazimabad", "Orangi Town", "Liaquatabad", "Scheme 33", "Safoora Goth", "Buffer Zone"
        )
        val adapter = ArrayAdapter(this, R.layout.simple_dropdown_item_1line, locationList)
        val autoCompleteTextView = binding.listOfLocation
        autoCompleteTextView.setAdapter(adapter)



    }
}