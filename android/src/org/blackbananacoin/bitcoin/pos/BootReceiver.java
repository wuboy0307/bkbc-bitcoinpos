/*
 * Copyright 2013 Y12STUDIO
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.blackbananacoin.bitcoin.pos;

import android.app.Activity;
import android.app.KeyguardManager;
import android.app.KeyguardManager.KeyguardLock;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootReceiver extends BroadcastReceiver {
	@Override
	public void onReceive(Context context, Intent intent) {

		if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {

			KeyguardManager keyguardManager = (KeyguardManager) context
					.getSystemService(Activity.KEYGUARD_SERVICE);
			KeyguardLock lock = keyguardManager
					.newKeyguardLock(Context.KEYGUARD_SERVICE);
			lock.disableKeyguard();

			Intent myIntent = new Intent(context, BitcoinPosActivity.class);

			myIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			context.startActivity(myIntent);
		}
	}

}
