#!/usr/bin/groovy

def call(body) {
    def version 
    try {
        version = sh(script: 'git rev-parse --short HEAD', returnStdout: true).toString().trim()
    } catch (err){
        error("unable to get short git sha, maybe in a detached HEAD, did you chose to Check out to a specific local branch?")
    }
    
    version = 'v' + version
    echo 'using new version ' + version
    return version
}
