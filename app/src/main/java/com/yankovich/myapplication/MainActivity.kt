package com.yankovich.myapplication
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.yankovich.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    RecipeItem("Android")
                }
            }
        }
    }
}

@Composable
fun RecipeItem(name: String) {
    val image = painterResource(id = R.drawable.androidparty)
    Column {
        Image(painter = image, contentDescription = null)
        Text(text = "Product name '$name!'", fontSize = 22.sp, color = Color.White)
        Text(text = "lorem ipsum set dolar um no met", color = Color.White)
    }
}

@Preview(
    showBackground = true,
    name = "Mock 3",
    showSystemUi = true,
    backgroundColor = 0x333333
)
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        RecipeItem("empty")
    }
}