package com.dao;

import com.entity.ZhidaoxiangmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhidaoxiangmuVO;
import com.entity.view.ZhidaoxiangmuView;


/**
 * 指导项目
 * 
 * @author 
 * @email 
 * @date 2021-05-11 10:26:09
 */
public interface ZhidaoxiangmuDao extends BaseMapper<ZhidaoxiangmuEntity> {
	
	List<ZhidaoxiangmuVO> selectListVO(@Param("ew") Wrapper<ZhidaoxiangmuEntity> wrapper);
	
	ZhidaoxiangmuVO selectVO(@Param("ew") Wrapper<ZhidaoxiangmuEntity> wrapper);
	
	List<ZhidaoxiangmuView> selectListView(@Param("ew") Wrapper<ZhidaoxiangmuEntity> wrapper);

	List<ZhidaoxiangmuView> selectListView(Pagination page,@Param("ew") Wrapper<ZhidaoxiangmuEntity> wrapper);
	
	ZhidaoxiangmuView selectView(@Param("ew") Wrapper<ZhidaoxiangmuEntity> wrapper);
	
}
