package com.thegamecreators.agk;

import main.AGKMain;

/**
 *
 * @author Sean
 */
public abstract class AGKEntry {
	/**
	* @param args the command line arguments
	*/
	public static void main(String[] args) {
		AGKLib.Begin(new AGKMain());
	}
	
	public void start() {
		begin();
		
		while (true) {
			if (AGKLib.UpdateWindow()) {
				break;
			}
			
			if (AGKLib.IsCapturingImage() == 0) {
				loop();
			} else {
				AGKLib.Sleep( 10 );
			}
		}
		
		complete();
		AGKLib.CleanNative();
	}
	
	public abstract void begin();
	public abstract void loop();
	public abstract void complete();
}
