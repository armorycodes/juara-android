/*
 * Created by faisalamir on 19/09/21
 * FrogoRecyclerView
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) 2021 FrogoBox Inc.
 * All rights reserved
 *
 */

object ProjectSetting {

    // ---------------------------------------------------------------------------------------------

    // Project settings
    const val NAME_APP = "JuaraAndroid"

    const val APP_DOMAIN = "com"
    const val APP_PLAY_CONSOLE = "frogobox"
    const val APP_NAME = "juaraandroid"

    const val VERSION_MAJOR = 1
    const val VERSION_MINOR = 0
    const val VERSION_PATCH = 0
  
    // ---------------------------------------------------------------------------------------------

    // Key Store
    const val PLAYSTORE_STORE_FILE = "frogoboxmedia.jks"
    const val PLAYSTORE_STORE_PASSWORD = "amirisback"
    const val PLAYSTORE_KEY_ALIAS = "frogoisback"
    const val PLAYSTORE_KEY_PASSWORD = "amirisback"

    // ---------------------------------------------------------------------------------------------
    // Default Setting - Do Not Change
    // ---------------------------------------------------------------------------------------------

    const val PROJECT_COMPILE_SDK = 31
    const val PROJECT_MIN_SDK = 21
    const val PROJECT_TARGET_SDK = PROJECT_COMPILE_SDK

    // ---------------------------------------------------------------------------------------------

    const val MODULE_CORE_PROJECT = "coreproject"
    const val MODULE_DATA_PRESISTANCE = "datapresistence"
    const val MODULE_INTERNET = "internet"
    const val MODULE_KOTLIN_BASICS = "kotlinbasics"
    const val MODULE_LAYOUTS = "layouts"
    const val MODULE_NAVIGATION = "navigation"
    const val MODULE_WORK_MANAGER = "workmanager"

    const val PROJECT_APP_ID = "$APP_DOMAIN.$APP_PLAY_CONSOLE.$APP_NAME"
    const val PROJECT_MODULE_CORE_PROJECT = "$PROJECT_APP_ID.$MODULE_CORE_PROJECT"
    const val PROJECT_MODULE_DATA_PRESISTANCE = "$PROJECT_APP_ID.$MODULE_DATA_PRESISTANCE"
    const val PROJECT_MODULE_INTERNET = "$PROJECT_APP_ID.$MODULE_INTERNET"
    const val PROJECT_MODULE_KOTLIN_BASICS = "$PROJECT_APP_ID.$MODULE_KOTLIN_BASICS"
    const val PROJECT_MODULE_LAYOUTS = "$PROJECT_APP_ID.$MODULE_LAYOUTS"
    const val PROJECT_MODULE_NAVIGATION = "$PROJECT_APP_ID.$MODULE_NAVIGATION"
    const val PROJECT_MODULE_WORK_MANAGER = "$PROJECT_APP_ID.$MODULE_WORK_MANAGER"

    const val PROJECT_VERSION_CODE = (VERSION_MAJOR * 100) + (VERSION_MINOR * 10) + (VERSION_PATCH * 1)
    const val PROJECT_VERSION_NAME = "$VERSION_MAJOR.$VERSION_MINOR.$VERSION_PATCH"

    // ---------------------------------------------------------------------------------------------

    // Declaration apps name debug mode
    const val DEBUG_ATTRIBUTE = "Development"
    const val NAME_APP_DEBUG = "$NAME_APP $DEBUG_ATTRIBUTE"

    // Constant Variable
    val NAME_APK = NAME_APP.toLowerCase().replace(" ", "-")
    val NAME_SETTING_LOWERCASE = NAME_APP.toLowerCase().replace(" ", "_")
    val NAME_SETTING_UPERCASE = NAME_APP.toUpperCase().replace(" ", "_")
    val DB = "db_$NAME_SETTING_LOWERCASE.db"
    val PREF_NAME = "PREF_GAME_$NAME_SETTING_UPERCASE"

    // Declaration admob id for debug
    const val DEBUG_ADMOB_APP_ID = "ca-app-pub-3940256099942544~3347511713"

}
