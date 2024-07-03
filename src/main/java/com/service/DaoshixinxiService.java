package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DaoshixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DaoshixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DaoshixinxiView;


/**
 * 导师信息
 *
 * @author 
 * @email 
 * @date 2021-05-11 10:26:09
 */
public interface DaoshixinxiService extends IService<DaoshixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DaoshixinxiVO> selectListVO(Wrapper<DaoshixinxiEntity> wrapper);
   	
   	DaoshixinxiVO selectVO(@Param("ew") Wrapper<DaoshixinxiEntity> wrapper);
   	
   	List<DaoshixinxiView> selectListView(Wrapper<DaoshixinxiEntity> wrapper);
   	
   	DaoshixinxiView selectView(@Param("ew") Wrapper<DaoshixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DaoshixinxiEntity> wrapper);
   	
}

