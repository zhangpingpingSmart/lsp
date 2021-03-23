package com.zpp.lsp.pojo.make;

import com.zpp.lsp.pojo.GoodsFormat;
import com.zpp.lsp.pojo.GoodsPicture;
import com.zpp.lsp.pojo.ProcessMethod;

import java.util.Date;
import java.util.List;

/**
 * @Author: 张平平
 * @Date: 2021/3/23 15:14
 * 商品信息组合实体
 */
public class GoodsMake {
    private Long goodsId;
    private String goodsName;
    private Long categoryId;
    private String goodsAs;
    private String goodsLabel;
    private String goodsBrand;
    private String goodsDesc;
    private Integer goodsSeq;
    private String goodsRremark;
    private Date createTime;
    private String storeName;
    private String storeAddr;
    private List<GoodsFormat> goodsFormatList;
    private List<GoodsPicture> goodsPictureList;
    private List<ProcessMethod> processMethodList;
}
