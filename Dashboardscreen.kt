package com.example.Sema.ui.theme.screens.dashboard

import android.graphics.Color
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.movableContentOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.Sema.R
import com.example.Sema.navigation.ROUT_CLOTHING
import com.example.Sema.ui.theme.lBlue

@Composable
fun Dashboardscreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        val mContext = LocalContext.current
        TopAppBar(
            title = {
                Text(text = "Amazon Shop")
            },
            backgroundColor = lBlue
        )
        //End of TopAppBar
        Spacer(modifier = Modifier.height(30.dp))

        //Start of Row

        Row {
            Column {
                Text(text = "Amazon", fontSize = 30.sp)
                Text(text = "Shop from A to Z")
            }
            Spacer(modifier = Modifier.width(100.dp))


            Image(
                painter = painterResource(id = R.drawable.img),
                contentDescription = "Amazon",
                modifier = Modifier.size(100.dp)
            )


        }
        //End of Row

        Column(modifier = Modifier.padding(start = 20.dp)) {
            //Row1
            Row {
                Card(
                    modifier = Modifier
                        .clickable{
                            navController.navigate(ROUT_CLOTHING)
                            Toast.makeText(mContext,
                                "Opening ClothesScreen",
                                Toast.LENGTH_SHORT).show()
                        }
                        .size(width = 160.dp, height = 120.dp), elevation = 10.dp
                )
                {
                    Column {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.img),
                                contentDescription = "amazon",
                                modifier = Modifier.size(100.dp)
                            )
                        }
                        Text(
                            text = "Clothing",
                            fontSize = 20.sp,
                            color = lBlue,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                    }

                    Spacer(modifier = Modifier.width(100.dp))



                }

                Card(
                    modifier = Modifier
                        .size(width = 160.dp, height = 120.dp), elevation = 10.dp
                )
                {
                    Column {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.img),
                                contentDescription = "amazon",
                                modifier = Modifier.size(100.dp)
                            )
                        }
                        Text(
                            text = "Electronics",
                            fontSize = 20.sp,
                            color = lBlue,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )

                    }


                }
            }

            //End of Row1

            Spacer(modifier = Modifier.width(40.dp))


            Row {
                Card(
                    modifier = Modifier
                        .size(width = 160.dp, height = 120.dp), elevation = 10.dp
                )
                {
                    Column {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.img),
                                contentDescription = "amazon",
                                modifier = Modifier.size(100.dp)
                            )
                        }
                        Text(
                            text = "Home",
                            fontSize = 20.sp,
                            color = lBlue,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                    }

                    Spacer(modifier = Modifier.width(100.dp))



                }

                Card(
                    modifier = Modifier
                        .size(width = 160.dp, height = 120.dp), elevation = 10.dp
                )
                {
                    Column {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.img),
                                contentDescription = "amazon",
                                modifier = Modifier.size(100.dp)
                            )
                        }
                        Text(
                            text = "Beauty",
                            fontSize = 20.sp,
                            color = lBlue,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )

                    }


                }
            }

            //End of Row1


            Row {
                Card(
                    modifier = Modifier
                        .size(width = 160.dp, height = 120.dp), elevation = 10.dp
                )
                {
                    Column {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.img),
                                contentDescription = "amazon",
                                modifier = Modifier.size(100.dp)
                            )
                        }
                        Text(
                            text = "Pharmacy",
                            fontSize = 20.sp,
                            color = lBlue,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                    }

                    Spacer(modifier = Modifier.width(100.dp))



                }

                Card(
                    modifier = Modifier
                        .size(width = 160.dp, height = 120.dp), elevation = 10.dp
                )
                {
                    Column {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.img_1),
                                contentDescription = "amazon",
                                modifier = Modifier.size(100.dp)
                            )
                        }
                        Text(
                            text = "Groceries",
                            fontSize = 20.sp,
                            color = lBlue,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )

                    }


                }
            }

            //End of Row1



                    }


                }
            }

            //End of Row1

fun TopAppBar(title: @Composable () -> Unit, backgroundColor: Color, function: () -> Unit) {

}

@Preview(showBackground = true)
@Composable
fun DashboardscreenPreview(){
    Dashboardscreen(rememberNavController())

}