package com.example.cards

import android.content.Context
import android.util.AttributeSet
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class CustomView(context: Context,attrs: AttributeSet):ConstraintLayout(context,attrs) {

    init {
        inflate(context,R.layout.custom_view,this)

        val imageView1 :ImageView = findViewById(R.id.image)
        val imageView2 :ImageView = findViewById(R.id.image2)
        val imageView3 :ImageView = findViewById(R.id.image3)
        val textView1 :TextView =findViewById(R.id.caption)
        val textView2 :TextView =findViewById(R.id.caption2)

        val attributes = context.obtainStyledAttributes(attrs,R.styleable.custom_view)

        imageView1.setImageDrawable(attributes.getDrawable(R.styleable.custom_view_image))
        imageView2.setImageDrawable(attributes.getDrawable(R.styleable.custom_view_image))
        imageView3.setImageDrawable(attributes.getDrawable(R.styleable.custom_view_image))
        textView1.text = attributes.getText(R.styleable.custom_view_text)
        textView2.text = attributes.getText(R.styleable.custom_view_text)

        attributes.recycle()
    }
}