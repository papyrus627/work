public class PhoneTest {
    public static void main(String[] args) {

        // 1. 创建长度为 5 的对象数组 (此时数组里都是 null)
        Phone[] phones = new Phone[5];

        // 2. 遍历数组，实例化对象填入容器
        for (int i = 0; i < phones.length; i++) {
            // 假设统一配置内存 256.0，价格 5999.0，其他属性内部随机
            phones[i] = new Phone(256.0, 5999.0);
        }

        System.out.println("========== 初始手机批次信息 ==========");
        // 3. 遍历输出所有手机信息
        for (int i = 0; i < phones.length; i++) {
            System.out.println(phones[i].toString());
        }

        System.out.println("\n========== 针对第3个手机的操作 ==========");
        // 4. 定位第3个手机（索引为 2）
        Phone targetPhone = phones[2];

        // 依次执行操作
        targetPhone.call();
        targetPhone.sendMessage();
        targetPhone.playGame();

        // 打印修改后的该手机信息
        System.out.println("\n--- 操作后该手机的最新状态 ---");
        System.out.println(targetPhone.toString());

        System.out.println("\n========== 最终所有手机信息 ==========");
        // 5. 再次遍历核对总数据
        for (int i = 0; i < phones.length; i++) {
            System.out.println(phones[i].toString());
        }
    }
}