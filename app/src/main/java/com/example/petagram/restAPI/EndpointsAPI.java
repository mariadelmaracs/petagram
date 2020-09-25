package com.example.petagram.restAPI;

import com.example.petagram.model.PetResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface EndpointsAPI {

    @GET(ConstantsRestApi.URL_USER_MEDIA)
    Call<PetResponse> getRecentMedia();
}
