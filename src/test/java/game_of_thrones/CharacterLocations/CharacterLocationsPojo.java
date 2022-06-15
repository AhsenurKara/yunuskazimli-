package game_of_thrones.CharacterLocations;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CharacterLocationsPojo {
    private String message;
    private List<DataPojoForCharacterLocations> data;
}
