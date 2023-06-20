package com.kodilla.psychoterapeutic_clinic_bckend.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Currency {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "USD_EXCHANGE_RATE")
    private long usd;

    @Column(name = "EUR_EXCHANGE_RATE")
    private long eur;

    @Column(name = "GBP_EXCHANGE_RATE")
    private long gpb;

}
