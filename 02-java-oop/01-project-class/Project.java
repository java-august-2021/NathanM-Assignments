public class Project {
    public String name;
    public String description;

    //Insert Methods

    public String elevatorPitch() {
        return String.format("%s: %s", name, description);
    }

    //Add Constructors

    public Project() {
        this.name = "Please provide name.";
        this.description = "Please provide a description.";
    }

    public Project(String name) {
        this.name = name;
        this.description = "Please provide a description.";
    }

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // Setters

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public String setName() {
        return this.name;
    }

    public String setDescription() {
        return this.description;
    }
    }


