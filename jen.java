pipeline {
  agent any

  stages {
    stage('Checkout') {
      steps {
        // checkout from GitHub; branch and url must be named arguments
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
 
