package com.douaa23at.songsdownloader

import android.os.Looper
import android.util.Log

/**
 * Created by douaa.atouailaa on 04/04/2019.
 */
class DownloadThread : Thread() {

     var mDownloadHandler : DownloadHandler?=null
       override fun run() {
           Looper.prepare()
           mDownloadHandler = DownloadHandler()
           Looper.loop()
    }


}