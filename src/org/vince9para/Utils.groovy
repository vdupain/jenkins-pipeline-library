def getBranch(){
  def branch = env.BRANCH_NAME
  if (!branch){
    try {
      branch = sh(script: 'git symbolic-ref --short HEAD', returnStdout: true).toString().trim()
    } catch (err){
      echo('Unable to get git branch and in a detached HEAD. You may need to select Pipeline additional behaviour and \'Check out to specific local branch\'')
      return null
    }
  }
  echo "Using branch ${branch}" 
  return branch
}

