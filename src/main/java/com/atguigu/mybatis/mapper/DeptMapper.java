package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;
import org.omg.PortableInterceptor.INACTIVE;

/**
 * @author 灰太狼
 * @version 1.0
 */

public interface DeptMapper {
    Dept getEmpAndDeptByStepTwo(@Param("did") Integer did);


    Dept getDeptAndEmp(@Param("did") String did);



    Dept getDeptAndEmpByStepOne(@Param("did") Integer did);
}
