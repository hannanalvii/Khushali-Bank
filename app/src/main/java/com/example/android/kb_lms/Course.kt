package com.example.android.kb_lms

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.VideoView

class Course : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course)


        var vdoview = findViewById<VideoView>(R.id.videoView)
        vdoview.setVideoURI(Uri.parse("android.resource://"+ packageName + "/" + R.raw.small))
        //vdoview.setMediaController(new MediaController(this))
        vdoview.requestFocus()
        vdoview.start()

    }
}
