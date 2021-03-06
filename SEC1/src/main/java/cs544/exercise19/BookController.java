/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs544.exercise19;

import cs544.sample.Car;
import cs544.sample.ICarDao;
import cs544.sample.NoSuchResourceException;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Ayu
 */
@Controller
public class BookController {

    @Resource
    private IBookDao bookDao;

//    @RequestMapping("/")
//    public String redirectRoot() {
//        return "redirect:/books";
//  }

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public String getAll(Model model) {
        model.addAttribute("books", bookDao.getAll());
        return "bookList";
    }

    @RequestMapping(value = "/books/add", method = RequestMethod.POST)
    public String add(Book book) {
        bookDao.add(book);
        return "redirect:/books";
    }

    @RequestMapping(value = "/books/{id}", method = RequestMethod.GET)
    public String get(@PathVariable int id, Model model) {
        model.addAttribute("books", bookDao.get(id));
        return "bookDetails";
    }

    @RequestMapping(value = "/books/{id}", method = RequestMethod.POST)
    public String update(Book book, @PathVariable int id) {
        bookDao.update(id, book); 
        return "redirect:/books";
    }

    @RequestMapping(value = "/books/delete", method = RequestMethod.POST)
    public String delete(int bookId) {
        bookDao.delete(bookId);
        return "redirect:/books";
    }

    @ExceptionHandler(value = NoSuchResourceException.class)
    public ModelAndView handle(Exception e) {
        ModelAndView mv = new ModelAndView();
        mv.getModel().put("e", e);
        mv.setViewName("noSuchResource");
        return mv;
    }
}
