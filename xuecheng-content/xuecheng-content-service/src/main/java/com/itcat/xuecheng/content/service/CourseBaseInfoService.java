package com.itcat.xuecheng.content.service;

import com.itcat.xuecheng.base.model.PageParams;
import com.itcat.xuecheng.base.model.PageResult;
import com.itcat.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.itcat.xuecheng.content.model.po.CourseBase;

public interface CourseBaseInfoService {
    PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto queryCourseParamsDto);
}
