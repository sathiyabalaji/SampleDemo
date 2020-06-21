node{
stage('SCM Checkout'){
git 'https://github.com/sathiyabalaji/SampleDemo'
}
stage('Compile-Package'){
  def mvnhome=tool name: 'Maven 3.5.0', type: 'maven'
  sh "${mvnHome}/bin/mvn package"
}
}
