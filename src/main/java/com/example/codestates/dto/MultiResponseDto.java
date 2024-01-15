package com.example.codestates.dto;

import org.springframework.data.domain.Page;

import java.util.List;

public class MultiResponseDto<T> {

    private List<T>  data;
    private Pageinfo pageinfo;

    public MultiResponseDto(List<T> data, Page page){
        this.data =data;
        this.pageinfo = new Pageinfo(page.getNumber() + 1, page.getSize(), page.getTotalElements(), page.getTotalPages());
    }

}
