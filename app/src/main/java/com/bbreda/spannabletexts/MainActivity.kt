package com.bbreda.spannabletexts

import android.graphics.Typeface
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.StyleSpan
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val myTextBoldSpannable = "Hello World !"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvMyText.text = setBoldSpannable(myTextBoldSpannable)

    }

    private fun setBoldSpannable(myText: String): SpannableString {
        val spannableContent = SpannableString(myText)
        spannableContent.setSpan(
            StyleSpan(Typeface.BOLD),
            0,
            myText.length / 2,
            Spannable.SPAN_INCLUSIVE_INCLUSIVE
        )

        return spannableContent
    }
}
