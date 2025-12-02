pipeline {
agent any
stage {
       stage('complicated'){
      step{
     git main:https://github.com/Sanjith77/kins'
   }
  }
}
stage('build')
{
step{
      echo"hello this is my file"
 }
 }
 }
}
 
