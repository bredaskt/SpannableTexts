package com.bbreda.spannabletexts

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSpannableTexts()
    }

    private fun setSpannableTexts() {
        val myTextBoldSpannable = "This is a text bold spannable !"
        val myTextColorSpannable = "This is a text color spannable !"

        tvMyTextBold.text = setBoldSpannable(myTextBoldSpannable)
        tvMyTextSpannable.text = setColorSpannable(myTextColorSpannable)
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

    private fun setColorSpannable(myText: String): SpannableString {
        val spannableContent = SpannableString(myText)
        spannableContent.setSpan(
            ForegroundColorSpan(Color.RED),
            8, 12,
            Spannable.SPAN_EXCLUSIVE_INCLUSIVE)
        return spannableContent
    }


}
