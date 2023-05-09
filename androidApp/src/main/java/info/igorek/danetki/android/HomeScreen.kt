package info.igorek.danetki.android

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun HomeScreen() {
    LazyColumn {
        items(listOf("One", "Two")) { item ->
            Text(text = item)
        }
    }
}
