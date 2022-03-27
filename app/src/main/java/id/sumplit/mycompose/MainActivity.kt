package id.sumplit.mycompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import id.sumplit.mycompose.ui.theme.MyComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Box {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "Test",
                contentScale = ContentScale.Crop
            )
        }
        Column {
            Text(text = "Hellow $name!")
            Text(text = "Hellow $name!")
            Text(text = "Hellow $name!")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyComposeTheme {
        Greeting("Androidxxxx")
    }
}