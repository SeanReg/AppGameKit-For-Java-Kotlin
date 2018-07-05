package main;

import com.thegamecreators.agk.AGKEntry;
import com.thegamecreators.agk.AGKLib;

/**
 *
 * @author Sean
 */
public class AGKMain extends AGKEntry {


	private float startx = 0; 
	private float starty = 0; 
	private float angx = 0; 
	private float angy = 0;
	private int cameraMode = 0;
	private float time = 0;
	
	@Override
	public void begin() {
		AGKLib.SetWindowTitle("AGK");
		AGKLib.SetWindowSize(1024, 768, 0);
		AGKLib.SetWindowAllowResize(1);
		AGKLib.SetSyncRate( 60,0 );
		AGKLib.SetAntialiasMode(1);
		
		// set display properties
		AGKLib.SetVirtualResolution( 1024, 768 );
		AGKLib.SetOrientationAllowed( 1, 1, 1, 1 );
		AGKLib.SetScissor(0,0,0,0);
		AGKLib.SetCameraRange( 1, 0.1f, 2000 );

		// enable the sky box
		AGKLib.SetSkyBoxVisible( 1 );

		// load terrain detail texture with mipmapping enabled
		AGKLib.SetGenerateMipmaps(1);
		AGKLib.LoadImage( 1, AGKLib.toAGKPath("detail.png") );
		AGKLib.SetImageWrapU( 1, 1 );
		AGKLib.SetImageWrapV( 1, 1 );

		// load the terrain shader to give the terrain color based on height
		AGKLib.LoadShader( 1, AGKLib.toAGKPath("Terrain.vs"), AGKLib.toAGKPath("Terrain.ps") );

		// create the terrain object from a height map
		AGKLib.CreateObjectFromHeightMap( 1, AGKLib.toAGKPath("Mexico.png"), 768, 50, 768, 1, 16 );
		AGKLib.SetObjectImage( 1, 1, 0 );
		AGKLib.SetObjectUVScale( 1, 0, 128, 128 ); // scale the detail texture so it repeats
		AGKLib.SetObjectShader( 1, 1 );

		AGKLib.SetCameraPosition(1, 383, 30, 383);
		AGKLib.SetCameraLookAt( 1, 0,40,0,0 );

		AGKLib.SetAmbientColor( 128,128,128 );

		// buttons for mobile devices to control the camera 
		AGKLib.AddVirtualButton(1, AGKLib.GetScreenBoundsRight()-45, AGKLib.GetScreenBoundsBottom()-45,80 );
		AGKLib.AddVirtualButton(2, AGKLib.GetScreenBoundsRight()-45, AGKLib.GetScreenBoundsBottom()-130,80 );
		AGKLib.AddVirtualButton(3, AGKLib.GetScreenBoundsLeft()+45,AGKLib.GetScreenBoundsBottom()-45,80 );

		AGKLib.SetPrintSize(15);

		// add some atmospheric fog
		AGKLib.SetFogMode( 1 );
		AGKLib.SetFogColor( 161,183,209 );
		AGKLib.SetFogRange( 50, 700 );
		AGKLib.SetFogSunColor( 255,230,179 );
	}
	
	@Override
	public void loop() {
		// move the camera
		float speed = 1.0f;
		if ( AGKLib.GetRawKeyState( 16 ) == 1 ) speed = 0.1f;
		if ( cameraMode == 1 ) speed = 0.25f;

		if ( AGKLib.GetRawKeyState( 87 ) == 1 ) AGKLib.MoveCameraLocalZ( 1, speed );
		if ( AGKLib.GetRawKeyState( 83 ) == 1 ) AGKLib.MoveCameraLocalZ( 1, -speed );

		if ( AGKLib.GetRawKeyState( 65 ) == 1 ) AGKLib.MoveCameraLocalX( 1, -speed );
		if ( AGKLib.GetRawKeyState( 68 ) == 1 ) AGKLib.MoveCameraLocalX( 1, speed );

		if ( AGKLib.GetRawKeyState( 81 ) == 1 ) AGKLib.MoveCameraLocalY( 1, -speed );
		if ( AGKLib.GetRawKeyState( 69 ) == 1 ) AGKLib.MoveCameraLocalY( 1, speed );

		if ( AGKLib.GetVirtualButtonState(1) == 1 ) AGKLib.MoveCameraLocalZ( 1, -speed );
		if ( AGKLib.GetVirtualButtonState(2) == 1 ) AGKLib.MoveCameraLocalZ( 1, speed );

		// rotate the camera
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

		// change camera mode
		if ( AGKLib.GetVirtualButtonPressed(3) == 1 ) cameraMode = 1 - cameraMode;
		if ( cameraMode == 1 ) {
			// stick camera to the terrain
			float x = AGKLib.GetCameraX(1);
			float z = AGKLib.GetCameraZ(1);
			AGKLib.SetCameraPosition( 1, x, AGKLib.GetObjectHeightMapHeight(1,x,z)+0.5f, z );
		}

		// move the sun 
		time = time + AGKLib.GetFrameTime() * 0.5f;
		float xdir = AGKLib.Sin(time);
		float ydir = -0.5f;
		float zdir = AGKLib.Cos(time);
		AGKLib.SetSunDirection( xdir, ydir, zdir );

		// show some information
		AGKLib.Print( "FPS: " + AGKLib.ScreenFPS() );
		AGKLib.Print( "Polygons: " + AGKLib.GetPolygonsDrawn() );
			
		AGKLib.Sync();
	}

	@Override
	public void complete() {
	}	
}
