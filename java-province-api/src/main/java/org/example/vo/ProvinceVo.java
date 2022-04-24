package org.example.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author fdrama
 * @date 2022/04/02
 **/
@Data
public class ProvinceVo implements Serializable {


    private static final long serialVersionUID = -4295367930589042590L;

    private Integer provinceId;

    private String provinceName;

    private String provinceCode;

}
