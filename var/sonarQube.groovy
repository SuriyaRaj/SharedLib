def call(String sonarServer, String mavenHome, String sonarhostname, String sonarLoginkey){

        mvnHome = tool "${mavenHome}"
        withSonarQubeEnv("${sonarServer}"){
        
            sh "${mvnHome}/bin/mvn clean package sonar:sonar -Dsonar.host.url=("${sonarhostname}")  -Dsonar.login=("${sonarLoginkey}")"
        }    
}
