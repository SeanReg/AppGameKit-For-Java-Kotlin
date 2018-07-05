package main;

import com.thegamecreators.agk.AGKEntry;
import com.thegamecreators.agk.AGKLib;

/**
 *
 * @author Sean
 */
public class AGKMain extends AGKEntry {
	
	private float speed[] = new float[500];
	private float move[] = new float[500];
	
	private int fire = 1;
	
	@Override
	public void begin() {
		// set the resolution
		AGKLib.SetVirtualResolution ( 320, 480 );

		// display a background
		AGKLib.CreateSprite ( AGKLib.LoadImage ( AGKLib.toAGKPath("background1.jpg") ) );

		// load an image for the particles and sprites
		AGKLib.LoadImage ( 1, AGKLib.toAGKPath("shrapnel3.png" ) );
		AGKLib.LoadImage ( 2, AGKLib.toAGKPath("ball1.png" ) );

		// create particles off screen
		AGKLib.CreateParticles ( 1, -100, -100 );

		// create a batch of 500 sprites
		for (int i = 1; i < 500; ++i) {
			AGKLib.CreateSprite ( i, 2 );
			AGKLib.SetSpritePosition ( i, AGKLib.Random ( 320, 2000 ), AGKLib.Random ( 60, 480 ) );
			AGKLib.SetSpriteColor ( i, AGKLib.Random ( 0, 255 ), AGKLib.Random ( 0, 255 ), AGKLib.Random ( 0, 255 ), AGKLib.Random ( 50, 255 ) );
			speed [ i ] = AGKLib.Random ( 10, 40 ) / 10.0f;
			move [ i ] = 0.0f;
		}
	}

	@Override
	public void loop() {
	// show statistics
		AGKLib.Print ( "Drawing set up time      = " + AGKLib.GetDrawingSetupTime ( ) );
		AGKLib.Print ( "Drawing time             = " + AGKLib.GetDrawingTime ( ) );
		AGKLib.Print ( "Sprites drawn            = " + AGKLib.GetManagedSpriteDrawnCount ( ) );
		AGKLib.Print ( "Particles drawn          = " + AGKLib.GetParticleDrawnQuadCount ( ) );
		AGKLib.Print ( "Frame rate               = " + AGKLib.ScreenFPS());

		// build 107 additions
		AGKLib.Print ( "Get pixels drawn         = " + AGKLib.GetPixelsDrawn ( ) );
		AGKLib.Print ( "Get managed sprite calls = " + AGKLib.GetManagedSpriteDrawCalls ( ) );

		// move all sprites
		for (int i = 1; i < 500; ++i) {
			float x = AGKLib.GetSpriteX ( i );
			float y = AGKLib.GetSpriteY ( i );

			y = y + AGKLib.Cos(move [ i ] );
			move [ i ] = move [ i ] + speed [ i ];

			AGKLib.SetSpritePosition ( i, x - speed [ i ], y );
			AGKLib.SetSpriteAngle ( i, AGKLib.GetSpriteAngle ( i ) + speed [ i ] );

			if (x < -100)
				AGKLib.SetSpritePosition ( i, AGKLib.Random ( 320, 2000 ), AGKLib.Random ( 60, 480 ) );
		}
		
		// fire particles when ready
		if ( fire == 1 ) {
			// set up particles
			AGKLib.SetParticlesPosition ( 1, AGKLib.Random ( 100, 200 ), AGKLib.Random ( 100, 300 ) );

			AGKLib.ResetParticleCount ( 1 );
			AGKLib.SetParticlesFrequency ( 1, 250 );
			AGKLib.SetParticlesLife ( 1, 3.0f );
			AGKLib.SetParticlesSize ( 1, 64 );
			AGKLib.SetParticlesStartZone ( 1, -10, 0, 10, 0 );
			AGKLib.SetParticlesImage ( 1, 1 );
			AGKLib.SetParticlesDirection ( 1, 30, 30 );
			AGKLib.SetParticlesAngle ( 1, 360 );
			AGKLib.SetParticlesVelocityRange ( 1, 0.8f, 2.5f );
			AGKLib.SetParticlesMax ( 1, 500 );

			AGKLib.AddParticlesColorKeyFrame ( 1, 0.0f, 0, 0, 0, 0 );
			AGKLib.AddParticlesColorKeyFrame ( 1, 0.5f, 255, 255, 0, 255 );
			AGKLib.AddParticlesColorKeyFrame ( 1, 2.8f, 255, 0, 0, 0 );

			AGKLib.AddParticlesForce ( 1, 2.0f, 2.8f, 25, -25 );

			// reset fire value
			fire = 0;
		}
		
		// when the explosion has finished it is safe to fire once more
		if ( AGKLib.GetParticlesMaxReached ( 1 ) == 1 )
			fire = 1;
		
		AGKLib.Sync();
	}

	@Override
	public void complete() {
	}
}
