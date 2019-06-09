package org.framework.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class OperationValueController {

    @GetMapping("/operationValue")
    public String operationValueForm(Model model) {
        model.addAttribute("operationValue", new OperationValue());
        return "operationValue";
    }

    @PostMapping("/operationValue")
    public String operationValueSubmit(@ModelAttribute OperationValue operationValue,HttpServletRequest request) {
        request.getSession().setAttribute("keyId", operationValue.getKeyId());
        request.getSession().setAttribute("jobId", operationValue.getJobId());
        return "result";
    }
}
