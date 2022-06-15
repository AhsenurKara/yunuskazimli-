package game_of_thrones.CharacterLocations;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DataPojoForCharacterLocations {
    private List<String> locations;
    private String id;
    private String name;
    private String slug;
    private int __v;
}
