package com.example.statechanges

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.statechanges.ui.theme.StateChangesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContent {
            StateChangesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    HelloScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

class HelloViewModel : ViewModel() {
    private val _name = MutableLiveData("")
    val name: LiveData<String> = _name

    fun onNameChange(newName: String) {
        _name.value = newName
    }

}

@Composable
fun HelloScreen(helloViewModel: HelloViewModel = viewModel(), modifier: Modifier = Modifier) {
    val name : String by helloViewModel.name.observeAsState("")

    HelloContent(name = name, onNameChange = { helloViewModel.onNameChange(it) })
}

@Composable
fun HelloContent(
    name: String,
    onNameChange: (String) -> Unit
) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text= "Hello, $name!",
            modifier = Modifier.padding(bottom = 8.dp),
            style = MaterialTheme.typography.headlineSmall
        )
        OutlinedTextField(
            value = name,
            onValueChange = onNameChange,
            label = { Text(text ="Name") }
        )
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
fun DefaultPreview() {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        HelloScreen(modifier = Modifier.padding(innerPadding))
    }
}