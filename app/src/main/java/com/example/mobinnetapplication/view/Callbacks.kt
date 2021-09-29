package com.example.mobinnetapplication.view

interface Callbacks {
    fun openSignUpFragment()
    fun openMainCloudySpaceFragment()
    fun openLayoutCategoryFragment(requestCode:Int,tag:String)
    fun openItemCameraFragment(tag:String)
}