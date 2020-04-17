package org.devops

def colorPrint(color, context) {
  colors = ['red'  : "\033[1;31m ${context} \033[0m",
            'blue' : "\033[1;34m ${context} \033[0m",
            'yello': "\033[1;33m ${context} \033[0m",
            'green': "\033[1;32m ${context} \033[0m"
  ]
  ansiColor('xterm') {
    println(colors[color])
  }
}