package junit;

import org.I0Itec.zkclient.ZkClient;
import org.apache.zookeeper.CreateMode;

/**
 * @author yangkai on 2018/3/21.
 */
public class MyJunit {

    public static void main(String[] args) {
        ZkClient zkClient = new ZkClient("192.168.1.59:2181",5000);
        zkClient.exists("/mytree");
        zkClient.create("/mytree","hhh", CreateMode.EPHEMERAL);
        System.out.println(zkClient.readData("/mytree").toString());
        zkClient.close();
    }
}
