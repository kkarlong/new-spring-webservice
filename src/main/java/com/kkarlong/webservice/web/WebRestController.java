package com.kkarlong.webservice.web;

import com.kkarlong.webservice.domain.PostsRepository;
import com.kkarlong.webservice.dto.posts.PostsSaveRequestDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "PostApiController", description = "게시글 API")
@RestController
@AllArgsConstructor
public class WebRestController {

    private PostsRepository postsRepository;

    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }

    @ApiOperation(value="게시글 등록")
    @PostMapping("/posts")
    public void savePosts(@RequestBody PostsSaveRequestDto post){
        postsRepository.save(post.toEntity());
    }
}
