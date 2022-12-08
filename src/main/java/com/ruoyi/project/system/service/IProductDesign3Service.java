package com.ruoyi.project.system.service;

import java.util.List;

import com.ruoyi.project.system.domain.MethodQuality;
import com.ruoyi.project.system.domain.ProductDesign3;

/**
 * 成品件设计数据Service接口
 *
 * @author ruoyi
 * @date 2022-11-10
 */
public interface IProductDesign3Service
{
    /**
     * 查询成品件设计数据
     *
     * @param id 成品件设计数据主键
     * @return 成品件设计数据
     */
    public ProductDesign3 selectProductDesign3ById(Long id);



    public List<MethodQuality> selectMethodQuality();

    /**
     * 查询成品件设计数据列表
     *
     * @param productDesign3 成品件设计数据
     * @return 成品件设计数据集合
     */
    public List<ProductDesign3> selectProductDesign3List(ProductDesign3 productDesign3);

    /**
     * 新增成品件设计数据
     *
     * @param productDesign3 成品件设计数据
     * @return 结果
     */
    public int insertProductDesign3(ProductDesign3 productDesign3);

    /**
     * 修改成品件设计数据
     *
     * @param productDesign3 成品件设计数据
     * @return 结果
     */
    public int updateProductDesign3(ProductDesign3 productDesign3);

    /**
     * 批量删除成品件设计数据
     *
     * @param ids 需要删除的成品件设计数据主键集合
     * @return 结果
     */
    public int deleteProductDesign3ByIds(Long[] ids);

    /**
     * 删除成品件设计数据信息
     *
     * @param id 成品件设计数据主键
     * @return 结果
     */
    public int deleteProductDesign3ById(Long id);
}
