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

public class musicPlayerReceiver extends BroadcastReceiver{

	@Override
	public void onReceive(Context context, Intent intent) {
		
		Intent serviceIntent =  new Intent(context, BackgroundMusicService.class);
		
		String action = intent.getAction();
		
		if(action.equals("playMusic"))
		{
			serviceIntent.putExtra("toDo", "playMusic");
			
		}
		else if(action.equals("nextMusic"))
		{
			serviceIntent.putExtra("toDo", "nextMusic");
			
		}
		else if(action.equals("prevMusic"))
		{
			serviceIntent.putExtra("toDo", "prevMusic");
			
		}
		else if(action.equals("pauseMusic"))
		{
			serviceIntent.putExtra("toDo", "pauseMusic");
		}
		else if(action.equals("stopMusic"))
		{
			serviceIntent.putExtra("toDo", "stopMusic");
		}
		else if(action.equals("playMusicFromList"))
		{
			serviceIntent.putExtra("toDo", "playMusicFromList");
		}
		else if(action.equals("stopBackgroundService"))
		{
			serviceIntent.putExtra("toDo", "stopBackgroundService");
		}
		context.startService(serviceIntent);
	}

}
