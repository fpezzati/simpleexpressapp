job('simpleexpressapp dummy builder with docker') {
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
    dockerBuildAndPublish {
      repositoryName('fpezzati/simpleexpressapp')
      tag('{GIT_REVISION, length=9}')
      registryCredentials('dockerhub')
      forcePull(false)
      forceTag(false)
      createFingerprints(false)
      skipDecorate()
    }
  }
}
