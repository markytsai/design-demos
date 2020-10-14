package com.example.templatedemo.enums;

import com.example.templatedemo.impl.ApProcess;
import com.example.templatedemo.impl.CenterProcess;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ProcessEnum {


    APP(1, ApProcess.class),
    Center(2, CenterProcess.class),
    ;

    private Integer id;

    private Class type;

}
