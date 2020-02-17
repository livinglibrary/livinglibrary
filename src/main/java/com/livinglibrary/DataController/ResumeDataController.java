package com.livinglibrary.DataController;

import com.livinglibrary.service.ResumeService;
import com.livinglibrary.vo.ResumeDetailVO;
import com.livinglibrary.vo.ResumeListVO;
import com.livinglibrary.vo.ResumeMenuVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ResumeDataController {
    @Resource
    ResumeService resumeService;

    /**
     * 返回菜单内容
     * @return
     */
    @RequestMapping("/getPMenu")
    public List<ResumeMenuVO> getTitle(){
        return resumeService.getResumeMenu();
    }

    /**
     * 根据菜单id获取简历
     * @param id
     * @return
     */
    @RequestMapping("/getResumeListById")
    public List<ResumeListVO> getResumeListById(Integer id){
        return resumeService.getResumeListByMenuId(id);
    }

    /**
     * 获取简历明细
     * @param listId
     * @return
     */
    @RequestMapping("/getResumeDetail")
    public ResumeDetailVO getResumeDetailByListId(Integer listId){
        if(null == listId){
            return null;
        }
        return this.resumeService.getResumeDetailByListId(listId);
    }
 }
