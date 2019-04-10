package dlugolecki.pawel.dto;

import dlugolecki.pawel.model.enums.Education;
import dlugolecki.pawel.model.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VoterDto {

    private Long id;
    private Integer age;
    private Gender gender;
    private Education education;
    private ConstituencyDto constituencyDto;
}