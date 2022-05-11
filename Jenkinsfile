pipeline {
    environment{
        imageName=""
    }
    agent any

    stages {
        stage('Git Build') {
            steps {
                // Get some code from a GitHub repository
                git branch: 'main', url: 'https://github.com/SuchiBhargav/Mess-management-backend.git'
            }

        }
        stage('Maven Build') {
            steps {
                script{
                    sh 'mvn clean package'
                }
            }

        }
         stage('Docker Build To Image') {
            steps {
              script{
                  imageName =docker.build 'suchibhargav/mess_management_bkd:latest'
              }
            }

         }
         stage('Push Docker Image') {
            steps {
                script{
                    docker.withRegistry('','docker-jenkins'){
                    imageName.push()
                    }
                }
            }

         }
        stage('Ansible Deploy Docker Image') {
            steps {
              ansiblePlaybook becomeUser: null, colorized: true, disableHostKeyChecking: true, installation: 'ansible', inventory: 'inventory', playbook: 'playbook.yml', sudoUser: null
            }

        }

    }
}
