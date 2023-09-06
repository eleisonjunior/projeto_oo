package com.infnet.projeto_oo.controller;

import com.infnet.projeto_oo.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PedidoController {

    @Autowired
    PedidoService pedidoService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)

    public ModelAndView getIndex(@ModelAttribute("message") final String message,

                                 @ModelAttribute("error") final String error) {


        ModelAndView mav = new ModelAndView("index");

        mav.addObject("listPedidos", pedidoService.returnPedido());

        mav.addObject("message", message);

        mav.addObject("error", error);


        return mav;

    }


}
