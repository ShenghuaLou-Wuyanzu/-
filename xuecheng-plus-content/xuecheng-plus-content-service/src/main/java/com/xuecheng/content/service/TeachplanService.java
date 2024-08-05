package com.xuecheng.content.service;

import com.xuecheng.content.model.dto.SaveTeachplanDto;
import com.xuecheng.content.model.dto.TeachplanDto;

import java.util.List;

/**
 * @description 课程基本信息管理业务接口
 * @author Mr.M
 * @date 2022/9/6 21:42
 * @version 1.0
 */
public interface TeachplanService {

    /**
     * @description 查询课程计划树型结构
     * @param courseId  课程id
     * @return List<TeachplanDto>
     */
    public List<TeachplanDto> findTeachplanTree(Long courseId);

    /**
     * 新增、修改、保存课程计划
     * @param teachplanDto
     */
    public void saveTeachplan(SaveTeachplanDto teachplanDto);
}
