package com.example.tasarimcalismasi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tasarimcalismasi.ui.theme.TasarimCalismasiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TasarimCalismasiTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background
                ) {
                    Sayfa()
                }
            }
        }
    }
}

@Composable
fun Sayfa() {
/*    Row {
        Text(text = "Merhaba")
        Box(modifier = Modifier
            .size(80.dp)
            .background(Color.Red))
        Box(modifier = Modifier
            .size(50.dp)
            .background(Color.Green))
        Box(modifier = Modifier
            .size(100.dp)
            .background(Color.Blue))

    }
    Column {
        Text(text = "Merhaba")
        Box(modifier = Modifier
            .size(80.dp)
            .background(Color.Red))
        Box(modifier = Modifier
            .size(50.dp)
            .background(Color.Green))
        Box(modifier = Modifier
            .size(100.dp)
            .background(Color.Blue))

    }*/
/*    Box {
        Box(modifier = Modifier
            .size(100.dp)
            .background(Color.Red))
        Box(modifier = Modifier
            .size(80.dp)
            .background(Color.Green))
        Box(modifier = Modifier
            .size(60.dp)
            .background(Color.Blue))

    }*/
/*    Row {
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Red)
        )
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Green)
        )
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Blue)
        )
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Yellow)
        )

    }*/
    /*  Column(verticalArrangement = Arrangement.Center, modifier = Modifier.fillMaxHeight()) {
          Box(
              modifier = Modifier
                  .size(80.dp)
                  .background(Color.Red)
          )
          Box(
              modifier = Modifier
                  .size(50.dp)
                  .background(Color.Green)
          )
          Box(
              modifier = Modifier
                  .size(100.dp)
                  .background(Color.Blue)
          )

      }
      Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth()) {
          Box(
              modifier = Modifier
                  .size(80.dp)
                  .background(Color.Red)
          )
          Box(
              modifier = Modifier
                  .size(50.dp)
                  .background(Color.Green)
          )
          Box(
              modifier = Modifier
                  .size(100.dp)
                  .background(Color.Blue)
          )

      }
      Row(verticalAlignment = Alignment.CenterVertically) {
          Box(modifier = Modifier
              .size(80.dp)
              .background(Color.Red))
          Box(modifier = Modifier
              .size(50.dp)
              .background(Color.Green))
          Box(modifier = Modifier
              .size(100.dp)
              .background(Color.Yellow))
      }*/

/*    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.End
    ) {
        Box(modifier = Modifier
            .size(80.dp)
            .background(Color.Red))
        Box(modifier = Modifier
            .size(50.dp)
            .background(Color.Yellow))
        Box(modifier = Modifier
            .size(100.dp)
            .background(Color.Green))

    }*/
    /* Row(Modifier.fillMaxWidth()) {
         Text(text = "Merhaba", Modifier.padding(all = 20.dp))
         Text(text = "Merhaba", Modifier.padding(start = 20.dp, end = 20.dp))
         Box(
             modifier = Modifier
                 .size(100.dp)
                 .background(Color.Green)
         )
         Spacer(modifier = Modifier.size(20.dp))
         Box(
             modifier = Modifier
                 .size(80.dp, 200.dp)
                 .background(Color.Red)
         )
     }*/
    /*Row(modifier = Modifier.fillMaxWidth()) {
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Red)
                .weight(50f)
        )
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Yellow)
                .weight(30f)
        )
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Green)
                .weight(20f)
        )

    }*/
    /*Column {

        KirmiziKare()
        YesilKare()
        Yazi(yazi = "Merhaba", boyut = 40)

    }*/

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = stringResource(id = R.string.textYazi), fontSize = 50.sp)
        Button(onClick = { /*TODO*/ }) {
            Text(text = stringResource(id = R.string.buttonYazi), fontSize = 24.sp)
        }

    }

}

@Composable
fun KirmiziKare() {
    Box(
        modifier = Modifier
            .size(100.dp)
            .background(Color.Red)
    )
}

@Composable
fun YesilKare() {
    Box(
        modifier = Modifier
            .size(100.dp)
            .background(Color.Green)
    )
}

@Composable
fun Yazi(yazi: String, boyut: Int) {
    Text(text = yazi, fontSize = boyut.sp)
}


@Preview(showBackground = true, locale = "tr")
@Composable
fun DefaultPreview() {
    TasarimCalismasiTheme {
        Sayfa()
    }
}