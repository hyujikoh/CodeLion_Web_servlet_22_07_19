import com.fasterxml.jackson.core.JsonProcessingException;
import org.example.Web_servlet.servlet_ver1.util.Ut;
import org.junit.jupiter.api.Test;
import org.example.Web_servlet.servlet_ver1.article.model.ArticleDto;

import static org.assertj.core.api.Assertions.assertThat;

public class Apptest {

    @Test
    void 실험_assertThat() {
        int rs = 10 + 20;
        assertThat(rs).isEqualTo(30);
    }

    @Test
    void 실험_ObjectMapper() throws JsonProcessingException {
        ArticleDto articleDto = new ArticleDto(1, "제목", "내용");

        String jsonStr = Ut.json.toJsonStr(articleDto, "");
        assertThat(jsonStr).isNotBlank();
        assertThat(jsonStr).isEqualTo("""
                {"id":1,"title":"제목","body":"내용"}
                """.trim());
    }
}
