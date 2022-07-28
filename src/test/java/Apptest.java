import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import org.example.Web_servlet.servlet_ver1.util.Ut;
import org.junit.jupiter.api.Test;
import org.example.Web_servlet.servlet_ver1.article.model.ArticleDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class Apptest {

    @Test
    void 실험_assertThat() {
        int rs = 10 + 20;
        assertThat(rs).isEqualTo(30);
    }

    @Test
    void 실험2_ObjectMapper() throws JsonProcessingException {
        ArticleDto articleDto = new ArticleDto(1, "제목", "내용");

        String jsonStr = Ut.json.toStr(articleDto, "");
        assertThat(jsonStr).isNotBlank();
        assertThat(jsonStr).isEqualTo("""
                {"id":1,"title":"제목","body":"내용"}
                """.trim());
    }
    @Test
    void 실험3_ObjectMapper__jsonStrToObj() {
        ArticleDto articleDtoOrigin = new ArticleDto(1, "제목", "내용");
        String jsonStr = Ut.json.toStr(articleDtoOrigin, "");

        ArticleDto articleDtoFromJson = Ut.json.toObj(jsonStr, ArticleDto.class, null);

        assertThat(articleDtoOrigin).isEqualTo(articleDtoFromJson);

    }
    @Test
    void 실험4_ObjectMapper__ListToJson_fromMe() {

        List<ArticleDto> result = new ArrayList<>();
        ArticleDto articleDtoOrigin1 = new ArticleDto(1, "제목", "내용");
        ArticleDto articleDtoOrigin2 = new ArticleDto(2, "제목2", "내용2");;
        result.add(articleDtoOrigin1);
        result.add(articleDtoOrigin2);

        String jsonStr = Ut.json.toStr(result, "");
        assertThat(jsonStr).isNotBlank();
        assertThat(jsonStr).isEqualTo("""
                [{"id":1,"title":"제목","body":"내용"},{"id":2,"title":"제목2","body":"내용2"}]
                """.trim());
    }
    @Test
    void 실험_ObjectMapper__MapToJson_fromMe() {
        int index = 0 ;
        HashMap<ArticleDto,Integer> result = new HashMap<ArticleDto, Integer>();
        ArticleDto articleDtoOrigin1 = new ArticleDto(1, "제목", "내용");
        index++;
        result.put(articleDtoOrigin1,index);

        ArticleDto articleDtoOrigin2 = new ArticleDto(2, "제목2", "내용2");;
        index++;
        result.put(articleDtoOrigin2,index);


        String jsonStr = Ut.json.toStr(result, "");
        assertThat(jsonStr).isNotBlank();
        assertThat(jsonStr).isEqualTo("""
               {"ArticleDto(id=2, title=제목2, body=내용2)":2,"ArticleDto(id=1, title=제목, body=내용)":1}
                """.trim());
    }

    @Test
        // JS객체(단순) => ArticleDto
    void ObjectMapper__jsonStrToObj() {
        ArticleDto articleDtoOrigin = new ArticleDto(1, "제목", "내용");
        String jsonStr = Ut.json.toStr(articleDtoOrigin, "");

        ArticleDto articleDtoFromJson = Ut.json.toObj(jsonStr, ArticleDto.class, null);
        assertThat(articleDtoOrigin).isEqualTo(articleDtoFromJson);
    }


    @Test
        // JS배열 => List<ArticleDto>
    void ObjectMapper__jsonStrToArticleDtoList() {
        List<ArticleDto> articleDtos = new ArrayList<>();
        articleDtos.add(new ArticleDto(1, "제목1", "내용1"));
        articleDtos.add(new ArticleDto(2, "제목2", "내용2"));

        String jsonStr = Ut.json.toStr(articleDtos, "");

        List<ArticleDto> articleDtosFromJson = Ut.json.toObj(jsonStr, new TypeReference<>() {
        }, null);

        assertThat(articleDtosFromJson).isEqualTo(articleDtos);
    }

    @Test
        // JS객체(복잡) => Map<String, ArticleDto>
    void ObjectMapper__jsonStrToArticleDtoMap() {
        Map<String, ArticleDto> articleDtoMap = new HashMap<>();
        articleDtoMap.put("가장오래된", new ArticleDto(1, "제목1", "내용1"));
        articleDtoMap.put("최신", new ArticleDto(2, "제목2", "내용2"));
        String jsonStr = Ut.json.toStr(articleDtoMap, "");

        Map<String, ArticleDto> articleDtoMapFromJson = Ut.json.toObj(jsonStr, new TypeReference<>() {
        }, null);

        assertThat(articleDtoMapFromJson).isEqualTo(articleDtoMap);
    }


}
