package com.davidorellana.logincomposeretrofit2.network.repository

import com.davidorellana.logincomposeretrofit2.network.dto.LoginDto
import com.davidorellana.logincomposeretrofit2.network.dto.TokenDto
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthApiService {

    @POST("auth")
    suspend fun getLogin(@Body loginDto: LoginDto) : Response<TokenDto>
}