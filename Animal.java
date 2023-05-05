package foxrabbitsv1;

import java.util.List;

public abstract class Animal {


    private boolean alive;
    // The fox's position.
    private Localizacao location;
    // The field occupied.
    private Campo field;

    public Animal(Campo field, Localizacao local) {
        this.alive = true;
        this.field=field;
        setLocation(local);

    }
    protected void setLocation(Localizacao newLocation)
    {
        if(location != null) {
            field.clear(location);
        }
        location = newLocation;
        field.place(this, newLocation);
    }
    protected void setDead() {
        alive = false;
        if (location != null) {
            field.clear(location);
            location = null;
            field = null;
        }
    }
    public Campo getField() {
        return field;
    }

    protected boolean isAlive()
    {
        return alive;
    }
    protected Localizacao getLocation()
    {
        return location;
    }

    abstract public void act(List<Animal> newAnimals);
}


