package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhidaoxiangmuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhidaoxiangmuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhidaoxiangmuView;


/**
 * 指导项目
 *
 * @author 
 * @email 
 * @date 2021-05-11 10:26:09
 */
public interface ZhidaoxiangmuService extends IService<ZhidaoxiangmuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhidaoxiangmuVO> selectListVO(Wrapper<ZhidaoxiangmuEntity> wrapper);
   	
   	ZhidaoxiangmuVO selectVO(@Param("ew") Wrapper<ZhidaoxiangmuEntity> wrapper);
   	
   	List<ZhidaoxiangmuView> selectListView(Wrapper<ZhidaoxiangmuEntity> wrapper);
   	
   	ZhidaoxiangmuView selectView(@Param("ew") Wrapper<ZhidaoxiangmuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhidaoxiangmuEntity> wrapper);
   	
}

