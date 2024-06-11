package com.api_master.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.api_master.api_mastercommon.model.entity.UserInterfaceInfo;

import java.util.List;

/**
 * 用户接口信息 Mapper
 *
 */
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}




