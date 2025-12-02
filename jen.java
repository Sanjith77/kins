pipeline {
  agent any

  stages {
    stage('Checkout') {
      steps {
        git branch: 'main', url: 'https://github.com/Sanjith77/kins'
      }
    }

    stage('Build') {
      steps {
        echo 'hello this is my file'
      }
    }
  }
}
 
