pipeline {
agent any
stages {
stage('Print Versions') {
steps {
// 打印 Docker 版本
sh 'echo "Docker Version:"'
sh 'docker --version'
// 打印 JDK 版本
sh 'echo "JDK Version:"'
sh 'java -version'

                // 打印 Git 版本
                sh 'echo "Git Version:"'
                sh 'git --version'
            
                sh 'mvn --version' 
                // 打印 Maven 版本
                sh 'echo "Maven Version:"'
                sh 'mvn --version' // 或使用 `mvn --version`

                

            }
        }
    }
}