package org.framework.Controller;

import org.framework.Form.Model.Keymodel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class KeymodelController {

    @RequestMapping(value={"/reqmainpage"},method = RequestMethod.GET)
    public ModelAndView keyModelForm() {
        return new ModelAndView("reqmainpage", "keyModel",new Keymodel());
    }

    @RequestMapping(value="/reqmainpage",method = RequestMethod.POST)
    public String FormSubmit(@Valid @ModelAttribute("keyModel") Keymodel keymodel, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "error";
        }
        model.addAttribute("keyId",keymodel.getKeyId());
        model.addAttribute("jobId",keymodel.getJobId());
        return "result";
    }

}
