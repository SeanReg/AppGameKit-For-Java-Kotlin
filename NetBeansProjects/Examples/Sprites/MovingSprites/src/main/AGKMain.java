package main;

import com.thegamecreators.agk.AGKEntry;
import com.thegamecreators.agk.AGKLib;

/**
 *
 * @author Sean
 */
public class AGKMain extends AGKEntry {
	
	private int mCanMove = 0;
	private int mSprite = 0;

	private float mOrgX = 0.0f;
	private float mOrgY = 0.0f;
	private float mDirX = 0.0f;
	private float mDirY = 0.0f;
	private float mDistFromAtoB = 0.0f;

	@Override
	public void begin() {
		// set a virtual resolution of 320 x 480
		AGKLib.SetVirtualResolution(320, 480);

		AGKLib.CreateSprite(AGKLib.LoadImage(AGKLib.toAGKPath("background4.jpg")));
		mSprite = AGKLib.CreateSprite(AGKLib.LoadImage(AGKLib.toAGKPath("lime.png")));
	}

	@Override
	public void loop() {
		AGKLib.Print("Touch or click the screen to move the");
		AGKLib.Print("sprite to that location");

		if (AGKLib.GetPointerReleased() != 0) {
			float pX = AGKLib.GetPointerX();
			float pY = AGKLib.GetPointerY();

			if (mCanMove == 0) {
				++mCanMove;

				mOrgX = AGKLib.GetSpriteX(mSprite);
				mOrgY = AGKLib.GetSpriteY(mSprite);

				float distX = pX - mOrgX;
				float distY = pY - mOrgY;
				mDistFromAtoB = (float) Math.sqrt(Math.pow(distX, 2) + Math.pow(distY, 2));

				if (mDistFromAtoB != 0.0f) {
					mDirX = distX / mDistFromAtoB;
					mDirY = distY / mDistFromAtoB;
				}
			}
		}

		if (mCanMove > 0) {
			AGKLib.SetSpritePosition(mSprite, mOrgX + mDirX * mCanMove, mOrgY + mDirY * mCanMove);

			if (mCanMove < mDistFromAtoB) {
				mCanMove += 2;
			} else {
				mCanMove = 0;
			}
		}

		AGKLib.Sync();
	}

	@Override
	public void complete() {
	}
	
}
