package com.wayn.admin.api.domain.shop;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.wayn.common.base.ShopBaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 商品参数表
 * </p>
 *
 * @author wayn
 * @since 2020-07-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class GoodsAttribute extends ShopBaseEntity implements Serializable {

    private static final long serialVersionUID = 5794705846831493502L;

    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 商品表的商品ID
     */
    private Integer goodsId;

    /**
     * 商品参数名称
     */
    private String attribute;

    /**
     * 商品参数值
     */
    private String value;

    /**
     * 删除标志（0代表存在 1代表删除）
     */
    private Boolean delFlag;


}