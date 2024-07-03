package com.dao;

import com.entity.DaoshixuanzeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DaoshixuanzeVO;
import com.entity.view.DaoshixuanzeView;


/**
 * 导师选择
 * 
 * @author 
 * @email 
 * @date 2021-05-11 10:26:09
 */
public interface DaoshixuanzeDao extends BaseMapper<DaoshixuanzeEntity> {
	
	List<DaoshixuanzeVO> selectListVO(@Param("ew") Wrapper<DaoshixuanzeEntity> wrapper);
	
	DaoshixuanzeVO selectVO(@Param("ew") Wrapper<DaoshixuanzeEntity> wrapper);
	
	List<DaoshixuanzeView> selectListView(@Param("ew") Wrapper<DaoshixuanzeEntity> wrapper);

	List<DaoshixuanzeView> selectListView(Pagination page,@Param("ew") Wrapper<DaoshixuanzeEntity> wrapper);
	
	DaoshixuanzeView selectView(@Param("ew") Wrapper<DaoshixuanzeEntity> wrapper);
	
}
