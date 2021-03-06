/*
 * Copyright 2014 Vitaly Litvak (vitavaque@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.traccar.web.client.i18n;

public interface Messages extends com.google.gwt.i18n.client.Messages {
    String authentication();

    String user();

    String password();

    String login();

    String register();

    String save();

    String cancel();

    String globalSettings();

    String registration();

    String updateInterval();

    String device();

    String archive();

    String from();

    String to();

    String load();

    String clear();

    String valid();

    String time();

    String latitude();

    String longitude();

    String altitude();

    String speed();

    String course();

    String power();

    String name();

    String uniqueIdentifier();

    String devices();

    String add();

    String edit();

    String remove();

    String settings();

    String account();

    String preferences();

    String users();

    String global();

    String logout();

    String follow();

    String state();

    String attribute();

    String value();

    String address();

    String administrator();

    String map();

    String speedUnits();

    String error();

    String errNoResults();

    String errFillFields();

    String errDeviceExists();

    String errUsernameTaken();

    String confirm();

    String confirmUserRemoval();

    String errUsernameOrPasswordEmpty();

    String errInvalidUsernameOrPassword();

    String confirmDeviceRemoval();

    String errRemoteCall();

    String recordTrace();

    String timePrintInterval();

    String trackerServerLog();

    String refresh();

    String close();

    String logSize();

    String defaultMapState();

    String zoom();

    String takeFromMap();

    String day();

    String hour();

    String minute();

    String second();

    String ago(String dateTimeString);

    String meter();

    String manager();

    String share();

    String deviceTimeout();

    String offline();

    String since(String dateTimeString);

    String idle();

    String disallowDeviceManagementByUsers();

    String idleWhenSpeedIsLE();

    String distance();

    String exportToCSV();

    String exportToGPX();

    String changePassword();

    String enterNewPassword(String p0);

    String importData();

    String fileToImport();

    String log();

    String importingData();

    String defaultHashImplementation();

    String filter();

    String hideZeroCoordinates();

    String hideInvalidLocations();

    String hideDuplicates();

    String ignoreLocationsWithDistanceFromPreviousLT();

    String disableFilter();

    String server();

    String port();

    String secureConnectionType();

    String useAuthorization();

    String test();

    String notifications();

    String notificationSettings();

    String testFailed();

    String testSucceeded();

    String email();

    String invalidEmail();

    String fromAddress();

    String style();

    String fullPalette();

    String smallPalette();

    String markers();

    String standardMarkers();

    String reducedMarkers();

    String zoomToTrack();

    String exportData();

    String errNoDeviceNameOrId();

    String eventRecordingEnabled();

    String language();

    String readOnly();

    String protocol();
}
