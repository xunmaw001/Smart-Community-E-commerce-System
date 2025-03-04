package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 服务预约
 *
 * @author 
 * @email
 */
@TableName("yanglaofuwuyuyue")
public class YanglaofuwuyuyueEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YanglaofuwuyuyueEntity() {

	}

	public YanglaofuwuyuyueEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 服务
     */
    @TableField(value = "yanglaofuwu_id")

    private Integer yanglaofuwuId;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 状态
     */
    @TableField(value = "yanglaofuwuyuyue_status_types")

    private Integer yanglaofuwuyuyueStatusTypes;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：服务
	 */
    public Integer getYanglaofuwuId() {
        return yanglaofuwuId;
    }


    /**
	 * 获取：服务
	 */

    public void setYanglaofuwuId(Integer yanglaofuwuId) {
        this.yanglaofuwuId = yanglaofuwuId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：状态
	 */
    public Integer getYanglaofuwuyuyueStatusTypes() {
        return yanglaofuwuyuyueStatusTypes;
    }


    /**
	 * 获取：状态
	 */

    public void setYanglaofuwuyuyueStatusTypes(Integer yanglaofuwuyuyueStatusTypes) {
        this.yanglaofuwuyuyueStatusTypes = yanglaofuwuyuyueStatusTypes;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Yanglaofuwuyuyue{" +
            "id=" + id +
            ", yanglaofuwuId=" + yanglaofuwuId +
            ", yonghuId=" + yonghuId +
            ", yanglaofuwuyuyueStatusTypes=" + yanglaofuwuyuyueStatusTypes +
            ", createTime=" + createTime +
        "}";
    }
}
