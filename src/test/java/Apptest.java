import com.fasterxml.jackson.core.JsonProcessingException;
import org.example.Web_servlet.servlet_ver1.util.Ut;
import org.junit.jupiter.api.Test;
import org.example.Web_servlet.servlet_ver1.article.model.ArticleDto;

import java.util.ArrayList;
import java.util.List;

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
    void 실험4_ObjectMapper__ListToJson1_fromMe() {

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


}
