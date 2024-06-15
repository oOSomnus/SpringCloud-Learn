package com.han.gulimall.product.controller;

import java.util.Arrays;
import java.util.Map;

    import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.han.gulimall.product.entity.SpuCommentEntity;
import com.han.gulimall.product.service.SpuCommentService;
import com.han.common.utils.PageUtils;
import com.han.common.utils.R;


/**
 * 商品评价
 *
 * @author yhz
 * @email yihang6992@foxmail.com
 * @date 2024-06-15 14:49:02
 */
@RestController
@RequestMapping("product/spucomment")
public class SpuCommentController {
    @Autowired
    private SpuCommentService spuCommentService;

    /**
     * 列表
     */
    @RequestMapping("/list")
            public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = spuCommentService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
            public R info(@PathVariable("id") Long id) {
            SpuCommentEntity spuComment = spuCommentService.getById(id);

        return R.ok().put("spuComment", spuComment);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
            public R save(@RequestBody SpuCommentEntity spuComment) {
            spuCommentService.save(spuComment);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
            public R update(@RequestBody SpuCommentEntity spuComment) {
            spuCommentService.updateById(spuComment);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
            public R delete(@RequestBody Long[] ids) {
            spuCommentService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
