package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DaoshixuanzeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DaoshixuanzeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DaoshixuanzeView;


/**
 * 导师选择
 *
 * @author 
 * @email 
 * @date 2021-05-11 10:26:09
 */
public interface DaoshixuanzeService extends IService<DaoshixuanzeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DaoshixuanzeVO> selectListVO(Wrapper<DaoshixuanzeEntity> wrapper);
   	
   	DaoshixuanzeVO selectVO(@Param("ew") Wrapper<DaoshixuanzeEntity> wrapper);
   	
   	List<DaoshixuanzeView> selectListView(Wrapper<DaoshixuanzeEntity> wrapper);
   	
   	DaoshixuanzeView selectView(@Param("ew") Wrapper<DaoshixuanzeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DaoshixuanzeEntity> wrapper);
   	
}

