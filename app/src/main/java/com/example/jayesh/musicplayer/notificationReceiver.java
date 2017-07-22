/*  
 *    Project name: Music player
 *    Submitted for: Summer training program 2015-16 ,HPES
 *    Submitted By: Avinash Kumar
 *     				Kiit University,BBSR-751024
 *     				email: gudavinas@gmail.com
 *     				phone: 8260619225
 * 
 * 
 */



package com.example.jayesh.musicplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class notificationReceiver extends BroadcastReceiver{

	@Override
	public void onReceive(Context context, Intent intent) {
		
Intent serviceIntent =  new Intent(context,notificationService.class);
		
		String action = intent.getAction();
		
		if(action.equals("playMusic") || action.equals("prevMusic")||action.equals("nextMusic") || action.equals("playMusicFromList")||action.equals("pauseMusic")|| action.equals("stopMusic"))
		{
			serviceIntent.putExtra("toDo", "playMusic");
			context.startService(serviceIntent);
			
		}
	}

}
