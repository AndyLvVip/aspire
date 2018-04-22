package aspire.basis.controller;

import aspire.basis.model.UserModel;
import aspire.framework.jackson.annotation.JsonResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/signUp")
    @JsonResult(type = UserModel.class, included = {"username", "phoneNo", "email"})
    public Object signUp(@RequestBody UserModel src) {
        return src.create();
    }
}
