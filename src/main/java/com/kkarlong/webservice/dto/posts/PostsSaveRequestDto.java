package com.kkarlong.webservice.dto.posts;

import com.kkarlong.webservice.domain.Posts;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@ApiModel(description = "게시글 모델")
@NoArgsConstructor
@Getter
@Setter
public class PostsSaveRequestDto {

    @ApiModelProperty(value = "제목", required = true, example = "게시글 제목")
    private String title;

    @ApiModelProperty(value = "내용", required = true, example = "게시글 내용")
    private String content;

    @ApiModelProperty(value = "작성자", example = "kkarlong")
    private String author;

    public Posts toEntity(){
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}
