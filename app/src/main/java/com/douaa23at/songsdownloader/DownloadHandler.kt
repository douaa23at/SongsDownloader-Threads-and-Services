package com.douaa23at.songsdownloader

import android.os.Handler
import android.os.Message
import android.util.Log

/**
 * Created by douaa.atouailaa on 05/04/2019.
 */
class DownloadHandler : Handler() {
    private val TAG: String?= DownloadHandler::javaClass.name
    override fun handleMessage(msg: Message?) {
        downloadSong(msg!!.obj.toString())
    }
    private fun downloadSong(msg :String) {
        val endTime = System.currentTimeMillis() + 1000*10
        while (System.currentTimeMillis() < endTime)
            Thread.sleep(1000)
        Log.d(TAG,"Song downloaded")
    }
}