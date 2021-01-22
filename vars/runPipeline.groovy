#!groovy
def call() {
  node{
    stage('Checkout') {
      checkout scm
    }

    def cfg = pipelineCfg()
    switch(cfg.lang) {
      case "python": 
        pythonPipeline(cfg)
        break
      case "nodejs":
        nodejsPipeline(cfg)
        break
    }
  }
}
