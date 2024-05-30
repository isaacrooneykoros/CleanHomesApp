package com.example.Sema.ui.theme.screens.clothingscreen

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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.Sema.R
import com.example.Sema.ui.theme.lBlue

private fun Modifier. Modifier(){

}



@Composable
fun ClothingScreen(navController: NavHostController) {
    val mContext = LocalContext.current

    Column (modifier = Modifier.fillMaxSize()) {
        TopAppBar(
            title = { Text(text = "Hoods") },
            backgroundColor = lBlue
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentAlignment = Alignment.BottomStart
        ) {

            Image(
                painter = painterResource(id = R.drawable.dressing),
                contentDescription = "pants",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Column {
                Text(
                    text = "SUMMER COLLECTION",
                    fontSize = 25.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.ExtraBold,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "Purchase your outfits",
                    fontSize = 20.sp,
                    color = Color.Black
                )
            }

        }
//End of box

        Spacer(modifier = Modifier.height(30.dp))



        //End of Column1
        Spacer(modifier = Modifier.width(10.dp))
        Column (modifier = Modifier.verticalScroll(rememberScrollState())){
            //Row1
            Row(modifier = Modifier.padding(start = 20.dp)) {
                //Column1

                Column {
                    Card(modifier = Modifier
                        .height(100.dp)
                        .width(160.dp)
                        .verticalScroll(rememberScrollState())) {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.img_3),
                                contentDescription = "Pants",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )


                        }

                    }

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "Colored Pants",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.Bold,
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Ksh.1500",
                        fontSize = 15.sp,
                        color = Color.Black
                    )

                    OutlinedButton(
                        onClick = {
                            val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                            simToolKitLaunchIntent?.let { mContext.startActivity(it) }

                        },

                        ) {
                        Text(text = "Rent", color = Color.Blue)
                    }

                    Spacer(modifier = Modifier.height(5.dp))

                }


                //End of Column1
                Spacer(modifier = Modifier.width(10.dp))

                //Column1

                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.img_1),
                                contentDescription = "Denim",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "Of Blue Denims",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "Ksh.4000",
                        fontSize = 15.sp,
                        color = Color.Black
                    )

                    OutlinedButton(
                        onClick = {
                            val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                            simToolKitLaunchIntent?.let { mContext.startActivity(it) }

                        },

                        ) {
                        Text(text = "Hire", color = Color.Blue)
                    }

                    Spacer(modifier = Modifier.height(5.dp))

                }


                //End of Column1
            }
            //End of row


            //Row2
            Row(modifier = Modifier.padding(start = 20.dp)) {
                //Column1

                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.img_4),
                                contentDescription = "Shirts",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }


                    Text(
                        text = "Colored Shirts",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                    )

                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Ksh.4800",
                        fontSize = 15.sp,
                        color = Color.Black
                    )

                    OutlinedButton(
                        onClick = {
                            val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                            simToolKitLaunchIntent?.let { mContext.startActivity(it) }

                        },

                        ) {
                        Text(text = "Hire", color = Color.Blue)
                    }


                    Spacer(modifier = Modifier.height(5.dp))

                }


                //End of Column1
                Spacer(modifier = Modifier.width(10.dp))

                //Column1

                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.img),
                                contentDescription = "Shorts",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "Colored Shorts",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                    )
                    Spacer(modifier = Modifier.height(5.dp))


                    Text(
                        text = "Ksh.7000",
                        fontSize = 15.sp,
                        color = Color.Black
                    )

                    OutlinedButton(
                        onClick = {
                            val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                            simToolKitLaunchIntent?.let { mContext.startActivity(it) }

                        },

                        ) {
                        Text(text = "Hire", color = Color.Blue)
                    }

                    Spacer(modifier = Modifier.height(5.dp))

                }


                //End of Column1
            }
            //End of row2

            //Row1
            Row(modifier = Modifier.padding(start = 20.dp)) {
                //Column1

                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.img_3),
                                contentDescription = "Pants",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "All sized Pants",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Ksh.8760",
                        fontSize = 15.sp,
                        color = Color.Black
                    )

                    OutlinedButton(
                        onClick = {
                            val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                            simToolKitLaunchIntent?.let { mContext.startActivity(it) }

                        },

                        ) {
                        Text(text = "Hire", color = Color.Red)
                    }


                    Spacer(modifier = Modifier.height(5.dp))

                }


                //End of Column1
                Spacer(modifier = Modifier.width(10.dp))

                //Column1

                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                    ) {
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.img_1),
                                contentDescription = "short",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "All sized",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Ksh.3500",
                        fontSize = 15.sp,
                        color = Color.Black
                    )
                    OutlinedButton(
                        onClick = {
                            val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                            simToolKitLaunchIntent?.let { mContext.startActivity(it) }

                        },

                        ) {
                        Text(text = "Hire", color = Color.Blue)
                    }

                }


                //End of Column1
            }
            //End of row 3
        }
    }
}


@Preview
@Composable
fun ClothingScreenPreview() {
    ClothingScreen(rememberNavController())
}