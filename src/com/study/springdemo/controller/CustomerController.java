package com.study.springdemo.controller;

import com.study.springdemo.model.Customer;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    //  VIEWS
    private final String VIEW_FORM = "customer-form";
    private final String VIEW_CONFIRMATION = "customer-confirmation";

    // add an initbinder ... to convert trim input strings
    // remove leading and trailing whitespace
    // resolve issue for our validation
    // if String has only white space ... trim it to null

    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);

        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @RequestMapping("/showForm")
    public String showForm(Model theModel) {
        theModel.addAttribute("customer", new Customer());

        return VIEW_FORM;
    }

    @RequestMapping("/processForm")
    public String processForm(
            @Valid
            @ModelAttribute("customer") Customer theCustomer,
            BindingResult theBindingResult) {
        if(theBindingResult.hasErrors()){
            return VIEW_FORM;
        }
        return VIEW_CONFIRMATION;
    }

}
