package org.example.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.example.dto.Result;
import org.example.service.ProvinceService;
import org.example.vo.ProvinceVo;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author fdrama
 * @date 2022/04/02
 **/
@Service
@Component
public class ProvinceServiceImpl implements ProvinceService {

    @Override
    public Result<List<ProvinceVo>> getAllProvinceList() {
        Result<List<ProvinceVo>> result = new Result<>();
        result.fail("dubbo", "");
        return result;
    }
}
