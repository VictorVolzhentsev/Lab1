package com.example.lab1.service;

import com.example.lab1.model.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Qualifier("modifyUid")
public class ModifyUid implements ModifyService {
    @Override
    public Response modify(Response response) {
        response.setUid("1234567890");
        return response;
    }
}