package com.atguigu.srb.core.controller.admin;

import com.atguigu.srb.core.pojo.entity.IntegralGrade;
import com.atguigu.srb.core.service.IntegralGradeService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/admin/core/integralGrade")
public class AdminIntegralGradeController {
    @Resource
    private IntegralGradeService integralGradeService;

    @GetMapping("/list")
    @ApiOperation("积分等级列表")
    public List<IntegralGrade> listAll(){
        return integralGradeService.list();
    }

    @DeleteMapping("/remove/{id}")
    @ApiOperation(value = "根据id删除积分等级", notes = "逻辑删除")
    public boolean removeById(@PathVariable Long id ){

        return integralGradeService.removeById(id);
    }
}
