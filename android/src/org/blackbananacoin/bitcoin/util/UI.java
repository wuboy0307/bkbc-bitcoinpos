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
package org.blackbananacoin.bitcoin.util;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import android.util.Log;

public class UI {

	private static final String ACTIVITY_TAG = "BKBC_BitCoinPOS";

	public static final long TimeDownloadInterval = 5 * 60 * 1000;

	public static final NumberFormat DFMT_2D = new DecimalFormat("#,###.##");

	public static void logd(String log) {
		Log.d(ACTIVITY_TAG, log);
	}

	public static void logv(String log) {
		Log.v(ACTIVITY_TAG, log);
	}

}