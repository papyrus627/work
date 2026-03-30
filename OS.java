// OS.java
public class OS {
    private String name;      // 系统名称
    private String version;   // 系统版本
    private String kernel;    // 内核类型
    private String developer; // 开发商

    // 构造方法
    public OS(String name, String version, String kernel, String developer) {
        this.name = name;
        this.version = version;
        this.kernel = kernel;
        this.developer = developer;
    }

    // Getter 方法（封装）
    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public String getKernel() {
        return kernel;
    }

    public String getDeveloper() {
        return developer;
    }
}
