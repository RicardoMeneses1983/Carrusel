package com.example.carrusel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView.ItemAnimator.ItemAnimatorFinishedListener
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.listener.CarouselListener
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem
import java.text.FieldPosition

class MainActivity : AppCompatActivity() {

  private val list = mutableListOf<CarouselItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val carousel : ImageCarousel = findViewById(R.id.carousel)

       list.add(CarouselItem(imageDrawable = R.drawable.imagencuatro, "4"))
       list.add(CarouselItem(imageDrawable = R.drawable.imagendos,"2"))
       list.add(CarouselItem(imageDrawable = R.drawable.imagenuno,"1"))

       carousel.showCaption = false

       carousel.addData(list)

        carousel.carouselListener = object : CarouselListener {

            val intentApple= Intent(this@MainActivity,AppleInfo::class.java).apply {
                            }

            val intentHonor = Intent(this@MainActivity,MainHonor::class.java).apply {

            }

            override fun onClick(position: Int, carouselItem: CarouselItem) {
               // super.onClick(position, carouselItem)
              //  Toast.makeText(this@MainActivity,"Celular ${carouselItem.caption}",Toast.LENGTH_SHORT).show()

              Log.i("Entra","Celuar Imagen ${carouselItem.caption}")

              if (carouselItem.caption == "1"){
                  Log.i("Apple","Acceso Apple")
                  startActivity(intentApple)
              }
                if (carouselItem.caption == "4"){
                    Log.i("Apple","Acceso Honor")
                    startActivity(intentHonor)
                }



            }

        }

    }

  }


