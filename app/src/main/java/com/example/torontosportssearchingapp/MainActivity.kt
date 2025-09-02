package com.example.torontosportssearchingapp

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.torontosportssearchingapp.ui.theme.TorontoSportsSearchingAppTheme
import android.widget.Button
import android.content.Intent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_page)

        val sportType_spinner : Spinner = findViewById(R.id.Dropin_Pg_spinner)
        val week_spinner : Spinner = findViewById(R.id.Week_spinner)
        val day_spinner : Spinner = findViewById(R.id.Day_spinner)
        // Your list of items
        val sportType_items = listOf("Ice", "Non-Ice")
        val week_items = listOf("Week 1", "Week 2", "Week 3", "Week 4")
        val day_items = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
        // Create the adapter
        val sportType_adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, sportType_items)
        val week_adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, week_items)
        val day_adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, day_items)
        // Set dropdown style
        sportType_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        week_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        day_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        // Attach adapter to spinner
        sportType_spinner.adapter = sportType_adapter
        week_spinner.adapter = week_adapter
        day_spinner.adapter = day_adapter

        val btnGoSearch = findViewById<Button>(R.id.search_button)
        btnGoSearch.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onDestroy() {
        super.onDestroy()

        // Clean up resources here
        //releaseSomeResources()
    }
}



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TorontoSportsSearchingAppTheme {
        Greeting("Android")
    }
}