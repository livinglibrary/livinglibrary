package com.livinglibrary.service;

import com.livinglibrary.mapper.ResumeDetailMapper;
import com.livinglibrary.mapper.ResumeListMapper;
import com.livinglibrary.mapper.ResumeMenuMapper;
import com.livinglibrary.po.*;
import com.livinglibrary.util.CopyObject;
import com.livinglibrary.vo.ResumeDetailVO;
import com.livinglibrary.vo.ResumeListVO;
import com.livinglibrary.vo.ResumeMenuVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class ResumeService {

    @Resource
    ResumeMenuMapper menuMapper;

    @Resource
    ResumeListMapper resumeListMapper;

    @Resource
    ResumeDetailMapper resumeDetailMapper;

    /**
     * 返回简历菜单
     * @return
     */
    public List<ResumeMenuVO> getResumeMenu(){
        List<ResumeMenuVO> list = new ArrayList<ResumeMenuVO>();
        // 获取开放菜单 ，获取内容已根据pid升序排序，方便前台生成左侧菜单栏
        List<ResumeMenu> result = menuMapper.getAllOpenMenu();
        try{
            if(null != result && result.size() > 0)
            for(int i=0;i<result.size();i++){
                ResumeMenuVO temp = new ResumeMenuVO();
                CopyObject.copyProperties(result.get(i),temp);
                list.add(temp);
            }
        }catch(Exception e){e.printStackTrace();}
        return list;
    }

    /**
     * 根据菜单id返回简历清单
     * @param menuId
     * @return
     */
    public List<ResumeListVO> getResumeListByMenuId(Integer menuId){
        List<ResumeListVO> list = new ArrayList<ResumeListVO>();
        ResumeListExample example = new ResumeListExample();
        ResumeListExample.Criteria criteria = example.createCriteria();
        criteria.andMenuIdEqualTo(menuId);
        criteria.andOpenEqualTo((byte)1);
        List<ResumeList> result = resumeListMapper.selectByExample(example);
        try{
            if(null != result && result.size() >0){
                for(int i=0;i<result.size();i++){
                    ResumeListVO temp = new ResumeListVO();
                    CopyObject.copyProperties(result.get(i),temp);
                    list.add(temp);
                }
            }
        }catch(Exception e){e.printStackTrace();}
        return list;
    }

    /**
     * 根据listId获取简历明细
     * @param listId
     * @return
     */
    public ResumeDetailVO getResumeDetailByListId(Integer listId){
        ResumeDetailVO resultVO = new ResumeDetailVO();
        ResumeList resumeList = this.resumeListMapper.selectByPrimaryKey(listId);
        // 判定改内容是否已被管理员关闭
        if(null != resumeList && resumeList.getOpen()==1){
            ResumeDetail result = this.resumeDetailMapper.getResumeDetailByListId(listId);
            try{
                CopyObject.copyProperties(result,resultVO);
            }catch(Exception e){e.printStackTrace();}
        }
        return resultVO;
    }

}
