package cn.zealon.readingcloud.book.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 分类接口
 * @author: zealon
 * @since: 2019/4/3
 */
@RestController
@RequestMapping("book/category")
public class CategoryController {

    @RequestMapping("where")
    public String getStr(){
        return "comeFrom Book2";
    }
}
