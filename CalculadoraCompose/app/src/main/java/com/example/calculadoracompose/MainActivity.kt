package com.example.calculadoracompose

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.calculadoracompose.ui.theme.CalculadoraComposeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculadoraComposeTheme {
                CalculadoraEstado()
            }
        }
    }
}

@Composable
fun CrearBoton() {
    Row {
        Button(
            modifier = Modifier.width(1.dp),
            onClick = {

            }
        ) {
            Text("asdasd")
        }
        Button(
            onClick = {

            }
        ) {
            Text("asdasd")
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Preview(
    showSystemUi = true,
    device = "spec:width=411dp,height=891dp,dpi=420,isRound=false,chinSize=0dp,orientation=landscape"
)

@Composable
fun CalculadoraEstado() {
    val configuration = LocalConfiguration.current

    when (configuration.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {
            CalculadoraLandscape()
        }

        else -> {
            CalculadoraVertical()
        }

    }
}
@Composable
fun CalculadoraVertical() {
    CalculadoraComposeTheme {

        Column {

            Row {
                TextField(
                    modifier = Modifier
                        .weight(1f)
                        .height(300.dp),
                    value = "",
                    onValueChange = {
                    },

                    )
            }
            Row(

                modifier = Modifier
                    .height(95.dp),
            ) {

                Button(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .padding(5.dp),
                    onClick = {

                    },
                    shape = MaterialTheme.shapes.small,
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Cyan)
                ) {
                    Text("AC")
                }
                Button(
                    modifier = Modifier
                        .weight(2f)
                        .fillMaxHeight()
                        .padding(5.dp),
                    onClick = {

                    },
                    shape = MaterialTheme.shapes.small,
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Cyan)
                ) {
                    Text("COMPARTIR")
                }
                Button(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .padding(5.dp),
                    onClick = {

                    },
                    shape = MaterialTheme.shapes.small,
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Cyan)
                ) {
                    Text("/")
                }

            }
            Row(
                modifier = Modifier
                    .height(95.dp),
            ) {
                Button(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .padding(5.dp),
                    onClick = {

                    },
                    shape = MaterialTheme.shapes.small,
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
                ) {
                    Text("1")
                }
                Button(

                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .padding(5.dp),
                    onClick = {

                    },
                    shape = MaterialTheme.shapes.small,
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
                ) {
                    Text("1")
                }
                Button(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .padding(5.dp),
                    onClick = {

                    },
                    shape = MaterialTheme.shapes.small,
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
                ) {
                    Text("1")
                }
                Button(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .padding(5.dp),
                    onClick = {

                    },
                    shape = MaterialTheme.shapes.small,
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Cyan)
                ) {
                    Text("1")
                }
            }
            Row(
                modifier = Modifier
                    .height(95.dp),

                ) {
                Button(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .padding(5.dp),
                    onClick = {

                    },
                    shape = MaterialTheme.shapes.small,
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
                ) {
                    Text("1")
                }
                Button(

                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .padding(5.dp),
                    onClick = {

                    },
                    shape = MaterialTheme.shapes.small,
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
                ) {
                    Text("1")
                }
                Button(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .padding(5.dp),
                    onClick = {

                    },
                    shape = MaterialTheme.shapes.small,
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
                ) {
                    Text("1")
                }
                Button(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .padding(5.dp),
                    onClick = {

                    },
                    shape = MaterialTheme.shapes.small,
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Cyan)
                ) {
                    Text("1")
                }
            }
            Row(
                modifier = Modifier
                    .height(95.dp),
            ) {
                Button(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .padding(5.dp),
                    onClick = {

                    },
                    shape = MaterialTheme.shapes.small,
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
                ) {
                    Text("1")
                }
                Button(

                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .padding(5.dp),
                    onClick = {

                    },
                    shape = MaterialTheme.shapes.small,
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
                ) {
                    Text("1")
                }
                Button(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .padding(5.dp),
                    onClick = {

                    },
                    shape = MaterialTheme.shapes.small,
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
                ) {
                    Text("1")
                }
                Button(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .padding(5.dp),
                    onClick = {

                    },
                    shape = MaterialTheme.shapes.small,
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Cyan)
                ) {
                    Text("1")
                }
            }
            Row(
                modifier = Modifier
                    .height(95.dp),
            ) {
                Button(
                    modifier = Modifier
                        .weight(2f)
                        .fillMaxHeight()
                        .padding(5.dp),
                    onClick = {

                    },
                    shape = MaterialTheme.shapes.small,
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
                ) {
                    Text("0")
                }
                Button(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .padding(5.dp),
                    onClick = {

                    },
                    shape = MaterialTheme.shapes.small,
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
                ) {
                    Text(",")
                }
                Button(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .padding(5.dp),
                    onClick = {

                    },
                    shape = MaterialTheme.shapes.small,
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Cyan)
                ) {
                    Text("=")
                }

            }

        }
    }
}
@Composable
fun CalculadoraLandscape() {

}

