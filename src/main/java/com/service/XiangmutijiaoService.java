package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiangmutijiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiangmutijiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiangmutijiaoView;


/**
 * 项目提交
 *
 * @author 
 * @email 
 * @date 2021-05-11 10:26:09
 */
public interface XiangmutijiaoService extends IService<XiangmutijiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiangmutijiaoVO> selectListVO(Wrapper<XiangmutijiaoEntity> wrapper);
   	
   	XiangmutijiaoVO selectVO(@Param("ew") Wrapper<XiangmutijiaoEntity> wrapper);
   	
   	List<XiangmutijiaoView> selectListView(Wrapper<XiangmutijiaoEntity> wrapper);
   	
   	XiangmutijiaoView selectView(@Param("ew") Wrapper<XiangmutijiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiangmutijiaoEntity> wrapper);
   	
}

