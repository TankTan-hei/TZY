package com.xyj.test01.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private String username;
}
