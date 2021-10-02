package com.example.mobinnetapplication.view

interface Callbacks {
    fun openLayoutCategoryFragment(requestCode:Int,tag:String)
    fun openItemCameraFragment(tag:String)
    fun openFragment(desId:Int)
    fun itemVisibility(itemId:Int)
}