package com.ryan.mall;

import com.ryan.mall.dao.CategoryMapper;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MallApplicationTests {
	@Autowired
	private CategoryMapper categoryMapper;

}
