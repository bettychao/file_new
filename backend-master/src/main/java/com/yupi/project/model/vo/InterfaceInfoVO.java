package com.api_master.project.model.vo;

import com.api_master.api_mastercommon.model.entity.InterfaceInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 接口信息封装视图
 *
 *
 * @TableName product
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class InterfaceInfoVO extends InterfaceInfo {

    /**
     * 调用次数
     */
    private Integer totalNum;

    private static final long serialVersionUID = 1L;
}