package com.bwanaian.config;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum lang {
    INDONESIAN("Indonesian","id");


    private final String name;
    private final String code;

    public String toString(){
        return name;
    }

    public String getCode(){
        return code;
    }
}
