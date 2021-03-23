package com.zpp.lsp.service;

import com.zpp.lsp.pojo.ProcessMethod;

/**
 * @Author: 张平平
 * @Date: 2021/3/22 17:59
 */
public interface ProcessMethodService {
    ProcessMethod getProcessMethodById(String methodId);

    void saveProcessMethod(ProcessMethod processMethod);

    void updateProcessMethodById(ProcessMethod processMethod);

    void deleteProcessMethodById(String methodId);
}
