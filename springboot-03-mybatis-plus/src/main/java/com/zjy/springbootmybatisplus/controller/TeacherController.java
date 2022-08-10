package com.zjy.springbootmybatisplus.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zjy.springbootmybatisplus.controller.until.R;
import com.zjy.springbootmybatisplus.domain.Teacher;
import com.zjy.springbootmybatisplus.domain.vo.PageVo;
import com.zjy.springbootmybatisplus.service.ITeacherService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private PageVo pageVo;

    @Autowired
    private ITeacherService teacherService;

    @GetMapping
    public R<List<Teacher>> list() {
        List<Teacher> list = teacherService.list();
       return new R(true, list, "请求成功");
    }


    @PostMapping("/save")
    public R<Boolean> save(@RequestBody Teacher teacher){
        if(teacher.getId() == null){
            boolean save = teacherService.save(teacher);
            return new R<>(true, save, "保存成功");
        } else {
           return this.update(teacher);
        }
    }


    @PutMapping("/update")
    public R<Boolean> update(@RequestBody Teacher teacher){
        boolean b = teacherService.updateById(teacher);
        return new R<>(true, b, "保存成功");
    }

    @DeleteMapping("{id}")
    public R<Boolean> del(@PathVariable Integer id){
        Boolean delete = teacherService.delete(id);
        return new R(true, delete, "删除成功");
    }

    @GetMapping("{id}")
    public R get(@PathVariable Integer id){
        Teacher byId = teacherService.getById(id);
        return new R(true, byId, "成功");
    }

    @PostMapping("/search/page/{curPage}/{pageSize}")
    public R<PageVo> searchPage(@PathVariable("curPage") Integer curPage, @PathVariable("pageSize") Integer pageSize, @RequestBody Teacher teacher){
        IPage<Teacher> teacherIPage = teacherService.searchPage(teacher, curPage, pageSize);
        List<Teacher> records = teacherIPage.getRecords();

        long total = teacherIPage.getTotal();
        long size = teacherIPage.getSize();
        long current = teacherIPage.getCurrent();
        pageVo.setTotal(total);
        pageVo.setPageSize(size);
        pageVo.setCurPage(current);
        pageVo.setRecords(records);


        return new R<PageVo>(true, pageVo, "成功");
    }


    @GetMapping("/page/{curPage}/{pageSize}")
    public List<Teacher> gePage(@PathVariable Integer curPage, @PathVariable Integer pageSize){
        IPage<Teacher> page = new Page<>(curPage, pageSize);
        List<Teacher> records = teacherService.page(page).getRecords();
       return records;
    }

    @GetMapping("/{curPage}/{pageSize}")
    public IPage<Teacher> getPageList(@PathVariable Integer curPage, @PathVariable Integer pageSize){
        return teacherService.getPage(curPage, pageSize);
    }


}
