package com.thegamecreators.agk;

/**
 *
 * @author Sean
 */
public class AGKLib {

	static {
		try {
			System.loadLibrary("agk64");
		} catch(UnsatisfiedLinkError e) {
			System.load(System.getProperty("user.dir") + "/" + System.mapLibraryName("agk64"));
		}
	}
		
	public static String toAGKPath(String fileName) {
		String dir = System.getProperty("user.dir");
		return "raw:" + dir + "/media/" + fileName;
	}
	
	public static native void Begin(AGKEntry entry);
	public static native boolean UpdateWindow();
	public static native void CleanNative();
	
    // core functions
    public static native void SetScreenResolution( int width, int height );
    public static native void SetWindowPosition( int x, int y );
    public static native void SetWindowSize( int width, int height, int fullscreen );
    public static native void SetWindowSize( int width, int height, int fullscreen, int allowOverSized );
    public static native void SetWindowAllowResize( int mode );
    public static native void MaximizeWindow();
    public static native void MinimizeApp();
    public static native void RestoreApp();
    public static native void SetImmersiveMode( int mode );
    public static native int GetDeviceWidth();
    public static native int GetRealDeviceWidth();
    public static native int GetDeviceHeight();
    public static native int GetRealDeviceHeight();
    public static native int GetMaxDeviceWidth();
    public static native int GetMaxDeviceHeight();
    public static native int GetDeviceDPI();
    public static native String GetAppPackageName();
    public static native int GetDevicePlatform();
    public static native void SetVSync( int mode );
    public static native void SetSyncRate( float fps, int mode );
    public static native void SetVirtualResolution( int iWidth, int iHeight );
    public static native void SetDisplayAspect( float aspect );
    public static native int GetVirtualWidth();
    public static native int GetVirtualHeight();
    public static native float GetScreenBoundsLeft();
    public static native float GetScreenBoundsRight();
    public static native float GetScreenBoundsTop();
    public static native float GetScreenBoundsBottom();
    public static native float GetDisplayAspect();
    public static native int GetOrientation();
    public static native int GetPaused();
    public static native int GetResumed();
    public static native int GetResumed2();
    public static native String GetDeviceName();
    public static native String GetDeviceBaseName();
    public static native String GetDeviceType();
    public static native int GetDeviceNetworkType();
    public static native int GetStorageRemaining( String path );
    public static native int GetStorageTotal( String path );
    public static native String GetAppName();
    public static native String GetCL();
    public static native void SetWindowTitle( String szTitle );
    public static native void UpdateDeviceSize();
    public static native void UpdateDeviceSize(int w);
    public static native void UpdateDeviceSize(int w, int h);
    public static native void StepPhysics( float time );
    public static native void Sync();
    public static native void Break();
    public static native void Update( float time );
    public static native void Update();
    public static native void Update2D( float time );
    public static native void Update2D();
    public static native void Update3D( float time );
    public static native void Update3D();
    public static native void DrawAllLines();
    public static native void Render2DBack();
    public static native void Render2DFront();
    public static native void Render3D();
    public static native void RenderShadowMap();
    public static native void Render();
    public static native void Swap();
    public static native void UpdateInput();
    public static native void ClearScreen();
    public static native void ClearDepthBuffer();
    public static native void Sleep( int milliseconds );
    public static native float Timer();
    public static native void ResetTimer();
    public static native double PlatformGetRawTime();
    public static native float GetRunTime();
    public static native int GetSeconds();
    public static native float GetFrameTime();
    public static native int GetMilliseconds();
    public static native String GetDeviceLanguage();
    public static native void SetSleepMode( int mode );
    public static native void SetAntialiasMode( int mode );

    public static native void SetExpansionFileKey( String key );
    public static native void SetExpansionFileVersion(int version);
    public static native int GetExpansionFileState();
    public static native void DownloadExpansionFile();
    public static native float GetExpansionFileProgress();

    public static native String GetDeviceID();
    public static native String Sha1( String str );
    public static native String Sha256( String str );
    public static native String Sha512( String str );
    public static native String HTTPEncode( String str );
    public static native String HTTPDecode( String str );
    public static native int GetNumProcessors();


    public static native int SortFloatToint( float f );
    public static native float SortintToFloat( int u );
    public static native int SortIntToint( int f );
    public static native int SortintToInt( int u );

    // math functions
    public static native void SetRandomSeed( int seed );
    public static native int Random( );
    public static native int Random( int from, int to );
    public static native int RandomSign( int value );
    public static native void SetRandomSeed2( int seed );
    public static native int Random2( );
    public static native int Random2( int from, int to );
    public static native float Sin( float a );
    public static native float Cos( float a );
    public static native float Tan( float a );
    public static native float SinRad( float a );
    public static native float CosRad( float a );
    public static native float TanRad( float a );
    public static native float ASin( float a );
    public static native float ACos( float a );
    public static native float ATan( float a );
    public static native float ATan2( float y, float x );
    public static native float ATanFull( float x, float y );
    public static native float ASinRad( float a );
    public static native float ACosRad( float a );
    public static native float ATanRad( float a );
    public static native float ATan2Rad( float y, float x );
    public static native float ATanFullRad( float x, float y );
    public static native int Trunc( float a );
    public static native int Floor( float a );
    public static native int Ceil( float a );
    public static native int Round( float a );
    public static native float Sqrt( float a );
    public static native float Abs( float a );
    public static native int Mod( int a, int b );
    public static native float FMod( float a, float b );
    public static native float Pow( float a, float b );
    public static native float Log( float a );

    // control functions
    public static native void SetAlphaTestThreshold( int threshold );
    public static native void SetGenerateMipmaps( int generate );
    public static native void SetOrientationAllowed( int portrait, int portrait2, int landscape, int landscape2 );
    public static native void SetTransitionMode( int mode );
    public static native void SetSortTextures( int sort );
    public static native void SetSortDepth( int sort );
    public static native void SetSortTransparentDepth( int sort );
    public static native void SetSortCreated( int sort );
    public static native float ScreenFPS();
    public static native int GetPolygonsDrawn();
    public static native int GetShadowPolygonsDrawn();
    public static native int GetVerticesProcessed();
    public static native void EnableClearDepth( int clear );
    public static native void EnableClearColor( int clear );
    public static native void SetBorderColor( int red, int green, int blue );
    public static native void SetClearColor( int red, int green, int blue );
    public static native void BindDefaultFramebuffer();
    public static native void SetDefaultMagFilter( int filter );
    public static native void SetDefaultMinFilter( int filter );
    public static native void SetDefaultWrapU( int mode );
    public static native void SetDefaultWrapV( int mode );
    public static native void SetViewOffset( float x, float y );
    public static native void SetViewZoom( float zoom );
    public static native void SetViewZoomMode( int mode );
    public static native float GetViewOffsetX();
    public static native float GetViewOffsetY();
    public static native float GetViewZoom();
    public static native void SetScissor( float x, float y, float x2, float y2 );
    public static native void SetIntendedDeviceSize( int width, int height );
    public static native void UseNewDefaultFonts( int mode );

    // functions that fail call this function
    public static native void DebugInfo( String type, String data );
    public static native void PluginError( String szErr );
    public static native void SetErrorMode( int mode );
    public static native String GetLastError();
    public static native int GetErrorOccurred();




    public static native void Message( String msg );

    // image functions

    public static native int GetImageTextureID ( int iImageIndex );
    public static native void LoadImage ( int iImageIndex, String sImageFilename, int bBlackToAlpha );
    public static native int LoadImage ( String sImageFilename, int bBlackToAlpha );
    public static native void LoadImage ( int iImageIndex, String sImageFilename );
    public static native int LoadImage ( String sImageFilename );
    public static native void LoadSubImage ( int iImageIndex, int iParentIndex, String sImageFilename );
    public static native int LoadSubImage ( int iParentIndex, String sImageFilename );
    public static native void LoadImageResized( int iImageID, String szFilename, float scaleX, float scaleY, int cache );
    public static native int LoadImageResized( String szFilename, float scaleX, float scaleY, int cache );
    public static native void PreCacheImage( String szFilename, float scaleX, float scaleY );
    public static native int GetCachingFinished();
    public static native void CreateImageColor( int imageID, int red, int green, int blue, int alpha );
    public static native int CreateImageColor( int red, int green, int blue, int alpha );
    public static native void CreateRenderImage( int imageID, int width, int height, int format, int mipmap );
    public static native int CreateRenderImage( int width, int height, int format, int mipmap );
    public static native int GetImageExists ( int iImageIndex );
    public static native void DeleteImage ( int iImageIndex );
    public static native void DeleteAllImages();
    public static native float GetImageWidth ( int iImageIndex );
    public static native float GetImageHeight ( int iImageIndex );
    public static native void SetImageMinFilter( int iImageIndex, int mode );
    public static native void SetImageMagFilter( int iImageIndex, int mode );
    public static native void SetImageWrapU( int iImageIndex, int mode );
    public static native void SetImageWrapV( int iImageIndex, int mode );
    public static native void SetImageMask( int iDstImage, int iSrcImage, int dst, int src, int x, int y );
    public static native void SaveImage( int iImageIndex, String filename );
    public static native void CopyImage( int newImage, int fromImage, int x, int y, int width, int height );
    public static native int CopyImage( int fromImage, int x, int y, int width, int height );
    public static native int GetImage( float x, float y, float width, float height );
    public static native void GetImage( int imageID, float x, float y, float width, float height );
    public static native String GetImageFilename( int imageID );
    public static native void SetImageSavePixels( int mode );
    public static native void SetImageTransparentColor( int iImage, int r, int g, int b );
    public static native void ResizeImage( int image, int width, int height );

    public static native int ChooseImage();
    public static native int ShowChooseImageScreen();
    public static native void ChooseInternal(int value);
    public static native int GetChosenImage();
    public static native int IsChoosingImage();

    public static native int ShowImageCaptureScreen();
    public static native void CaptureImage();
    public static native void CaptureInternal(int value);
    public static native void CancelCapture();
    public static native int GetCapturedImage();
    public static native int IsCapturingImage();

    public static native int GetNumDeviceCameras();
    public static native int SetDeviceCameraToImage( int cameraID, int imageID );
    public static native void DeviceCameraUpdate();
    public static native void DeviceCameraResumed();
    public static native int GetDeviceCameraType( int cameraID );


    public static native String DecodeQRCode( int image );
    public static native int EncodeQRCode( String text, int errormode );

    public static native void PrintImage( int image, float size );

    // render functions
    public static native void SetRenderToImage( int colorImage, int depthImage );
    public static native void SetRenderToScreen();
    public static native int IsSupportedDepthTexture();

    // sprite functions

    public static native int GetSpriteImageID ( int iSpriteIndex );
    public static native int CreateSprite ( int iImageIndex );
    public static native int LoadSprite ( String imagefile );
    public static native void CreateSprite ( int iSpriteIndex, int iImageIndex );
    public static native void LoadSprite ( int iSpriteIndex, String imagefile );
    public static native void CreateDummySprite ( int iSpriteIndex );
    public static native int CreateDummySprite ( );
    public static native void CloneSprite( int iSpriteIndex, int iOtherSprite );
    public static native int CloneSprite( int iOtherSprite );
    public static native void DeleteSprite ( int iSpriteIndex );
    public static native void DeleteAllSprites();
    public static native void SetSpritePosition ( int iSpriteIndex, float fX, float fY );
    public static native void SetSpritePositionByOffset ( int iSpriteIndex, float fX, float fY );
    public static native void SetSpriteX ( int iSpriteIndex, float fX );
    public static native void SetSpriteY ( int iSpriteIndex, float fY );
    public static native void SetSpriteAngle ( int iSpriteIndex, float fAng );
    public static native void SetSpriteAngleRad ( int iSpriteIndex, float fAng );
    public static native void SetSpriteDepth ( int iSpriteIndex, int iDepth );
    public static native void SetSpriteFlip ( int iSpriteIndex, int horz, int vert );
    public static native void SetSpriteSnap ( int iSpriteIndex, int snap );
    public static native void SetSpriteVisible ( int iSpriteIndex, int bVisible );
    public static native void SetSpriteActive ( int iSpriteIndex, int bActive );
    public static native void SetSpriteImage ( int iSpriteIndex, int iImageIndex );
    public static native void SetSpriteImage ( int iSpriteIndex, int iImageIndex, int bUpdateShape );
    public static native void SetSpriteAdditionalImage ( int iSpriteIndex, int iImageIndex, int iStage );
    public static native void SetSpriteUV ( int iSpriteIndex, float u1, float v1, float u2, float v2, float u3, float v3, float u4, float v4 );
    public static native void ResetSpriteUV( int iSpriteIndex );

    public static native int GetSpriteExists ( int iSpriteIndex );
    public static native float GetSpriteX ( int iSpriteIndex );
    public static native float GetSpriteY ( int iSpriteIndex );
    public static native float GetSpriteXByOffset ( int iSpriteIndex );
    public static native float GetSpriteYByOffset ( int iSpriteIndex );
    public static native float GetSpriteOffsetX ( int iSpriteIndex );
    public static native float GetSpriteOffsetY ( int iSpriteIndex );
    public static native float GetSpriteWidth ( int iSpriteIndex );
    public static native float GetSpriteHeight ( int iSpriteIndex );
    public static native float GetSpriteAngle ( int iSpriteIndex );
    public static native float GetSpriteAngleRad ( int iSpriteIndex );
    public static native float GetSpriteScaleX ( int iSpriteIndex );
    public static native float GetSpriteScaleY ( int iSpriteIndex );
    public static native int GetSpriteHitTest ( int iSpriteIndex, float x, float y );
    public static native int GetSpriteDepth( int iSpriteIndex );
    public static native int GetSpriteColorRed( int iSpriteIndex );
    public static native int GetSpriteColorGreen( int iSpriteIndex );
    public static native int GetSpriteColorBlue( int iSpriteIndex );
    public static native int GetSpriteColorAlpha( int iSpriteIndex );
    public static native int GetSpritePlaying( int iSpriteIndex );
    public static native int GetSpriteVisible( int iSpriteIndex );
    public static native int GetSpriteActive( int iSpriteIndex );
    public static native int GetSpriteGroup( int iSpriteIndex );
    public static native int GetSpriteTransparency( int iSpriteIndex );

    public static native float GetSpriteXFromPixel( int iSpriteIndex, int x );
    public static native float GetSpriteYFromPixel( int iSpriteIndex, int y );
    public static native int GetSpritePixelFromX( int iSpriteIndex, float x );
    public static native int GetSpritePixelFromY( int iSpriteIndex, float y );

    public static native float GetWorldXFromSprite( int iSpriteIndex, float x, float y );
    public static native float GetWorldYFromSprite( int iSpriteIndex, float x, float y );
    public static native float GetSpriteXFromWorld( int iSpriteIndex, float x, float y );
    public static native float GetSpriteYFromWorld( int iSpriteIndex, float x, float y );

    public static native void SetSpriteSize( int iSpriteIndex, float width, float height );
    public static native void SetSpriteSize( int iSpriteIndex, float width);
    public static native void SetSpriteAnimation( int iSpriteIndex, int iFrameWidth, int iFrameHeight, int iFrameCount );
    public static native void AddSpriteAnimationFrame( int iSpriteIndex, int iImageIndex );
    public static native void ClearSpriteAnimationFrames( int iSpriteIndex );
    public static native void SetSpriteSpeed( int iSpriteIndex, float fFps );
    public static native void PlaySprite( int iSpriteIndex );
    public static native void PlaySprite( int iSpriteIndex, float fFps );
    public static native void PlaySprite( int iSpriteIndex, float fFps, int iLoop );
    public static native void PlaySprite( int iSpriteIndex, float fFps, int iLoop, int iFromFrame, int iToFrame );
    public static native void StopSprite( int iSpriteIndex );
    public static native void ResumeSprite( int iSpriteIndex );
    public static native void SetSpriteFrame( int iSpriteIndex, int iFrame );
    public static native int GetSpriteCurrentFrame( int iSpriteIndex );
    public static native int GetSpriteFrameCount( int iSpriteIndex );
    public static native void SetSpriteTransparency( int iSpriteIndex, int mode );
    public static native void SetSpriteOffset( int iSpriteIndex, float x, float y );
    public static native void SetSpriteColor( int iSpriteIndex, int iRed, int iGreen, int iBlue, int iAlpha );
    public static native void SetSpriteColorRed( int iSpriteIndex, int iRed );
    public static native void SetSpriteColorGreen( int iSpriteIndex, int iGreen );
    public static native void SetSpriteColorBlue( int iSpriteIndex, int iBlue );
    public static native void SetSpriteColorAlpha( int iSpriteIndex, int iAlpha );
    public static native void SetSpriteUVBorder( int iSpriteIndex, float border );
    public static native void SetSpriteUVOffset( int iSpriteIndex, float u, float v );
    public static native void SetSpriteUVScale( int iSpriteIndex, float scaleU, float scaleV );
    public static native void FixSpriteToScreen( int iSpriteIndex, int mode );

    public static native void SetSpriteScale( int iSpriteIndex, float x, float y );
    public static native void SetSpriteScaleByOffset( int iSpriteIndex, float x, float y );
    public static native void SetSpriteScissor( int iSpriteIndex, float x, float y, float x2, float y2 );
    public static native void SetSpriteShader( int spriteID, int shaderID );

    public static native void SetSpriteGroup( int iSpriteIndex, int group );
    public static native void SetSpriteCategoryBits( int iSpriteIndex, int categories );
    public static native void SetSpriteCategoryBit( int iSpriteIndex, int category, int flag );
    public static native void SetSpriteCollideBits( int iSpriteIndex, int mask );
    public static native void SetSpriteCollideBit( int iSpriteIndex, int category, int flag );

    public static native void SetSpriteGroup( int iSpriteIndex, int group, int shapeID );
    public static native void SetSpriteCategoryBits( int iSpriteIndex, int categories, int shapeID );
    public static native void SetSpriteCategoryBit( int iSpriteIndex, int category, int flag, int shapeID );
    public static native void SetSpriteCollideBits( int iSpriteIndex, int mask, int shapeID );
    public static native void SetSpriteCollideBit( int iSpriteIndex, int category, int flag, int shapeID );

    public static native void DrawSprite( int iSpriteIndex );

    // physics commands
    public static native void SetPhysicsScale( float scale );
    public static native void SetPhysicsGravity( float x, float y );
    public static native void SetPhysicsDebugOn();
    public static native void SetPhysicsDebugOff();
    public static native void SetPhysicsThreading( int threads );
    public static native void SetPhysicsCCD( int mode );
    public static native void SetPhysicsSleeping( int mode );
    public static native void SetPhysicsMaxPolygonPoints( int points );


    //physics benchmarking
    public static native float GetPhysicsSolveTime();
    public static native int GetPhysicsIslandCount();

    public static native void SetPhysicsWallTop( int mode );
    public static native void SetPhysicsWallLeft( int mode );
    public static native void SetPhysicsWallRight( int mode );
    public static native void SetPhysicsWallBottom( int mode );

    // global forces
    public static native int CreatePhysicsForce( float x, float y, float power, float limit, float range, int fade );
    public static native void DeletePhysicsForce( int iForceIndex );
    public static native void SetPhysicsForcePosition( int iForceIndex, float x, float y );
    public static native void SetPhysicsForcePower( int iForceIndex, float power );
    public static native void SetPhysicsForceRange( int iForceIndex, float range );

    // sprites
    public static native void SetSpriteShape( int iSpriteIndex, int shape );
    public static native void SetSpriteShapeBox( int iSpriteIndex, float x, float y, float x2, float y2, float angle );
    public static native void SetSpriteShapeCircle( int iSpriteIndex, float x, float y, float radius );
    public static native void SetSpriteShapePolygon( int iSpriteIndex, int numPoints, int index, float x, float y );

    public static native void SetSpriteShape( int iSpriteIndex, int shape, int shapeID );
    public static native void SetSpriteShapeBox( int iSpriteIndex, float x, float y, float x2, float y2, float angle, int shapeID );
    public static native void SetSpriteShapeCircle( int iSpriteIndex, float x, float y, float radius, int shapeID );
    public static native void SetSpriteShapePolygon( int iSpriteIndex, int numPoints, int index, float x, float y, int shapeID );
    public static native void SetSpriteShapeChain( int iSpriteIndex, int numPoints, int index, int loop, float x, float y, int shapeID );

    public static native void AddSpriteShapeBox( int iSpriteIndex, float x, float y, float x2, float y2);
    public static native void AddSpriteShapeBox( int iSpriteIndex, float x, float y, float x2, float y2, float angle );
    public static native void AddSpriteShapeCircle( int iSpriteIndex, float x, float y, float radius );
    public static native void AddSpriteShapePolygon( int iSpriteIndex, int numPoints, int index, float x, float y );
    public static native void AddSpriteShapeChain( int iSpriteIndex, int numPoints, int index, int loop, float x, float y );

    public static native void ClearSpriteShapes( int iSpriteIndex );
    public static native int GetSpriteNumShapes( int iSpriteIndex );

    public static native int GetSpriteShapeNumVertices( int iSpriteIndex, int shapeID );
    public static native float GetSpriteShapeVertexX( int iSpriteIndex, int shapeID, int vertex );
    public static native float GetSpriteShapeVertexY( int iSpriteIndex, int shapeID, int vertex );

    public static native void SetSpritePhysicsCOM( int iSpriteIndex, float x, float y );
    public static native void CalculateSpritePhysicsCOM( int iSpriteIndex );
    public static native float GetSpritePhysicsCOMX( int iSpriteIndex );
    public static native float GetSpritePhysicsCOMY( int iSpriteIndex );


    public static native void SetSpritePhysicsOn( int iSpriteIndex );
    public static native void SetSpritePhysicsOn( int iSpriteIndex, int mode );
    public static native void SetSpritePhysicsOff( int iSpriteIndex );
    public static native void SetSpritePhysicsDelete( int iSpriteIndex );
    public static native void SetSpritePhysicsFriction( int iSpriteIndex, float friction );
    public static native void SetSpritePhysicsRestitution( int iSpriteIndex, float restitution );
    public static native void SetSpritePhysicsFriction( int iSpriteIndex, float friction, int shapeID );
    public static native void SetSpritePhysicsRestitution( int iSpriteIndex, float restitution, int shapeID );
    public static native void SetSpritePhysicsDensity( int iSpriteIndex, float density, int shapeID );
    public static native void SetSpritePhysicsCanRotate( int iSpriteIndex, int rotate );
    public static native void SetSpritePhysicsVelocity( int iSpriteIndex, float vx, float vy );
    public static native void SetSpritePhysicsAngularVelocity( int iSpriteIndex, float va );
    public static native void SetSpritePhysicsDamping( int iSpriteIndex, float damp );
    public static native void SetSpritePhysicsAngularDamping( int iSpriteIndex, float damp );
    public static native void SetSpritePhysicsIsBullet( int iSpriteIndex, int bullet );
    public static native void SetSpritePhysicsMass( int iSpriteIndex, float mass );
    public static native void SetSpritePhysicsIsSensor( int iSpriteIndex, int sensor );
    public static native void SetSpritePhysicsIsSensor( int iSpriteIndex, int sensor, int shapeID );

    public static native void SetSpritePhysicsForce( int iSpriteIndex, float x, float y, float vx, float vy );
    public static native void SetSpritePhysicsTorque( int iSpriteIndex, float torque );
    public static native void SetSpritePhysicsImpulse( int iSpriteIndex, float x, float y, float vx, float vy );
    public static native void SetSpritePhysicsAngularImpulse( int iSpriteIndex, float impulse );

    public static native float GetSpritePhysicsVelocityX( int iSpriteIndex );
    public static native float GetSpritePhysicsVelocityY( int iSpriteIndex );
    public static native float GetSpritePhysicsAngularVelocity( int iSpriteIndex );
    public static native float GetSpritePhysicsMass( int iSpriteIndex );

    // joints
    public static native void DeleteJoint( int iJointIndex );
    public static native int GetJointExists( int iJointIndex );









    public static native void CreateDistanceJoint( int iJointIndex, int iSpriteIndex1, int iSpriteIndex2, float x, float y, float x2, float y2, int colConnected );
    public static native void CreateRevoluteJoint( int iJointIndex, int iSpriteIndex1, int iSpriteIndex2, float x, float y, int colConnected );
    public static native void CreatePrismaticJoint( int iJointIndex, int iSpriteIndex1, int iSpriteIndex2, float x, float y, float vx, float vy, int colConnected );
    public static native void CreatePulleyJoint( int iJointIndex, int iSpriteIndex1, int iSpriteIndex2, float gnd1x, float gnd1y, float gnd2x, float gnd2y, float a1x, float a1y, float a2x, float a2y, float ratio, int colConnected );
    public static native void CreateMouseJoint( int iJointIndex, int iSpriteIndex1, float x, float y, float maxForce );
    public static native void CreateLineJoint( int iJointIndex, int iSpriteIndex1, int iSpriteIndex2, float x, float y, float vx, float vy, int colConnected );
    public static native void CreateWeldJoint( int iJointIndex, int iSpriteIndex1, int iSpriteIndex2, float x, float y, int colConnected );
    public static native void CreateRopeJoint( int iJointIndex, int iSpriteIndex1, int iSpriteIndex2, float x, float y, float x2, float y2, float maxLength, int colConnected );

    // special joint that joins two joints
    public static native void CreateGearJoint( int iJointIndex, int iJoint1, int iJoint2, float ratio );

    // returns joint ID









    public static native int CreateDistanceJoint( int iSpriteIndex1, int iSpriteIndex2, float x, float y, float x2, float y2, int colConnected );
    public static native int CreateRevoluteJoint( int iSpriteIndex1, int iSpriteIndex2, float x, float y, int colConnected );
    public static native int CreatePrismaticJoint( int iSpriteIndex1, int iSpriteIndex2, float x, float y, float vx, float vy, int colConnected );
    public static native int CreatePulleyJoint( int iSpriteIndex1, int iSpriteIndex2, float gnd1x, float gnd1y, float gnd2x, float gnd2y, float a1x, float a1y, float a2x, float a2y, float ratio, int colConnected );
    public static native int CreateMouseJoint( int iSpriteIndex1, float x, float y, float maxForce );
    public static native int CreateLineJoint( int iSpriteIndex1, int iSpriteIndex2, float x, float y, float vx, float vy, int colConnected );
    public static native int CreateWeldJoint( int iSpriteIndex1, int iSpriteIndex2, float x, float y, int colConnected );
    public static native int CreateRopeJoint( int iSpriteIndex1, int iSpriteIndex2, float x, float y, float x2, float y2, float maxLength, int colConnected );

    public static native void CreatePulleyJoint2( int iSpriteIndex1, int iSpriteIndex2, float ratio, int colConnected );
    public static native int FinishPulleyJoint( float gnd1x, float gnd1y, float gnd2x, float gnd2y, float a1x, float a1y, float a2x, float a2y );

    // special joint that joins two joints
    public static native int CreateGearJoint( int iJoint1, int iJoint2, float ratio );

    public static native void SetJointLimitOn( int iJointIndex, float lowerLimit, float upperLimit );
    public static native void SetJointLimitOff( int iJointIndex );
    public static native void SetJointMotorOn( int iJointIndex, float speed, float maxForce );
    public static native void SetJointMotorOff( int iJointIndex );
    public static native void SetJointMouseTarget( int iJointIndex, float x, float y );
    public static native void SetJointMouseMaxForce( int iJointIndex, float maxForce );

    public static native float GetJointReactionForceX( int iJointIndex );
    public static native float GetJointReactionForceY( int iJointIndex );
    public static native float GetJointReactionTorque( int iJointIndex );

    public static native void SetJointDamping( int iJointIndex, float dampingRatio, float frequency );

    // ray casts
    public static native int PhysicsRayCast( float x, float y, float x2, float y2 );
    public static native int PhysicsRayCastGroup( int group, float x, float y, float x2, float y2 );
    public static native int PhysicsRayCastCategory( int category, float x, float y, float x2, float y2 );

    public static native int SpriteRayCast( float x, float y, float x2, float y2 );
    public static native int SpriteRayCastGroup( int group, float x, float y, float x2, float y2 );
    public static native int SpriteRayCastCategory( int category, float x, float y, float x2, float y2 );

    public static native int SpriteRayCastSingle( int sprite, float x, float y, float x2, float y2 );


    // ray cast return
    public static native int GetRayCastSpriteID( );

    public static native float GetRayCastX();
    public static native float GetRayCastY();
    public static native float GetRayCastNormalX();
    public static native float GetRayCastNormalY();
    public static native float GetRayCastFraction();

    // non physics collision functions
    public static native int GetSpriteInBox( int iSprite1, float x1, float y1, float x2, float y2 );
    public static native int GetSpriteInCircle( int iSprite1, float x1, float y1, float radius );
    public static native int GetSpriteCollision( int iSprite1, int iSprite2 );

    public static native int GetSpriteHit( float x, float y );
    public static native int GetSpriteHitGroup( int group, float x, float y );
    public static native int GetSpriteHitCategory( int category, float x, float y );

    // non physics distance functions
    public static native float GetSpriteDistance( int iSprite1, int iSprite2 );
    public static native float GetSpriteDistancePoint1X( );
    public static native float GetSpriteDistancePoint1Y( );
    public static native float GetSpriteDistancePoint2X( );
    public static native float GetSpriteDistancePoint2Y( );

    // physics collision functions
    public static native int GetFirstContact();
    public static native int GetNextContact();
    public static native float GetContactWorldX();
    public static native float GetContactWorldY();
    public static native int GetContactSpriteID1();
    public static native int GetContactSpriteID2();



    // body contacts
    public static native int GetSpriteFirstContact( int iSprite1 );
    public static native int GetSpriteNextContact( );
    public static native float GetSpriteContactWorldX( );
    public static native float GetSpriteContactWorldY( );
    public static native int GetSpriteContactSpriteID2( );


    public static native int GetPhysicsCollision( int iSprite1, int iSprite2 );
    public static native float GetPhysicsCollisionX( );
    public static native float GetPhysicsCollisionY( );
    public static native float GetPhysicsCollisionWorldX( );
    public static native float GetPhysicsCollisionWorldY( );


    // particle commands
    public static native void CreateParticles( int ID, float x, float y );
    public static native int CreateParticles( float x, float y );
    public static native int GetParticlesExists( int ID );
    public static native void DeleteParticles( int ID );
    public static native void SetParticlesPosition( int ID, float x, float y );
    public static native void SetParticlesDepth( int ID, int depth );
    public static native void SetParticlesFrequency( int ID, float freq );
    public static native void SetParticlesStartZone( int ID, float x1, float y1, float x2, float y2 );
    public static native void SetParticlesDirection( int ID, float vx, float vy );
    public static native void SetParticlesVelocityRange( int ID, float v1, float v2 );
    public static native void SetParticlesAngle( int ID, float angle );
    public static native void SetParticlesAngleRad( int ID, float angle );
    public static native void SetParticlesRotationRange( int ID, float angle1, float angle2 );
    public static native void SetParticlesRotationRangeRad( int ID, float angle1, float angle2 );
    public static native void SetParticlesFaceDirection( int ID, int mode );
    public static native void SetParticlesSize( int ID, float size );
    public static native void SetParticlesLife( int ID, float time );
    public static native void SetParticlesMax( int ID, int max );
    public static native void ResetParticleCount( int ID );
    public static native void SetParticlesImage( int ID, int imageID );
    public static native void SetParticlesColorInterpolation( int ID, int mode );
    public static native void SetParticlesVisible( int ID, int visible );
    public static native void SetParticlesActive( int ID, int active );
    public static native void SetParticlesTransparency( int ID, int mode );

    public static native float GetParticlesX( int ID );
    public static native float GetParticlesY( int ID );
    public static native int GetParticlesDepth( int ID );
    public static native int GetParticlesVisible( int ID );
    public static native int GetParticlesActive( int ID );
    public static native float GetParticlesFrequency( int ID );
    public static native float GetParticlesDirectionX( int ID );
    public static native float GetParticlesDirectionY( int ID );
    public static native float GetParticlesAngle( int ID );
    public static native float GetParticlesAngleRad( int ID );
    public static native float GetParticlesSize( int ID );
    public static native float GetParticlesLife( int ID );
    public static native int GetParticlesMaxReached( int ID );

    public static native void AddParticlesForce( int ID, float starttime, float endtime, float x, float y );
    public static native void ClearParticlesForces( int ID );
    public static native void AddParticlesColorKeyFrame( int ID, float time, int red, int green, int blue, int alpha );
    public static native void ClearParticlesColors( int ID );
    public static native void AddParticlesScaleKeyFrame( int ID, float time, float scale );
    public static native void ClearParticlesScales( int ID );
    public static native void FixParticlesToScreen( int ID, int mode );

    public static native void UpdateParticles( int ID, float time );
    public static native void OffsetParticles( int ID, float x, float y );

    // text commands
    public static native void SetTextDefaultFontImage( int iImageID );
    public static native void SetTextDefaultExtendedFontImage( int iImageID );
    public static native void SetTextDefaultMinFilter( int mode );
    public static native void SetTextDefaultMagFilter( int mode );

    public static native void CreateText( int iTextIndex, String string );
    public static native int CreateText( String string );
    public static native void DeleteText( int iTextIndex );
    public static native void DeleteAllText();
    public static native void SetTextString( int iTextIndex, String string );
    public static native void SetTextPosition( int iTextIndex, float fX, float fY );
    public static native void SetTextX( int iTextIndex, float fX );
    public static native void SetTextY( int iTextIndex, float fY );
    public static native void SetTextAngle( int iTextIndex, float fAngle );
    public static native void SetTextAngleRad( int iTextIndex, float fAngleRad );
    public static native void SetTextSize( int iTextIndex, float fSize );
    public static native void SetTextSpacing( int iTextIndex, float fSpacing );
    public static native void SetTextLineSpacing( int iTextIndex, float fSpacing );
    public static native void SetTextDepth( int iTextIndex, int iDepth );
    public static native void SetTextVisible( int iTextIndex, int bVisible );
    public static native void SetTextAlignment( int iTextIndex, int mode );
    public static native void SetTextColor( int iTextIndex, int iRed, int iGreen, int iBlue );
    public static native void SetTextColor( int iTextIndex, int iRed, int iGreen, int iBlue, int iAlpha );
    public static native void SetTextColorRed( int iTextIndex, int iRed );
    public static native void SetTextColorGreen( int iTextIndex, int iGreen );
    public static native void SetTextColorBlue( int iTextIndex, int iBlue );
    public static native void SetTextColorAlpha( int iTextIndex, int iAlpha );
    public static native void SetTextFontImage( int iTextIndex, int iImageID );
    public static native void SetTextExtendedFontImage( int iTextIndex, int iImageID );
    public static native void SetTextFont( int iTextIndex, int iFontID );
    public static native void FixTextToScreen( int iTextIndex, int mode );
    public static native void SetTextMaxWidth( int iTextIndex, float width );
    public static native void SetTextScissor( int iTextIndex, float x, float y, float x2, float y2 );
    public static native void SetTextTransparency( int iTextIndex, int mode );
    public static native void SetTextBold( int iTextIndex, int bold );

    public static native int GetTextColorRed( int iTextIndex );
    public static native int GetTextColorGreen( int iTextIndex );
    public static native int GetTextColorBlue( int iTextIndex );
    public static native int GetTextColorAlpha( int iTextIndex );
    public static native int GetTextExists( int iTextIndex );
    public static native float GetTextX( int iTextIndex );
    public static native float GetTextY( int iTextIndex );
    public static native int GetTextLength( int iTextIndex );
    public static native float GetTextTotalWidth( int iTextIndex );
    public static native float GetTextTotalHeight( int iTextIndex );
    public static native int GetTextHitTest( int iTextIndex, float x, float y );
    public static native int GetTextVisible( int iTextIndex );
    public static native int GetTextDepth( int iTextIndex );
    public static native float GetTextSize( int iTextIndex );
    public static native String GetTextString( int iTextIndex );
    public static native float GetTextSpacing( int iTextIndex );
    public static native float GetTextLineSpacing( int iTextIndex );
    public static native int GetTextAlignment( int iTextIndex );

    public static native void SetTextCharPosition( int iTextIndex, int iCharIndex, float x, float y );
    public static native void SetTextCharX( int iTextIndex, int iCharIndex, float x );
    public static native void SetTextCharY( int iTextIndex, int iCharIndex, float y );
    public static native void SetTextCharAngle( int iTextIndex, int iCharIndex, float angle );
    public static native void SetTextCharAngleRad( int iTextIndex, int iCharIndex, float angle );
    public static native void SetTextCharColor( int iTextIndex, int iCharIndex, int red, int green, int blue, int alpha );
    public static native void SetTextCharColorRed( int iTextIndex, int iCharIndex, int red );
    public static native void SetTextCharColorGreen( int iTextIndex, int iCharIndex, int green );
    public static native void SetTextCharColorBlue( int iTextIndex, int iCharIndex, int blue );
    public static native void SetTextCharColorAlpha( int iTextIndex, int iCharIndex, int alpha );
    public static native void SetTextCharBold( int iTextIndex, int iCharIndex, int bold );

    public static native float GetTextCharX( int iTextIndex, int iCharIndex );
    public static native float GetTextCharY( int iTextIndex, int iCharIndex );
    public static native float GetTextCharAngle( int iTextIndex, int iCharIndex );
    public static native float GetTextCharAngleRad( int iTextIndex, int iCharIndex );
    public static native int GetTextCharColorRed( int iTextIndex, int iCharIndex );
    public static native int GetTextCharColorGreen( int iTextIndex, int iCharIndex );
    public static native int GetTextCharColorBlue( int iTextIndex, int iCharIndex );
    public static native int GetTextCharColorAlpha( int iTextIndex, int iCharIndex );

    public static native void DrawText( int iTextIndex );

    // Font commands
    public static native int LoadFont( String szFontFile );
    public static native void LoadFont( int iFontID, String szFontFile );
    public static native int GetFontExists( int iFontID );
    public static native int GetSystemFontExists( String szFontFile );
    public static native void DeleteFont( int iFontID );

    // 2D Skeleton commands
    public static native void CreateSkeleton2D( int iSkeleton );
    public static native int CreateSkeleton2D();
    public static native int GetSkeleton2DExists( int iSkeleton );
    public static native void DeleteSkeleton2D( int iSkeleton );
    public static native void LoadSkeleton2DFromSpineFile( int iSkeleton, String filename, float scale, int atlasImage, int loadAnim );
    public static native int LoadSkeleton2DFromSpineFile( String filename, float scale, int atlasImage, int loadAnim );
    public static native void LoadSkeleton2DFromSpriterFile( int iSkeleton, String filename, float scale, int atlasImage );
    public static native int LoadSkeleton2DFromSpriterFile( String filename, float scale, int atlasImage );
    public static native void SetSkeleton2DPosition( int iSkeleton, float x, float y );
    public static native void SetSkeleton2DRotation( int iSkeleton, float r );
    public static native void SetSkeleton2DFlip( int iSkeleton, int flipH, int flipV );
    public static native void SetSkeleton2DDepth( int iSkeleton, int depth );
    public static native void FixSkeleton2DToScreen( int iSkeleton, int mode );
    public static native void SetSkeleton2DVisible( int iSkeleton, int mode );

    public static native float GetSkeleton2DX( int skeleton );
    public static native float GetSkeleton2DY( int skeleton );
    public static native float GetSkeleton2DAngle( int skeleton );

    //public static native int AddSkeleton2DBone( int iSkeleton, int parent, String name );
    public static native int GetSkeleton2DBone( int iSkeleton, String name );
    public static native int GetSkeleton2DBoneParent( int iSkeleton, int bone );
    public static native float GetSkeleton2DBoneX( int iSkeleton, int bone );
    public static native float GetSkeleton2DBoneY( int iSkeleton, int bone );
    public static native float GetSkeleton2DBoneAngle( int iSkeleton, int bone );
    public static native float GetSkeleton2DBoneCurrX( int iSkeleton, int bone );
    public static native float GetSkeleton2DBoneCurrY( int iSkeleton, int bone );
    public static native float GetSkeleton2DBoneCurrAngle( int iSkeleton, int bone );
    public static native void SetSkeleton2DBonePosition( int iSkeleton, int bone, float x, float y );
    public static native void SetSkeleton2DBoneAngle( int iSkeleton, int bone, float r );
    public static native void SetSkeleton2DBoneScale( int iSkeleton, int bone, float sx, float sy );
    public static native void SetSkeleton2DBoneMode( int iSkeleton, int bone, int mode );

    public static native void FixSpriteToSkeleton2D( int spriteID, int iSkeletonID, int bone, int zorder );

    public static native void PlaySkeleton2DAnimation( int iSkeleton, String anim, float starttime, int loop, float tweentime );
    public static native void SetSkeleton2DAnimationFrame( int iSkeleton, String anim, float time, float tweentime );
    public static native void SetSkeleton2DAnimationSpeed( int iSkeleton, float speed );
    public static native float GetSkeleton2DCurrentTime( int iSkeleton );
    public static native void StopSkeleton2DAnimation( int iSkeleton );
    public static native int GetSkeleton2DIsAnimating( int iSkeleton );
    public static native int GetSkeleton2DIsTweening( int iSkeleton );
    public static native float GetSkeleton2DAnimationTime( int iSkeleton, String anim );

    // tween commands

    public static native void DeleteTween( int tweenID );
    public static native int GetTweenExists( int tweenID );
    public static native void SetTweenDuration( int tweenID, float duration );
    public static native int TweenLinear();
    public static native int TweenSmooth1();
    public static native int TweenSmooth2();
    public static native int TweenEaseIn1();
    public static native int TweenEaseIn2();
    public static native int TweenEaseOut1();
    public static native int TweenEaseOut2();
    public static native int TweenBounce();
    public static native int TweenOvershoot();

    // custom tweens
    public static native void CreateTweenCustom( int tweenID, float duration );
    public static native int CreateTweenCustom( float duration );
    public static native int GetTweenCustomExists( int tweenID );
    public static native void SetTweenCustomFloat1( int tweenID, float begin, float end, int interpolation );
    public static native void SetTweenCustomFloat2( int tweenID, float begin, float end, int interpolation );
    public static native void SetTweenCustomFloat3( int tweenID, float begin, float end, int interpolation );
    public static native void SetTweenCustomFloat4( int tweenID, float begin, float end, int interpolation );
    public static native void SetTweenCustomInteger1( int tweenID, int begin, int end, int interpolation );
    public static native void SetTweenCustomInteger2( int tweenID, int begin, int end, int interpolation );
    public static native void SetTweenCustomInteger3( int tweenID, int begin, int end, int interpolation );
    public static native void SetTweenCustomInteger4( int tweenID, int begin, int end, int interpolation );
    public static native float GetTweenCustomFloat1( int tweenID );
    public static native float GetTweenCustomFloat2( int tweenID );
    public static native float GetTweenCustomFloat3( int tweenID );
    public static native float GetTweenCustomFloat4( int tweenID );
    public static native int GetTweenCustomInteger1( int tweenID );
    public static native int GetTweenCustomInteger2( int tweenID );
    public static native int GetTweenCustomInteger3( int tweenID );
    public static native int GetTweenCustomInteger4( int tweenID );

    public static native void PlayTweenCustom( int tweenID, float delay );
    public static native void PauseTweenCustom( int tweenID );
    public static native void ResumeTweenCustom( int tweenID );
    public static native void UpdateTweenCustom( int tweenID, float time );
    public static native void StopTweenCustom( int tweenID );
    public static native int GetTweenCustomPlaying( int tweenID );

    // sprite tweening
    public static native void CreateTweenSprite( int tweenID, float duration );
    public static native int CreateTweenSprite( float duration );
    public static native int GetTweenSpriteExists( int tweenID );
    public static native void SetTweenSpriteX( int tweenID, float beginX, float endX, int interpolation );
    public static native void SetTweenSpriteY( int tweenID, float beginY, float endY, int interpolation );
    public static native void SetTweenSpriteXByOffset( int tweenID, float beginX, float endX, int interpolation );
    public static native void SetTweenSpriteYByOffset( int tweenID, float beginY, float endY, int interpolation );
    public static native void SetTweenSpriteAngle( int tweenID, float beginA, float endA, int interpolation );
    public static native void SetTweenSpriteSizeX( int tweenID, float beginSX, float endSX, int interpolation );
    public static native void SetTweenSpriteSizeY( int tweenID, float beginSY, float endSY, int interpolation );
    public static native void SetTweenSpriteRed( int tweenID, int beginR, int endR, int interpolation );
    public static native void SetTweenSpriteGreen( int tweenID, int beginG, int endG, int interpolation );
    public static native void SetTweenSpriteBlue( int tweenID, int beginB, int endB, int interpolation );
    public static native void SetTweenSpriteAlpha( int tweenID, int beginA, int endA, int interpolation );

    public static native void PlayTweenSprite( int tweenID, int spriteID, float delay );
    public static native void PauseTweenSprite( int tweenID, int spriteID );
    public static native void ResumeTweenSprite( int tweenID, int spriteID );
    public static native void UpdateTweenSprite( int tweenID, int spriteID, float time );
    public static native void StopTweenSprite( int tweenID, int spriteID );
    public static native int GetTweenSpritePlaying( int tweenID, int spriteID );

    // text tweening
    public static native void CreateTweenText( int tweenID, float duration );
    public static native int CreateTweenText( float duration );
    public static native int GetTweenTextExists( int tweenID );
    public static native void SetTweenTextX( int tweenID, float beginX, float endX, int interpolation );
    public static native void SetTweenTextY( int tweenID, float beginY, float endY, int interpolation );
    public static native void SetTweenTextAngle( int tweenID, float beginA, float endA, int interpolation );
    public static native void SetTweenTextSize( int tweenID, float beginS, float endS, int interpolation );
    public static native void SetTweenTextSpacing( int tweenID, float beginSP, float endSP, int interpolation );
    public static native void SetTweenTextLineSpacing( int tweenID, float beginLSP, float endLSP, int interpolation );
    public static native void SetTweenTextRed( int tweenID, int beginR, int endR, int interpolation );
    public static native void SetTweenTextGreen( int tweenID, int beginG, int endG, int interpolation );
    public static native void SetTweenTextBlue( int tweenID, int beginB, int endB, int interpolation );
    public static native void SetTweenTextAlpha( int tweenID, int beginA, int endA, int interpolation );

    public static native void PlayTweenText( int tweenID, int textID, float delay );
    public static native void PauseTweenText( int tweenID, int textID );
    public static native void ResumeTweenText( int tweenID, int textID );
    public static native void UpdateTweenText( int tweenID, int textID, float time );
    public static native void StopTweenText( int tweenID, int textID );
    public static native int GetTweenTextPlaying( int tweenID, int textID );

    // text char tweening
    public static native void CreateTweenChar( int tweenID, float duration );
    public static native int CreateTweenChar( float duration );
    public static native int GetTweenCharExists( int tweenID );
    public static native void SetTweenCharX( int tweenID, float beginX, float endX, int interpolation );
    public static native void SetTweenCharY( int tweenID, float beginY, float endY, int interpolation );
    public static native void SetTweenCharAngle( int tweenID, float beginA, float endA, int interpolation );
    public static native void SetTweenCharRed( int tweenID, int beginR, int endR, int interpolation );
    public static native void SetTweenCharGreen( int tweenID, int beginG, int endG, int interpolation );
    public static native void SetTweenCharBlue( int tweenID, int beginB, int endB, int interpolation );
    public static native void SetTweenCharAlpha( int tweenID, int beginA, int endA, int interpolation );

    public static native void PlayTweenChar( int tweenID, int textID, int charID, float delay );
    public static native void PauseTweenChar( int tweenID, int textID, int charID );
    public static native void ResumeTweenChar( int tweenID, int textID, int charID );
    public static native void UpdateTweenChar( int tweenID, int textID, int charID, float time );
    public static native void StopTweenChar( int tweenID, int textID, int charID );
    public static native int GetTweenCharPlaying( int tweenID, int textID, int charID );

    // object tweening
    public static native void CreateTweenObject( int tweenID, float duration );
    public static native int CreateTweenObject( float duration );
    public static native int GetTweenObjectExists( int tweenID );
    public static native void SetTweenObjectX( int tweenID, float beginX, float endX, int interpolation );
    public static native void SetTweenObjectY( int tweenID, float beginY, float endY, int interpolation );
    public static native void SetTweenObjectZ( int tweenID, float beginZ, float endZ, int interpolation );
    public static native void SetTweenObjectAngleX( int tweenID, float beginAX, float endAX, int interpolation );
    public static native void SetTweenObjectAngleY( int tweenID, float beginAY, float endAY, int interpolation );
    public static native void SetTweenObjectAngleZ( int tweenID, float beginAZ, float endAZ, int interpolation );
    public static native void SetTweenObjectScaleX( int tweenID, float beginSX, float endSX, int interpolation );
    public static native void SetTweenObjectScaleY( int tweenID, float beginSY, float endSY, int interpolation );
    public static native void SetTweenObjectScaleZ( int tweenID, float beginSZ, float endSZ, int interpolation );
    public static native void SetTweenObjectRed( int tweenID, int beginR, int endR, int interpolation );
    public static native void SetTweenObjectGreen( int tweenID, int beginG, int endG, int interpolation );
    public static native void SetTweenObjectBlue( int tweenID, int beginB, int endB, int interpolation );
    public static native void SetTweenObjectAlpha( int tweenID, int beginA, int endA, int interpolation );

    public static native void PlayTweenObject( int tweenID, int objectID, float delay );
    public static native void PauseTweenObject( int tweenID, int objectID );
    public static native void ResumeTweenObject( int tweenID, int objectID );
    public static native void UpdateTweenObject( int tweenID, int objectID, float time );
    public static native void StopTweenObject( int tweenID, int objectID );
    public static native int GetTweenObjectPlaying( int tweenID, int objectID );

    // camera tweening
    public static native void CreateTweenCamera( int tweenID, float duration );
    public static native int CreateTweenCamera( float duration );
    public static native int GetTweenCameraExists( int tweenID );
    public static native void SetTweenCameraX( int tweenID, float beginX, float endX, int interpolation );
    public static native void SetTweenCameraY( int tweenID, float beginY, float endY, int interpolation );
    public static native void SetTweenCameraZ( int tweenID, float beginZ, float endZ, int interpolation );
    public static native void SetTweenCameraAngleX( int tweenID, float beginAX, float endAX, int interpolation );
    public static native void SetTweenCameraAngleY( int tweenID, float beginAY, float endAY, int interpolation );
    public static native void SetTweenCameraAngleZ( int tweenID, float beginAZ, float endAZ, int interpolation );
    public static native void SetTweenCameraFOV( int tweenID, float beginF, float endF, int interpolation );

    public static native void PlayTweenCamera( int tweenID, int cameraID, float delay );
    public static native void PauseTweenCamera( int tweenID, int cameraID );
    public static native void ResumeTweenCamera( int tweenID, int cameraID );
    public static native void UpdateTweenCamera( int tweenID, int cameraID, float time );
    public static native void StopTweenCamera( int tweenID, int cameraID );
    public static native int GetTweenCameraPlaying( int tweenID, int cameraID );

    // tween chaining
    public static native void CreateTweenChain( int chainID );
    public static native int CreateTweenChain();
    public static native void DeleteTweenChain( int chainID );
    public static native void ClearTweenChain( int chainID );
    public static native void AddTweenChainCustom( int chainID, int tweenID, float delay );
    public static native void AddTweenChainSprite( int chainID, int tweenID, int spriteID, float delay );
    public static native void AddTweenChainText( int chainID, int tweenID, int textID, float delay );
    public static native void AddTweenChainChar( int chainID, int tweenID, int textID, int charID, float delay );
    public static native void AddTweenChainObject( int chainID, int tweenID, int objectID, float delay );
    public static native void AddTweenChainCamera( int chainID, int tweenID, int cameraID, float delay );

    public static native void PlayTweenChain( int chainID );
    public static native void PauseTweenChain( int chainID );
    public static native void StopTweenChain( int chainID );
    public static native int GetTweenChainPlaying( int chainID );
    public static native void SetTweenChainTime( int chainID, float time );
    public static native float GetTweenChainEndTime( int chainID );

    public static native void UpdateAllTweens( float time );
    public static native void UpdateTweenChain( int chainID, float time );


    // print commands
    public static native void Print( String szString );
    public static native void Print( int i );
    public static native void Print( float f );
    public static native void PrintC( String szString );
    public static native void PrintC( int i );
    public static native void PrintC( float f );
    public static native void SetPrintSize( float fSize );
    public static native void SetPrintSpacing( float fSpacing );
    public static native void SetPrintColor( int iRed, int iGreen, int iBlue );
    public static native void SetPrintColor( int iRed, int iGreen, int iBlue, int iAlpha );
    public static native void SetPrintFont( int fontID );

    // raw input commands
    public static native int GetMultiTouchExists();
    public static native int GetMouseExists();
    public static native int GetKeyboardExists();
    public static native int GetJoystickExists();
    public static native int GetCameraExists();

    // sensors
    public static native int GetAccelerometerExists();
    public static native int GetGyroSensorExists();
    public static native int GetProximitySensorExists();
    public static native int GetLightSensorExists();
    public static native int GetMagneticSensorExists();
    public static native int GetRotationVectorSensorExists();
    public static native int GetGPSSensorExists();

    // touch commands
    public static native int GetRawTouchCount();
    public static native int GetRawTouchCount( int bIncludeUnknown );
    public static native int GetRawFirstTouchEvent();
    public static native int GetRawFirstTouchEvent( int bIncludeUnknown );
    public static native int GetRawNextTouchEvent( );
    public static native int GetRawTouchType( int iIndex );
    public static native float GetRawTouchStartX( int iIndex );
    public static native float GetRawTouchStartY( int iIndex );
    public static native float GetRawTouchCurrentX( int iIndex );
    public static native float GetRawTouchCurrentY( int iIndex );
    public static native float GetRawTouchLastX( int iIndex );
    public static native float GetRawTouchLastY( int iIndex );
    public static native int GetRawTouchReleased( int iIndex );
    public static native void SetRawTouchValue( int iIndex, int value );
    public static native int GetRawTouchValue( int iIndex );
    public static native float GetRawTouchTime( int iIndex );
    public static native void SetRawTouchMoveSensitivity( int distance );

    // mouse
    public static native float GetRawMouseX();
    public static native float GetRawMouseY();
    public static native float GetRawMouseWheel();
    public static native float GetRawMouseWheelDelta();
    public static native int GetRawMouseLeftPressed();
    public static native int GetRawMouseLeftState();
    public static native int GetRawMouseLeftReleased();
    public static native int GetRawMouseRightPressed();
    public static native int GetRawMouseRightState();
    public static native int GetRawMouseRightReleased();
    public static native int GetRawMouseMiddlePressed();
    public static native int GetRawMouseMiddleState();
    public static native int GetRawMouseMiddleReleased();
    public static native void SetRawMouseVisible( int visible );
    public static native void SetRawMousePosition( float x, float y );

    // sensors

    // accelerometer
    public static native void FixOrientationByDefault();
    public static native float GetRawAccelX();
    public static native float GetRawAccelY();
    public static native float GetRawAccelZ();

    // gyroscope
    public static native float GetRawGyroVelocityX();
    public static native float GetRawGyroVelocityY();
    public static native float GetRawGyroVelocityZ();

    // proximity
    public static native float GetRawProximityDistance();

    // light sensor
    public static native float GetRawLightLevel();

    // magnetic
    public static native float GetRawMagneticX();
    public static native float GetRawMagneticY();
    public static native float GetRawMagneticZ();

    // rotation sensor
    public static native float GetRawRotationVectorX();
    public static native float GetRawRotationVectorY();
    public static native float GetRawRotationVectorZ();
    public static native float GetRawRotationVectorW();

    public static native float GetRawRotationVectorX2();
    public static native float GetRawRotationVectorY2();
    public static native float GetRawRotationVectorZ2();
    public static native float GetRawRotationVectorW2();

    // GPS
    public static native void StartGPSTracking();
    public static native void StopGPSTracking();
    public static native float GetRawGPSLatitude();
    public static native float GetRawGPSLongitude();
    public static native float GetRawGPSAltitude();

    // joystick
    public static native void CompleteRawJoystickDetection();
    public static native int GetRawJoystickExists( int index );
    public static native int GetRawJoystickConnected( int index );
    public static native float GetRawJoystickX( int index );
    public static native float GetRawJoystickY( int index );
    public static native float GetRawJoystickZ( int index );
    public static native float GetRawJoystickRX( int index );
    public static native float GetRawJoystickRY( int index );
    public static native float GetRawJoystickRZ( int index );
    public static native int GetRawJoystickButtonPressed( int index, int button );
    public static native int GetRawJoystickButtonState( int index, int button );
    public static native int GetRawJoystickButtonReleased( int index, int button );
    public static native void SetRawJoystickDeadZone( float threshold );

    // virtual joysticks
    public static native void AddVirtualJoystick( int index, float x, float y, float size );
    public static native void DeleteVirtualJoystick( int index );
    public static native int GetVirtualJoystickExists( int index );
    public static native float GetVirtualJoystickX( int index );
    public static native float GetVirtualJoystickY( int index );
    public static native void SetVirtualJoystickAlpha( int index, int alpha1, int alpha2 );
    public static native void SetVirtualJoystickPosition( int index, float x, float y );
    public static native void SetVirtualJoystickSize( int index, float size );
    public static native void SetVirtualJoystickActive( int index, int active );
    public static native void SetVirtualJoystickVisible( int index, int visible );
    public static native void SetVirtualJoystickImageInner( int index, int imageID );
    public static native void SetVirtualJoystickImageOuter( int index, int imageID );
    public static native void SetVirtualJoystickDeadZone( float threshold );

    // virtual buttons
    public static native void AddVirtualButton( int index, float x, float y, float size );
    public static native void DeleteVirtualButton( int index );
    public static native int GetVirtualButtonExists( int index );
    public static native int GetVirtualButtonPressed( int index );
    public static native int GetVirtualButtonReleased( int index );
    public static native int GetVirtualButtonState( int index );
    public static native void SetVirtualButtonColor( int index, int red, int green, int blue );
    public static native void SetVirtualButtonAlpha( int index, int alpha );
    public static native void SetVirtualButtonPosition( int index, float x, float y );
    public static native void SetVirtualButtonSize( int index, float size );
    public static native void SetVirtualButtonSize( int index, float sizeX, float sizeY );
    public static native void SetVirtualButtonActive( int index, int active );
    public static native void SetVirtualButtonVisible( int index, int visible );
    public static native void SetVirtualButtonImageUp( int index, int imageID );
    public static native void SetVirtualButtonImageDown( int index, int imageID );
    public static native void SetVirtualButtonText( int index, String str );

    // keyboard
    public static native int GetRawKeyPressed( int key );
    public static native int GetRawKeyState( int key );
    public static native int GetRawKeyReleased( int key );
    public static native int GetRawLastKey();

    // AGK emulated input commands
    public static native int GetPointerPressed();
    public static native int GetPointerState();
    public static native int GetPointerReleased();
    public static native int GetPointerGesture();
    public static native float GetPointerX();
    public static native float GetPointerY();

    public static native float GetDirectionX();
    public static native float GetDirectionY();
    public static native float GetDirectionAngle();
    public static native float GetDirectionSpeed();

    public static native float GetJoystickX();
    public static native float GetJoystickY();
    public static native void SetJoystickScreenPosition( float x, float y, float size );
    public static native void SetJoystickDeadZone( float threshold );

    public static native int GetButtonPressed( int index );
    public static native int GetButtonState( int index );
    public static native int GetButtonReleased( int index );
    public static native void SetButtonScreenPosition( int index, float x, float y, float size );

    // text input
    public static native void StartTextInput( );
    public static native void StartTextInput( String initial );
    public static native void StopTextInput( );
    public static native int GetTextInputState();
    public static native int GetTextInputCompleted();
    public static native int GetTextInputCancelled();
    public static native String GetTextInput();
    public static native int GetPrevChar();
    public static native int GetLastChar();
    public static native void SetCursorBlinkTime( float seconds );
    public static native void SetTextInputMaxChars(int max);
    public static native void SetTextInputLabel( String str );

    // edit boxes
    public static native void CreateEditBox( int index );
    public static native int CreateEditBox();
    public static native int GetEditBoxExists( int index );
    public static native void DeleteEditBox( int index );
    public static native int GetEditBoxHasFocus( int index );
    public static native int GetCurrentEditBox();
    public static native void SetEditBoxPosition( int index, float x, float y );
    public static native void SetEditBoxSize( int index, float width, float height );
    public static native void SetEditBoxDepth( int index, int depth );
    public static native void SetEditBoxBorderSize( int index, float size );
    public static native void SetEditBoxBorderColor( int index, int red, int green, int blue, int alpha );
    public static native void SetEditBoxBackgroundColor( int index, int red, int green, int blue, int alpha );
    public static native void SetEditBoxText( int index, String str ); // 120212 - paul notice, how a command name which is contained in another similar command MUST be placed first!!
    public static native void SetEditBoxTextColor( int index, int red, int green, int blue );
    public static native void SetEditBoxCursorColor( int index, int red, int green, int blue );
    public static native void SetEditBoxFontImage( int index, int image );
    public static native void SetEditBoxExtendedFontImage( int index, int image );
    public static native void SetEditBoxFont( int index, int fontID );
    public static native void SetEditBoxTextSize( int index, float size );
    public static native void SetEditBoxCursorPosition( int index, int pos );
    public static native void SetEditBoxFocus( int index, int iActive );
    public static native void SetEditBoxActive( int index, int iActive );
    public static native void SetEditBoxVisible( int index, int iActive );
    public static native void SetEditBoxBorderImage( int index, int image );
    public static native void SetEditBoxBackgroundImage( int index, int image );
    public static native void SetEditBoxCursorBlinkTime( int index, float time );
    public static native void SetEditBoxCursorWidth( int index, float width );
    public static native void SetEditBoxMaxChars( int index, int max );
    public static native void SetEditBoxMaxLines( int index, int max );
    public static native void SetEditBoxMultiLine( int index, int mulitline );
    public static native void SetEditBoxScissor( int index, float x, float y, float x2, float y2 );
    public static native void SetEditBoxPasswordMode( int index, int mode );
    public static native void SetEditBoxUseAlternateInput( int index, int mode );
    public static native void SetEditBoxWrapMode( int index, int mode );
    public static native void FixEditBoxToScreen( int index, int fix );
    public static native String GetEditBoxText( int index );
    public static native float GetEditBoxX( int index );
    public static native float GetEditBoxY( int index );
    public static native float GetEditBoxWidth( int index );
    public static native float GetEditBoxHeight( int index );
    public static native int GetEditBoxChanged( int index );
    public static native int GetEditBoxActive( int index );
    public static native int GetEditBoxVisible( int index );
    public static native int GetEditBoxLines( int index );
    public static native int GetEditBoxCursorPosition( int index );

    // sound comands
    public static native void LoadSound( int iID, String sFilename );
    public static native int LoadSound( String sFilename );
    public static native void LoadSoundOGG( int iID, String sFilename );
    public static native int LoadSoundOGG( String sFilename );
    public static native int PlaySound( int iID );
    public static native int PlaySound( int iID, int iVol );
    public static native int PlaySound( int iID, int iVol, int iLoop );
    public static native int PlaySound( int iID, int iVol, int iLoop, int iPriority );
    public static native void StopSound( int iID );
    public static native void DeleteSound( int iID );
    public static native int GetSoundInstances( int iID );
    public static native int GetSoundsPlaying( int iID );
    public static native void SetSoundSystemVolume( int iVol );
    public static native int GetSoundExists( int iID );
    public static native float GetSoundMaxRate();
    public static native float GetSoundMinRate();
    public static native void SaveSound( int iID, String sImageFilename );

    public static native int GetSoundInstancePlaying( int iID );
    public static native int GetSoundInstanceVolume( int iID );
    public static native float GetSoundInstanceRate( int iID );
    public static native void SetSoundInstanceVolume( int iID, int vol );
    public static native void SetSoundInstanceRate( int iID, float rate );
    public static native void SetSoundInstanceBalance( int iID, float balance );
    public static native int GetSoundInstanceLoopCount( int iID );
    public static native void StopSoundInstance( int iID );

    // music comands
    public static native int LoadMusic( String sFile );
    public static native void LoadMusic( int iID, String sFile );
    public static native void SetMusicFileVolume( int ID, int vol );
    public static native void PlayMusic( );
    public static native void PlayMusic( int iID );
    public static native void PlayMusic( int iID, int bLoop );
    public static native void PlayMusic( int iID, int bLoop, int iStartID, int iEndID );
    public static native void PauseMusic( );
    public static native void ResumeMusic( );
    public static native void StopMusic( );
    public static native void DeleteMusic( int iID );
    public static native int GetMusicPlaying();
    public static native void SetMusicSystemVolume( int iVol );
    public static native int GetMusicExists( int iID );
    public static native float GetMusicDuration( int iID );
    public static native float GetMusicPosition();
    public static native void SeekMusic( float seconds, int mode );

    // OGG music
    public static native int LoadMusicOGG( String sFile );
    public static native void LoadMusicOGG( int musicID, String sFile );
    public static native int GetMusicExistsOGG( int musicID );
    public static native void SetMusicVolumeOGG( int musicID, int vol );
    public static native void PlayMusicOGG( int musicID );
    public static native void PlayMusicOGG( int musicID, int iLoop );
    public static native void PauseMusicOGG( int musicID );
    public static native void ResumeMusicOGG( int musicID );
    public static native void StopMusicOGG( int musicID );
    public static native void DeleteMusicOGG( int musicID );
    public static native int GetMusicPlayingOGG( int musicID );
    public static native int GetMusicLoopCountOGG( int musicID );
    public static native float GetMusicDurationOGG( int musicID );
    public static native float GetMusicPositionOGG( int musicID );
    public static native void SeekMusicOGG( int musicID, float seconds, int mode );
    public static native void SetMusicSystemVolumeOGG( int iVol );
    public static native void SetMusicLoopTimesOGG(int musicID, float startTime, float endTime);
    public static native void SetMusicLoopCountOGG(int musicID, int loop);

    // record sound
    public static native void RecordSound( String szFilename );
    public static native void StopSoundRecording();
    public static native int IsSoundRecording();

    public static native void VibrateDevice( float seconds );

    // file system commands
    public static native String SimplifyPath( String szPath );
    public static native String JoinPaths( String szPath, String szPath2 );
    public static native int IsAbsolutePath( String szPath );
    public static native int CountWindowsDrives();
    public static native String GetWindowsDrive( int index );

    public static native int OpenRawFolder( String szPath );
    public static native void CloseRawFolder( int ID );
    public static native int GetRawFolderNumFiles( int ID );
    public static native int GetRawFolderNumFolders( int ID );
    public static native String GetRawFolderFileName( int ID, int index );
    public static native String GetRawFolderFolderName( int ID, int index );

    public static native void SetRawWritePath( String str );
    public static native String GetWritePath();
    public static native String GetReadPath();
    public static native String GetDocumentsPath();

    public static native String ChooseRawFile( String ext );
    public static native String ChooseRawFile( String ext, int returnFullPath );

    public static native int GetFileExists( String szFile );
    public static native void DeleteFile( String szFile );

    public static native int OpenToWrite( String szFile, int append );
    public static native void OpenToWrite( int ID, String szFile, int append );
    public static native int OpenToWrite( String szFile );
    public static native void OpenToWrite( int ID, String szFile );			

    public static native int OpenToRead( String szFile );
    public static native void OpenToRead( int ID, String szFile );

    public static native int FileIsOpen( int ID );
    public static native void CloseFile( int iFileID );
    public static native int FileEOF( int iFileID );
    public static native int GetFileSize( int iFileID );
    public static native int GetFilePos( int iFileID );
    public static native void SetFilePos( int iFileID, int pos );

    public static native void WriteByte( int iFileID, int b );
    public static native void WriteInteger( int iFileID, int i );
    public static native void WriteFloat( int iFileID, float f );
    public static native void WriteString( int iFileID, String str );
    public static native void WriteString2( int iFileID, String str );
    public static native void WriteLine( int iFileID, String str );

    public static native int ReadByte( int iFileID );
    public static native int ReadInteger( int iFileID );
    public static native float ReadFloat( int iFileID );
    public static native String ReadString( int iFileID );
    public static native String ReadString2( int iFileID );
    public static native String ReadLine( int iFileID );

    // directory commands
    public static native int SetCurrentDir(String str);
    public static native String GetCurrentDir();
    public static native int SetFolder(String str);
    public static native String GetFolder();

    public static native int MakeFolder(String str);
    public static native void DeleteFolder(String str);

    public static native String GetFirstFolder();
    public static native String GetFirstFolder( int mode );
    public static native String GetNextFolder();
    public static native int GetFolderCount();
    public static native int GetFolderCount( int mode );

    public static native String GetFirstFile();
    public static native String GetFirstFile( int mode );
    public static native String GetNextFile();
    public static native int GetFileCount();
    public static native int GetFileCount( int mode );

    // broadcast commands
    public static native int CreateBroadcastListener( int port );
    public static native int CreateBroadcastListener( String szIP, int port );
    public static native void DeleteBroadcastListener( int iID );
    public static native int GetBroadcastMessage( int iID );

    // socket commands
    public static native int ConnectSocket( String szIP, int port, int timeout );
    public static native int ConnectSocket( int socketID, String szIP, int port, int timeout );
    public static native int GetSocketConnected( int socketID );
    public static native int GetSocketExists( int socketID );
    public static native void DeleteSocket( int socketID );


    public static native String GetSocketRemoteIP( int socketID );
    public static native int FlushSocket( int scoketID );

    public static native int GetSocketBytesAvailable( int socketID );
    public static native int GetSocketByte( int socketID );
    public static native int GetSocketInteger( int socketID );
    public static native float GetSocketFloat( int socketID );
    public static native String GetSocketString( int socketID );

    public static native int SendSocketByte( int socketID, int value );
    public static native int SendSocketInteger( int socketID, int value );
    public static native int SendSocketFloat( int socketID, float value );
    public static native int SendSocketString( int socketID, String value );

    // socket listener
    public static native int CreateSocketListener( String szIP, int port );
    public static native int CreateSocketListener( int listenerID, String szIP, int port );
    public static native int GetSocketListenerConnection( int listenerID );
    public static native void DeleteSocketListener( int listenerID );

    // network commands
    public static native int HostNetwork( String szNetworkName, String szMyName, int port );
    public static native int HostNetwork( String szNetworkName, String szMyName, int port, int portv6 );
    public static native void SetNetworkNoMoreClients( int iNetID );
    public static native void SetNetworkAllowClients( int iNetID );

    public static native int JoinNetwork( String szNetworkName, String szMyName );
    public static native int JoinNetwork( String szIP, int port, String szMyName );

    public static native int GetNetworkExists( int iNetID );
    public static native int IsNetworkActive( int iNetID );
    public static native String GetDeviceIP();
    public static native String GetDeviceIPv6();
    public static native int GetNetworkInterface();

    public static native void CloseNetwork( int iNetID );
    public static native void SetNetworkLatency( int iNetID, int latency );

    public static native int GetNetworkMyClientID( int iNetID );
    public static native int GetNetworkNumClients( int iNetID );
    public static native int GetNetworkFirstClient( int iNetID );
    public static native int GetNetworkNextClient( int iNetID );

    public static native void KickNetworkClient( int iNetID, int client );

    public static native int GetNetworkClientDisconnected( int iNetID, int client );
    public static native void DeleteNetworkClient( int iNetID, int client );
    public static native String GetNetworkClientName( int iNetID, int client );
    public static native float GetNetworkClientPing( int iNetID, int client );
    public static native int GetNetworkServerID( int iNetID );

    public static native void SetNetworkLocalInteger( int iNetID, String name, int i );
    public static native void SetNetworkLocalInteger( int iNetID, String name, int i, int mode );
    public static native void SetNetworkLocalFloat( int iNetID, String name, float f );
    public static native void SetNetworkLocalFloat( int iNetID, String name, float f, int mode );
    public static native int GetNetworkClientInteger( int iNetID, int client, String name );
    public static native float GetNetworkClientFloat( int iNetID, int client, String name );

    public static native int CreateNetworkMessage( );
    public static native void AddNetworkMessageInteger( int iMsgID, int value );
    public static native void AddNetworkMessageFloat( int iMsgID, float value );
    public static native void AddNetworkMessageString( int iMsgID, String value );
    public static native String GetNetworkMessageFromIP( int iMsgID );
    public static native int GetNetworkMessageFromClient( int iMsgID );
    public static native int GetNetworkMessageInteger( int iMsgID );
    public static native float GetNetworkMessageFloat( int iMsgID );
    public static native String GetNetworkMessageString( int iMsgID );
    public static native void DeleteNetworkMessage( int iMsgID );

    public static native void SendNetworkMessage( int iNetID, int toClient, int iMsgID );
    public static native int GetNetworkMessage( int iNetID );

    public static native void SetNetworkClientUserData( int iNetID, int client, int index, int value );
    public static native int GetNetworkClientUserData( int iNetID, int client, int index );

    // HTTP commands
    public static native int CreateHTTPConnection();
    public static native void DeleteHTTPConnection( int iHTTP );

    public static native int GetInternetState();

    public static native int SetHTTPHost( int iHTTP, String szHost, int iSecure );
    public static native int SetHTTPHost( int iHTTP, String szHost, int iSecure, String szUser, String szPass );
    public static native void CloseHTTPConnection( int iHTTP );
    public static native void SetHTTPTimeout( int iHTTP, int milliseconds );
    public static native void SetHTTPVerifyCertificate( int iHTTP, int mode );

    public static native String SendHTTPRequest( int iHTTP, String szServerFile ); //blocks
    public static native String SendHTTPRequest( int iHTTP, String szServerFile, String szPostData ); //blocks
    public static native int SendHTTPRequestASync( int iHTTP, String szServerFile ); //does not block
    public static native int SendHTTPRequestASync( int iHTTP, String szServerFile, String szPostData ); //does not block
    public static native int SendHTTPFile( int iHTTP, String szServerFile, String szPostData, String szLocalFile ); //does not block
    public static native String GetHTTPResponse( int iHTTP ); // 120112 - notice the shorter command goes first (for AGK compiler)
    public static native int GetHTTPResponseReady( int iHTTP );
    public static native String GetHTTPResponseC( int iHTTP );
    public static native int GetHTTPFile( int iHTTP, String szServerFile, String szLocalFile ); //does not block
    public static native int GetHTTPFile( int iHTTP, String szServerFile, String szLocalFile, String szPostData ); //does not block
    public static native int GetHTTPFileComplete( int iHTTP );
    public static native float GetHTTPFileProgress( int iHTTP );

    public static native void OpenBrowser( String url );

    public static native int RunApp( String szFilename, String szParameters );
    public static native int GetAppRunning( int appID );
    public static native void TerminateApp( int appID );

    public static native void ViewFile( String szFilename );
    public static native void ShareText( String szText );
    public static native void ShareImage( String szFilename );
    public static native void ShareImageAndText( String szFilename, String szText );

    // string commands
    public static native String Str( int value );
    public static native String Str( float value );
    public static native String Str( float value, int decimals );
    public static native String Bin( int i );
    public static native String Hex( int i );
    public static native String StringToBase64( String input );
    public static native String HexToBase64( String input );
    public static native int Val( String str );
    public static native int Val( String str, int base );
    public static native float ValFloat( String str );
    public static native String Left ( String str, int count );
    public static native String Right ( String str, int count );
    public static native String Mid ( String str, int count, int length );
    public static native int Asc ( String str );
    public static native int Len ( String str );
    public static native int ByteLen ( String str );
    public static native String Chr ( int iCharValue );
    public static native String Lower ( String str );
    public static native String Upper ( String str );
    public static native String Spaces ( int count );
    public static native int FindStringCount( String str, String findStr );
    public static native int FindStringCount( String str, String findStr, int ignoreCase, int start );
    public static native int FindString( String str, String findStr );
    public static native int FindString( String str, String findStr, int ignoreCase, int start );
    public static native int FindStringReverse( String str, String findStr );
    public static native int FindStringReverse( String str, String findStr, int ignoreCase, int start );
    public static native int CompareString( String str, String str2 );
    public static native int CompareString( String str, String str2, int ignoreCase, int maxChars );
    public static native String ReplaceString( String str, String find, String replace, int qty );
    public static native String StripString( String str, String chars );
    public static native String TrimString( String str, String chars );
    public static native String TruncateString( String str, String character );
    public static native int CountStringTokens( String str, String delimiters );
    public static native String GetStringToken( String str, String delimiters, int token );
    public static native int CountStringTokens2( String str, String delimiter );
    public static native String GetStringToken2( String str, String delimiter, int token );

    // benchmarking
    public static native int GetManagedSpriteCount();
    public static native int GetManagedSpriteSortedCount();
    public static native int GetManagedSpriteDrawnCount();
    public static native int GetPixelsDrawn();
    public static native int GetManagedSpriteDrawCalls();

    public static native int GetParticleDrawnPointCount();
    public static native int GetParticleDrawnQuadCount();

    public static native float GetUpdateTime();
    public static native float GetPhysicsTime();
    public static native float GetDrawingSetupTime();
    public static native float GetDrawingTime();

    public static native int GetLoadedImages();
    public static native int GetUnassignedImages();
    public static native String GetUnassignedImageFileName( int index );

    public static native float GetImageMemoryUsage();

    // date/time

    public static native int GetMonthFromUnix64( int unixtime );
    public static native int GetDayFromUnix64( int unixtime );
    public static native int GetHoursFromUnix64( int unixtime );
    public static native int GetMinutesFromUnix64( int unixtime );
    public static native int GetSecondsFromUnix64( int unixtime );
    public static native int GetUnixFromDate64( int year, int month, int days, int hours, int minutes, int seconds );
    public static native int GetUnixTime64();

    // tier 1 does not support 64 bit values, dates above 2038 will overflow


    public static native int GetMonthFromUnix( int unixtime );
    public static native int GetDaysFromUnix( int unixtime );
    public static native int GetHoursFromUnix( int unixtime );
    public static native int GetMinutesFromUnix( int unixtime );
    public static native int GetSecondsFromUnix( int unixtime );
    public static native int GetUnixFromDate( int year, int month, int days, int hours, int minutes, int seconds );
    public static native int GetUnixTime();

    public static native int GetLeapYear( int year );
    public static native String GetCurrentDate();
    public static native String GetCurrentTime();
    public static native int GetDayOfWeek();

    // adverts
    public static native void SetInneractiveDetails( String szCode );
    public static native void SetAdMobDetails( String szID );
    public static native void SetAdMobRewardAdDetails( String szID );
    public static native void SetChartboostDetails( String szKey1, String szKey2 );
    public static native void SetAmazonAdDetails( String szKey );

    public static native void SetAmazonAdTesting( int mode );
    public static native void SetAdMobTesting( int mode );

    public static native void ShowFullscreenAdvertAdMob();
    public static native void ShowFullscreenAdvertChartboost();
    public static native void ShowFullscreenAdvertAmazon();

    public static native int GetFullscreenAdvertLoadedAdMob();
    public static native int GetFullscreenAdvertLoadedChartboost();
    public static native int GetFullscreenAdvertLoadedAmazon();

    public static native void ShowRewardAdAdMob();
    public static native int GetRewardAdLoadedAdMob();
    public static native int GetRewardAdRewardedAdMob();
    public static native void ResetRewardAdMob();

    public static native void ShowRewardAdChartboost();
    public static native void CacheRewardAdChartboost();
    public static native int GetRewardAdLoadedChartboost();
    public static native int GetRewardAdRewardedChartboost();
    public static native void ResetRewardChartboost();

    public static native void CreateFullscreenAdvert();
    public static native void CreateAdvert( int type, int horz, int vert, int test );
    public static native void CreateAdvertEx( int type, int horz, int vert, int test, float offsetx, float offsety );
    public static native void SetAdvertPosition( float x, float y, float width );
    public static native void SetAdvertLocation( int horz, int vert, float width );
    public static native void SetAdvertLocationEx( int horz, int vert, float offsetx, float offsety, float width );
    public static native void SetAdvertVisible( int iVisible );
    public static native void RequestAdvertRefresh ();
    public static native void DeleteAdvert( );

    //
    // V108 - 
    //

    // log command (mainly for HTML5 but others can use it; output window)
    public static native void Log( String szMessage );

    // internal social functions
    public static native void SocialPluginsSetup ();
    public static native void SocialPluginsDestroy ();

    // video commands
    public static native int LoadVideo( String szFilename );
    public static native void DeleteVideo();
    public static native void SetVideoDimensions( float x, float y, float width, float height );
    public static native void PlayVideo();
    public static native void PlayVideoToImage( int imageID );
    public static native void PauseVideo(); 
    public static native void StopVideo();
    public static native int GetVideoPlaying();
    public static native float GetVideoPosition();
    public static native float GetVideoDuration();
    public static native void SetVideoVolume( float volume );
    public static native float GetVideoWidth();
    public static native float GetVideoHeight();
    public static native void VideoResumed();
    public static native void VideoUpdate();
    public static native void SetVideoPosition( float seconds );

    // screen recording
    public static native void StartScreenRecording( String szFilename, int microphone );
    public static native void StopScreenRecording();
    public static native int IsScreenRecording();

    // Smart watch
    public static native void ActivateSmartWatch( String szReserved );
    public static native int GetSmartWatchState();
    public static native void SendSmartWatchData( String szJson );
    public static native String ReceiveSmartWatchData();

    // Text to speech
    public static native void TextToSpeechSetup();
    public static native int GetTextToSpeechReady();
    public static native void Speak( String text );
    public static native void Speak( String text, int delay );
    public static native void SetSpeechRate( float rate );
    public static native void SetSpeechLanguage( String lang );
    public static native int IsSpeaking();
    public static native void StopSpeaking();

    // RATING COMMANDS
    public static native void  RateApp                      ( String szID );
    public static native void  RateApp                      ( String szID, String title );
    public static native void  RateApp                      ( String szID, String title, String message );
    public static native void RequestAppReview(); // iOS only

    // IN APP PURCHASE COMMANDS
    public static native void  InAppPurchaseSetKeys         ( String szData1, String szData2 );
    public static native void  InAppPurchaseSetTitle        ( String szTitle );
    public static native void  InAppPurchaseAddProductID    ( String szID, int type );
    public static native void  InAppPurchaseSetup           ();
    public static native void  InAppPurchaseActivate        ( int iID );
    public static native int   GetInAppPurchaseState        ();
    public static native int   GetInAppPurchaseAvailable    ( int iID );
    public static native String GetInAppPurchaseLocalPrice   ( int iID );
    public static native String GetInAppPurchaseDescription  ( int iID );
    public static native void  InAppPurchaseRestore		  ();
    public static native String GetInAppPurchaseSignature    ( int iID );

    // FACEBOOK COMMANDS
    public static native void  FacebookSetup                ( String szID );
    public static native void  FacebookLogin                ();
    public static native void  FacebookLogout               ();
    public static native void  FacebookShowLikeButton       ( String szURL, int iX, int iY, int iWidth, int iHeight );
    public static native void  FacebookDestroyLikeButton    ();
    public static native void  FacebookPostOnMyWall         ( String szLink, String szPicture, String szName, String szCaption, String szDescription );
    public static native void  FacebookPostOnFriendsWall    ( String szID, String szLink, String szPicture, String szName, String szCaption, String szDescription );
    public static native void  FacebookInviteFriend         ( String szID, String szMessage );
    public static native void  FacebookGetFriends           ();
    public static native int   FacebookGetFriendsState      ();
    public static native int   FacebookGetFriendsCount      ();
    public static native String FacebookGetFriendsName       ( int iIndex );
    public static native String FacebookGetFriendsID         ( int iIndex );
    public static native void  FacebookDownloadFriendsPhoto ( int iIndex );
    public static native int   GetFacebookDownloadState     ();
    public static native String GetFacebookDownloadFile      ();
    public static native int   GetFacebookLoggedIn          ();
    public static native String FacebookGetUserID			  ();
    public static native String FacebookGetUserName		  ();
    public static native String FacebookGetAccessToken		  ();
    public static native void  FacebookActivateAppTracking  ();

    // TWITTER COMMANDS
    public static native void  TwitterSetup                 ( String szKey, String szSecret );
    public static native void  TwitterMessage               ( String szMessage );

    // NOTIFICATION COMMANDS
    public static native void  NotificationCreate           ( String szDateTime, String szMessage, String szData );
    public static native void  NotificationReset            ();
    public static native int   GetNotification              ();
    public static native String GetNotificationData          ();

    // V108 Ultra notification (WinRT Metro-style)
    public static native int   GetNotificationType          ();
    public static native void  SetNotificationImage		  ( int iImageIndex );
    public static native void  SetNotificationText          ( String pText );

    // local notifications
    public static native void SetLocalNotification( int iID, int datetime, String szMessage );
    public static native void CancelLocalNotification( int iID );
    public static native int GetLocalNotificationExists( int iID );
    public static native int GetLocalNotificationTime( int iID );
    public static native String GetLocalNotificationMessage( int iID );
    public static native void CheckLocalNotifications();

    // push notifications
    public static native void SetPushNotificationKeys( String data1, String reserved );
    public static native int PushNotificationSetup();
    public static native String GetPushNotificationToken();

    // Android permissions
    public static native int CheckPermission( String szPermission );
    public static native void RequestPermission( String szPermission );

    // Shared variables
    public static native void SetSharedVariableAppGroup( String group );
    public static native void SaveSharedVariable( String varName, String varValue );
    public static native String LoadSharedVariable( String varName, String defaultValue );
    public static native void DeleteSharedVariable( String varName );

    // Cloud data
    public static native void SetupCloudData( String reserved );
    public static native int GetCloudDataAllowed();
    public static native int GetCloudDataChanged();
    public static native String GetCloudDataVariable( String varName, String defaultValue );
    public static native void SetCloudDataVariable( String varName, String varValue );
    public static native void DeleteCloudDataVariable( String varName );

    // Firebase
    public static native void FirebaseSetup();
    public static native void FirebaseLogEvent( String event_name );

    // zip functions
    public static native void CreateZip( int zipID, String filename );
    public static native int CreateZip( String filename );
    public static native void AddZipEntry( int zipID, String path, String zipPath );
    public static native void CloseZip( int zipID );
    public static native void ExtractZip( String zipfilename, String path );

    // memblock functions (do not exist at this time)
    public static native int CreateMemblock( int size );
    public static native void CreateMemblock( int memID, int size );
    public static native int GetMemblockExists( int memID );
    public static native void DeleteMemblock( int memID );
    public static native String GetMemblockPtr( int memID );
    public static native void CopyMemblock( int memSrcID, int memDstID, int srcOffset, int dstOffset, int size );

    public static native int GetMemblockSize( int memID );
    public static native int GetMemblockByte( int memID, int offset );
    public static native int GetMemblockByteSigned( int memID, int offset );
    public static native int GetMemblockShort( int memID, int offset );
    public static native int GetMemblockInt( int memID, int offset );
    public static native float GetMemblockFloat( int memID, int offset );
    public static native String GetMemblockString( int memID, int offset, int length );

    public static native void SetMemblockByte( int memID, int offset, int value );
    public static native void SetMemblockByteSigned( int memID, int offset, int value );
    public static native void SetMemblockShort( int memID, int offset, int value );
    public static native void SetMemblockInt( int memID, int offset, int value );
    public static native void SetMemblockFloat( int memID, int offset, float value );
    public static native void SetMemblockString( int memID, int offset, String value );

    public static native void CreateMemblockFromImage( int memID, int imageID );
    public static native int CreateMemblockFromImage( int imageID );
    public static native void CreateImageFromMemblock( int imageID, int memID );
    public static native int CreateImageFromMemblock( int memID );

    public static native void CreateMemblockFromSound( int memID, int soundID );
    public static native int CreateMemblockFromSound( int soundID );
    public static native void CreateSoundFromMemblock( int soundID, int memID );
    public static native int CreateSoundFromMemblock( int memID );

    public static native void CreateMemblockFromFile( int memID, String filename );
    public static native int CreateMemblockFromFile( String filename );
    public static native void CreateFileFromMemblock( String filename, int memID );

    public static native void CreateMemblockFromObjectMesh( int memID, int objID, int meshIndex );
    public static native int CreateMemblockFromObjectMesh( int objID, int meshIndex );
    public static native void CreateObjectFromMeshMemblock( int objID, int memID );
    public static native int CreateObjectFromMeshMemblock( int memID );
    public static native void SetObjectMeshFromMemblock( int objID, int meshIndex, int memID );
    public static native void AddObjectMeshFromMemblock( int objID, int memID );

    public static native void SetMeshMemblockVertexPosition( int memID, int vertexIndex, float x, float y, float z );
    public static native void SetMeshMemblockVertexNormal( int memID, int vertexIndex, float x, float y, float z );
    public static native void SetMeshMemblockVertexUV( int memID, int vertexIndex, float u, float v );
    public static native void SetMeshMemblockVertexColor( int memID, int vertexIndex, int red, int green, int blue, int alpha );




    public static native float GetMeshMemblockVertexX( int memID, int vertexIndex );
    public static native float GetMeshMemblockVertexY( int memID, int vertexIndex );
    public static native float GetMeshMemblockVertexZ( int memID, int vertexIndex );
    public static native float GetMeshMemblockVertexNormalX( int memID, int vertexIndex );
    public static native float GetMeshMemblockVertexNormalY( int memID, int vertexIndex );
    public static native float GetMeshMemblockVertexNormalZ( int memID, int vertexIndex );
    public static native float GetMeshMemblockVertexU( int memID, int vertexIndex );
    public static native float GetMeshMemblockVertexV( int memID, int vertexIndex );
    public static native int GetMeshMemblockVertexRed( int memID, int vertexIndex );
    public static native int GetMeshMemblockVertexGreen( int memID, int vertexIndex );
    public static native int GetMeshMemblockVertexBlue( int memID, int vertexIndex );
    public static native int GetMeshMemblockVertexAlpha( int memID, int vertexIndex );

    //
    // V108 ULTRA RAW COMMANDS
    //
    // Internal
    public static native void InitialiseSensorCommands();
    public static native void FreeSensorCommands();
    // Real Commands
    public static native int  GetNFCExists();

    // V108 NFC
    public static native int GetRawNFCCount();
    public static native int GetRawFirstNFCDevice();
    public static native int GetRawNextNFCDevice();
    public static native String GetRawNFCName( int iIndex );
    public static native int SendRawNFCData( int iIndex, String pMessageText );
    public static native int GetRawNFCDataState( int iIndex );
    public static native String GetRawNFCData( int iIndex );

    // GameCenter

    public static native int GetGameCenterExists();
    public static native void GameCenterSetup();
    public static native void GameCenterSetup( String szKey, String szData );
    public static native void GameCenterLogin();
    public static native int GetGameCenterLoggedIn();
    public static native String GetGameCenterPlayerID();
    public static native String GetGameCenterPlayerDisplayName();
    public static native void GameCenterSubmitScore( int iScore, String szBoardID );
    public static native void GameCenterShowLeaderBoard ( String szBoardID ); 
    public static native void GameCenterSubmitAchievement ( String szAchievementID, int iPercentageComplete );
    public static native void GameCenterAchievementsShow ( );
    public static native void GameCenterAchievementsReset ( );

    // drawing commands
    public static native int MakeColor( int red, int green, int blue );
    public static native int GetColorRed( int color );
    public static native int GetColorGreen( int color );
    public static native int GetColorBlue( int color );
    public static native void DrawLineInternal( float x, float y, float x2, float y2, int color1, int color2 );
    public static native void DrawLine( float x, float y, float x2, float y2, int red, int green, int blue );
    public static native void DrawLine( float x, float y, float x2, float y2, int color1, int color2 );
    public static native void DrawBox( float x, float y, float x2, float y2, int color1, int color2, int color3, int color4, int filled );
    public static native void DrawEllipse( float x, float y, float radiusx, float radiusy, int color1, int color2, int filled );

    //
    // V108 3D Commands
    //

    public static native void SetGlobal3DDepth( int depth );

    // 3d objects
    public static native void CreateObjectBox( int objID, float width, float height, float length );
    public static native int CreateObjectBox( float width, float height, float length );
    public static native void CreateObjectSphere( int objID, float diameter, int rows, int columns );
    public static native int CreateObjectSphere( float diameter, int rows, int columns );
    public static native int CreateObjectCapsule( float diameter, float height, int axis );
    public static native void CreateObjectCapsule( int objID, float diameter, float height, int axis );
    public static native void CreateObjectCone( int objID, float height, float diameter, int segments );
    public static native int CreateObjectCone( float height, float diameter, int segments );
    public static native void CreateObjectCylinder( int objID, float height, float diameter, int segments );
    public static native int CreateObjectCylinder( float height, float diameter, int segments );
    public static native void CreateObjectPlane( int objID, float width, float height );
    public static native int CreateObjectPlane( float width, float height );
    public static native void CreateObjectQuad( int objID );
    public static native int CreateObjectQuad();

    public static native void CreateObjectFromHeightMap( int objID, String szImageFile, float width, float height, float length, int smoothing, int split ); 
    public static native int CreateObjectFromHeightMap( String szImageFile, float width, float height, float length, int smoothing, int split );

    public static native int CreateObjectFromObjectMesh( int fromObjID, int meshIndex );
    public static native void CreateObjectFromObjectMesh( int objID, int fromObjID, int meshIndex );

    // for public static native objects
    public static native void LoadObject( int objID, String szFilename );
    public static native void LoadObject( int objID, String szFilename, float height );
    public static native int LoadObject( String szFilename );
    public static native int LoadObject( String szFilename, float height );

    // for animated objects
    public static native void LoadObjectWithChildren( int objID, String szFilename );
    public static native int LoadObjectWithChildren( String szFilename );

    public static native void SaveObject( int objID, String szFilename );

    public static native void CloneObject( int newobjID, int objID );
    public static native int CloneObject( int objID );
    public static native void InstanceObject( int newobjID, int objID );
    public static native int InstanceObject( int objID );

    public static native int GetObjectExists( int objID );
    public static native void DeleteObject( int objID );
    public static native void DeleteObjectWithChildren( int objID );
    public static native void DeleteObjectTree( int objID );

    public static native void DeleteAllObjects();

    public static native int GetObjectNumChildren( int objID );
    public static native int GetObjectChildID( int objID, int childIndex );

    public static native int GetObjectNumBones( int objID );
    public static native int GetObjectBoneByName( int objID, String name );

    // mesh
    public static native int GetObjectNumMeshes( int objID );
    public static native String GetObjectMeshName( int objID, int meshIndex );
    public static native void SetObjectMeshImage( int objID, int meshIndex, int imageID, int textureStage );
    public static native void SetObjectMeshLightMap( int objID, int meshIndex, int imageID );
    public static native void SetObjectMeshNormalMap( int objID, int meshIndex, int imageID );
    public static native void SetObjectMeshNormalMapScale( int objID, int meshIndex, float scaleU, float scaleV );
    public static native void SetObjectMeshShader( int objID, int meshIndex, int shaderID );
    public static native String GetObjectMeshVSSource( int objID, int meshIndex );
    public static native String GetObjectMeshPSSource( int objID, int meshIndex );
    public static native void SetObjectMeshUVOffset( int objID, int meshIndex, int textureStage, float offsetU, float offsetV );
    public static native void SetObjectMeshUVScale( int objID, int meshIndex, int textureStage, float scaleU, float scaleV );
    public static native float GetObjectMeshSizeMinX( int objID, int meshIndex );
    public static native float GetObjectMeshSizeMaxX( int objID, int meshIndex );
    public static native float GetObjectMeshSizeMinY( int objID, int meshIndex );
    public static native float GetObjectMeshSizeMaxY( int objID, int meshIndex );
    public static native float GetObjectMeshSizeMinZ( int objID, int meshIndex );
    public static native float GetObjectMeshSizeMaxZ( int objID, int meshIndex );

    public static native void FixObjectToObject( int objID, int toObjID );
    public static native void FixObjectToBone( int objID, int toObjID, int toBoneIndex );

    // animation
    public static native int GetObjectNumAnimations( int objID );
    public static native String GetObjectAnimationName( int objID, int index );
    public static native void PlayObjectAnimation( int objID, String animName, float starttime, float endtime, int loop, float tweentime );
    public static native void SetObjectAnimationFrame(int objID, String animName, float time, float tweentime );
    public static native void StopObjectAnimation( int objID );
    public static native void ResetObjectAnimation( int objID );
    public static native void SetObjectAnimationSpeed(  int objID, float speed );
    public static native int GetObjectIsAnimating( int objID );
    public static native int GetObjectIsTweening( int objID );
    public static native float GetObjectAnimationTime( int objID );
    public static native float GetObjectAnimationDuration( int objID, String animName );

    // bone transform
    public static native void SetObjectBonePosition( int objID, int boneIndex, float x, float y, float z );
    public static native void SetObjectBoneRotation( int objID, int boneIndex, float angx, float angy, float angz );
    public static native void SetObjectBoneRotationQuat( int objID, int boneIndex, float w, float x, float y, float z );
    public static native void SetObjectBoneLookAt( int objID, int boneIndex, float x, float y, float z, float roll );
    public static native void SetObjectBoneCanAnimate( int objID, int boneIndex, int animate );

    public static native void RotateObjectBoneLocalX( int objID, int boneIndex, float amount );
    public static native void RotateObjectBoneLocalY( int objID, int boneIndex, float amount );
    public static native void RotateObjectBoneLocalZ( int objID, int boneIndex, float amount );

    public static native String GetObjectBoneName( int objID, int boneIndex );
    public static native float GetObjectBoneX( int objID, int boneIndex );
    public static native float GetObjectBoneY( int objID, int boneIndex );
    public static native float GetObjectBoneZ( int objID, int boneIndex );
    public static native float GetObjectBoneAngleX( int objID, int boneIndex );
    public static native float GetObjectBoneAngleY( int objID, int boneIndex );
    public static native float GetObjectBoneAngleZ( int objID, int boneIndex );
    public static native float GetObjectBoneQuatW( int objID, int boneIndex );
    public static native float GetObjectBoneQuatX( int objID, int boneIndex );
    public static native float GetObjectBoneQuatY( int objID, int boneIndex );
    public static native float GetObjectBoneQuatZ( int objID, int boneIndex );

    public static native float GetObjectBoneWorldX( int objID, int boneIndex );
    public static native float GetObjectBoneWorldY( int objID, int boneIndex );
    public static native float GetObjectBoneWorldZ( int objID, int boneIndex );
    public static native float GetObjectBoneWorldAngleX( int objID, int boneIndex );
    public static native float GetObjectBoneWorldAngleY( int objID, int boneIndex );
    public static native float GetObjectBoneWorldAngleZ( int objID, int boneIndex );
    public static native float GetObjectBoneWorldQuatW( int objID, int boneIndex );
    public static native float GetObjectBoneWorldQuatX( int objID, int boneIndex );
    public static native float GetObjectBoneWorldQuatY( int objID, int boneIndex );
    public static native float GetObjectBoneWorldQuatZ( int objID, int boneIndex );

    // object transform
    public static native void SetObjectPosition( int objID, float x, float y, float z );
    public static native void SetObjectRotation( int objID, float angx, float angy, float angz );
    public static native void SetObjectRotationQuat( int objID, float w, float x, float y, float z );
    public static native void SetObjectScale( int objID, float x, float y, float z );
    public static native void SetObjectScalePermanent( int objID, float x, float y, float z );

    public static native void MoveObjectLocalX( int objID, float amount );
    public static native void MoveObjectLocalY( int objID, float amount );
    public static native void MoveObjectLocalZ( int objID, float amount );

    public static native void RotateObjectLocalX( int objID, float amount );
    public static native void RotateObjectLocalY( int objID, float amount );
    public static native void RotateObjectLocalZ( int objID, float amount );

    public static native void RotateObjectGlobalX( int objID, float amount );
    public static native void RotateObjectGlobalY( int objID, float amount );
    public static native void RotateObjectGlobalZ( int objID, float amount );

    public static native float GetObjectX( int objID );
    public static native float GetObjectY( int objID );
    public static native float GetObjectZ( int objID );
    public static native float GetObjectAngleX( int objID );
    public static native float GetObjectAngleY( int objID );
    public static native float GetObjectAngleZ( int objID );
    public static native float GetObjectQuatW( int objID );
    public static native float GetObjectQuatX( int objID );
    public static native float GetObjectQuatY( int objID );
    public static native float GetObjectQuatZ( int objID );

    public static native float GetObjectWorldX( int objID );
    public static native float GetObjectWorldY( int objID );
    public static native float GetObjectWorldZ( int objID );
    public static native float GetObjectWorldAngleX( int objID );
    public static native float GetObjectWorldAngleY( int objID );
    public static native float GetObjectWorldAngleZ( int objID );
    public static native float GetObjectWorldQuatW( int objID );
    public static native float GetObjectWorldQuatX( int objID );
    public static native float GetObjectWorldQuatY( int objID );
    public static native float GetObjectWorldQuatZ( int objID );

    public static native float GetObjectSizeMinX( int objID );
    public static native float GetObjectSizeMaxX( int objID );
    public static native float GetObjectSizeMinY( int objID );
    public static native float GetObjectSizeMaxY( int objID );
    public static native float GetObjectSizeMinZ( int objID );
    public static native float GetObjectSizeMaxZ( int objID );

    public static native void SetObjectLookAt( int objID, float x, float y, float z, float roll );
    public static native void FixObjectPivot( int objID );

    public static native float GetObjectHeightMapHeight( int objID, float x, float z );

    // object properties
    public static native void SetObjectImage( int objID, int imageID, int texStage );
    public static native void SetObjectLightMap( int objID, int imageID );
    public static native void SetObjectNormalMap( int objID, int imageID );
    public static native void SetObjectNormalMapScale( int objID, float scaleU, float scaleV );
    public static native void SetObjectShader( int objID, int shaderID );
    public static native void SetObjectColor( int objID, int red, int green, int blue, int alpha );
    public static native void SetObjectColorEmissive( int objID, int red, int green, int blue );
    public static native void SetObjectLightMode( int objID, int mode );
    public static native void SetObjectScreenCulling( int objID, int mode );
    public static native void SetObjectUVOffset( int objID, int textureStage, float offsetU, float offsetV );
    public static native void SetObjectUVScale( int objID, int textureStage, float scaleU, float scaleV );
    public static native void SetObjectFogMode( int objID, int mode );
    public static native void SetObjectCastShadow( int objID, int mode );
    public static native void SetObjectReceiveShadow( int objID, int mode );

    public static native void SetObjectDepthReadMode( int objID, int mode );
    public static native void SetObjectDepthWrite( int objID, int mode );
    public static native void SetObjectDepthBias( int objID, float bias );
    public static native void SetObjectDepthRange( int objID, float zNear, float zFar );
    public static native void SetObjectTransparency( int objID, int mode );
    public static native void SetObjectBlendModes( int objID, int src, int dst );
    public static native void SetObjectAlphaMask( int objID, int mode );
    public static native void SetObjectCullMode( int objID, int mode );
    public static native void SetObjectVisible( int objID, int mode );

    public static native int GetObjectDepthReadMode( int objID );
    public static native int GetObjectDepthWrite( int objID );
    public static native float GetObjectDepthBias( int objID );
    public static native int GetObjectTransparency( int objID );
    public static native int GetObjectCullMode( int objID );
    public static native int GetObjectVisible( int objID );
    public static native int GetObjectInScreen( int objID );
    public static native int GetObjectCastShadowMode( int objID );
    public static native int GetObjectReceiveShadowMode( int objID );

    public static native String GetObjectName( int objID );

    public static native void SetObjectShaderConstantByName( int objID, String szName, float value1, float value2, float value3, float value4 );
    public static native void SetObjectShaderConstantArrayByName( int objID, String szName, int arrayIndex, float value1, float value2, float value3, float value4 );
    public static native void SetObjectShaderConstantDefault( int objID, String szName );

    public static native void DrawObject( int objID );

    public static native float GetScreenXFrom3D( float x, float y, float z );
    public static native float GetScreenYFrom3D( float x, float y, float z );

    public static native float Get3DVectorXFromScreen( float x, float y );
    public static native float Get3DVectorYFromScreen( float x, float y );
    public static native float Get3DVectorZFromScreen( float x, float y );

    // collision
    public static native void SetObjectCollisionMode( int objID, int mode );

    public static native int ObjectRayCast( int objID, float oldx, float oldy, float oldz, float newx, float newy, float newz );
    public static native int ObjectSphereCast( int objID, float oldx, float oldy, float oldz, float newx, float newy, float newz, float radius );
    public static native int ObjectSphereSlide( int objID, float oldx, float oldy, float oldz, float newx, float newy, float newz, float radius );
    public static native int GetObjectRayCastNumHits();
    public static native int GetObjectRayCastHitID( int index );
    public static native float GetObjectRayCastX( int index );
    public static native float GetObjectRayCastY( int index );
    public static native float GetObjectRayCastZ( int index );
    public static native float GetObjectRayCastSlideX( int index );
    public static native float GetObjectRayCastSlideY( int index );
    public static native float GetObjectRayCastSlideZ( int index );
    public static native float GetObjectRayCastNormalX( int index );
    public static native float GetObjectRayCastNormalY( int index );
    public static native float GetObjectRayCastNormalZ( int index );
    public static native float GetObjectRayCastBounceX( int index );
    public static native float GetObjectRayCastBounceY( int index );
    public static native float GetObjectRayCastBounceZ( int index );
    public static native float GetObjectRayCastDistance( int index );

    // fog
    public static native void SetFogMode( int mode );
    public static native void SetFogColor( int red, int green, int blue );
    public static native void SetFogSunColor( int red, int green, int blue );
    public static native void SetFogRange( float minDist, float maxDist );

    public static native int GetFogMode();
    public static native int GetFogColorsEqual();

    // sky box
    public static native void SetSkyBoxVisible( int active );
    public static native void SetSkyBoxSkyColor( int red, int green, int blue );
    public static native void SetSkyBoxHorizonColor( int red, int green, int blue );
    public static native void SetSkyBoxSunColor( int red, int green, int blue );
    public static native void SetSkyBoxHorizonSize( float size, float height );
    public static native void SetSkyBoxSunVisible( int visible );
    public static native void SetSkyBoxSunSize( float sun, float halo );

    // shaders
    public static native void LoadShader( int shaderID, String szVertexFile, String szPixelFile );
    public static native int LoadShader( String szVertexFile, String szPixelFile );
    public static native void LoadShaderFromString( int shaderID, String szVertexSource, String szPixelSource );
    public static native int LoadShaderFromString( String szVertexSource, String szPixelSource );
    public static native void LoadFullScreenShader( int shaderID, String szPixelFile );
    public static native int LoadFullScreenShader( String szPixelFile );
    public static native void LoadSpriteShader( int shaderID, String szPixelFile );
    public static native int LoadSpriteShader( String szPixelFile );
    public static native void SetShaderConstantByName( int shaderID, String szName, float value1, float value2, float value3, float value4 );
    public static native void SetShaderConstantArrayByName( int shaderID, String szName, int arrayIndex, float value1, float value2, float value3, float value4 );
    public static native int GetShaderExists( int shaderID );
    public static native void DeleteShader( int shaderID );

    // cameras
    public static native void SetCameraPosition( int cameraID, float x, float y, float z );
    public static native void SetCameraRotationQuat( int cameraID, float w, float x, float y, float z );
    public static native void SetCameraRotation( int cameraID, float angx, float angy, float angz );

    public static native void MoveCameraLocalX( int cameraID, float amount );
    public static native void MoveCameraLocalY( int cameraID, float amount );
    public static native void MoveCameraLocalZ( int cameraID, float amount );

    public static native void RotateCameraLocalX( int cameraID, float amount );
    public static native void RotateCameraLocalY( int cameraID, float amount );
    public static native void RotateCameraLocalZ( int cameraID, float amount );

    public static native void RotateCameraGlobalX( int cameraID, float amount );
    public static native void RotateCameraGlobalY( int cameraID, float amount );
    public static native void RotateCameraGlobalZ( int cameraID, float amount );

    public static native float GetCameraX( int cameraID );
    public static native float GetCameraY( int cameraID );
    public static native float GetCameraZ( int cameraID );
    public static native float GetCameraAngleX( int cameraID );
    public static native float GetCameraAngleY( int cameraID );
    public static native float GetCameraAngleZ( int cameraID );
    public static native float GetCameraQuatW( int cameraID );
    public static native float GetCameraQuatX( int cameraID );
    public static native float GetCameraQuatY( int cameraID );
    public static native float GetCameraQuatZ( int cameraID );

    public static native void SetCameraLookAt( int cameraID, float x, float y, float z, float roll );
    public static native void SetCameraRange( int cameraID, float fNear, float fFar );
    public static native void SetCameraFOV( int cameraID, float fov );
    public static native void SetCameraAspect( int cameraID, float aspect );
    public static native void SetCameraOrthoWidth( int cameraID, float width );
    public static native void SetCameraBounds( int cameraID, float left, float right, float top, float bottom );
    public static native void SetCameraOffCenter( int cameraID, int mode );

    public static native float GetCameraFOV( int cameraID );




    // lights
    public static native void CreatePointLight( int lightID, float x, float y, float z, float radius, int red, int green, int blue );
    public static native int GetPointLightExists( int lightID );
    public static native void DeletePointLight( int lightID );
    public static native void ClearPointLights();
    public static native void SetPointLightPosition( int lightID, float x, float y, float z );
    public static native void SetPointLightColor( int lightID, int red, int green, int blue );
    public static native void SetPointLightRadius( int lightID, float radius );
    public static native void SetPointLightMode( int lightID, int mode );

    // only allow one directional light
    //public static native void CreateLightDirectional( int lightID, float vx, float vy, float vz, int red, int green, int blue );
    //public static native int GetLightDirectionalExists( int lightID );
    //public static native void DeleteLightDirectional( int lightID );
    //public static native void ClearLightDirectionals();
    public static native void SetSunDirection( float vx, float vy, float vz );
    public static native void SetSunColor( int red, int green, int blue );
    public static native void SetSunActive( int active );

    public static native void SetAmbientColor( int red, int green, int blue );

    // Shadows
    public static native int GetShadowMappingSupported();
    public static native void SetShadowMappingMode( int mode );
    public static native int GetShadowMappingMode();
    public static native void SetShadowSmoothing( int mode );
    public static native int GetShadowSmoothing();
    public static native void SetShadowMapSize( int width, int height );
    public static native void SetShadowRange( float range );
    public static native void SetShadowBias( float bias );
    public static native void SetShadowLightStepSize( float step );
    public static native void SetShadowCascadeValues( float cascade1, float cascade2, float cascade3 );

    // 3D Particles

    public static native void Create3DParticles( int ID, float x, float y, float z );
    public static native int Create3DParticles( float x, float y, float z );
    public static native int Get3DParticlesExists( int ID );
    public static native void Delete3DParticles( int ID );
    public static native void Set3DParticlesPosition( int ID, float x, float y, float z );
    public static native void Set3DParticlesFrequency( int ID, float freq );
    public static native void Set3DParticlesStartZone( int ID, float x1, float y1, float z1, float x2, float y2, float z2 );
    public static native void Set3DParticlesDirection( int ID, float vx, float vy, float vz, float roll );
    public static native void Set3DParticlesVelocityRange( int ID, float v1, float v2 );
    public static native void Set3DParticlesDirectionRange( int ID, float angle, float angle2 );
    //public static native void Set3DParticlesFaceDirection( int ID, int mode );
    public static native void Set3DParticlesSize( int ID, float size );
    public static native void Set3DParticlesLife( int ID, float time );
    public static native void Set3DParticlesMax( int ID, int max );
    public static native void Reset3DParticleCount( int ID );
    public static native void Set3DParticlesImage( int ID, int imageID );
    public static native void Set3DParticlesColorInterpolation( int ID, int mode );
    public static native void Set3DParticlesVisible( int ID, int visible );
    public static native void Set3DParticlesActive( int ID, int active );
    public static native void Set3DParticlesTransparency( int ID, int mode );

    public static native float Get3DParticlesX( int ID );
    public static native float Get3DParticlesY( int ID );
    public static native float Get3DParticlesZ( int ID );
    public static native int Get3DParticlesVisible( int ID );
    public static native int Get3DParticlesActive( int ID );
    public static native float Get3DParticlesFrequency( int ID );
    public static native float Get3DParticlesDirectionX( int ID );
    public static native float Get3DParticlesDirectionY( int ID );
    public static native float Get3DParticlesDirectionZ( int ID );
    public static native float Get3DParticlesDirectionRange1( int ID );
    public static native float Get3DParticlesDirectionRange2( int ID );
    public static native float Get3DParticlesSize( int ID );
    public static native float Get3DParticlesLife( int ID );
    public static native int Get3DParticlesMaxReached( int ID );

    public static native void Add3DParticlesForce( int ID, float starttime, float endtime, float x, float y, float z );
    public static native void Clear3DParticlesForces( int ID );
    public static native void Add3DParticlesColorKeyFrame( int ID, float time, int red, int green, int blue, int alpha );
    public static native void Clear3DParticlesColors( int ID );
    public static native void Add3DParticlesScaleKeyFrame( int ID, float time, float scale );
    public static native void Clear3DParticlesScales( int ID );

    public static native void Update3DParticles( int ID, float time );
    public static native void Offset3DParticles( int ID, float x, float y, float z );

    //3D Physics Commands

    //3D Physics World Commands
    public static native void Create3DPhysicsWorld();
    public static native void Create3DPhysicsWorld( float scaleFactor );
    public static native void Set3DPhysicsGravity( float x, float y, float z );
    public static native void Set3DPhysicsGravity( int vectorID );
    public static native void Step3DPhysicsWorld();
    public static native void Reset3DPhysicsWorld();
    public static native void Delete3DPhysicsWorld();
    public static native void Debug3DPhysicsWorld();// Can not use Debugger at this time.Unable to draw wireframe.
    public static native int Get3DPhysicsTotalObjects();
    public static native int Get3DPhysicsActiveObjects();
    public static native int Get3DPhysicsTotalJoints();

    //CollisionShapes
    public static native void SetObjectShapeBox( int objID );
    public static native void SetObjectShapeBox( int objID, float sizeX, float sizeY, float sizeZ );
    public static native void SetObjectShapeBox( int objID, int vectorID );
    public static native void SetObjectShapeSphere( int objID );
    public static native void SetObjectShapeSphere( int objID, float diameter );
    public static native void SetObjectShapeCylinder( int objID, int axis );
    public static native void SetObjectShapeCylinder( int objID, int axis, float height, float diameter );
    public static native void SetObjectShapeCone( int objID, int axis );
    public static native void SetObjectShapeCone( int objID, int axis, float height, float diameter );
    public static native void SetObjectShapeCapsule( int objID, int axis );
    public static native void SetObjectShapeCapsule( int objID, int axis, float sizeX, float sizeY, float sizeZ );
    public static native void SetObjectShapeCapsule( int objID, int axis, int vectorID );
    public static native void SetObjectShapeConvexHull( int objID );
    public static native void SetObjectShapeStaticPolygon( int objID );
    public static native void SetObjectShapeCompound( int objID );

    //RigidBodies
    public static native void Create3DPhysicsDynamicBody( int objID );
    public static native void Create3DPhysicsStaticBody( int objID );
    public static native void Create3DPhysicsKinematicBody( int objID ); 
    public static native void Delete3DPhysicsBody( int objID );
    public static native int Create3DPhysicsStaticPlane ( float normlX, float normalY, float normalZ, float offsetPosition );
    public static native void Set3DPhysicsStaticPlanePosition( int planeID, float posX, float posY, float posZ );
    public static native void Set3DPhysicsStaticPlaneRotation( int planeID, float angX, float angY, float angZ );
    public static native void Delete3DPhysicsStaticPlane( int planeID );
    public static native void SetObject3DPhysicsGroupAndMask( int objID, int group, int mask );
    public static native int GetObject3DPhysicsGroup( int objID );
    public static native int GetObject3DPhysicsMask( int objID );
    public static native void SetObject3DPhysicsCanSleep( int objID, int canSleep );
    public static native void SetObject3DPhysicsMass( int objID, float mass );
    public static native float GetObject3DPhysicsMass( int objID );
    public static native void SetObject3DPhysicsFriction( int objID, float friction );
    public static native float GetObject3DPhysicsFriction( int objID );
    public static native void SetObject3DPhysicsRollingFriction( int objID, float friction );
    public static native float GetObject3DPhysicsRollingFriction( int objID );
    public static native void SetObject3DPhysicsAnisotropicFriction( int objID, int type );
    public static native void SetObject3DPhysicsMaxLinearVelocity( int objID, float maxLinearVelocity );
    public static native float GetObject3DPhysicsMaxLinearVelocity( int objID );
    public static native void SetObject3DPhysicsLinearVelocity( int objID, float dirX, float dirY, float dirZ, float initialSpeed );
    public static native void SetObject3DPhysicsLinearVelocity( int objID, int vectorID, float initialSpeed );
    public static native float GetObject3DPhysicsLinearVelocityX( int objID );
    public static native float GetObject3DPhysicsLinearVelocityY( int objID );
    public static native float GetObject3DPhysicsLinearVelocityZ( int objID );
    public static native void SetObject3DPhysicsAngularVelocity( int objID, float angX, float angY, float angZ, float initialSpeed );
    public static native void SetObject3DPhysicsAngularVelocity( int objID, int vectorID, float initialSpeed );
    public static native float GetObject3DPhysicsAngularVelocityX( int objID );
    public static native float GetObject3DPhysicsAngularVelocityY( int objID );
    public static native float GetObject3DPhysicsAngularVelocityZ( int objID );
    public static native void SetObject3DPhysicsDamping( int objID, float linearDamp, float angularDamp );
    public static native float GetObject3DPhysicsLinearDamp( int objID );
    public static native float GetObject3DPhysicsAngularDamp( int objID );
    public static native void SetObject3DPhysicsSleepingThreshold( int objID, float angular, float linear );
    public static native float GetObject3DPhysicsAngularSleepingThreshold( int objID );
    public static native float GetObject3DPhysicsLinearSleepingThreshold( int objID );
    public static native void SetObject3DPhysicsDeactivationTime( int objID, float time );
    public static native void SetObject3DPhysicsRestitution( int objID, float friction);
    public static native float GetObject3DPhysicsRestitution(  int objID );

    //ContactReports
    public static native int GetObject3DPhysicsFirstContact( int objID ); 
    public static native float GetObject3DPhysicsContactX(); 
    public static native float GetObject3DPhysicsContactY(); 
    public static native float GetObject3DPhysicsContactZ(); 
    public static native int GetObject3DPhysicsContactVector( int outPosVec3 );
    public static native int GetObject3DPhysicsContactObjectB();
    public static native int GetObject3DPhysicsNextContact();
    public static native int GetObjects3DPhysicsContactPositionVector( int objA, int objB, int outPosVec3 );

    //Joints/
    public static native int Create3DPhysicsPickJoint( int objID, int positionVec3 );
    public static native void Update3DPhysicsPickJoint( int jointID, int positionVec3 );
    public static native void Delete3DPhysicsPickJoint( int jointID );
    public static native int Create3DPhysicsHingeJoint( int objA, int objB, int positionVec3, int rotationVec3, int disableCollisions );
    public static native int Create3DPhysicsConeTwistJoint( int objA, int objB, int positionVec3, int rotationVec3, int disableCollisions );
    public static native int Create3DPhysicsSliderJoint( int objA, int objB, int positionVec3, int rotationVec3 );
    public static native int Create3DPhysicsFixedJoint( int objA, int objB, int positionVec3 );
    public static native int Create3DPhysics6DOFJoint( int objA, int objB, int positionVec3, float rotationVec3 );
    public static native void Set3DPhysicsJointSliderAngularLimits( int jointID, float lowerLimit, float upperLimit );
    public static native void Set3DPhysicsJointSliderLinearLimits( int jointID, float lowerLimit, float upperLimit );
    public static native void Set3DPhysicsJointConeTwistLimits( int jointID, float swingSpan1, float swingSpan2, float twistSpan );
    public static native void Set3DPhysicsJointHingeLimits( int jointID, float minAng, float maxAng );
    public static native void Set3DPhysicsJointBreakingThreshold( int jointID, float breakThreshold );
    public static native void Set3DPhysicsJointEnabled( int jointID, int isEnabled );
    public static native int Get3DPhysicsJointEnabled( int jointID );
    public static native int Get3DPhysicsJointPositionVector( int jointID );
    public static native int Get3DPhysicsJointRotationVector( int jointID );
    public static native void Delete3DPhysicsJoint( int jointID );

    //Joint Motors
    public static native void Set3DPhysicsHingeJointMotorIsEnabled( int jointID, int isEnabled );
    public static native void Set3DPhysicsHingeJointMaxMotorImpulse( int jointID, float maxImpulse );
    public static native void Set3DPhysicsHingeJointMotorVelocity( int jointID, float targetVelocity );
    public static native void Set3DPhysicsTwistJointMotorIsEnabled( int jointID, int isEnabled );
    public static native void Set3DPhysicsTwistJointMaxMotorImpulse( int jointID, float maxImpulse );
    public static native void Set3DPhysicsTwistJointMotorRotationTarget( int jointID, int rotationVec3ID );
    public static native void Set3DPhysicsSliderJointPoweredLinearMotorIsEnabled( int jointID, int isEnabled );
    public static native void Set3DPhysicsSliderJointMaxLinearMotorForce( int jointID, float maxLinearForce );
    public static native void Set3DPhysicsSliderJointTargetLinearMotorVelocity( int jointID, float linearMotorVelocity );

    //CompoundCollisionShapes/
    public static native void AddObjectShapeBox( int objID, int positionVec3, int rotationVec3, int sizeVec3 );
    public static native void AddObjectShapeSphere( int objID, int positionVec3, float diameter );
    public static native void AddObjectShapeCapsule( int objID, int positionVec3, int rotationVec3, int sizeVec3, int axis );
    public static native void AddObjectShapeCone( int objID, int positionVec3, int rotationVec3, int sizeVec3, int axis);
    public static native void AddObjectShapeCylinder( int objID, int positionVec3, int rotationVec3, int sizeVec3, int axis);

    //SavingAndLoading/
    public static native int SaveObjectShape( int objID, String fileName );
    public static native int LoadObjectShape( int objID, String fileName );

    //Vector commands
    public static native int CreateVector3();
    public static native int CreateVector3( float x, float y, float z );
    public static native void SetVector3( int vectorID, float x, float y, float z );
    public static native void DeleteVector3( int vectorID );
    public static native float GetVector3X( int vectorID );
    public static native float GetVector3Y( int vectorID );
    public static native float GetVector3Z( int vectorID );
    public static native float GetVector3Distance( int vectorU, int vectorV );
    public static native float GetVector3Length( int vectorID );
    public static native float GetVector3Dot( int vectorU, int vectorV );
    public static native void GetVector3Cross( int resultVec, int vectorU, int vectorV );
    public static native void GetVector3Multiply( int resultVec, float multiplier );
    public static native void GetVector3Add( int resultVec, int addVec );


    //RayCasting/
    public static native int Create3DPhysicsRay();
    public static native void Delete3DPhysicsRay( int rayID );
    public static native int Ray3DPhysicsExist( int rayID );
    public static native void RayCast3DPhysics( int rayID, int fromVec3ID, int toVec3ID, int allOrClosest );
    public static native int RayCast3DPhysicsObject( int objID, int rayID, int fromVec3ID, int toVec3ID, int allOrClosest );
    public static native int Get3DPhysicsRayCastObjectHit( int rayID, float fractionIndex );
    public static native int Get3DPhysicsRayCastClosestObjectHit( int rayID );
    public static native float Get3DPhysicsRayCastFraction( int rayID );
    public static native int Get3DPhysicsRayCastContactPosition( int rayID, float fractionIndex, int outVec3ID );
    public static native int Get3DPhysicsRayCastClosestContactPosition( int rayID, int outVec3ID );
    public static native void Get3DPhysicsRayCastNormalVector( int rayID, int returnVec3ID );
    public static native int Get3DPhysicsRayCastNumHits( int rayID );
    public static native void SphereCast3DPhysics( int rayID, int fromVec3ID, int toVec3ID, float radius );
    public static native int SphereCast3DPhysicsObject( int objID, int rayID, int fromVec3ID, int toVec3ID, float radius );

    //CharacterController/
    public static native void Create3DPhysicsCharacterController( int objID, int axis, int objOffsetVec3, int objOrientationVec3, float crouchScale );
    public static native void Delete3DPhysicsCharacterController( int objID );
    public static native int Get3DPhysicsCharacterControllerExists( int objID );
    public static native void Set3DPhysicsCharacterControllerGravity( int objID, float gravity );
    public static native void Set3DPhysicsCharacterControllerFallSpeed( int objID, float fallSpeed );
    public static native void Set3DPhysicsCharacterControllerJumpSpeed( int objID, float jumpSpeed );
    public static native void Set3DPhysicsCharacterControllerMaxSlope( int objID, float maxSlopeDegress );
    public static native void Set3DPhysicsCharacterControllerStepHeight( int objID, float stepHeight );
    public static native float Get3DPhysicsCharacterControllerMaxSlope( int objID );
    public static native float Get3DPhysicsCharacterControllerGravity( int objID );
    public static native void Move3DPhysicsCharacterController( int objID, int direction, float velocity );
    public static native void Move3DPhysicsCharacterController( int objID, float x, float z, float velocity );
    public static native void Rotate3DPhysicsCharacterController( int objID, float angle );
    public static native void Jump3DPhysicsCharacterController( int objID );
    public static native void Crouch3DPhysicsCharacterController( int objID );
    public static native void Stand3DPhysicsCharacterController( int objID );
    public static native void Debug3DPhysicsCharacterController( int objID, int isDebug );
    public static native void Set3DPhysicsCharacterControllerPosition( int objID, float posX, float posY, float posZ );

    //Ragdoll/
    public static native void Create3DPhysicsRagDoll( int objID, float objTotalWeight );
    public static native int Add3DPhysicsRagDollBone( int startBoneID, int endBoneID, float diameter, int collisionGroup, int collisionMask );
    public static native void AssignTo3DPhysicsRagDollBoneObjectBone( int ragdollBoneID, int objBoneID );
    public static native void Add3DPhysicsRagDollHingeJoint( int boneAID, int boneBID, int objBoneID, int jointRotationVec3, float minLimit, float maxLimit );
    public static native void Add3DPhysicsRagDollTwistJoint( int boneAID, int boneBID, int objBoneID, int jointRotationVec3, int limitsVec3 );
    public static native void Finalize3DPhysicsRagDoll();
    public static native void Delete3DPhysicsRagdoll( int objID );
    public static native int Get3DPhysicsRagdollExist( int objID );
    public static native int Get3DPhysicsRagdollFromBoneObject( int objID );
    public static native int Is3dPhysicsRagdollStatic( int objID );
    public static native void Set3DphysicsRagdollStatic( int objID, int isStatic );
    public static native void Set3DPhysicsRagdollBonesVisible( int objID, int isVisible );
    public static native void Set3DPhysicsRagdollDamping( float linear, float angular );
    public static native void Set3DPhysicsRagdollSleepingThresholds( float linear, float angular );
    public static native void Set3DPhysicsRagdollDeactivationTime( float time );
    public static native void Set3DPhysicsRagdollDeactivation( int objID, int isDisabled );


    // AR
    public static native void ARSetup();
    public static native int ARGetStatus();
    public static native void ARUpdateInternal();
    public static native void ARPause();
    public static native void ARResume();
    public static native void ARDestroy();
    public static native void ARControlCamera();
    public static native void ARDrawBackground();
    public static native void ARSetPlaneDetectionMode( int mode );
    public static native void ARSetLightEstimationMode( int mode );

    public static native float ARGetLightEstimate();

    public static native int ARHitTest( float screenX, float screenY );
    public static native float ARGetHitTestX( int index );
    public static native float ARGetHitTestY( int index );
    public static native float ARGetHitTestZ( int index );
    public static native float ARGetHitTestNormalX( int index );
    public static native float ARGetHitTestNormalY( int index );
    public static native float ARGetHitTestNormalZ( int index );
    public static native int ARGetHitTestType( int index );
    public static native void ARHitTestFinish();

    public static native int ARGetPlanes( int reserved );
    public static native float ARGetPlaneX( int index );
    public static native float ARGetPlaneY( int index );
    public static native float ARGetPlaneZ( int index );
    public static native float ARGetPlaneAngleX( int index );
    public static native float ARGetPlaneAngleY( int index );
    public static native float ARGetPlaneAngleZ( int index );
    public static native float ARGetPlaneSizeX( int index );
    public static native float ARGetPlaneSizeZ( int index );
    public static native void ARGetPlanesFinish();

    public static native int ARCreateAnchorFromHitTest( int index );
    public static native int ARCreateAnchorFromPlane( int index );
    public static native void ARFixObjectToAnchor( int objID, int anchorID );
    public static native int ARGetAnchorStatus( int anchorID );
    public static native void ARDeleteAnchor( int anchorID );
}