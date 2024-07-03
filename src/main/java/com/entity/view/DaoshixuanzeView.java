package com.entity.view;

import com.entity.DaoshixuanzeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 导师选择
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-11 10:26:09
 */
@TableName("daoshixuanze")
public class DaoshixuanzeView  extends DaoshixuanzeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DaoshixuanzeView(){
	}
 
 	public DaoshixuanzeView(DaoshixuanzeEntity daoshixuanzeEntity){
 	try {
			BeanUtils.copyProperties(this, daoshixuanzeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
