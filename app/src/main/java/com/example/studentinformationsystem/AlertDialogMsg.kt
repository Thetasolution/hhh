package com.example.studentinformationsystem

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.LayoutInflater
import kotlinx.android.synthetic.main.activity_alert_dialog_msg.*
import kotlinx.android.synthetic.main.login_dialog.view.*

class AlertDialogMsg : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog_msg)


        //button click to show dialog
        dialog.setOnClickListener {
            //inflate the Dialog with custom view
            val mDialogView = LayoutInflater.from(this).inflate(R.layout.login_dialog,null)
            //AlertDialogBuilder
            val mBuilder = AlertDialog.Builder(this)
                .setView(mDialogView)
                .setTitle("Login Confirmation")
            //show dialog
            val mAlertDialog= mBuilder.show()
            //login button click of custom layout
            mDialogView.dialogLoginBtn.setOnClickListener {
                //dismiss dialog
                mAlertDialog.dismiss()
                //get text from Edittext of custom layout
                val name= mDialogView.dialogNameEt.text.toString()
                val email=mDialogView.dialogEmailEt.text.toString()
                val password = mDialogView.dialogPasswordEt.text.toString()
                //set the input text in TextView
                mainInfoTv.setText("Name:"+ name +"\nEmail:"+email+"\nPassword:"+password)
            }
            //cancel button of custom layout
            mDialogView.dialogCancelBtn.setOnClickListener {
                //dismiss dialog
                mAlertDialog.dismiss()
            }
        }


    }
}
