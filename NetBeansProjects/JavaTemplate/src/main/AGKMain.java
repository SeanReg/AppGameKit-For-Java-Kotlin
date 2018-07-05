package main;

import com.thegamecreators.agk.AGKEntry;
import com.thegamecreators.agk.AGKLib;

public class AGKMain extends AGKEntry {

	@Override
	public void begin() {
		//Setup your application here
		AGKLib.SetVirtualResolution (1024, 768);
		AGKLib.SetClearColor( 151,170,204 ); // light blue
		AGKLib.SetSyncRate(60,0);
		AGKLib.SetScissor(0,0,0,0);
	}
	
	@Override
	public void loop() {
		//Application main loop here
		
		AGKLib.Print("FPS: " + AGKLib.ScreenFPS());

		// Update screen
		AGKLib.Sync();
	}

	@Override
	public void complete() {
		//Cleanup your application here
	}
	
}
