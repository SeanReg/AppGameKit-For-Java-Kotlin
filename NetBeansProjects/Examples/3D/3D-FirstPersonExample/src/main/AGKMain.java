package main;

import com.thegamecreators.agk.AGKEntry;
import com.thegamecreators.agk.AGKLib;

public class AGKMain extends AGKEntry {


	private float startx = 0; 
	private float starty = 0; 
	private float angx = 0; 
	private float angy = 0;
	
	@Override
	public void begin() {
		// Init app
		AGKLib.SetDisplayAspect(640.0f / 480);
		AGKLib.SetSyncRate(60,0);
		AGKLib.SetClearColor(128,64,0);
		AGKLib.SetCameraRange(1,15,1000);
		AGKLib.SetScissor(0,0,0,0);

		// Loading status
		int customimg = AGKLib.LoadImage(AGKLib.toAGKPath("custom.png"));
		AGKLib.CreateText(1,"Loading Metro Theatre Scene");
		AGKLib.SetTextFontImage(1,customimg);
		AGKLib.SetTextAlignment(1,1);
		AGKLib.SetTextPosition(1,50,45);
		AGKLib.SetTextSize(1,10);
		AGKLib.CreateText(2,"Artwork by Mark Blosser");
		AGKLib.SetTextFontImage(2,customimg);
		AGKLib.SetTextAlignment(2,1);
		AGKLib.SetTextPosition(2,50,60);
		AGKLib.SetTextSize(1,8);
		AGKLib.Sync();

		// Load world
		loadWorld();

		// Setup camera
		float plrx = 1850, plrz = -3650, plra = 0, eyeheight = 553;
		AGKLib.SetCameraPosition(1,plrx,eyeheight,plrz);
		AGKLib.SetCameraRotation(1,0,plra,0);

		AGKLib.CreatePointLight(1, plrx,eyeheight,plrz, 600, 255,255,255 );
		AGKLib.SetPointLightMode(1,1);
		AGKLib.CreateObjectSphere( 99, 10, 10,10 );
		AGKLib.SetObjectLightMode( 99, 0 );

		AGKLib.SetSunActive(0);
		AGKLib.SetAmbientColor(50,50,50);

		// Start loop
		AGKLib.DeleteText(1);
		AGKLib.DeleteText(2);

		AGKLib.SetRawJoystickDeadZone(0.1f);

		AGKLib.AddVirtualButton(1, 94.7f,93.1f,9.77f );
		AGKLib.AddVirtualButton(2, 94.7f,79.4f,9.77f );
	}
	
	private void loadWorld() {
		//
		//
		// Load lightmaps
		int lm[] = new int[10];
		lm[0] = AGKLib.LoadImage(AGKLib.toAGKPath("0.png"));
		lm[1] = AGKLib.LoadImage(AGKLib.toAGKPath("1.png"));
		for (int t = 0; t <= 1; ++t) {
			AGKLib.SetImageWrapU(lm[t],1);
			AGKLib.SetImageWrapV(lm[t],1);
		}
		//
		// Load all OBJ making up world (created in FPS Creator)
		int objmax = 50;
		for (int obj = 1; obj <= objmax; ++obj) {
			String objs = "mesh" + obj + ".obj";
			AGKLib.LoadObject(obj, AGKLib.toAGKPath(objs), 0);

			String tex = "";
			if (obj>=1 && obj<=7) {
				tex = "mesh" + obj + "-1.jpg";
			} else {
				tex = "mesh" + obj + "-0.jpg";
			}
			String texname = AGKLib.Left(tex, AGKLib.Len(tex) - 4);
			String lms = AGKLib.Right(texname,1);
			if (lms == "-") 
				lms="0";
			int teximg = AGKLib.LoadImage(AGKLib.toAGKPath(tex));
			AGKLib.SetImageWrapU(teximg,1);
			AGKLib.SetImageWrapV(teximg,1);
			AGKLib.SetObjectImage(obj,teximg,0);
			AGKLib.SetObjectLightMap(obj,lm[Integer.parseInt(lms)]);
			//
			// Progress status
			int perc = (int)((obj / (float)objmax) * 100);

			AGKLib.SetTextString(1,"Metro Theatre - "+ perc +"%");
			AGKLib.Sync();

		}
	}
	
	@Override
	public void loop() {
		// Old position
		float oldx = AGKLib.GetCameraX(1);
		float oldy = AGKLib.GetCameraY(1) - 45;
		float oldz = AGKLib.GetCameraZ(1);
		//
		// Move camera
		if ( AGKLib.GetRawKeyState( 87 ) == 1) AGKLib.MoveCameraLocalZ( 1, 4 );
		if ( AGKLib.GetRawKeyState( 83 ) == 1) AGKLib.MoveCameraLocalZ( 1, -4 );
		if ( AGKLib.GetRawKeyState( 65 ) == 1) AGKLib.MoveCameraLocalX( 1, -4 );
		if ( AGKLib.GetRawKeyState( 68 ) == 1) AGKLib.MoveCameraLocalX( 1, 4 );

		if ( AGKLib.GetVirtualButtonState(1) == 1 ) AGKLib.MoveCameraLocalZ( 1, -4 );
		if ( AGKLib.GetVirtualButtonState(2) == 1 ) AGKLib.MoveCameraLocalZ( 1, 4 );
		
		int pressed = 0;
		if ( AGKLib.GetPointerPressed() == 1) {
			startx = AGKLib.GetPointerX();
			starty = AGKLib.GetPointerY();
			angx = AGKLib.GetCameraAngleX(1);
			angy = AGKLib.GetCameraAngleY(1);
			pressed = 1;
		}

		if ( AGKLib.GetPointerState() == 1 ) {
			float fDiffX = (AGKLib.GetPointerX() - startx) / 1.0f;
			float fDiffY = (AGKLib.GetPointerY() - starty) / 1.0f;

			float newX = angx + fDiffY;
			if ( newX > 89 ) newX = 89;
			if ( newX < -89 ) newX = -89;
			AGKLib.SetCameraRotation( 1, newX, angy + fDiffX, 0 );
		}

		if ( AGKLib.GetRawJoystickExists(1) == 1 ) {
			AGKLib.MoveCameraLocalZ(1,-AGKLib.GetRawJoystickY(1)*4);
			AGKLib.MoveCameraLocalX(1,AGKLib.GetRawJoystickX(1)*4);
			AGKLib.RotateCameraGlobalY(1,AGKLib.GetRawJoystickRX(1)*4);
			AGKLib.RotateCameraLocalX(1,AGKLib.GetRawJoystickRY(1)*4);
		}
		//
		// Gravity on camera
		AGKLib.SetCameraPosition(1,AGKLib.GetCameraX(1),AGKLib.GetCameraY(1)-4,AGKLib.GetCameraZ(1));
		//
		// New position
		float newx = AGKLib.GetCameraX(1);
		float newy = AGKLib.GetCameraY(1)-45;
		float newz = AGKLib.GetCameraZ(1);
		//
		// Adjust Y to match floor
		if (AGKLib.ObjectSphereSlide(0,oldx,oldy,oldz,newx,newy,newz,19l) > 0) {
			newx = AGKLib.GetObjectRayCastSlideX(0);
			newy = AGKLib.GetObjectRayCastSlideY(0);
			newz = AGKLib.GetObjectRayCastSlideZ(0);
			AGKLib.SetCameraPosition(1,newx,newy+45,newz);
		}

		float posx = AGKLib.Sin(AGKLib.Timer()*40) * 250 + 2000;
		AGKLib.SetPointLightPosition( 1, posx, 565, -3600 );
		AGKLib.SetObjectPosition( 99, posx, 565, -3600 );
		//
		// Framerate prompt
		AGKLib.Print("W A S D or joystick to move, click and drag to rotate");
		float fps = AGKLib.ScreenFPS(); 
		AGKLib.Print("FPS: " + fps);
		//
		// Update screen
		AGKLib.Sync();
	}

	@Override
	public void complete() {
	}	
}
