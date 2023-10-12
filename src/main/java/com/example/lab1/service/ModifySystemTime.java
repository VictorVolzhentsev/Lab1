package com.example.lab1.service;

import com.example.lab1.model.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Qualifier("ModifySystemTime")
public class ModifySystemTime implements ModifyService {

    @Override
    public Response modify(Response response) {
        response.setSystemTime("");
        return response;
    }
}