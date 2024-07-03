package com.dao;

import com.entity.XiangmutijiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiangmutijiaoVO;
import com.entity.view.XiangmutijiaoView;


/**
 * 项目提交
 * 
 * @author 
 * @email 
 * @date 2021-05-11 10:26:09
 */
public interface XiangmutijiaoDao extends BaseMapper<XiangmutijiaoEntity> {
	
	List<XiangmutijiaoVO> selectListVO(@Param("ew") Wrapper<XiangmutijiaoEntity> wrapper);
	
	XiangmutijiaoVO selectVO(@Param("ew") Wrapper<XiangmutijiaoEntity> wrapper);
	
	List<XiangmutijiaoView> selectListView(@Param("ew") Wrapper<XiangmutijiaoEntity> wrapper);

	List<XiangmutijiaoView> selectListView(Pagination page,@Param("ew") Wrapper<XiangmutijiaoEntity> wrapper);
	
	XiangmutijiaoView selectView(@Param("ew") Wrapper<XiangmutijiaoEntity> wrapper);
	
}
