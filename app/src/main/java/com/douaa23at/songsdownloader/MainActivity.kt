package com.douaa23at.songsdownloader

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
private  var TAG:String? = MainActivity::javaClass.name
private var songDownloader:Button?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var thread:DownloadThread = DownloadThread()
        thread.name = "downloadUI"
        thread.start()
        songDownloader = findViewById(R.id.songDownloader)
        songDownloader!!.setOnClickListener{
            Toast.makeText(this@MainActivity,"Download is clicked",Toast.LENGTH_LONG).show()
            //send messages to the handler
            PlayList.playList.forEach {
                var message:Message = Message.obtain()
                message.obj = it
                thread.mDownloadHandler!!.sendMessage(message)
            }

        }
    }
}
