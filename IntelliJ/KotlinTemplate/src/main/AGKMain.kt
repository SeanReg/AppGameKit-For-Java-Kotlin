package main

import com.thegamecreators.agk.AGKEntry
import com.thegamecreators.agk.AGKLib

class AGKMain : AGKEntry() {

    override fun begin() {
        //Setup your application here
        AGKLib.SetVirtualResolution(1024, 768)
        AGKLib.SetClearColor(151, 170, 204) // light blue
        AGKLib.SetSyncRate(60f, 0)
        AGKLib.SetScissor(0f, 0f, 0f, 0f)
    }

    override fun loop() {
        //Application main loop here
        AGKLib.Print("FPS: " + AGKLib.ScreenFPS())

        // Update screen
        AGKLib.Sync()
    }

    override fun complete() {
        //Cleanup your application here
    }
}
