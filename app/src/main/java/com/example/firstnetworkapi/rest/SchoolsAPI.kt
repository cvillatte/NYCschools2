package com.example.firstnetworkapi.rest

import com.example.firstnetworkapi.model.SchoolsItem
import com.example.firstnetworkapi.model.domain.Schools
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET

interface SchoolsAPI {

    @GET(SAT_SCORES)
    fun retrieveSchools(): Single<List<SchoolsItem>

}