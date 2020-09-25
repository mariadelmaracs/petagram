package com.example.petagram.restAPI.adapter;

import com.example.petagram.model.PetResponse;
import com.example.petagram.restAPI.ConstantsRestApi;
import com.example.petagram.restAPI.EndpointsAPI;
import com.example.petagram.restAPI.deserializador.PetDeserializador;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestApiAdapter {

    public EndpointsAPI stablishConnectionRestAPInstagram(Gson gson) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ConstantsRestApi.ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        return retrofit.create(EndpointsAPI.class);
    }

    public Gson buildGsonDeserializeMediaRecent() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(PetResponse.class, new PetDeserializador());
        return gsonBuilder.create();
    }
}
