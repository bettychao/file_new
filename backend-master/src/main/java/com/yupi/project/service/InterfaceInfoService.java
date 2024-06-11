package com.api_master.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.api_master.api_mastercommon.model.entity.InterfaceInfo;

/**
 * 接口信息服务
 *
 *
 */
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
