package leetcode;

/**
 * 2022/6/21
 * leetcode 1108. IP 地址无效化
 * horace
 */
public class DefangIPaddr1108 {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
