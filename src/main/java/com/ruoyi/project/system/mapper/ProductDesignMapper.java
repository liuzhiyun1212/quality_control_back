package com.ruoyi.project.system.mapper;

import java.util.List;
import com.ruoyi.project.system.domain.ProductDesign;
import com.ruoyi.project.system.domain.install_way;
import com.ruoyi.project.system.domain.partsSite;

/**
 * 成品件设计数据Mapper接口
 *
 * @author ruoyi
 * @date 2022-11-11
 */
public interface ProductDesignMapper
{
    /**
     * 查询成品件设计数据
     *
     * @param id 成品件设计数据主键
     * @return 成品件设计数据
     */
    public ProductDesign selectProductDesignById(Long id);


    /**
     * 统计成品件的安装位置和该位置上成品件安装的数量
     *
     *
     * @return
     */
    public List<partsSite> selectPartsSite();
//4.2.1.11
    public List<partsSite> selectPartsSitenum();
    //4.2.1.12
    public List<ProductDesign> selectPartsinstall();

    public List<partsSite> selectPartsqulitynum();


    public List<partsSite> selectPartsinstallnum();

    public List<install_way> selectinstallmethod();
    /**
     * 查询成品件设计数据列表
     *
     * @param productDesign 成品件设计数据
     * @return 成品件设计数据集合
     */
    public List<ProductDesign> selectProductDesignList(ProductDesign productDesign);

    /**
     * 新增成品件设计数据
     *
     * @param productDesign 成品件设计数据
     * @return 结果
     */
    public int insertProductDesign(ProductDesign productDesign);

    /**
     * 修改成品件设计数据
     *
     * @param productDesign 成品件设计数据
     * @return 结果
     */
    public int updateProductDesign(ProductDesign productDesign);

    /**
     * 删除成品件设计数据
     *
     * @param id 成品件设计数据主键
     * @return 结果
     */
    public int deleteProductDesignById(Long id);

    /**
     * 批量删除成品件设计数据
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteProductDesignByIds(Long[] ids);
}
