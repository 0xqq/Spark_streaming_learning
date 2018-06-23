package com.imooc.spark;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Boot应用
 */
@RestController
public class HelloBoot
{

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello()
    {
        return "Hello world spring boot...";
    }

    @RequestMapping(value = "/first", method = RequestMethod.GET)
    public ModelAndView firstDemo()
    {
        return new ModelAndView("test");
    }

    @RequestMapping(value = "/course_clickcount", method = RequestMethod.GET)
    public ModelAndView courseClickCountStat()
    {
        return new ModelAndView("demo");
    }

}
