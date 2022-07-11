package com.example.testserver.config

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView
import org.springframework.web.servlet.view.RedirectView

/**
 * Home redirection to swagger api documentation
 */
@Controller
class HomeController {

    private val log = LoggerFactory.getLogger(javaClass)

    @RequestMapping(value = ["/"])
    fun index(): ModelAndView {
        log.info("redirect to swagger-ui.html")
        val modelAndView = ModelAndView()
        modelAndView.view = RedirectView("/swagger-ui.html", true, false)
        return modelAndView
    }
}
