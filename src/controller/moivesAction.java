package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pojo.Moive;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class moivesAction {
    @Autowired
    private dao.moivesMapper moivesMapper;
    @RequestMapping("views/index")
    public ModelAndView queryall(HttpServletRequest request, HttpServletRequest response) throws Exception{
        List<Moive> moivelist = moivesMapper.queryall();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list",moivelist);
        modelAndView.setViewName("/views/index.jsp");
        return modelAndView;
    }
    @RequestMapping("views/vedio")
    public ModelAndView palyer(HttpServletRequest request, HttpServletResponse response) throws Exception{
        int  id = Integer.parseInt(request.getParameter("id"));
        Moive moive = moivesMapper.selectById(id);
        ModelAndView model = new ModelAndView();
        model.addObject("moive",moive);
        model.setViewName("/views/vedio.jsp");
        return model;
    }
    @RequestMapping("/views/insert")
    public String insert(String title,String stars,String time, String url,int score) throws Exception{
        Moive moive = new Moive();
        moive.setImgUrl("http://localhost:8080/views/upload/2018/11/1.jpg");
        moive.setUrl(url);
        moive.setStars(stars);
        moive.setScore(score);
        moive.setTitle(title);
        moive.setReleasetime(time);
        moivesMapper.addMoive(moive);
        return "/views/index.action";
    }


}
