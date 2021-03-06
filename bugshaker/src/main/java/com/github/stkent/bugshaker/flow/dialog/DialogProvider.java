/*
 * Copyright 2016 Stuart Kent
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.github.stkent.bugshaker.flow.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import androidx.annotation.NonNull;

public interface DialogProvider {

    /**
     * @param activity the Activity that will present this dialog
     * @param reportBugClickListener a listener that implementations must invoke when the user confirms that they would
     *                               like to submit a bug report
     * @return a fully configured AlertDialog instance.
     */
    @NonNull
    Dialog getAlertDialog(
            @NonNull Activity activity,
            @NonNull DialogInterface.OnClickListener reportBugClickListener);

}
