package com.frogobox.app.core

import android.app.Application
import com.frogobox.sdk.view.FrogoViewModel


/*
 * Created by faisalamir on 17/04/22
 * JuaraAndroid
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) 2022 Frogobox Media Inc.      
 * All rights reserved
 *
 */

abstract class BaseViewModel(
    private val context: Application
) : FrogoViewModel(context) {


}