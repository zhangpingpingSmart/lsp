package com.zpp.lsp.service.impl;

import com.zpp.lsp.mapper.ProcessMethodMapper;
import com.zpp.lsp.pojo.ProcessMethod;
import com.zpp.lsp.service.ProcessMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: 张平平
 * @Date: 2021/3/23 9:08
 */
@Service
public class ProcessMethodServiceImpl implements ProcessMethodService {

    @Autowired
    private ProcessMethodMapper processMethodMapper;

    @Override
    public ProcessMethod getProcessMethodById(String methodId) {
        return processMethodMapper.getProcessMethodById(methodId);
    }

    @Override
    public void saveProcessMethod(ProcessMethod processMethod) {
        processMethodMapper.insert(processMethod);
    }

    @Override
    public void updateProcessMethodById(ProcessMethod processMethod) {
        processMethodMapper.updateById(processMethod);
    }

    @Override
    public void deleteProcessMethodById(String methodId) {
        processMethodMapper.deleteProcessMethodById(methodId);
    }
}
