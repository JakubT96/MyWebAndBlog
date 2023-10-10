package JakubT96.springblog.models.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
public class ArticleDTO {

    @NotBlank(message = "Vyplňte titulek")
    @NotNull(message = "Vyplňte titulek")
    @Size(max = 100, message = "Titulek je příliš dlouhý")
    private String title;

    @NotBlank(message = "Vyplňte popisek")
    @NotNull(message = "Vyplňte popisek")
    private String description;

    @NotBlank(message = "Vyplňte obsah")
    @NotNull(message = "Vyplňte obsah")
    private String content;

    private long articleId;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    //endregion

    public long getArticleId() {
        return articleId;
    }

    public void setArticleId(long articleId) {
        this.articleId = articleId;
    }
}