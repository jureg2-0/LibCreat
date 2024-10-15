package api_web.api_web.model.Desenho;

import api_web.api_web.model.Ideia.Ideia;
import api_web.api_web.model.Mensagem.Mensagem;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity

public class Desenho extends Mensagem{
    
    private String tag;
    private Ideia ideia;
}
