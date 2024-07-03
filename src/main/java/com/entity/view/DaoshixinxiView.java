package com.entity.view;

import com.entity.DaoshixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 导师信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-11 10:26:09
 */
@TableName("daoshixinxi")
public class DaoshixinxiView  extends DaoshixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DaoshixinxiView(){
	}
 
 	public DaoshixinxiView(DaoshixinxiEntity daoshixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, daoshixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
