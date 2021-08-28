package one.digitalinnovation.personapi.dto.requet;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PersonDTO {

    private Long id;
    @NotEmpty
    @Size(min = 2, max = 108)
    private String firstName;

    private String lastName;

    private String cpf;

    private String birthDate;

    private List<PhoneDTO> phones;
}
