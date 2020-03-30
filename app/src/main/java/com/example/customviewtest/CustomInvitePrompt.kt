package com.example.customviewtest

import android.content.Context
import android.graphics.drawable.GradientDrawable
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import java.lang.Exception

class CustomInvitePrompt: RelativeLayout, View.OnClickListener {
    private var inviteText: TextView? = null
    private var inviteButton: TextView? = null
    private var rootLayout:RelativeLayout?=null
private var mContext:Context?=null
    var invText:String=""
    var butText:String=""
    var bkgColor:Int=0
    var bkgColorButton:Int=0
    var invTextColor:Int=0
    var invButtonTextColor:Int=0


    constructor(context: Context?) : super(context){
        mContext=context
        val inflater = context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        inflater.inflate(R.layout.invite_friends_prompt, this)

        try {


            rootLayout=findViewById(R.id.root_layout)
            rootLayout?.setBackgroundColor(bkgColor)

            inviteButton=findViewById(R.id.customPrompt_inviteButton)
            inviteText=findViewById(R.id.customPrompt_inviteText)

            inviteButton?.let {
                it.text =butText
                it.setBackgroundResource(R.drawable.background_transparent_rounded_corners)
                val drawable = it.background as GradientDrawable
                drawable.setColor(bkgColorButton);
                it.setTextColor(invButtonTextColor)

            }


            inviteText?.let {
                it.text =invText
                it.setTextColor(invTextColor)

            }
        }catch (ex:Exception){
            Log.e("EXCEPTION AALI REY",ex.message)
        }
        postInvalidate()
//        init()
    }
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
mContext=context
        val inflater = context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        inflater.inflate(R.layout.invite_friends_prompt, this)

        try {


            rootLayout = findViewById(R.id.root_layout)
            rootLayout?.setBackgroundColor(bkgColor)

            inviteButton = findViewById(R.id.customPrompt_inviteButton)
            inviteText = findViewById(R.id.customPrompt_inviteText)

            inviteButton?.let {
                it.text = butText
                it.setBackgroundResource(R.drawable.background_transparent_rounded_corners)
                val drawable = it.background as GradientDrawable
                drawable.setColor(bkgColorButton);
                it.setTextColor(invButtonTextColor)

            }


            inviteText?.let {
                it.text = invText
                it.setTextColor(invTextColor)

            }


        } catch (ex: Exception) {
            Log.e("EXCEPTION AALI REY", ex.message)
        }
        postInvalidate()
//        init()
    }
//    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr){
//        mContext=context
////        init()
//
//    }


    override fun onClick(view: View?) {
        if (view != null) {
            when (view.id) {
                R.id.customPrompt_inviteText -> {
Toast.makeText(mContext,"Text Clicked",Toast.LENGTH_LONG).show()
                }
            }
        }
    }

}