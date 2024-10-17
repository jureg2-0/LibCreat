package api_web.api_web.model.Mensagem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Data
@Getter
@Setter
@EqualsAndHashCode (of = {"idMensagem"})
public abstract class Mensagem {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMensagem;
    private String titulo;
    private Long curtidas;
    private String dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm"));
    private String destinatario; //Teoricamente, esse é o nickname de outro usuário.
}
