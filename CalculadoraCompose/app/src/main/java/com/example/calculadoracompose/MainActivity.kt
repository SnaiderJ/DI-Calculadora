package com.example.calculadoracompose

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
fun ResultadoCalculadora(resultado: String, horizontal : Boolean) {
    if (!horizontal) {
        Row(
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.End,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.35f)
        ) {
            Text(
                text = resultado,
                fontSize = 125.sp,
            )
        }
    } else {
        Row(
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.End,
            modifier = Modifier
                .padding(top = 20.dp)
                .width(400.dp)
                .fillMaxHeight(0.25f)
        ) {
            Text(
                text = resultado,
                fontSize = 90.sp,
            )
        }
    }
}

@Composable
fun Botones(
    text: String,
    weight: Int,
    size: Int,
    color : Color,
    funciona : Boolean,
    resultado : String,
    onTextChange: (String) -> Unit
){
    if (!funciona){
        Button(
            modifier = Modifier
                .width(weight.dp)
                .height(70.dp)
                .padding(5.dp),
            onClick = {
            },
            shape = MaterialTheme.shapes.small,
            colors = ButtonDefaults.buttonColors(containerColor = color)
        ) {
            Text(
                text = text, modifier = Modifier.wrapContentSize(), fontSize = size.sp
            )
        }
    } else {
        Button(
            modifier = Modifier
                .width(weight.dp)
                .height(70.dp)
                .padding(5.dp),
            onClick = {
                if (text == "AC") {
                    onTextChange("0")
                } else if (resultado == "0") {
                    onTextChange(text)
                } else {
                    onTextChange(if (resultado.length < 7) resultado + text else resultado)
                }
            },
            shape = MaterialTheme.shapes.small,
            colors = ButtonDefaults.buttonColors(containerColor = color)
        ) {
            Text(
                text = text, modifier = Modifier.wrapContentSize(), fontSize = size.sp
            )
        }
    }
}

@Composable
fun FilaBotones(
    tresBotones: Boolean,
    text1: String,
    text2: String,
    text3: String,
    text4: String,
    size: Int,
    color1: Color,
    color2: Color,
    resultado : String,
    onTextChange: (String) -> Unit
) {
    Row(
        modifier = Modifier
            .height(95.dp)
    ) {
        if (!tresBotones) {
            Button(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .padding(5.dp),
                onClick = {
                    if (resultado == "0") {
                        onTextChange(text1)
                    } else {
                        onTextChange(if (resultado.length < 5) resultado + text1 else resultado)
                    }
                },
                shape = MaterialTheme.shapes.small,
                colors = ButtonDefaults.buttonColors(containerColor = color1)
            ) {
                Text(
                    text = text1, modifier = Modifier.wrapContentSize(), fontSize = size.sp
                )
            }

            Button(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .padding(5.dp),
                onClick = {
                    if (resultado == "0") {
                        onTextChange(text2)
                    } else {
                        onTextChange(if (resultado.length < 5) resultado + text2 else resultado)
                    }
                },
                shape = MaterialTheme.shapes.small,
                colors = ButtonDefaults.buttonColors(containerColor = color1)
            ) {
                Text(
                    text = text2, modifier = Modifier.wrapContentSize(), fontSize = size.sp
                )
            }

            Button(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .padding(5.dp),
                onClick = {
                    if (resultado == "0") {
                        onTextChange(text3)
                    } else {
                        onTextChange(if (resultado.length < 5) resultado + text3 else resultado)
                    }
                },
                shape = MaterialTheme.shapes.small,
                colors = ButtonDefaults.buttonColors(containerColor = color1)
            ) {
                Text(
                    text = text3, modifier = Modifier.wrapContentSize(), fontSize = size.sp
                )
            }

            Button(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .padding(5.dp),
                onClick = {
                },
                shape = MaterialTheme.shapes.small,
                colors = ButtonDefaults.buttonColors(containerColor = color2)
            ) {
                Text(
                    text = text4, modifier = Modifier.wrapContentSize(), fontSize = size.sp
                )
            }
        } else if (text2 == "COMPARTIR"){
            Button(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .padding(5.dp),
                onClick = {
                    onTextChange("0")
                },
                shape = MaterialTheme.shapes.small,
                colors = ButtonDefaults.buttonColors(containerColor = color1)
            ) {
                Text(
                    text = text1, modifier = Modifier.wrapContentSize(), fontSize = size.sp
                )
            }

            Button(
                modifier = Modifier
                    .weight(2f)
                    .fillMaxHeight()
                    .padding(5.dp),
                onClick = {
                },
                shape = MaterialTheme.shapes.small,
                colors = ButtonDefaults.buttonColors(containerColor = color1)
            ) {
                Text(
                    text = text2, modifier = Modifier.wrapContentSize(), fontSize = 25.sp
                )
            }

            Button(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .padding(5.dp),
                onClick = {
                },
                shape = MaterialTheme.shapes.small,
                colors = ButtonDefaults.buttonColors(containerColor = color2)
            ) {
                Text(
                    text = text3, modifier = Modifier.wrapContentSize(), fontSize = size.sp
                )
            }
        } else {

            Button(
                modifier = Modifier
                    .weight(2f)
                    .fillMaxHeight()
                    .padding(5.dp),
                onClick = {
                    if (resultado == "0") {
                        onTextChange(text1)
                    } else {
                        onTextChange(if (resultado.length < 5) resultado + text1 else resultado)
                    }
                },
                shape = MaterialTheme.shapes.small,
                colors = ButtonDefaults.buttonColors(containerColor = color1)
            ) {
                Text(
                    text = text1, modifier = Modifier.wrapContentSize(), fontSize = size.sp
                )
            }

            Button(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .padding(5.dp),
                onClick = {
                    if (resultado == "0") {
                        onTextChange(text2)
                    } else {
                        onTextChange(if (resultado.length < 5) resultado + text2 else resultado)
                    }
                },
                shape = MaterialTheme.shapes.small,
                colors = ButtonDefaults.buttonColors(containerColor = color1)
            ) {
                Text(
                    text = text2, modifier = Modifier.wrapContentSize(), fontSize = size.sp
                )
            }

            Button(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .padding(5.dp),
                onClick = {
                },
                shape = MaterialTheme.shapes.small,
                colors = ButtonDefaults.buttonColors(containerColor = color2)
            ) {
                Text(
                    text = text3, modifier = Modifier.wrapContentSize(), fontSize = size.sp
                )
            }
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
    var resultado by rememberSaveable { mutableStateOf("0") }
    val configuration = LocalConfiguration.current
    when (configuration.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {
            CalculadoraHorizontal(resultado) {
                nuevoResultado -> resultado = nuevoResultado
            }
        }
        else -> {
            CalculadoraVertical(resultado) {
                nuevoResultado -> resultado = nuevoResultado
            }
        }
    }
}

@Composable
fun CalculadoraVertical(resultado: String, onTextChange: (String) -> Unit) {
    CalculadoraComposeTheme {
        Column {
            ResultadoCalculadora(resultado, false)
            FilaBotones(true, "AC", "COMPARTIR", "/",
                "", 25, Color.Blue, Color.Cyan, resultado = resultado,
                onTextChange = { resultado ->
                    onTextChange(if (resultado.length < 5) resultado else resultado.take(5))
                })
            FilaBotones(false, "7", "8", "9",
                "x", 25, Color.Blue, Color.Cyan, resultado = resultado,
                onTextChange = { resultado ->
                    onTextChange(if (resultado.length < 5) resultado else resultado.take(5))
                })
            FilaBotones(false, "4", "5", "6",
                "-", 25, Color.Blue, Color.Cyan, resultado = resultado,
                onTextChange = { resultado ->
                    onTextChange(if (resultado.length < 5) resultado else resultado.take(5))
                })
            FilaBotones(false, "1", "2", "3",
                "+", 25, Color.Blue, Color.Cyan, resultado = resultado,
                onTextChange = { resultado ->
                    onTextChange(if (resultado.length < 5) resultado else resultado.take(5))
                })
            FilaBotones(true, "0", ",", "=",
                "", 25, Color.Blue, Color.Cyan, resultado = resultado,
                onTextChange = { resultado ->
                    onTextChange(if (resultado.length < 5) resultado else resultado.take(5))
                })
        }
    }
}

@Composable
fun CalculadoraHorizontal(resultado: String, onTextChange: (String) -> Unit) {
    CalculadoraComposeTheme {
        val altura = 70
        val padding = 5
        Row {
            Column {
                ResultadoCalculadora(resultado, true)
                Row (
                    modifier = Modifier
                        .padding(padding.dp)
                        .height(altura.dp)
                ){
                    Botones("COMPARTIR", 200, 25, Color.Gray, false, resultado = resultado,
                        onTextChange = { resultado ->
                            onTextChange(if (resultado.length < 7) resultado else resultado.take(7))
                        })
                    Botones("AC", 200, 30, Color.Gray, true, resultado = resultado,
                        onTextChange = { resultado ->
                            onTextChange(if (resultado.length < 7) resultado else resultado.take(7))
                        })
                }
                Row (
                    modifier = Modifier
                        .padding(padding.dp)
                        .height(altura.dp)
                ){
                    Botones("/", 200, 30, Color.Gray, false, resultado = resultado,
                        onTextChange = { resultado ->
                            onTextChange(if (resultado.length < 7) resultado else resultado.take(7))
                        })
                    Botones("X", 200, 30, Color.Gray, false, resultado = resultado,
                        onTextChange = { resultado ->
                            onTextChange(if (resultado.length < 7) resultado else resultado.take(7))
                        })
                }
                Row (
                    modifier = Modifier
                        .padding(bottom = 10.dp)
                        .padding(padding.dp)
                        .height(altura.dp)
                ){
                    Botones("-", 200, 30, Color.Gray, false, resultado = resultado,
                        onTextChange = { resultado ->
                            onTextChange(if (resultado.length < 7) resultado else resultado.take(7))
                        })
                    Botones("+", 200, 30, Color.Gray, false, resultado = resultado,
                        onTextChange = { resultado ->
                            onTextChange(if (resultado.length < 7) resultado else resultado.take(7))
                        })
                }
            }
            Column {
                Row (
                    modifier = Modifier
                        .padding(top = 32.5.dp)
                        .padding(padding.dp)
                        .height(altura.dp)
                ){
                    Botones("7", 142, 30, Color.Black, true, resultado = resultado,
                        onTextChange = { resultado ->
                            onTextChange(if (resultado.length < 7) resultado else resultado.take(7))
                        })
                    Botones("8", 142, 30, Color.Black, true, resultado = resultado,
                        onTextChange = { resultado ->
                            onTextChange(if (resultado.length < 7) resultado else resultado.take(7))
                        })
                    Botones("9", 142, 30, Color.Black, true, resultado = resultado,
                        onTextChange = { resultado ->
                            onTextChange(if (resultado.length < 7) resultado else resultado.take(7))
                        })
                }
                Row (
                    modifier = Modifier
                        .padding(padding.dp)
                        .height(altura.dp)
                ){
                    Botones("4", 142, 30, Color.Black, true, resultado = resultado,
                        onTextChange = { resultado ->
                            onTextChange(if (resultado.length < 7) resultado else resultado.take(7))
                        })
                    Botones("5", 142, 30, Color.Black, true, resultado = resultado,
                        onTextChange = { resultado ->
                            onTextChange(if (resultado.length < 7) resultado else resultado.take(7))
                        })
                    Botones("6", 142, 30, Color.Black, true, resultado = resultado,
                        onTextChange = { resultado ->
                            onTextChange(if (resultado.length < 7) resultado else resultado.take(7))
                        })
                }
                Row (
                    modifier = Modifier
                        .padding(padding.dp)
                        .height(altura.dp)
                ){
                    Botones("1", 142, 30, Color.Black, true, resultado = resultado,
                        onTextChange = { resultado ->
                            onTextChange(if (resultado.length < 7) resultado else resultado.take(7))
                        })
                    Botones("2", 142, 30, Color.Black, true, resultado = resultado,
                        onTextChange = { resultado ->
                            onTextChange(if (resultado.length < 7) resultado else resultado.take(7))
                        })
                    Botones("3", 142, 30, Color.Black, true, resultado = resultado,
                        onTextChange = { resultado ->
                            onTextChange(if (resultado.length < 7) resultado else resultado.take(7))
                        })
                }
                Row (
                    modifier = Modifier
                        .padding(bottom = 10.dp)
                        .padding(padding.dp)
                        .height(altura.dp)
                ){
                    Botones("0", 142, 30, Color.Black, true, resultado = resultado,
                        onTextChange = { resultado ->
                            onTextChange(if (resultado.length < 7) resultado else resultado.take(7))
                        })
                    Botones(",", 142, 30, Color.Black, true, resultado = resultado,
                        onTextChange = { resultado ->
                            onTextChange(if (resultado.length < 7) resultado else resultado.take(7))
                        })
                    Botones("=", 142, 30, Color.Gray, false, resultado = resultado,
                        onTextChange = { resultado ->
                            onTextChange(if (resultado.length < 7) resultado else resultado.take(7))
                        })
                }
            }
        }
    }
}
