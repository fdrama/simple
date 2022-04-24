package org.example.service;

import org.example.dto.Result;
import org.example.vo.ProvinceVo;

import java.util.List;

/**
 * @author fdrama
 * @date 2022/04/02
 **/
public interface ProvinceService {

    /**
     * 查询所有省份信息
     *
     * @return 省份信息列表
     */
    Result<List<ProvinceVo>> getAllProvinceList();
}
