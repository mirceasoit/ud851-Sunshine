/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // COMPLETED (1) Create a field to store the weather display TextView
    TextView tvWeatherData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        // COMPLETED (2) Use findViewById to get a reference to the weather display TextView
        tvWeatherData = (TextView) findViewById(R.id.tv_weather_data);

        // COMPLETED (3) Create an array of Strings that contain fake weather data
        String [] weatherConditions = {"Today, November 12 - Sunny - 1°C / 10°C",
                                       "Tomorrow, November 13 - Rain - 5°C / 12°C",
                                       "Tuesday, November 14 - Cloudy - 3°C / 9°C"};

        // COMPLETED (4) Append each String from the fake weather data array to the TextView
        for(String weatherCondition : weatherConditions) {
            tvWeatherData.append(weatherCondition + "\n\n\n");
        }
    }
}