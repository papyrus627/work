package work.phone;

import java.util.Random;

public class Phone {
    // 1. 定义属性：品牌、编号、电量、CPU个数
    String brand; // 品牌
    int id; // 编号
    int battery; // 当前电量 (0-100)
    int cpuCount; // CPU个数

    // 构造方法：用于初始化手机
    public Phone(String brand, int id, int battery, int cpuCount) {
        this.brand = brand;
        this.id = id;
        this.battery = battery;
        this.cpuCount = cpuCount;
    }

    // 1. 定义printPhoneInfo方法：输出手机信息
    public void printPhoneInfo() {
        System.out.println("【手机编号】" + id + " | 【品牌】" + brand + " | 【剩余电量】" + battery + "%");
    }

    // 2.1 定义打电话方法：耗电2%
    public void call() {
        battery -= 2;
        if (battery < 0)
            battery = 0; // 电量最低为0
        System.out.println("  - 执行操作：打电话，当前电量 " + battery + "%");
    }

    // 2.2 定义发短信方法：耗电1%
    public void sendMessage() {
        battery -= 1;
        if (battery < 0)
            battery = 0; // 电量最低为0
        System.out.println("  - 执行操作：发短信，当前电量 " + battery + "%");
    }

    // 2.3 定义照相方法：耗电4%
    public void takePhoto() {
        battery -= 4;
        if (battery < 0)
            battery = 0; // 电量最低为0
        System.out.println("  - 执行操作：照相，当前电量 " + battery + "%");
    }

    // 主方法 (main)
    public static void main(String[] args) {
        // 3.1 初始化5台手机
        // 预设品牌数组
        String[] brands = { "Apple", "Huawei", "Samsung", "Xiaomi", "OPPO" };

        // 创建Phone对象数组
        Phone[] phones = new Phone[5];

        for (int i = 0; i < 5; i++) {
            // 初始化：编号从1开始，初始电量100%，CPU设为8核（示例）
            phones[i] = new Phone(brands[i], i + 1, 100, 8);
        }

        // 3.2 为每台手机随机选择2种不同操作并执行
        Random rand = new Random();

        System.out.println("=== 开始模拟手机操作 ===\n");

        for (Phone phone : phones) {
            System.out.println("📱 正在操作：" + phone.brand + " (编号 " + phone.id + ")");
            System.out.println("  初始状态：" + phone.brand + " 电量 " + phone.battery + "%");

            // 生成两个不重复的随机数 (0, 1, 2 分别代表 电话、短信、照相)
            int op1 = rand.nextInt(3); // 0, 1, 2
            int op2 = rand.nextInt(3);

            // 确保 op2 和 op1 不重复
            while (op1 == op2) {
                op2 = rand.nextInt(3);
            }

            // 执行第一个操作
            switch (op1) {
                case 0:
                    phone.call();
                    break;
                case 1:
                    phone.sendMessage();
                    break;
                case 2:
                    phone.takePhoto();
                    break;
            }

            // 执行第二个操作
            switch (op2) {
                case 0:
                    phone.call();
                    break;
                case 1:
                    phone.sendMessage();
                    break;
                case 2:
                    phone.takePhoto();
                    break;
            }

            System.out.println("--------------------------");
        }

        // 3.3 所有操作完成后，依次显示最终信息
        System.out.println("\n=== 操作全部结束，显示最终状态 ===\n");
        for (Phone phone : phones) {
            phone.printPhoneInfo();
        }
    }
}