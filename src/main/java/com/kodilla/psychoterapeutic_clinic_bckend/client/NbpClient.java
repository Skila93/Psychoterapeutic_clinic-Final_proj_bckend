package com.kodilla.psychoterapeutic_clinic_bckend.client;

import com.kodilla.psychoterapeutic_clinic_bckend.domain.UsdResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
@RequiredArgsConstructor
public class NbpClient {

    private final RestTemplate restTemplate;

    @Value("${nbp.api.endpoint.prod}")
    private String nbpApiEndpoint;

    @Value("${nbp.api.usd.path}")
    private String usdGetPath;

    public List<UsdResponseDto> getUSD(){
        UsdResponseDto[] usdResponse = restTemplate
                .getForObject(
                        nbpApiEndpoint + usdGetPath, UsdResponseDto[].class);
        return Arrays.stream(usdResponse).toList();
    }
}