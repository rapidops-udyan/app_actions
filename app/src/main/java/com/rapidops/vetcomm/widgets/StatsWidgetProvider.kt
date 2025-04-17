/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.rapidops.vetcomm.widgets

import StatsWidget
import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.os.Build


/**
 * Implementation of App Widget functionality.
 */
class StatsWidgetProvider : AppWidgetProvider() {
    override fun onUpdate(
        context: Context,
        appWidgetManager: AppWidgetManager,
        appWidgetIds: IntArray
    ) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            for (appWidgetId in appWidgetIds) {

                val currentWidget = StatsWidget(
                    context,
                    appWidgetManager,
                    appWidgetId,
                    com.rapidops.vetcomm.R.layout.stats_widget
                )

                currentWidget.updateAppWidget()
            }

        }
    }
}

