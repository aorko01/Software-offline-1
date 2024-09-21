// SystemBuilder class for handling internet and framework options
public class SystemBuilder {
    private String internetOption;
    private String framework;

    // Method to set the internet option
    public SystemBuilder setInternetOption(String internetOption) {
        this.internetOption = internetOption;
        return this;
    }

    // Method to set the framework
    public SystemBuilder setFramework(String framework) {
        this.framework = framework;
        return this;
    }

    // Build method to display the final system configuration
    public void build() {
        System.out.println("Internet option: " + internetOption);
        System.out.println("Web framework: " + framework);
    }
}
