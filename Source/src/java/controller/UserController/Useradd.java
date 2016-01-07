/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.UserController;

import DAO.UserDAO.userDAO;
import DTO.Testtable2;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Nguyen Nhat
 */
public class Useradd {
    @RequestMapping(value="/add", method = RequestMethod.POST)
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception{
        int id = Integer.parseInt(hsr.getParameter("id"));
        String name = hsr.getParameter("name");
        userDAO.addMember(id, name);
        ModelAndView mv = new ModelAndView("users");
        try {
            List<Testtable2> lst = userDAO.layDS();
            mv.addObject("huehue",lst);
        } catch (Exception e) {
        }
        
        return mv;
        
        
    }
}
