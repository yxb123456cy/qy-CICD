package org.cy.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**1.git推送至git仓库 触发webhook
 * 2.Jenkins根据请求进行相关CICD操作;
 * 3.代码质量扫描
 * 4.maven打成Jar包
 * 5.Docker使用DockerFile构建docker镜像;
 * 5.jar包与Docker镜像并行传输 jar包存储至maven私服(nexus) docker镜像可推送到阿里云cor也可以推送到私有化部署harbor镜像仓库
 * 7.SSH远程服务器登录;
 * 8.操作本机k8s拉取镜像根据资源文件创建 ns pod dep svc等;
 * 9.接口测试;
 */

@SpringBootApplication
public class CicdApplication {
    /**
     * 配置Maven私服并打包上传成功;
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(CicdApplication.class, args);
    }

}
