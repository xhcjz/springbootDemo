package com.fc.test.api;

import com.fc.test.common.AjaxResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @author Joint
 */
@RestController
@CrossOrigin
@RequestMapping("api")
public class ApiController {

    @ApiOperation(value="登入接口",notes="登入接口")
    @PostMapping("/login")
    public AjaxResult login(String username,String password){

        return AjaxResult.success("操作成功");
    }
}
