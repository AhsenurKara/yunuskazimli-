package SWPojos.planets;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class PlanetsPojo {
    private int count;
    private String next;
    private String previous;
    private List<ResultsPojo> results;
}
