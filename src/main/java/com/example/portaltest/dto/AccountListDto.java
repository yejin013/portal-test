package com.example.portaltest.dto;

import lombok.Getter;

import java.util.List;

@Getter
public class AccountListDto {
    List<AccountDto> list;

    public AccountListDto(List<AccountDto> list) {
        this.list = list;
    }
}
