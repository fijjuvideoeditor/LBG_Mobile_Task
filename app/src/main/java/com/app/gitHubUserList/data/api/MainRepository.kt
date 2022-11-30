package com.app.gitHubUserList.data.api

import javax.inject.Inject


class MainRepository @Inject constructor (private val apiHelper: ApiHelperImpl) {

    suspend fun getUserList() = apiHelper.getUserList()

}