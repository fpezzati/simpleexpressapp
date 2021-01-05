job('simpleexpressapp dummy builder') {
  scm {
    git('https://github.com/fpezzati/simpleexpressapp.git'){
      usr ->
        usr / gitConfigName('dummy user')
        usr / gitConfigEmail('feffafi@fmail.com')
    }
  }
  triggers {
    scm('H/10 * * * *')
  }
  wrappers {
    nodejs('nodejs')
  }
  steps {
    shell('npm install')
  }
}
