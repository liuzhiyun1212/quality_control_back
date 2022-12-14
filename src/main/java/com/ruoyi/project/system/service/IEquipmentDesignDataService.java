package com.ruoyi.project.system.service;

import java.util.List;
import com.ruoyi.project.system.domain.EquipmentDesignData;
import com.ruoyi.project.system.domain.ProductDesign;

/**
 * 装备设计/改型数据Service接口
 * 
 * @author ruoyi
 * @date 2022-11-10
 */
public interface IEquipmentDesignDataService 
{
    /**
     * 查询装备设计/改型数据
     * 
     * @param id 装备设计/改型数据主键
     * @return 装备设计/改型数据
     */
    public EquipmentDesignData selectEquipmentDesignDataById(Long id);

    /**
     * 查询装备设计/改型数据列表
     * 
     * @param equipmentDesignData 装备设计/改型数据
     * @return 装备设计/改型数据集合
     */
    public List<EquipmentDesignData> selectEquipmentDesignDataList(EquipmentDesignData equipmentDesignData);

    /**
     * 新增装备设计/改型数据
     * 
     * @param equipmentDesignData 装备设计/改型数据
     * @return 结果
     */
    public int insertEquipmentDesignData(EquipmentDesignData equipmentDesignData);

    /**
     * 修改装备设计/改型数据
     * 
     * @param equipmentDesignData 装备设计/改型数据
     * @return 结果
     */
    public int updateEquipmentDesignData(EquipmentDesignData equipmentDesignData);

    /**
     * 批量删除装备设计/改型数据
     * 
     * @param ids 需要删除的装备设计/改型数据主键集合
     * @return 结果
     */
    public int deleteEquipmentDesignDataByIds(Long[] ids);

    /**
     * 删除装备设计/改型数据信息
     * 
     * @param id 装备设计/改型数据主键
     * @return 结果
     */
    public int deleteEquipmentDesignDataById(Long id);
    /**
     * 导入产品设计数据
     *
     * @param importDataList 数据列表
     * @param isUpdateSupport 是否更新支持，如果已存在，则进行更新数据
     * @param operName 操作用户
     * @return 结果
     */
    public String importData(List<EquipmentDesignData> importDataList, Boolean isUpdateSupport, String operName);
}
