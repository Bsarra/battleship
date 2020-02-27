package bn.ship;

import java.awt.image.renderable.ContextualRenderedImageFactory;
import java.util.Date;

public class Destroyer extends AbstractShip {

    public Destroyer() {

        this(null);
    }

    public Destroyer(String orientation) {
        super("Destroyer", 'D', 2, orientation); // TODO
    }


}
