package com.xxl.job.admin.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
@Api(value = "swagger-ui test", description = "swagger api 测试")
@RequestMapping("/swagger")
public class SwaggerTestController {

    @RequestMapping(value = "/demo", method={RequestMethod.GET})
    @ApiOperation(value = "swagger示例接口")
    public String test(@ApiParam(value = "开始日期", name = "startDate") @RequestParam("startDate") Date startDate,
                       @ApiParam(value = "结束日期", name = "endDate")  @RequestParam("endDate")  Date endDate) {
        return "index";
    }
}
