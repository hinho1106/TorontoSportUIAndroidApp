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

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_page)

        val spinner : Spinner = findViewById(R.id.Dropin_Pg_spinner)
        // Your list of items
        val items = listOf("Option 1", "Option 2", "Option 3")
        // Create the adapter
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, items)
        // Set dropdown style
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        // Attach adapter to spinner
        spinner.adapter = adapter
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