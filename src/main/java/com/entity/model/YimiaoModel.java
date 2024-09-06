package com.entity.model;

import com.entity.YimiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 疫苗信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YimiaoModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 疫苗标题
     */
    private String yimiaoName;


    /**
     * 疫苗类型
     */
    private Integer yimiaoTypes;


    /**
     * 疫苗图片
     */
    private String yimiaoPhoto;


    /**
     * 医院信息
     */
    private Integer yiyuanId;


    /**
     * 点击次数
     */
    private Integer yimiaoClicknum;


    /**
     * 发布日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 疫苗详情
     */
    private String yimiaoContent;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：疫苗标题
	 */
    public String getYimiaoName() {
        return yimiaoName;
    }


    /**
	 * 设置：疫苗标题
	 */
    public void setYimiaoName(String yimiaoName) {
        this.yimiaoName = yimiaoName;
    }
    /**
	 * 获取：疫苗类型
	 */
    public Integer getYimiaoTypes() {
        return yimiaoTypes;
    }


    /**
	 * 设置：疫苗类型
	 */
    public void setYimiaoTypes(Integer yimiaoTypes) {
        this.yimiaoTypes = yimiaoTypes;
    }
    /**
	 * 获取：疫苗图片
	 */
    public String getYimiaoPhoto() {
        return yimiaoPhoto;
    }


    /**
	 * 设置：疫苗图片
	 */
    public void setYimiaoPhoto(String yimiaoPhoto) {
        this.yimiaoPhoto = yimiaoPhoto;
    }
    /**
	 * 获取：医院信息
	 */
    public Integer getYiyuanId() {
        return yiyuanId;
    }


    /**
	 * 设置：医院信息
	 */
    public void setYiyuanId(Integer yiyuanId) {
        this.yiyuanId = yiyuanId;
    }
    /**
	 * 获取：点击次数
	 */
    public Integer getYimiaoClicknum() {
        return yimiaoClicknum;
    }


    /**
	 * 设置：点击次数
	 */
    public void setYimiaoClicknum(Integer yimiaoClicknum) {
        this.yimiaoClicknum = yimiaoClicknum;
    }
    /**
	 * 获取：发布日期
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：发布日期
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：疫苗详情
	 */
    public String getYimiaoContent() {
        return yimiaoContent;
    }


    /**
	 * 设置：疫苗详情
	 */
    public void setYimiaoContent(String yimiaoContent) {
        this.yimiaoContent = yimiaoContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
