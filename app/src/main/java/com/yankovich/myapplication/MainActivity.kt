package com.yankovich.myapplication
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
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
                    RecipeList()
                }
            }
        }
    }
}

@Composable
fun RecipeList(){
    LazyColumn {
        items(10){
            RecipeItem(name = "test")
        }
    }
}


@Composable
fun RecipeItem(name: String) {
    val image = painterResource(id = R.drawable.recipe)
    Column {
        Image(
            painter = image,
            contentDescription = null,
//            modifier = Modifier.aspectRatio(16f/9f),
            contentScale = ContentScale.Fit,
        )
        Text(text = "Product name '$name!'", fontSize = 22.sp, color = Color.White)
        Text(text = "lorem ipsum set dolar um no met", color = Color.White)
    }
}

@Composable
fun Empty() {
    Text(text = "Just empty text", color = Color.White)
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
//        RecipeItem("empty")
//        Empty()
        RecipeList()
    }
}